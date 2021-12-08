package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.RegisterHhDgEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RegisterHhDgRepo : JpaRepository<RegisterHhDgEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<RegisterHhDgEntity>
}