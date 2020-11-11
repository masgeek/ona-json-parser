package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValSphsKwEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsKwRepo : JpaRepository<ValSphsKwEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsKwEntity>
}