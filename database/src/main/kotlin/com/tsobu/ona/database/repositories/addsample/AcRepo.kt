package com.tsobu.ona.database.repositories.addsample

import com.tsobu.ona.database.entities.addsample.SampleLabelAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AcRepo : JpaRepository<SampleLabelAcEntity, Long> {
    override fun findAll(): List<SampleLabelAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<SampleLabelAcEntity>
}