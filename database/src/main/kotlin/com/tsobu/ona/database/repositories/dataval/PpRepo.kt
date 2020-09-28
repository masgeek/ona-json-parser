package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.PpEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PpRepo : JpaRepository<PpEntity, Long> {

    override fun findAll(): List<PpEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<PpEntity>
}
