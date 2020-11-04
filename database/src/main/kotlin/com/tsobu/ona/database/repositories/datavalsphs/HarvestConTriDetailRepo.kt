package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.HarvestConTriDetailEntity
import org.springframework.data.jpa.repository.JpaRepository

interface HarvestConTriDetailRepo :JpaRepository<HarvestConTriDetailEntity, Long> {
    override fun findAll(): List<HarvestConTriDetailEntity>
}