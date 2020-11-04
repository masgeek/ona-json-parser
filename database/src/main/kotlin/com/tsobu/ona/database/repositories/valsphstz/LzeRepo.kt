package com.tsobu.ona.database.repositories.valsphstz

import com.tsobu.ona.database.entities.valsphstz.LzeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LzeRepo : JpaRepository<LzeEntity, Long> {
    override fun findAll(): List<LzeEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<LzeEntity>
}