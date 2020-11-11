package com.tsobu.ona.database.repositories.`val`

import com.tsobu.ona.database.entities.`val`.ValIcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ValIcRepo : JpaRepository<ValIcEntity, Long> {
    abstract fun findAllByOrderBySubmissionDateAsc(): List<ValIcEntity>
}