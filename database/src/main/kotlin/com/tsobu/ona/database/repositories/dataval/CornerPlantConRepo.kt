package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.CornerPlantConEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CornerPlantConRepo : JpaRepository<CornerPlantConEntity, Long> {
    override fun findAll(): List<CornerPlantConEntity>
}