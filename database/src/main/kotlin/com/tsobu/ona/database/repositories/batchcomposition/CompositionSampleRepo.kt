package com.tsobu.ona.database.repositories.batchcomposition

import com.tsobu.ona.database.entities.batchcomposition.SampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CompositionSampleRepo : JpaRepository<SampleEntity, Long>