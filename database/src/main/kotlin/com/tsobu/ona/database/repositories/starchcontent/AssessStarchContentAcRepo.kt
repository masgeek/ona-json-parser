package com.tsobu.ona.database.repositories.starchcontent

import com.tsobu.ona.database.entities.starchcontent.AssessStarchContentAcEntity
import com.tsobu.ona.database.entities.valsphstz.EzEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AssessStarchContentAcRepo : JpaRepository<AssessStarchContentAcEntity?, Long?>{
    override fun findAll(): List<AssessStarchContentAcEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<AssessStarchContentAcEntity>
}