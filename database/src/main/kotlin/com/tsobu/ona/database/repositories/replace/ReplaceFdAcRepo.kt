package com.tsobu.ona.database.repositories.replace

import com.tsobu.ona.database.entities.replace.ReplaceFdAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ReplaceFdAcRepo : JpaRepository<ReplaceFdAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ReplaceFdAcEntity>
}