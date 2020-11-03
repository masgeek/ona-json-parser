package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "register_ea")
class EaEntity : BaseEntity() {
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

    @Column(name = "country")
    var country: String? = null

    @Column(name = "zone")
    var zone: String? = null

    @Column(name = "region")
    var region: String? = null

    @Column(name = "state")
    var state: String? = null

    @Column(name = "area_operation")
    var areaOperation: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

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

    @Column(name = "first_name_ea")
    var firstNameEa: String? = null

    @Column(name = "sur_name_ea")
    var surNameEa: String? = null

    @Column(name = "phone_nr_ea")
    var phoneNrEa: String? = null

    @Column(name = "phone_nr2_ea")
    var phoneNr2Ea: String? = null

    @Column(name = "gender_ea")
    var genderEa: String? = null

    @Column(name = "age_ea")
    var ageEa: String? = null

    @Column(name = "education_ea")
    var educationEa: String? = null

    @Column(name = "gov")
    var gov: String? = null

    @Column(name = "partner")
    var partner: String? = null

    @Column(name = "title")
    var title: String? = null

    @Column(name = "role")
    var role: String? = null

    @Column(name = "level")
    var level: String? = null

    @Column(name = "level_name")
    var levelName: String? = null

    @Column(name = "nr_hh")
    var nrHh: String? = null

    @Column(name = "freq")
    var freq: String? = null

    @Column(name = "photo_ea")
    var photoEa: String? = null

    @Column(name = "photo_profile_ea")
    var photoProfileEa: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "accept")
    var accept: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instanceid")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}