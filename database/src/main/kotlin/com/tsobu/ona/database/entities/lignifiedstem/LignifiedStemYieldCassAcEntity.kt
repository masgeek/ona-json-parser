package com.tsobu.ona.database.entities.lignifiedstem

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_lignified_stem_yield_cass_ac")
class LignifiedStemYieldCassAcEntity : BaseEntity() {
    @Column(name = "submission_date")
    private val submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    private val uuid: String? = null

    @Column(name = "start_date")
    private val startDate: LocalDateTime? = null

    @Column(name = "today_date")
    private val todayDate: LocalDate? = null

    @Column(name = "device_id")
    private val deviceId: String? = null

    @Column(name = "subscriber_id")
    private val subscriberId: String? = null

    @Column(name = "email")
    private val email: String? = null

    @Column(name = "username")
    private val username: String? = null

    @Column(name = "simserial")
    private val simserial: String? = null

    @Column(name = "phone_number")
    private val phoneNumber: String? = null

    @Column(name = "banner")
    private val banner: String? = null

    @Column(name = "intro")
    private val intro: String? = null

    @Column(name = "project")
    private val project: String? = null

    @Column(name = "country")
    private val country: String? = null

    @Column(name = "login")
    private val login: String? = null

    @Column(name = "firstname")
    private val firstname: String? = null

    @Column(name = "surname")
    private val surname: String? = null

    @Column(name = "geo_point_latitude")
    private val geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    private val geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    private val geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "entity_value")
    private val entityValue: String? = null

    @Column(name = "stem_count")
    private val stemCount: String? = null

    @Column(name = "sampling")
    private val sampling: String? = null

    @Column(name = "repeat")
    private val repeat: String? = null

    @Column(name = "set_of_yield_assessment")
    private val setOfYieldAssessment: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    private val instanceId: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null
}