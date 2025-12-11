import Model from '../models/characters.js';

// Get paginated results
export async function query({ skip = 0, limit = 10, filter = {} } = {}) {
    return Model.find(filter).skip(skip).limit(limit).lean();
}

// Get total count for pagination
export async function count(filter = {}) {
    return Model.countDocuments(filter);
}
export async function searchName(filter = {}) {
    return Model.find(filter).lean();
}