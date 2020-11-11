package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassavaAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RootYieldCassavaAcRepo : JpaRepository<RootYieldCassavaAcEntity, Long> {

    override fun findAll(): List<RootYieldCassavaAcEntity>
}