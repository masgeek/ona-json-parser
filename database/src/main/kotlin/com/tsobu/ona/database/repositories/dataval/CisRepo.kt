package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.CisEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CisRepo : JpaRepository<CisEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CisEntity>
}