package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.ScoreWeedControlAc
import org.springframework.data.jpa.repository.JpaRepository

interface ScoreWeedControlAcRepo : JpaRepository<ScoreWeedControlAc, Long> {

    override fun findAll(): List<ScoreWeedControlAc>
}