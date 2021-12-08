package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.SgRegisterHhEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SgRegisterHhRepo : JpaRepository<SgRegisterHhEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgRegisterHhEntity>
}