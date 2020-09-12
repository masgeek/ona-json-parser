package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.RootYieldCassavaAc
import com.tsobu.ona.database.entities.RootYieldCassavaAcYieldAssessment
import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


interface RootYieldCassavaAcYieldAssessmentRepo : JpaRepository<RootYieldCassavaAcYieldAssessment, Long> {

    override fun findAll(): List<RootYieldCassavaAcYieldAssessment>
}