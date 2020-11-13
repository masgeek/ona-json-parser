package com.tsobu.ona.database.repositories.replace

import com.tsobu.ona.database.entities.replace.ReplaceFbAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ReplaceFbAcRepo : JpaRepository<ReplaceFbAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ReplaceFbAcEntity>
}