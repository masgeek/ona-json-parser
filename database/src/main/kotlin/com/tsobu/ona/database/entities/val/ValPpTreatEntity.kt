package com.tsobu.ona.database.entities.`val`

import com.tsobu.ona.database.entities.BaseEntity
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
    var todayDate: LocalDateTime? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "subscriber_id")
    var subscriberId: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "country_select")
    var countrySelect: String? = null

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

    @Column(name = "basic_till_cp")
    var basicTillCp: String? = null

    @Column(name = "harrow_select_cp")
    var harrowSelectCp: String? = null

    @Column(name = "ridging_cp")
    var ridgingCp: String? = null

    @Column(name = "basic_till_method_select1_cp")
    var basicTillMethodSelect1Cp: String? = null

    @Column(name = "basic_till_method_select2_cp")
    var basicTillMethodSelect2Cp: String? = null

    @Column(name = "harrow_cp")
    var harrowCp: String? = null

    @Column(name = "ridging_method_select_cp")
    var ridgingMethodSelectCp: String? = null

    @Column(name = "basic_till_rec")
    var basicTillRec: String? = null

    @Column(name = "harrow_select_rec")
    var harrowSelectRec: String? = null

    @Column(name = "ridging_rec")
    var ridgingRec: String? = null

    @Column(name = "basic_till_method_select1_rec")
    var basicTillMethodSelect1Rec: String? = null

    @Column(name = "basic_till_method_select2_rec")
    var basicTillMethodSelect2Rec: String? = null

    @Column(name = "harrow_rec")
    var harrowRec: String? = null

    @Column(name = "ridging_method_select_rec")
    var ridgingMethodSelectRec: String? = null

    @Column(name = "presencered_plot")
    var presenceredPlot: String? = null

    @Column(name = "basic_till_alt")
    var basicTillAlt: String? = null

    @Column(name = "harrow_select_alt")
    var harrowSelectAlt: String? = null

    @Column(name = "ridging_alt")
    var ridgingAlt: String? = null

    @Column(name = "basic_till_method_select1_alt")
    var basicTillMethodSelect1Alt: String? = null

    @Column(name = "basic_till_method_select2_alt")
    var basicTillMethodSelect2Alt: String? = null

    @Column(name = "harrow_alt")
    var harrowAlt: String? = null

    @Column(name = "ridging_method_select_alt")
    var ridgingMethodSelectAlt: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}