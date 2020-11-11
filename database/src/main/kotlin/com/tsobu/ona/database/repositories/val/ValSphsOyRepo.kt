package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValSphsOyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsOyRepo : JpaRepository<ValSphsOyEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOyEntity>
}