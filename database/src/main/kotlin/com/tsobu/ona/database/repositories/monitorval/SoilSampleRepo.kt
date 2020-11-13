package com.tsobu.ona.database.repositories.monitorval

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.monitorval.SoilSampleEntity

interface SoilSampleRepo : JpaRepository<SoilSampleEntity?, Long?>