package com.tsobu.ona.database.repositories.sg

import com.tsobu.ona.database.entities.sg.SgDataValFipEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SgDataValFipRepo : JpaRepository<SgDataValFipEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgDataValFipEntity>
}