package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignPoAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssignPoAcRepo : JpaRepository<AssignPoAcEntity?, Long?>{

    override fun findAll(): List<AssignPoAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignPoAcEntity>
}