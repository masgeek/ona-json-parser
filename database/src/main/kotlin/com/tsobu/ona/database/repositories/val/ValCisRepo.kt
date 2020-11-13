package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValCisEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValCisRepo : JpaRepository<ValCisEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValCisEntity>
}