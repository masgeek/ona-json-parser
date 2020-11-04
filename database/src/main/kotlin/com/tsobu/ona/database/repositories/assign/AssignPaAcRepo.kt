package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignFdAcEntity
import com.tsobu.ona.database.entities.assign.AssignPaAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AssignPaAcRepo : JpaRepository<AssignPaAcEntity?, Long?>{

    override fun findAll(): List<AssignPaAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignPaAcEntity>
}