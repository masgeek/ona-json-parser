package com.tsobu.ona.database.repositories.batchcomposition

import com.tsobu.ona.database.entities.batchcomposition.CompositionEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CompositionRepo : JpaRepository<CompositionEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CompositionEntity>
}