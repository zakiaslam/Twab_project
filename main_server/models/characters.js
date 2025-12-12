import mongoose from "mongoose";

const Characters
    = new mongoose.Schema(
    {

    }
);
const CharacterNicknames = new mongoose.Schema({
    // Define your fields here

    // ... other fields
});
const CharacterAnimeWorks = new mongoose.Schema({
    // Define your fields here

    // ... other fields
});
// exporting the model
export const CharactersModel = mongoose.model("characters", Characters);
export const CharacterNicknamesModel = mongoose.model("character_nicknames", CharacterNicknames);
export const CharacterAnimeWorksModel = mongoose.model("character_anime_works", CharacterAnimeWorks);
