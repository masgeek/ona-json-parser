package com.tsobu.ona.database.repositories.collect

import com.tsobu.ona.database.entities.collect.CollectLeafTagsAcIdEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CollectLeafTagsAcIdRepo : JpaRepository<CollectLeafTagsAcIdEntity, Long>