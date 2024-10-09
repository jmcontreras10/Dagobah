package co.mateocontreras.dagobah.controllers

import co.mateocontreras.dagobah.builders.dtos.ExerciseDtoBuilder
import co.mateocontreras.dagobah.builders.entities.ExerciseEntityBuilder
import co.mateocontreras.dagobah.mappers.toDto
import co.mateocontreras.dagobah.services.ExerciseService
import co.mateocontreras.dagobah.util.toObjectId
import org.bson.types.ObjectId
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.kotlin.whenever
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
internal class ExerciseControllerTest {
    @Mock
    lateinit var exerciseService: ExerciseService

    @InjectMocks
    lateinit var exerciseController: ExerciseController

    @Test
    fun `getExercises should return all exercises`() {
        val exercises = listOf(
            ExerciseDtoBuilder().build(),
            ExerciseDtoBuilder(id = ObjectId.get().toString(), name = "Inclined Chest Press").build(),
        )
        whenever(exerciseService.getExercises()).thenReturn(exercises)

        val response = exerciseController.getExercises()
        assertEquals(exercises, response)
    }


    @Nested
    inner class GetExerciseById {
        @Test
        fun `getExerciseById should return the specified exercise`() {
            val id = ObjectId.get().toString()
            val exerciseDto = ExerciseDtoBuilder(id=id).build()
            whenever(exerciseService.getExerciseById(id)).thenReturn(exerciseDto)

            val response = exerciseController.getExerciseById(id)
            assertEquals(exerciseDto, response)
        }

        @Test
        fun `getExerciseById should throw an exception if the exercise does not exist`() {
            val id = ObjectId.get().toString()
            whenever(exerciseService.getExerciseById(id)).thenThrow(NoSuchElementException())
            assertThrows<NoSuchElementException> { exerciseController.getExerciseById(id) }
        }
    }
}