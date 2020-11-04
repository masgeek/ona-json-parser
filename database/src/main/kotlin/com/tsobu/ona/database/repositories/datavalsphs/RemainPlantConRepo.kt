package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.RemainPlantConEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RemainPlantConRepo : JpaRepository<RemainPlantConEntity, Long> {
    override fun findAll(): List<RemainPlantConEntity>
}