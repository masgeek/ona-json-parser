package com.tsobu.ona.database.repositories.agro

import com.tsobu.ona.database.entities.agro.AdvisoryWv2Entity
import org.springframework.data.jpa.repository.JpaRepository

interface AdvisoryRepo : JpaRepository<AdvisoryWv2Entity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<AdvisoryWv2Entity>
}