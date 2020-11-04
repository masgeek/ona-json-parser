package com.tsobu.ona.database.repositories.valsphstz

import com.tsobu.ona.database.entities.valsphstz.LzwEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LzwRepo : JpaRepository<LzwEntity, Long> {
    override fun findAll(): List<LzwEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<LzwEntity>
}