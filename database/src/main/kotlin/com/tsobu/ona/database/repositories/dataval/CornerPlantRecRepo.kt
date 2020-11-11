package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.CornerPlantRecEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CornerPlantRecRepo : JpaRepository<CornerPlantRecEntity, Long> {
    override fun findAll(): List<CornerPlantRecEntity>
}