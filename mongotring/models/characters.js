const mongoose = require('mongoose');

const Character
    = new mongoose.Schema(
    {

    }
);



// exporting the model
module.exports = mongoose.model('Character', Character);
