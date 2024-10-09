package co.mateocontreras.dagobah.services;

import co.mateocontreras.dagobah.controllers.dto.ExerciseDto
import co.mateocontreras.dagobah.mappers.toDto
import co.mateocontreras.dagobah.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ExerciseService (@Autowired val exerciseRepository: ExerciseRepository) {
        fun getExercises(): List<ExerciseDto> = exerciseRepository.findAll().map { it.toDto() }
}
