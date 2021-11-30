package com.tsobu.ona.database.repositories.validation

import com.tsobu.ona.database.entities.CheckIdRegEntity
import com.tsobu.ona.database.entities.validation.ChoiceValidationEntity
import com.tsobu.ona.database.entities.validation.ChoiceValidationKanoKadunaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ChoiceValidationKanoKadunaRepo : JpaRepository<ChoiceValidationKanoKadunaEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ChoiceValidationKanoKadunaEntity>
}