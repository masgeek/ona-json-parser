package com.tsobu.ona.database.repositories.validation

import com.tsobu.ona.database.entities.validation.ChoiceValidationKanoKadunaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ChoiceValidationKanoKadunaRepo : JpaRepository<ChoiceValidationKanoKadunaEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ChoiceValidationKanoKadunaEntity>
}