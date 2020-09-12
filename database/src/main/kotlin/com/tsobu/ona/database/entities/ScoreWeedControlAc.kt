package com.tsobu.ona.database.entities

import com.tsobu.ona.database.entities.BaseEntity
import java.sql.Date
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac")
class ScoreWeedControlAc : BaseEntity() {
    var uuid: String? = null
    var submissionDate: Timestamp? = null
    var todayDate: Date? = null
    var startDate: Timestamp? = null
    var endDate: Timestamp? = null
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

    @Column(name = "geo_point_latitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointLatitude: Double = 0.0

    @Column(name = "geo_point_longitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointLongitude: Double = 0.0

    @Column(name = "geo_point_altitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAltitude: Double = 0.0

    @Column(name = "geo_point_accuracy", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAccuracy: Double = 0.0

    var entity: String? = null
    var detail: String? = null
    var nrQuadrants: Int? = null
    var repeat: String? = null
    var setOfId: String? = null
    var instanceId: String? = null
    var weedKey: String? = null
}