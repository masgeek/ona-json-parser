package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValPpTzEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValPpTzRepo : JpaRepository<ValPpTzEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpTzEntity>
}