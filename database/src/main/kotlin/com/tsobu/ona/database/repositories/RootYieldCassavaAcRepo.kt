package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.RootYieldCassavaAc
import org.springframework.data.jpa.repository.JpaRepository

interface RootYieldCassavaAcRepo : JpaRepository<RootYieldCassavaAc, Long> {

    override fun findAll(): List<RootYieldCassavaAc>
}