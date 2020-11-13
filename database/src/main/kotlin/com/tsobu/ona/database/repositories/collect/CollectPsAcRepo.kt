package com.tsobu.ona.database.repositories.collect

import com.tsobu.ona.database.entities.collect.CollectPsAcEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CollectPsAcRepo : JpaRepository<CollectPsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CollectPsAcEntity>
}