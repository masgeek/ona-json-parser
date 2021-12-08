package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.RegisterEaDgEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RegisterEaDgRepo : JpaRepository<RegisterEaDgEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<RegisterEaDgEntity>
}