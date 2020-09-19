package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.CornerPlantConEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CornerPlantConRepo : JpaRepository<CornerPlantConEntity, Long> {
    override fun findAll(): List<CornerPlantConEntity>
}