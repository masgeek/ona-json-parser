package com.tsobu.ona.database.repositories.validation

import com.tsobu.ona.database.entities.CheckIdRegEntity
import com.tsobu.ona.database.entities.validation.ChoiceValidationEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ChoiceValidationRepo : JpaRepository<ChoiceValidationEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ChoiceValidationEntity>
}