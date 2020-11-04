package com.tsobu.ona.database.repositories.partition

import com.tsobu.ona.database.entities.partition.PartitionPsAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PartitionPsAcRepo : JpaRepository<PartitionPsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<PartitionPsAcEntity>
}