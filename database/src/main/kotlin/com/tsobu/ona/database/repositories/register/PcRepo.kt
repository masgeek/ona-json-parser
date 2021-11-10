package com.tsobu.ona.database.repositories.register

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.register.PcEntity

interface PcRepo : JpaRepository<PcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<PcEntity>
}