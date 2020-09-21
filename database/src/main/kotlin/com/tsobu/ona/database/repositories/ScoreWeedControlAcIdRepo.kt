package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.scoreweedcontrol.AcIdEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScoreWeedControlAcIdRepo : JpaRepository<AcIdEntity, Long> {

    override fun findAll(): List<AcIdEntity>
}