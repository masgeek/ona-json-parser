package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.AssessRootYieldCassavaAc
import com.tsobu.ona.database.entities.ScoreWeedControlAcId
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column

interface AssessRootYieldCassavaAcRepo : JpaRepository<AssessRootYieldCassavaAc, Long> {

    override fun findAll(): List<AssessRootYieldCassavaAc>
}