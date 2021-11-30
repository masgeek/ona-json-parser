package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "register_hh_dg")
@Entity
class RegisterHhDgEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "subscriberid")
    var subscriberid: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "generated_note_name_8")
    var generatedNoteName8: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "generated_note_name_13")
    var generatedNoteName13: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "eaid_scan")
    var eaidScan: String? = null

    @Column(name = "eaid_text")
    var eaidText: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "hhid_scan")
    var hhidScan: String? = null

    @Column(name = "hhid_text")
    var hhidText: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "project_code")
    var projectCode: String? = null

    @Column(name = "details_hh_note")
    var detailsHhNote: String? = null

    @Column(name = "first_name")
    var firstName: String? = null

    @Column(name = "sur_name")
    var surName: String? = null

    @Column(name = "gender")
    var gender: String? = null

    @Column(name = "birth_year")
    var birthYear: String? = null

    @Column(name = "phone_nr")
    var phoneNr: String? = null

    @Column(name = "phone_nr2")
    var phoneNr2: String? = null

    @Column(name = "whats_app")
    var whatsApp: String? = null

    @Column(name = "relation_hh")
    var relationHh: String? = null

    @Column(name = "marital_status")
    var maritalStatus: String? = null

    @Column(name = "education")
    var education: String? = null

    @Column(name = "occupation")
    var occupation: String? = null

    @Column(name = "member")
    var member: String? = null

    @Column(name = "coopassoc")
    var coopassoc: String? = null

    @Column(name = "generated_note_name_40")
    var generatedNoteName40: String? = null

    @Column(name = "hasc1")
    var hasc1: String? = null

    @Column(name = "hasc2")
    var hasc2: String? = null

    @Column(name = "hasc3")
    var hasc3: String? = null

    @Column(name = "hasc4")
    var hasc4: String? = null

    @Column(name = "hasc5")
    var hasc5: String? = null

    @Column(name = "home")
    var home: String? = null

    @Column(name = "geopoint_latitude")
    var geopointLatitude: String? = null

    @Column(name = "geopoint_longitude")
    var geopointLongitude: String? = null

    @Column(name = "geopoint_altitude")
    var geopointAltitude: String? = null

    @Column(name = "geopoint_accuracy")
    var geopointAccuracy: String? = null

    @Column(name = "signature")
    var signature: String? = null

    @Column(name = "conclusion")
    var conclusion: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}