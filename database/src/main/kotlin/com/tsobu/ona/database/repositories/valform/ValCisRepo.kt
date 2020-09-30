package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValCisEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ValCisRepo : JpaRepository<ValCisEntity?, Long?> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValCisEntity>
}