package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "register_ea_dg")
@Entity
class RegisterEaDgEntity : BaseEntity() {
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

    @Column(name = "eaidscan")
    var eaidscan: String? = null

    @Column(name = "eaidtext")
    var eaidtext: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "project_code")
    var projectCode: String? = null

    @Column(name = "details_ea_note")
    var detailsEaNote: String? = null

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

    @Column(name = "email")
    var email: String? = null

    @Column(name = "education")
    var education: String? = null

    @Column(name = "generated_note_name_31")
    var generatedNoteName31: String? = null

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

    @Column(name = "base_location")
    var baseLocation: String? = null

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