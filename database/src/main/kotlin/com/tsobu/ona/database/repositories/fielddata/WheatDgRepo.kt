package com.tsobu.ona.database.repositories.fielddata

import com.tsobu.ona.database.entities.fielddata.WheatDgEntity
import org.springframework.data.jpa.repository.JpaRepository

interface WheatDgRepo : JpaRepository<WheatDgEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<WheatDgEntity>
}