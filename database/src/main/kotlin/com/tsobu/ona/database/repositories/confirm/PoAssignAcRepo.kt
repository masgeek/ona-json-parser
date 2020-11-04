package com.tsobu.ona.database.repositories.confirm

import com.tsobu.ona.database.entities.confirm.ConfirmPoAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PoAssignAcRepo : JpaRepository<ConfirmPoAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ConfirmPoAcEntity>
}