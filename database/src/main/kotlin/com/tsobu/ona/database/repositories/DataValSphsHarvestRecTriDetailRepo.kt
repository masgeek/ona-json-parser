package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.BaseEntity
import com.tsobu.ona.database.entities.DataValSphsHarvestRecTriDetailEntity
import com.tsobu.ona.database.entities.ValSphsTzSzEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.persistence.Entity
import javax.persistence.Table

@Repository
interface DataValSphsHarvestRecTriDetailRepo : JpaRepository<DataValSphsHarvestRecTriDetailEntity, Long> {

    override fun findAll(): List<DataValSphsHarvestRecTriDetailEntity>
}