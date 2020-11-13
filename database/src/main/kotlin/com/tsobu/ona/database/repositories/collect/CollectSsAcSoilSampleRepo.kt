package com.tsobu.ona.database.repositories.collect

import com.tsobu.ona.database.entities.collect.CollectSsAcSoilSampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CollectSsAcSoilSampleRepo : JpaRepository<CollectSsAcSoilSampleEntity, Long>