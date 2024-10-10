package co.mateocontreras.dagobah.mappers

import co.mateocontreras.dagobah.builders.dtos.ExerciseDtoBuilder
import co.mateocontreras.dagobah.builders.entities.ExerciseEntityBuilder
import co.mateocontreras.dagobah.util.toObjectId
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@ExtendWith(MockitoExtension::class)
class ExerciseMapperTest {

    @Test
    fun `should map exercise to exercise dto`() {
        // Given
        val exercise = ExerciseEntityBuilder().build()

        // When
        val exerciseDto = exercise.toDto()

        // Then
        assertEquals(exercise.id.toString(), exerciseDto.id)
        assertEquals(exercise.name, exerciseDto.name)
        assertEquals(exercise.description, exerciseDto.description)
        assertEquals(exercise.category, exerciseDto.category)
        assertEquals(exercise.muscularGroup, exerciseDto.muscularGroup)
        assertEquals(exercise.equipment, exerciseDto.equipment)
    }

    @Test
    fun `should map exercise dto to exercise`() {
        // Given
        val exerciseDto = ExerciseDtoBuilder().build()

        // When
        val exercise = exerciseDto.toEntity()

        // Then
        assertEquals(exerciseDto.id?.toObjectId(), exercise.id)
        assertEquals(exerciseDto.name, exercise.name)
        assertEquals(exerciseDto.description, exercise.description)
        assertEquals(exerciseDto.category, exercise.category)
        assertEquals(exerciseDto.muscularGroup, exercise.muscularGroup)
        assertEquals(exerciseDto.equipment, exercise.equipment)
    }
}