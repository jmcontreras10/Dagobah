package co.mateocontreras.dagobah.builders.dtos

import co.mateocontreras.dagobah.controllers.dto.ExerciseDto
import co.mateocontreras.dagobah.repositories.entities.ExerciseEntity
import org.bson.types.ObjectId

class ExerciseDtoBuilder(
    private val id: String = ObjectId.get().toString(),
    private val name: String = "Chest Press",
    private val description: String = "Press the dumbbells up",
    private val category: String = "Strength",
    private val muscularGroup: String = "Chest",
    private val equipment: String = "Dumbbells",
    private val location: String = "Gym",
) {
    fun build(): ExerciseDto = ExerciseDto(
        id = id,
        name = name,
        description = description,
        category = category,
        muscularGroup = muscularGroup,
        equipment = equipment,
        location = location,
    )
}