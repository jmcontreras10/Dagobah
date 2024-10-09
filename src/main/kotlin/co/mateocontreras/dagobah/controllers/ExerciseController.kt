package co.mateocontreras.dagobah.controllers

import co.mateocontreras.dagobah.controllers.dto.ExerciseDto
import co.mateocontreras.dagobah.services.ExerciseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/exercises")
class ExerciseController(
    @Autowired val exerciseService: ExerciseService
) {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun getExercises(): List<ExerciseDto> {
        return exerciseService.getExercises()
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getExerciseById(@PathVariable id: String): ExerciseDto {
        return exerciseService.getExerciseById(id)
    }
}