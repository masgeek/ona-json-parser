package com.tsobu.ona.database.entities

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column

class AssessRootYieldCassavaAc : BaseEntity() {

    var submissionDate: LocalDateTime? = null
    var uuid: String? = null
    var startDate: LocalDateTime? = null
    var todayDate: LocalDate? = null
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
    var geoPointLatitude: Double? = null

    @Column(name = "geo_point_longitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointLongitude: Double? = null

    @Column(name = "geo_point_altitude", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAltitude: Double? = null

    @Column(name = "geo_point_accuracy", columnDefinition = "decimal", precision = 10, scale = 6)
    var geoPointAccuracy: Double? = null

    var rootEntity: String? = null
    var generatedTableListLabel23: String? = null
    var reservedNameForFieldListLabels24: String? = null
    var diseaseScoring: String? = null
    var rootQuality: String? = null
    var sampling: String? = null
    var fixedSize: String? = null
    var rootMethod: String? = null
    var densityFixed: String? = null
    var nrRowsFixed: String? = null
    var nrPlantsRowFixed: String? = null
    var plotDimNote: String? = null
    var l1Fixed: String? = null
    var w1Fixed: String? = null
    var lsFixed: String? = null
    var w2Fixed: String? = null
    var betweenRowFixed: String? = null
    var withinRowFixed: String? = null
    var densityFixedCalc: String? = null
    var maxStandFixed: String? = null
    var plotSizeFixed: String? = null
    var noteFixed: String? = null
    var rootRepeat: String? = null

    @Column(name = "set_of_yield_assesment")
    var setOfYieldAssessment: String? = null
    var endDate: LocalDateTime? = null
    var instanceId: String? = null
    var controlKey: String? = null
}