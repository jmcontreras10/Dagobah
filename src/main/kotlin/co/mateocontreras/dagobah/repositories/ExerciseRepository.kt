package co.mateocontreras.dagobah.repositories

import co.mateocontreras.dagobah.repositories.entities.ExerciseEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ExerciseRepository: MongoRepository<ExerciseEntity, ObjectId> {
}