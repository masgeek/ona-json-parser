package com.tsobu.ona.database.repositories.starchcontent

import com.tsobu.ona.database.entities.starchcontent.AssessStarchContentAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssessStarchContentAcRepo : JpaRepository<AssessStarchContentAcEntity?, Long?>{
    override fun findAll(): List<AssessStarchContentAcEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<AssessStarchContentAcEntity>
}