package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignFdAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssignFdAcRepo : JpaRepository<AssignFdAcEntity?, Long?>{

    override fun findAll(): List<AssignFdAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignFdAcEntity>
}