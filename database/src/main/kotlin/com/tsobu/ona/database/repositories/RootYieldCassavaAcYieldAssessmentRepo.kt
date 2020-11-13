package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcYaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RootYieldCassavaAcYieldAssessmentRepo : JpaRepository<RootYieldCassAcYaEntity, Long> {

    override fun findAll(): List<RootYieldCassAcYaEntity>
}