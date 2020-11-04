package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.HarvestRecTriDetailEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HarvestRecTriDetailRepo : JpaRepository<HarvestRecTriDetailEntity, Long> {

    override fun findAll(): List<HarvestRecTriDetailEntity>
}