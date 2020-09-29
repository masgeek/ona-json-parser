package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignFdAcEntity
import com.tsobu.ona.database.entities.dataval.FrEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AssignFdAcRepo : JpaRepository<AssignFdAcEntity?, Long?>{

    override fun findAll(): List<AssignFdAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignFdAcEntity>
}