package com.tsobu.ona.database.repositories.batchcomposition

import com.tsobu.ona.database.entities.batchcomposition.NextEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CompositionNextRepo : JpaRepository<NextEntity, Long>