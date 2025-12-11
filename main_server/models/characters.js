const mongoose = require('mongoose');

const Characters
    = new mongoose.Schema(
    {

    }
);
const profileSchema = new mongoose.Schema({
    // Define your fields here
    userId: mongoose.Schema.Types.ObjectId,
    // ... other fields
});
const character_anime = new mongoose.Schema({
    // Define your fields here
    userId: mongoose.Schema.Types.ObjectId,
    // ... other fields
});
// exporting the model
module.exports = mongoose.model('characters', Characters);
module.exports = mongoose.model('Profile', profileSchema);
module.exports = mongoose.model('character_anime_works', character_anime);
