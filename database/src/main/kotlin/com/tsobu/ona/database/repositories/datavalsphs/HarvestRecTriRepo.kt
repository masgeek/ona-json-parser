package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.SphsHarvestRecTriEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HarvestRecTriRepo : JpaRepository<SphsHarvestRecTriEntity, Long> {
    override fun findAll(): List<SphsHarvestRecTriEntity>
}