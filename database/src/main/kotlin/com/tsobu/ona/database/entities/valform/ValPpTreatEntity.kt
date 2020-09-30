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
    @Column(name = "Submission_Date")
    private val submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    private val uuid: String? = null

    @Column(name = "start_date")
    private val startDate: LocalDateTime? = null

    @Column(name = "today_date")
    private val todayDate: LocalDate? = null

    @Column(name = "deviceid")
    private val deviceid: String? = null

    @Column(name = "subscriberid")
    private val subscriberid: String? = null

    @Column(name = "email")
    private val email: String? = null

    @Column(name = "username")
    private val username: String? = null

    @Column(name = "simserial")
    private val simserial: String? = null

    @Column(name = "phonenumber")
    private val phonenumber: String? = null

    @Column(name = "banner")
    private val banner: String? = null

    @Column(name = "intro")
    private val intro: String? = null

    @Column(name = "EAID")
    private val EAID: String? = null

    @Column(name = "HHID")
    private val HHID: String? = null

    @Column(name = "country_Select")
    private val countrySelect: String? = null

    @Column(name = "geo_point_Latitude")
    private val geoPointLatitude: String? = null

    @Column(name = "geo_point_Longitude")
    private val geoPointLongitude: String? = null

    @Column(name = "geo_point_Altitude")
    private val geoPointAltitude: String? = null

    @Column(name = "geo_point_Accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "lat")
    private val lat: String? = null

    @Column(name = "lon")
    private val lon: String? = null

    @Column(name = "basic_Till_CP")
    private val basicTillCp: String? = null

    @Column(name = "harrow_Select_CP")
    private val harrowSelectCp: String? = null

    @Column(name = "ridging_CP")
    private val ridgingCp: String? = null

    @Column(name = "basic_Till_Method_Select1_CP")
    private val basicTillMethodSelect1Cp: String? = null

    @Column(name = "basic_Till_Method_Select2_CP")
    private val basicTillMethodSelect2Cp: String? = null

    @Column(name = "harrow_CP")
    private val harrowCp: String? = null

    @Column(name = "ridging_Method_Select_CP")
    private val ridgingMethodSelectCp: String? = null

    @Column(name = "basic_Till_REC")
    private val basicTillRec: String? = null

    @Column(name = "harrow_Select_REC")
    private val harrowSelectRec: String? = null

    @Column(name = "ridging_REC")
    private val ridgingRec: String? = null

    @Column(name = "basic_Till_Method_Select1_REC")
    private val basicTillMethodSelect1Rec: String? = null

    @Column(name = "basic_Till_Method_Select2_REC")
    private val basicTillMethodSelect2Rec: String? = null

    @Column(name = "harrow_REC")
    private val harrowRec: String? = null

    @Column(name = "ridging_Method_Select_REC")
    private val ridgingMethodSelectRec: String? = null

    @Column(name = "presence_Red_Plot")
    private val presenceRedPlot: String? = null

    @Column(name = "basic_Till_ALT")
    private val basicTillAlt: String? = null

    @Column(name = "harrow_Select_ALT")
    private val harrowSelectAlt: String? = null

    @Column(name = "ridging_ALT")
    private val ridgingAlt: String? = null

    @Column(name = "basic_Till_Method_Select1_ALT")
    private val basicTillMethodSelect1Alt: String? = null

    @Column(name = "basic_Till_Method_Select2_ALT")
    private val basicTillMethodSelect2Alt: String? = null

    @Column(name = "harrow_ALT")
    private val harrowAlt: String? = null

    @Column(name = "ridging_Method_Select_ALT")
    private val ridgingMethodSelectAlt: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_ID")
    private val instanceId: String? = null

    @Column(name = "control_KEY")
    private val controlKey: String? = null
}