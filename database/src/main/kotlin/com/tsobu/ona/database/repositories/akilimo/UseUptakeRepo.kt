package com.tsobu.ona.database.repositories.akilimo

import com.tsobu.ona.database.entities.akilimo.UseUptakeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UseUptakeRepo : JpaRepository<UseUptakeEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<UseUptakeEntity>
}