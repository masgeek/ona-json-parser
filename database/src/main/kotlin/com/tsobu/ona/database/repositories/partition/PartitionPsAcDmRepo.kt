package com.tsobu.ona.database.repositories.partition

import com.tsobu.ona.database.entities.partition.PartitionPsAcDmEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface PartitionPsAcDmRepo : JpaRepository<PartitionPsAcDmEntity, Long>