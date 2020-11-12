package com.tsobu.ona.database.repositories

import com.tsobu.ona.database.entities.FormColumnValidationEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FormColumnValidationRepo : JpaRepository<FormColumnValidationEntity, String>