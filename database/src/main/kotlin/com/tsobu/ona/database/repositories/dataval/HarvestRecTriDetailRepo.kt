package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.HarvestRecTriDetailEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HarvestRecTriDetailRepo : JpaRepository<HarvestRecTriDetailEntity, Long> {

    override fun findAll(): List<HarvestRecTriDetailEntity>
}