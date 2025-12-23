import mongoose from "mongoose";


const ratings_data = new mongoose.Schema({

    anime_id: { type: Number, required: true },   // MAL anime ID
    username: { type: String, required: true },
    status: { type: String, enum: ['watching','completed','on_hold','dropped','plan_to_watch'], default: 'plan_to_watch' },
    score: { type: Number, min: 0, max: 10 },
    is_rewatching: { type: Boolean, default: false },
    num_watched_episodes: { type: Number, default: 0 },

});
const profilesAnime = new mongoose.Schema({
    username: { type: String, required: true, unique: true },

    birthday: { type: Date },
    gender: { type: String },
    location: { type: String },

    watching: { type: Number, default: 0 },
    completed: { type: Number, default: 0 },
    on_hold: { type: Number, default: 0 },
    dropped: { type: Number, default: 0 },
    plan_to_watch: { type: Number, default: 0 },

});
const favourite = new mongoose.Schema({


    fav_type: { type: Date },
      id:  { type: Number, required: true },
    username: { type: String, required: true, unique: true },
});

// exporting the model

export const ratingsModel = mongoose.model("ratings", ratings_data);
export const profilesModel = mongoose.model("profiles", profilesAnime);

export const UserProfilesModel = mongoose.model("profiles", profilesAnime);
export const FavouriteModel = mongoose.model("favs", favourite);