package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValFrEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValFrRepo : JpaRepository<ValFrEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValFrEntity>
}