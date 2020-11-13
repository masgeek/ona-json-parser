package com.tsobu.ona.database.repositories.record

import com.tsobu.ona.database.entities.record.RecordDmPsAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RecordDmPsAcRepo : JpaRepository<RecordDmPsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<RecordDmPsAcEntity>
}