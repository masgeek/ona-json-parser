package com.tsobu.ona.database.repositories.akilimo

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.akilimo.UseUptakeEntity

interface UseUptakeRepo : JpaRepository<UseUptakeEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<UseUptakeEntity>
}