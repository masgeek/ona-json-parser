package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.scoreweedcontrol.AcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScoreWeedControlAcRepo : JpaRepository<AcEntity, Long> {

    override fun findAll(): List<AcEntity>
}