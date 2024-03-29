package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignTlAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssignTlAcRepo : JpaRepository<AssignTlAcEntity?, Long?>{

    override fun findAll(): List<AssignTlAcEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<AssignTlAcEntity>
}