package co.mateocontreras.dagobah.builders.entities

import co.mateocontreras.dagobah.repositories.entities.ExerciseEntity
import org.bson.types.ObjectId

class ExerciseEntityBuilder(
    private val id: ObjectId = ObjectId.get(),
    private val name: String = "Chest Press",
    private val description: String = "Press the dumbbells up",
    private val category: String = "Strength",
    private val muscularGroup: String = "Chest",
    private val equipment: String = "Dumbbells",
    private val location: String = "Gym",
) {
    fun build(): ExerciseEntity = ExerciseEntity(
        id = id,
        name = name,
        description = description,
        category = category,
        muscularGroup = muscularGroup,
        equipment = equipment,
        location = location,
    )
}