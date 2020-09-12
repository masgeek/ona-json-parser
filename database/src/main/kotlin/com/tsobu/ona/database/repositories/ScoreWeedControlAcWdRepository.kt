package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.ScoreWeedControlAc
import com.tsobu.ona.database.entities.ScoreWeedControlAcId
import com.tsobu.ona.database.entities.ScoreWeedControlAcWd
import org.springframework.data.jpa.repository.JpaRepository

interface ScoreWeedControlAcWdRepository : JpaRepository<ScoreWeedControlAcWd, Long> {

    override fun findAll(): List<ScoreWeedControlAcWd>
}