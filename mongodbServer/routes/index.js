var express = require('express');
var router = express.Router();
const controller = require("../controllers/characters")
const {ratingsData, profilesData, UserProfile, FavouriteType, RatingsCount} = require("../controllers/characters");

/* GET home page. */
router.get('/FindByUsername/:username', async function (req, res, next) {
    try {
        let username = req.params.username;
        console.log(username);
        const page = parseInt(req.query.page) || 1;
        const limit = 10;
        const skip = (page - 1) * limit;


        const results = await controller.profilesData({ skip, limit, username });
        console.log(results);
        res.json(results);
    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Internal server error' });
    }
});

router.get('/ratings/:id', async function (req, res, next) {
    try {
        const page = parseInt(req.query.page) || 1;
        const limit = 10;
        const skip = (page - 1) * limit;
        const anime_id = Number(req.params.id);

        const results = await controller.FindRatingsById({ skip, limit, anime_id });
        // console.log(results);

        // const totalCount = await controller.RatingsCount(anime_id);

        // console.log("this the total of rating"+totalCount);
        res.json(results);
        // res.json({
        //     data: results,      // current page data
        //     totalCount,         // total number of documents
        //     page,               // current page number
        //     pageSize: limit,    // items per page
        //     totalPages: Math.ceil(totalCount / limit)
        // });
    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Internal server error' });
    }
});

router.get('/profile', async function (req, res, next) {
    try {

        // let username = req.params.username;
        // console.log(username);
        const page = parseInt(req.query.page) || 1;
        const limit = 8;
        const skip = (page - 1) * limit;


        const results = await controller.UserProfile({ skip, limit });
        const totalCount = await controller.UserProfileCount();
        console.log(totalCount);


        res.json({
            data: results,      // current page data
            totalCount,         // total number of documents
            page,               // current page number
            pageSize: limit,    // items per page
            totalPages: Math.ceil(totalCount / limit)
        });

    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Internal server error' });
    }
});

router.get('/favourite/:username', async function (req, res, next) {
    try {
        let username = req.params.username;
        console.log(username);
        const page = parseInt(req.query.page) || 1;
        const limit = 10;
        const skip = (page - 1) * limit;

    //
        const results = await controller.FavouriteType({ skip, limit, username });
        console.log(results);
        res.json(results);
    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Internal server error' });
    }
});



module.exports = router;
