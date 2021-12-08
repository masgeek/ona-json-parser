package com.tsobu.ona.database.repositories.validation

import com.tsobu.ona.database.entities.validation.ChoiceValidationEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ChoiceValidationRepo : JpaRepository<ChoiceValidationEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ChoiceValidationEntity>
}