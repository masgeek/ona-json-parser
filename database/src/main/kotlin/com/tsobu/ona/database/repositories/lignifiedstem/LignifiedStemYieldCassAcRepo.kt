package com.tsobu.ona.database.repositories.lignifiedstem

import com.tsobu.ona.database.entities.lignifiedstem.LignifiedStemYieldCassAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LignifiedStemYieldCassAcRepo : JpaRepository<LignifiedStemYieldCassAcEntity?, Long?> {
    override fun findAll(): List<LignifiedStemYieldCassAcEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<LignifiedStemYieldCassAcEntity>
}