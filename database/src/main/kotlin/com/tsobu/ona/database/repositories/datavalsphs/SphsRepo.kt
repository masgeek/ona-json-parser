package com.tsobu.ona.database.repositories.datavalsphs

import com.tsobu.ona.database.entities.datavalsphs.SphsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SphsRepo : JpaRepository<SphsEntity, Long> {

    override fun findAll(): List<SphsEntity>
    fun findAllByOrderBySubmissionDateAsc(): List<SphsEntity>
}