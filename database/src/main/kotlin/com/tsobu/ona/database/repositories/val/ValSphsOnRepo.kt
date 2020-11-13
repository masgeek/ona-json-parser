package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValSphsOnEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsOnRepo : JpaRepository<ValSphsOnEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOnEntity>
}