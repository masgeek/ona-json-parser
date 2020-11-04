package com.tsobu.ona.database.repositories.replace

import com.tsobu.ona.database.entities.replace.ReplaceTlAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ReplaceTlAcRepo : JpaRepository<ReplaceTlAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ReplaceTlAcEntity>
}