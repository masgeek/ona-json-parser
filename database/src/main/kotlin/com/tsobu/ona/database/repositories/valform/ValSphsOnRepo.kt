package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValSphsOnEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValSphsOnRepo : JpaRepository<ValSphsOnEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOnEntity>
}