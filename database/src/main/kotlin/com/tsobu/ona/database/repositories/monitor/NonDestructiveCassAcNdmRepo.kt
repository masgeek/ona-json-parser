package com.tsobu.ona.database.repositories.monitor

import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcNdmEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NonDestructiveCassAcNdmRepo : JpaRepository<NonDestructiveCassAcNdmEntity, Long>