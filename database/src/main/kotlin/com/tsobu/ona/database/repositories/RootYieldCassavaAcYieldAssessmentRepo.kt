package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.RootYieldCassavaAc
import com.tsobu.ona.database.entities.RootYieldCassavaAcYieldAssessment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Repository
interface RootYieldCassavaAcYieldAssessmentRepo : JpaRepository<RootYieldCassavaAcYieldAssessment, Long> {

    override fun findAll(): List<RootYieldCassavaAcYieldAssessment>
}