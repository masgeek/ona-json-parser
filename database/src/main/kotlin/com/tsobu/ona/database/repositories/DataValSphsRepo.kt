package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.DataValSphsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface DataValSphsRepo : JpaRepository<DataValSphsEntity, Long> {

    override fun findAll(): List<DataValSphsEntity>
}