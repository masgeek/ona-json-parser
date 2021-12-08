package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.ExEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ExRepo : JpaRepository<ExEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ExEntity>
}