package com.tsobu.ona.database.repositories.monitorval

import com.tsobu.ona.database.entities.monitorval.SoilSampleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SoilSampleRepo : JpaRepository<SoilSampleEntity?, Long?>