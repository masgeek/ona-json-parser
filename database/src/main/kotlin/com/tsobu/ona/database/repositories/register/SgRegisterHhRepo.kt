package com.tsobu.ona.database.repositories.register

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.register.PcEntity
import com.tsobu.ona.database.entities.register.SgRegisterEaEntity
import com.tsobu.ona.database.entities.register.SgRegisterHhEntity
import org.springframework.stereotype.Repository

@Repository
interface SgRegisterHhRepo : JpaRepository<SgRegisterHhEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<SgRegisterHhEntity>
}