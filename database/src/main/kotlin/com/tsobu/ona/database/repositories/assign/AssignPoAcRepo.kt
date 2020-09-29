package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignPaAcEntity
import com.tsobu.ona.database.entities.assign.AssignPoAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AssignPoAcRepo : JpaRepository<AssignPoAcEntity?, Long?>{

    override fun findAll(): List<AssignPoAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignPoAcEntity>
}