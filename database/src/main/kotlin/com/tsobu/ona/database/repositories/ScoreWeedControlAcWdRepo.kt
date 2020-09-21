package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.scoreweedcontrol.WdEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScoreWeedControlAcWdRepo : JpaRepository<WdEntity, Long> {

    override fun findAll(): List<WdEntity>
}