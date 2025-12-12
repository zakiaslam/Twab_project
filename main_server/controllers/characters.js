import { CharacterAnimeWorksModel, CharacterNicknamesModel } from '../models/characters.js';


export async function queryAnimeWorks({ skip = 0, limit = 10, filter = {} } = {}) {
    return CharacterAnimeWorksModel.find(filter).skip(skip).limit(limit).lean();
}

export async function countAnimeWorks(filter = {}) {
    return CharacterAnimeWorksModel.countDocuments(filter);
}

export async function searchAnimeWorks(filter = {}) {
    return CharacterAnimeWorksModel.find(filter).lean();
}


export async function queryNicknames({ skip = 0, limit = 10, filter = {} } = {}) {
    return CharacterNicknamesModel.find(filter).skip(skip).limit(limit).lean();
}

export async function countNicknames(filter = {}) {
    return CharacterNicknamesModel.countDocuments(filter);
}

export async function searchNicknames(filter = {}) {
    return CharacterNicknamesModel.find(filter).lean();
}
