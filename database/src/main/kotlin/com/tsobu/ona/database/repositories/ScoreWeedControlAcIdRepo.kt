package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.ScoreWeedControlAc
import com.tsobu.ona.database.entities.ScoreWeedControlAcId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScoreWeedControlAcIdRepo : JpaRepository<ScoreWeedControlAcId, Long> {

    override fun findAll(): List<ScoreWeedControlAcId>
}