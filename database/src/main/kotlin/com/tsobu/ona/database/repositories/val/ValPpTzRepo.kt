package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValPpTzEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValPpTzRepo : JpaRepository<ValPpTzEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<ValPpTzEntity>
}