package com.tsobu.ona.database.repositories.pool

import com.tsobu.ona.database.entities.pool.PoolSamplesAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PoolSamplesAcRepo : JpaRepository<PoolSamplesAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<PoolSamplesAcEntity>
}