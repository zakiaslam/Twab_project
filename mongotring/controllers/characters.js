// services/characters.js
import Model from '../models/characters.js';


export async function query(filter = {}) {
    // Exclude _id, return plain JS objects

    return Model.find(filter).select('-_id').lean().exec();
}
