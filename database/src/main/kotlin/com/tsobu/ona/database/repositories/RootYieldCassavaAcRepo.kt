package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.rootyieldcassava.CassavaAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RootYieldCassavaAcRepo : JpaRepository<CassavaAcEntity, Long> {

    override fun findAll(): List<CassavaAcEntity>
}