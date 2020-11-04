package com.tsobu.ona.database.repositories

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.CheckIdRegEntity
import com.tsobu.ona.database.entities.starchcontent.AssessStarchContentAcEntity

interface CheckIdRegRepo : JpaRepository<CheckIdRegEntity?, Long?> {
    override fun findAll(): List<CheckIdRegEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<CheckIdRegEntity>
}