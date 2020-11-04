package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.HhEntity
import org.springframework.data.jpa.repository.JpaRepository

interface HhRepo : JpaRepository<HhEntity, Long> {

    override fun findAll(): List<HhEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<HhEntity>
}