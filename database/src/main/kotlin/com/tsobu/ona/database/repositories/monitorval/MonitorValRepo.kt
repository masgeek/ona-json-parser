package com.tsobu.ona.database.repositories.monitorval

import com.tsobu.ona.database.entities.monitorval.MonitorValEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MonitorValRepo : JpaRepository<MonitorValEntity, Long> {

    override fun findAll(): List<MonitorValEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<MonitorValEntity>
}