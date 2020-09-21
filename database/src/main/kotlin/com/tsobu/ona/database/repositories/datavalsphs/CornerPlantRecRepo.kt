package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.CornerPlantRecEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CornerPlantRecRepo : JpaRepository<CornerPlantRecEntity, Long> {
    override fun findAll(): List<CornerPlantRecEntity>
}