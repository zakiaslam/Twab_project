const mongoose = require('mongoose');

const Characters
    = new mongoose.Schema(
    {}
);
// exporting the model
module.exports = mongoose.model('Characters', Characters);
