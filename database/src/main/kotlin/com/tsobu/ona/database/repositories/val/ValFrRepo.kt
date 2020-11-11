package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValFrEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValFrRepo : JpaRepository<ValFrEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValFrEntity>
}