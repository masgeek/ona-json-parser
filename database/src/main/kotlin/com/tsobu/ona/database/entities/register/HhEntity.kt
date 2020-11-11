package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "register_hh")
class HhEntity : BaseEntity() {
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

    @Column(name = "sim_serial")
    var simSerial: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "zone")
    var zone: String? = null

    @Column(name = "region")
    var region: String? = null

    @Column(name = "state")
    var state: String? = null

    @Column(name = "loc_hh")
    var locHh: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "eaen")
    var eaen: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "login")
    var login: String? = null

    @Column(name = "first_name_en")
    var firstNameEn: String? = null

    @Column(name = "sur_name_en")
    var surNameEn: String? = null

    @Column(name = "gender_en")
    var genderEn: String? = null

    @Column(name = "phone_nr_en")
    var phoneNrEn: String? = null

    @Column(name = "first_name_hh")
    var firstNameHh: String? = null

    @Column(name = "sur_name_hh")
    var surNameHh: String? = null

    @Column(name = "phone_nr_hh")
    var phoneNrHh: String? = null

    @Column(name = "phone_nr2_hh")
    var phoneNr2Hh: String? = null

    @Column(name = "gender_hh")
    var genderHh: String? = null

    @Column(name = "age_hh")
    var ageHh: Int? = null

    @Column(name = "relation_hh")
    var relationHh: String? = null

    @Column(name = "marital_status_hh")
    var maritalStatusHh: String? = null

    @Column(name = "education_hh")
    var educationHh: String? = null

    @Column(name = "occupation_hh")
    var occupationHh: String? = null

    @Column(name = "start_year_hh")
    var startYearHh: String? = null

    @Column(name = "activities_hh")
    var activitiesHh: String? = null

    @Column(name = "use_case_hh")
    var useCaseHh: String? = null

    @Column(name = "photo_hh")
    var photoHh: String? = null

    @Column(name = "photo_profile_hh")
    var photoProfileHh: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "accept")
    var accept: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}