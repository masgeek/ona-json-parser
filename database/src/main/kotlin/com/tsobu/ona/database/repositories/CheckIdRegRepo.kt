package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.CheckIdRegEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CheckIdRegRepo : JpaRepository<CheckIdRegEntity?, Long?> {
    override fun findAll(): List<CheckIdRegEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<CheckIdRegEntity>
}