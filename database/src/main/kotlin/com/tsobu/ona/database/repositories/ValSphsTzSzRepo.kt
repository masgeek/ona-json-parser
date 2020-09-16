package com.tsobu.ona.database.repositories


import com.tsobu.ona.database.entities.ValSphsTzSzEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ValSphsTzSzRepo : JpaRepository<ValSphsTzSzEntity, Long> {

    override fun findAll(): List<ValSphsTzSzEntity>
}