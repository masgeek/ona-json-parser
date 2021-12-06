package com.tsobu.ona.database.repositories.register

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.register.PcEntity
import com.tsobu.ona.database.entities.register.SgRegisterEaEntity
import org.springframework.stereotype.Repository

@Repository
interface SgRegisterEaRepo : JpaRepository<SgRegisterEaEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgRegisterEaEntity>
}