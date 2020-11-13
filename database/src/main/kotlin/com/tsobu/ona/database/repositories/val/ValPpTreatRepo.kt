package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValPpTreatEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValPpTreatRepo : JpaRepository<ValPpTreatEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpTreatEntity>
}