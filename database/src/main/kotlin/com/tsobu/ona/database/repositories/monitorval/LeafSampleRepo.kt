package com.tsobu.ona.database.repositories.monitorval

import com.tsobu.ona.database.entities.monitorval.LeafSampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface LeafSampleRepo : JpaRepository<LeafSampleEntity, Long>