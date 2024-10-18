package co.mateocontreras.dagobah.controllers

import co.mateocontreras.dagobah.controllers.dto.ExerciseDto
import co.mateocontreras.dagobah.services.ExerciseService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
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

    private val log: Logger? = LoggerFactory.getLogger(ExerciseController::class.java)

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun getExercises(): ResponseEntity<List<ExerciseDto>> {
        return ResponseEntity.ok(exerciseService.getExercises())
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getExerciseById(@PathVariable id: String): ResponseEntity<ExerciseDto> {
        val exercise = exerciseService.getExerciseById(id) ?:
        return ResponseEntity.notFound().build<ExerciseDto?>().also {
            log?.error("Exercise with id $id not found")
        }
        return ResponseEntity.ok(exercise)
    }
}