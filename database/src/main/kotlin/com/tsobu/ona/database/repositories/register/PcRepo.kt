package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.PcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PcRepo : JpaRepository<PcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<PcEntity>
}