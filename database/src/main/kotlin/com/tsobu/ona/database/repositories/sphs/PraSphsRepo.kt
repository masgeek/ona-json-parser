package com.tsobu.ona.database.repositories.sphs

import com.tsobu.ona.database.entities.sphs.PraSphsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PraSphsRepo : JpaRepository<PraSphsEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<PraSphsEntity>
}