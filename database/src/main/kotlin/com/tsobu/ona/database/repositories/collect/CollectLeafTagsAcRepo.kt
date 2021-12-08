package com.tsobu.ona.database.repositories.collect

import com.tsobu.ona.database.entities.collect.CollectLeafTagsAcEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CollectLeafTagsAcRepo : JpaRepository<CollectLeafTagsAcEntity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<CollectLeafTagsAcEntity>
}