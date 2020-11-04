package com.tsobu.ona.database.repositories.record

import com.tsobu.ona.database.entities.record.CanopyDimensionsAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CanopyDimensionsAcRepo : JpaRepository<CanopyDimensionsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CanopyDimensionsAcEntity>
}