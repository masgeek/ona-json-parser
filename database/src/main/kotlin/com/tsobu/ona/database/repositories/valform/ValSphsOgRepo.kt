package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValSphsOgEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValSphsOgRepo : JpaRepository<ValSphsOgEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOgEntity>
}