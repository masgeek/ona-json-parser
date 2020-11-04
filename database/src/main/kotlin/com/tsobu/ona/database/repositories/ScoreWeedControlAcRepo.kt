package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.scoreweedcontrol.WeedAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScoreWeedControlAcRepo : JpaRepository<WeedAcEntity, Long> {

    override fun findAll(): List<WeedAcEntity>
}