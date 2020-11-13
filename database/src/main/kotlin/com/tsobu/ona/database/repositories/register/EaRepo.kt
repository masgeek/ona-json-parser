package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.EaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EaRepo : JpaRepository<EaEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<EaEntity>
}