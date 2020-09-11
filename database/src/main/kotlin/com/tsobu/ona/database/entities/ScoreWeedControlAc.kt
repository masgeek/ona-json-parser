package com.tsobu.ona.database.entities

import com.tsobu.ona.database.entities.BaseEntity
import java.sql.Date
import java.sql.Timestamp

class ScoreWeedControlAc : BaseEntity() {
    var uuid: String? = null
    var submissionDate: Timestamp? = null
    var today: Date? = null
    var start: Timestamp? = null
    var end: Timestamp? = null
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
    var geoPointLatitude = 0.0
    var geoPointLongitude = 0.0
    var geoPointAltitude = 0.0
    var geoPointAccuracy = 0.0
    var entity: String? = null
    var detail: String? = null
    var nrQuadrants: Long = 0
    var repeat: String? = null
    var setOfId: String? = null
    var instanceId: String? = null
    var key: String? = null
}