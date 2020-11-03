package com.tsobu.ona.database.repositories.monitor

import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NonDestructiveCassAcRepo : JpaRepository<NonDestructiveCassAcEntity, Long>