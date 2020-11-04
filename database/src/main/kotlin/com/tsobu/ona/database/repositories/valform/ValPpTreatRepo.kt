package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValPpTreatEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValPpTreatRepo : JpaRepository<ValPpTreatEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpTreatEntity>
}