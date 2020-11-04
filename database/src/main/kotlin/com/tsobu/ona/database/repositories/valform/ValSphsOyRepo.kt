package com.tsobu.ona.database.repositories.valform

import com.tsobu.ona.database.entities.valform.ValSphsOyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsOyRepo : JpaRepository<ValSphsOyEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValSphsOyEntity>
}