package com.tsobu.ona.database.repositories.register

import com.tsobu.ona.database.entities.register.ExRepeatEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ExRepeatRepo : JpaRepository<ExRepeatEntity, Long>