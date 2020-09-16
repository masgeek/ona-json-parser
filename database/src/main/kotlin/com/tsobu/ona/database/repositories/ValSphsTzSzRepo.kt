package com.tsobu.ona.database.repositories


import com.tsobu.ona.database.entities.ValSphsTzSz
import org.springframework.data.jpa.repository.JpaRepository

interface ValSphsTzSzRepo : JpaRepository<ValSphsTzSz, Long> {

    override fun findAll(): List<ValSphsTzSz>
}