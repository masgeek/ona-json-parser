package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.DataValSphsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DataValSphsRepo : JpaRepository<DataValSphsEntity, Long> {

    override fun findAll(): List<DataValSphsEntity>
}