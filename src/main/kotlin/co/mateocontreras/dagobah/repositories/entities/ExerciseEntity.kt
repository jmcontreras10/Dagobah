package co.mateocontreras.dagobah.repositories.entities

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "exercises")
data class ExerciseEntity (
    @Id
    var id: ObjectId? = null,
    var name: String? = null,
    var description: String? = null,
    var category: String? = null,
    var muscularGroup: String? = null,
    var equipment: String? = null,
    var location: String? = null,
)