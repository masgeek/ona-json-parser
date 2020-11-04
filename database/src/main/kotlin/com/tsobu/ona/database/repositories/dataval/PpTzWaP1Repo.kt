package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.PpTzWaP1Entity
import org.springframework.data.jpa.repository.JpaRepository

interface PpTzWaP1Repo : JpaRepository<PpTzWaP1Entity, Long> {

    override fun findAll(): List<PpTzWaP1Entity>
}