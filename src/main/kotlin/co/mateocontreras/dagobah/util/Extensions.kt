package co.mateocontreras.dagobah.util

import org.bson.types.ObjectId

fun String.toObjectId(): ObjectId {
    return ObjectId(this)
}