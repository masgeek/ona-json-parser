package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.PpTzEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PpTzRepo : JpaRepository<PpTzEntity, Long> {

    override fun findAll(): List<PpTzEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<PpTzEntity>
}
