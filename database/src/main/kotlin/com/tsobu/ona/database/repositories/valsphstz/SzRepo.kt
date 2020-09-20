package com.tsobu.ona.database.repositories.valsphstz


import com.tsobu.ona.database.entities.valsphstz.SzEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SzRepo : JpaRepository<SzEntity, Long> {

    override fun findAll(): List<SzEntity>
}