package com.tsobu.ona.database.repositories.monitorval

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.monitorval.PlotLayoutEntity

interface PlotLayoutRepo : JpaRepository<PlotLayoutEntity, Long>