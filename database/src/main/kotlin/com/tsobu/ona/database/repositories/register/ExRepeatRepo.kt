package com.tsobu.ona.database.repositories.register

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.register.ExRepeatEntity

interface ExRepeatRepo : JpaRepository<ExRepeatEntity, Long>