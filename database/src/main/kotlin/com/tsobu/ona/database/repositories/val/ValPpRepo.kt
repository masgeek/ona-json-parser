package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValPpEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValPpRepo : JpaRepository<ValPpEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpEntity>
    override fun findAll(): List<ValPpEntity>
}