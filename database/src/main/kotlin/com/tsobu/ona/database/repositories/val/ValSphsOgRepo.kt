package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValSphsOgEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsOgRepo : JpaRepository<ValSphsOgEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOgEntity>
}