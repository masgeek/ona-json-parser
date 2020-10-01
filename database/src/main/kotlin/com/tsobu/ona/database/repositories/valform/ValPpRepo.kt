package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValPpEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValPpRepo : JpaRepository<ValPpEntity?, Long?> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpEntity>
}