package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp_treat")
class ValPpTreatEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDate? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "subscriberid")
    var subscriberid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "countryselect")
    var countryselect: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "lat")
    var lat: String? = null

    @Column(name = "lon")
    var lon: String? = null

    @Column(name = "basictillcp")
    var basictillcp: String? = null

    @Column(name = "harrowselectcp")
    var harrowselectcp: String? = null

    @Column(name = "ridgingcp")
    var ridgingcp: String? = null

    @Column(name = "basictillmethodselect1cp")
    var basictillmethodselect1cp: String? = null

    @Column(name = "basictillmethodselect2cp")
    var basictillmethodselect2cp: String? = null

    @Column(name = "harrowcp")
    var harrowcp: String? = null

    @Column(name = "ridgingmethodselectcp")
    var ridgingmethodselectcp: String? = null

    @Column(name = "basictillrec")
    var basictillrec: String? = null

    @Column(name = "harrowselectrec")
    var harrowselectrec: String? = null

    @Column(name = "ridgingrec")
    var ridgingrec: String? = null

    @Column(name = "basictillmethodselect1rec")
    var basictillmethodselect1rec: String? = null

    @Column(name = "basictillmethodselect2rec")
    var basictillmethodselect2rec: String? = null

    @Column(name = "harrowrec")
    var harrowrec: String? = null

    @Column(name = "ridgingmethodselectrec")
    var ridgingmethodselectrec: String? = null

    @Column(name = "presenceredplot")
    var presenceredplot: String? = null

    @Column(name = "basictillalt")
    var basictillalt: String? = null

    @Column(name = "harrowselectalt")
    var harrowselectalt: String? = null

    @Column(name = "ridgingalt")
    var ridgingalt: String? = null

    @Column(name = "basictillmethodselect1alt")
    var basictillmethodselect1alt: String? = null

    @Column(name = "basictillmethodselect2alt")
    var basictillmethodselect2alt: String? = null

    @Column(name = "harrowalt")
    var harrowalt: String? = null

    @Column(name = "ridgingmethodselectalt")
    var ridgingmethodselectalt: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}