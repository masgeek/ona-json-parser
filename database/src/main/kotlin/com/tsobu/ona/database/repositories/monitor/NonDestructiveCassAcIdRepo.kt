package com.tsobu.ona.database.repositories.monitor

import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcIdEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NonDestructiveCassAcIdRepo : JpaRepository<NonDestructiveCassAcIdEntity, Long>