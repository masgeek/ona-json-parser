package com.tsobu.ona.database.repositories.greenbiomass

import com.tsobu.ona.database.entities.greenbiomass.YieldCassEntity
import org.springframework.data.jpa.repository.JpaRepository

interface YieldCassRepo : JpaRepository<YieldCassEntity?, Long?> {
    override fun findAll(): List<YieldCassEntity>

    fun findAllByOrderBySubmissionDateAsc(): List<YieldCassEntity>
}