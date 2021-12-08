package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.SgRegisterEaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SgRegisterEaRepo : JpaRepository<SgRegisterEaEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgRegisterEaEntity>
}