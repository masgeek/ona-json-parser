package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.ScoreWeedControlAc
import com.tsobu.ona.database.entities.ScoreWeedControlAcId
import org.springframework.data.jpa.repository.JpaRepository

interface ScoreWeedControlAcIdRepository : JpaRepository<ScoreWeedControlAcId, Long> {

    override fun findAll(): List<ScoreWeedControlAcId>
}