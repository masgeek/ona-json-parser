package com.tsobu.ona.database.repositories.assign

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.assign.AssignFdTlPoEntity

interface AssignFdTlPoRepo : JpaRepository<AssignFdTlPoEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<AssignFdTlPoEntity>
}