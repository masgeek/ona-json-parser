package com.tsobu.ona.database.repositories.monitorval

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.monitorval.PhEntity
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface PhRepo : JpaRepository<PhEntity, Long>