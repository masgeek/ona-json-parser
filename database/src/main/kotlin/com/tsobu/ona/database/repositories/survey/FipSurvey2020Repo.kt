package com.tsobu.ona.database.repositories.survey

import com.tsobu.ona.database.entities.survey.FipSurvey2020Entity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FipSurvey2020Repo : JpaRepository<FipSurvey2020Entity, Long> {
    fun findAllByOrderBySubmissionDateAsc(): List<FipSurvey2020Entity>
}