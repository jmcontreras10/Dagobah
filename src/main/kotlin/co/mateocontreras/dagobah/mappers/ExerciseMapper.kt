package co.mateocontreras.dagobah.mappers

import co.mateocontreras.dagobah.controllers.dto.ExerciseDto
import co.mateocontreras.dagobah.repositories.entities.ExerciseEntity

fun ExerciseEntity.toDto(): ExerciseDto {
    this.let {
        return ExerciseDto(
            id = it.id.toString(),
            name = it.name,
            description = it.description,
            category = it.category,
            muscularGroup = it.muscularGroup,
            equipment = it.equipment,
            location = it.location
        )
    }
}

fun ExerciseDto.toEntity(): ExerciseEntity {
    this.let {
        return ExerciseEntity(
            name = it.name,
            description = it.description,
            category = it.category,
            muscularGroup = it.muscularGroup,
            equipment = it.equipment,
            location = it.location
        )
    }
}