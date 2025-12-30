import {FavouriteModel, profilesModel, ratingsModel, UserProfilesModel} from '../models/characters.js';






export async function FindRatingsById({ skip = 0, limit = 10, anime_id,filter = {} } = {}) {
    if (anime_id) {
        filter.anime_id = anime_id;
    }

    return ratingsModel.find(filter).skip(skip).limit(limit).lean();
}



export async function profilesData({ skip = 0, limit = 10,username, filter = {} } = {}) {
    if (username) {
        filter.username = { $regex: `^${username}$`, $options: "i" };
    }
    return profilesModel.find(filter).skip(skip).limit(limit).lean();
}
export async function UserProfile({ skip = 0, limit = 10, filter = {} } = {}) {
    console.log("zaki")
    return UserProfilesModel.find({}).skip(skip).limit(limit).lean();
}
export async function UserProfileCount({ skip = 0, limit = 10, filter = {} } = {}) {

    return UserProfilesModel.countDocuments().exec();
}
export async function FavouriteType({ skip = 0, limit = 10,username, filter = {} } = {}) {
    if (username) {
        filter.username = { $regex: `^${username}$`, $options: "i" };
    }
    return FavouriteModel.find(filter).skip(skip).limit(limit).lean();
}
