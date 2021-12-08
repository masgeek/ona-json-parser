package com.tsobu.ona.database.repositories.assign

import com.tsobu.ona.database.entities.assign.AssignFdTlPoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssignFdTlPoRepo : JpaRepository<AssignFdTlPoEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<AssignFdTlPoEntity>
}