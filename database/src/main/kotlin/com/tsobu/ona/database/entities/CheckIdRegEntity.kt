package com.tsobu.ona.database.entities

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "check_id_registration")
class CheckIdRegEntity : BaseEntity() {
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

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "remark1")
    var remark1: String? = null

    @Column(name = "remark2")
    var remark2: String? = null

    @Column(name = "type_id")
    var typeId: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "loc_ea")
    var locEa: String? = null

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

    @Column(name = "firstname_ea")
    var firstnameEa: String? = null

    @Column(name = "surname_ea")
    var surnameEa: String? = null

    @Column(name = "phone_nr_ea")
    var phoneNrEa: String? = null

    @Column(name = "phone_nr_2ea")
    var phoneNr2ea: String? = null

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

    @Column(name = "title_value")
    var titleValue: String? = null

    @Column(name = "role_value")
    var roleValue: String? = null

    @Column(name = "level_value")
    var levelValue: String? = null

    @Column(name = "level_name")
    var levelName: String? = null

    @Column(name = "nr_hh")
    var nrHh: String? = null

    @Column(name = "freq")
    var freq: String? = null

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
    var ageHh: String? = null

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

    @Column(name = "details_ea_note")
    var detailsEaNote: String? = null

    @Column(name = "firstname_ea_note")
    var firstnameEaNote: String? = null

    @Column(name = "surname_ea_note")
    var surnameEaNote: String? = null

    @Column(name = "phone_nr_ea_note")
    var phoneNrEaNote: String? = null

    @Column(name = "phone_nr_2ea_note")
    var phoneNr2eaNote: String? = null

    @Column(name = "gender_ea_note")
    var genderEaNote: String? = null

    @Column(name = "age_ea_note")
    var ageEaNote: String? = null

    @Column(name = "education_ea_note")
    var educationEaNote: String? = null

    @Column(name = "gov_note")
    var govNote: String? = null

    @Column(name = "partner_note")
    var partnerNote: String? = null

    @Column(name = "title_note")
    var titleNote: String? = null

    @Column(name = "ao_note")
    var aoNote: String? = null

    @Column(name = "nr_hh_note")
    var nrHhNote: String? = null

    @Column(name = "correct_ea")
    var correctEa: String? = null

    @Column(name = "details_hh_note")
    var detailsHhNote: String? = null

    @Column(name = "firstnamehh_note")
    var firstnamehhNote: String? = null

    @Column(name = "surname_hh_note")
    var surnameHhNote: String? = null

    @Column(name = "phone_nr_hh_note")
    var phoneNrHhNote: String? = null

    @Column(name = "phone_nr2_hh_note")
    var phoneNr2HhNote: String? = null

    @Column(name = "gender_hh_note")
    var genderHhNote: String? = null

    @Column(name = "age_hh_note")
    var ageHhNote: String? = null

    @Column(name = "relation_hh_note")
    var relationHhNote: String? = null

    @Column(name = "marital_status_hh_note")
    var maritalStatusHhNote: String? = null

    @Column(name = "education_hh_note")
    var educationHhNote: String? = null

    @Column(name = "occupation_hh_note")
    var occupationHhNote: String? = null

    @Column(name = "start_year_hh_note")
    var startYearHhNote: String? = null

    @Column(name = "activities_hh_note")
    var activitiesHhNote: String? = null

    @Column(name = "usecase_hh_note")
    var usecaseHhNote: String? = null

    @Column(name = "correct_hh")
    var correctHh: String? = null

    @Column(name = "end_note1")
    var endNote1: String? = null

    @Column(name = "end_note2")
    var endNote2: String? = null

    @Column(name = "end_note3")
    var endNote3: String? = null

    @Column(name = "end_note4")
    var endNote4: String? = null

    @Column(name = "end_note5")
    var endNote5: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}