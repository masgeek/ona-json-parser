package com.tsobu.ona.database.repositories.dataval

import com.tsobu.ona.database.entities.dataval.IcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface IcRepo : JpaRepository<IcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<IcEntity>
}