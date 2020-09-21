package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.FrEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FrRepo : JpaRepository<FrEntity, Long> {

    override fun findAll(): List<FrEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<FrEntity>
}
