package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.SgDataValFipEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SgDataValFipRepo : JpaRepository<SgDataValFipEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgDataValFipEntity>
}