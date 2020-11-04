package com.tsobu.ona.database.repositories.addsample

import com.tsobu.ona.database.entities.addsample.AcEntity
import com.tsobu.ona.database.entities.addsample.AcSampleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AcSampleRepo : JpaRepository<AcSampleEntity?, Long?>