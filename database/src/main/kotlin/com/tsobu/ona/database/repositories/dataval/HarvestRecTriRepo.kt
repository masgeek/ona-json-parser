package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.HarvestRecTriEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HarvestRecTriRepo : JpaRepository<HarvestRecTriEntity, Long> {
    override fun findAll(): List<HarvestRecTriEntity>
}