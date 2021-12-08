package com.tsobu.ona.database.repositories.collect

import com.tsobu.ona.database.entities.collect.CollectSsAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CollectSsAcRepo : JpaRepository<CollectSsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CollectSsAcEntity>
}