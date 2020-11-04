package com.tsobu.ona.database.repositories.replace

import com.tsobu.ona.database.entities.replace.ReplacePoAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ReplacePoAcRepo : JpaRepository<ReplacePoAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ReplacePoAcEntity>
}