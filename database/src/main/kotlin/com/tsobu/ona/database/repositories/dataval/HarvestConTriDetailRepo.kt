package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.HarvestConTriDetailEntity
import org.springframework.data.jpa.repository.JpaRepository

interface HarvestConTriDetailRepo :JpaRepository<HarvestConTriDetailEntity, Long> {
    override fun findAll(): List<HarvestConTriDetailEntity>
}