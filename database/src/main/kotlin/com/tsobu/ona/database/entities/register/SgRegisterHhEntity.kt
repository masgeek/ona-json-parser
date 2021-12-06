package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "sg_register_hh")
@Entity
class SgRegisterHhEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "formhub_uuid")
    var formhubUuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

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

    @Column(name = "purpose_banner")
    var purposeBanner: String? = null

    @Column(name = "purpose_intro")
    var purposeIntro: String? = null

    @Column(name = "hh_location_generated_note_name_15")
    var hhLocationGeneratedNoteName15: String? = null

    @Column(name = "hh_location_eaen")
    var hhLocationEaen: String? = null

    @Column(name = "hh_location_eaid")
    var hhLocationEaid: String? = null

    @Column(name = "hh_location_loc_hh")
    var hhLocationLocHh: String? = null

    @Column(name = "hh_location_state")
    var hhLocationState: String? = null

    @Column(name = "hh_location_lga")
    var hhLocationLga: String? = null

    @Column(name = "hh_location_geopoint_latitude")
    var hhLocationGeopointLatitude: String? = null

    @Column(name = "hh_location_geopoint_longitude")
    var hhLocationGeopointLongitude: String? = null

    @Column(name = "hh_location_geopoint_altitude")
    var hhLocationGeopointAltitude: String? = null

    @Column(name = "hh_location_geopoint_accuracy")
    var hhLocationGeopointAccuracy: String? = null

    @Column(name = "details_hh_generated_note_name_24")
    var detailsHhGeneratedNoteName24: String? = null

    @Column(name = "details_hh_first_name_hh")
    var detailsHhFirstNameHh: String? = null

    @Column(name = "details_hh_sur_name_hh")
    var detailsHhSurNameHh: String? = null

    @Column(name = "details_hh_phone_nr_hh")
    var detailsHhPhoneNrHh: String? = null

    @Column(name = "details_hh_phone_nr2_hh")
    var detailsHhPhoneNr2Hh: String? = null

    @Column(name = "details_hh_gender_hh")
    var detailsHhGenderHh: String? = null

    @Column(name = "details_hh_age_hh")
    var detailsHhAgeHh: String? = null

    @Column(name = "details_hh_relation_hh")
    var detailsHhRelationHh: String? = null

    @Column(name = "details_hh_marital_status_hh")
    var detailsHhMaritalStatusHh: String? = null

    @Column(name = "details_hh_hh_type")
    var detailsHhHhType: String? = null

    @Column(name = "details_hh_education_hh")
    var detailsHhEducationHh: String? = null

    @Column(name = "details_hh_occupation_hh")
    var detailsHhOccupationHh: String? = null

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