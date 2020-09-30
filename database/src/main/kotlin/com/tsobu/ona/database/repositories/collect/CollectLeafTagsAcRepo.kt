package com.tsobu.ona.database.repositories.collect

import org.springframework.data.jpa.repository.JpaRepository
import com.tsobu.ona.database.entities.collect.CollectLeafTagsAcEntity

interface CollectLeafTagsAcRepo : JpaRepository<CollectLeafTagsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CollectLeafTagsAcEntity>
}