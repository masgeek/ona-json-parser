package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.opencsv.bean.CsvBindByName
import com.tsobu.ona.database.entities.BaseEntity
import java.sql.Date
import java.sql.Timestamp
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


class ScoreWeedControlAcDto {
    var uuid: String? = null

    @JsonProperty("SubmissionDate")
//    @CsvBindByName(column = "SubmissionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    var submissionDate: LocalDateTime? = null

    @JsonProperty("today")
    var todayDate: LocalDate? = null

    @JsonProperty("start")
    var startDate: LocalDateTime? = null

    @JsonProperty("end")
    var endDate: LocalDateTime? = null
    var deviceId: String? = null
    var subscriberId: String? = null
    var email: String? = null
    var username: String? = null
    var simSerial: String? = null
    var phoneNumber: String? = null
    var banner: String? = null
    var intro: String? = null
    var project: String? = null
    var country: String? = null
    var login: String? = null
    var firstName: String? = null
    var surname: String? = null
    var geoPointLatitude: Double? = null
    var geoPointLongitude: Double? = null
    var geoPointAltitude: Double? = null
    var geoPointAccuracy: Double? = null
    var weedEntity: String? = null
    var weedDetail: String? = null
    var nrQuadrants: Int? = null
    var weedRepeat: String? = null
    var setOfId: String? = null
    var instanceId: String? = null
    var weedKey: String? = null
}