package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RootYieldCassavaAcRepo : JpaRepository<RootYieldCassAcEntity, Long> {

    override fun findAll(): List<RootYieldCassAcEntity>
}