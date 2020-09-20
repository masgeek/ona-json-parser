package com.tsobu.ona.database.repositories.valsphstz

import com.tsobu.ona.database.entities.valsphstz.EzEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EzRepo : JpaRepository<EzEntity, Long> {
    override fun findAll(): List<EzEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<EzEntity>
}