package com.tsobu.ona.database.entities.scoreweedcontrol

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac")
class AcEntity : BaseEntity() {
    var uuid: String? = null

    var submissionDate: LocalDateTime? = null
    var todayDate: LocalDate? = null
    var startDate: LocalDateTime? = null
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

    @Column(name = "surname")
    var surname: String? = null

    @Column(name = "geo_point_latitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointLatitude: Double? = null

    @Column(name = "geo_point_longitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointLongitude: Double? = null

    @Column(name = "geo_point_altitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAltitude: Double? = null

    @Column(name = "geo_point_accuracy", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAccuracy: Double? = null


    @Column(name = "weed_entity")
    var weedEntity: String? = null
    var weedDetail: String? = null
    var nrQuadrants: Int? = null

    @Column(name = "weed_repeat")
    var weedRepeat: String? = null
    var setOfId: String? = null
    var instanceId: String? = null
    var weedKey: String? = null
}