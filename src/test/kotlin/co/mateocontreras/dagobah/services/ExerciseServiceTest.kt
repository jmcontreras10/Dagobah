package co.mateocontreras.dagobah.services

import co.mateocontreras.dagobah.builders.entities.ExerciseEntityBuilder
import co.mateocontreras.dagobah.mappers.toDto
import co.mateocontreras.dagobah.repositories.ExerciseRepository
import org.bson.types.ObjectId
import org.junit.jupiter.api.Nested
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.whenever
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@ExtendWith(MockitoExtension::class)
class ExerciseServiceTest {
    @Mock
    lateinit var exerciseRepository: ExerciseRepository

    @InjectMocks
    lateinit var exerciseService: ExerciseService

    @Test
    fun `getExercises should return all exercises`() {
        // Given
        val exercisesEntities = listOf(
            ExerciseEntityBuilder().build(),
            ExerciseEntityBuilder(id = ObjectId.get(), name = "Inclined Chest Press").build(),
        )
        whenever(exerciseRepository.findAll()).thenReturn(exercisesEntities)

        // When
        val result = exerciseService.getExercises()

        // Then
        assertEquals(exercisesEntities.map { it.toDto() }, result)
    }

    @Nested
    inner class GetExerciseById {
        @Test
        fun `getExerciseById should return the specified exercise`() {
            // Given
            val id = ObjectId.get()
            val exercise = ExerciseEntityBuilder().build()
            whenever(exerciseRepository.findById(id)).thenReturn(Optional.of(exercise))

            // When
            val result = exerciseService.getExerciseById(id.toString())

            // Then
            assertEquals(exercise.toDto(), result)
        }

        @Test
        fun `getExerciseById should throw an exception if the exercise does not exist`() {
            // Given
            val id = ObjectId.get()
            whenever(exerciseRepository.findById(id)).thenThrow(NoSuchElementException())

            // When
            assertThrows<NoSuchElementException> {
                exerciseService.getExerciseById(id.toString())}
            }
    }
}