package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.RemainPlantRecEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RemainPlantRecRepo : JpaRepository<RemainPlantRecEntity, Long> {
    override fun findAll(): List<RemainPlantRecEntity>
}