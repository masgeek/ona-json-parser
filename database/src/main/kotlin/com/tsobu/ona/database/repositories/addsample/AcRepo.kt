package com.tsobu.ona.database.repositories.addsample

import com.tsobu.ona.database.entities.addsample.AcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AcRepo : JpaRepository<AcEntity, Long> {
    override fun findAll(): List<AcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AcEntity>
}