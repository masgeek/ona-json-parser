package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "sg_register_ea")
@Entity
class SgRegisterEaEntity : BaseEntity() {
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

    @Column(name = "purpose_banner")
    var purposeBanner: String? = null

    @Column(name = "purpose_intro")
    var purposeIntro: String? = null

    @Column(name = "enumerator_generated_note_name_14")
    var enumeratorGeneratedNoteName14: String? = null

    @Column(name = "enumerator_first_name_en")
    var enumeratorFirstNameEn: String? = null

    @Column(name = "enumerator_sur_name_en")
    var enumeratorSurNameEn: String? = null

    @Column(name = "enumerator_gender_en")
    var enumeratorGenderEn: String? = null

    @Column(name = "enumerator_phone_nr_en")
    var enumeratorPhoneNrEn: String? = null

    @Column(name = "area_ea_generated_note_name_21")
    var areaEaGeneratedNoteName21: String? = null

    @Column(name = "area_ea_areaoperation")
    var areaEaAreaoperation: String? = null

    @Column(name = "area_ea_state")
    var areaEaState: String? = null

    @Column(name = "area_ea_lga")
    var areaEaLga: String? = null

    @Column(name = "area_ea_geopoint_latitude")
    var areaEaGeopointLatitude: String? = null

    @Column(name = "area_ea_geopoint_longitude")
    var areaEaGeopointLongitude: String? = null

    @Column(name = "area_ea_geopoint_altitude")
    var areaEaGeopointAltitude: String? = null

    @Column(name = "area_ea_geopoint_accuracy")
    var areaEaGeopointAccuracy: String? = null

    @Column(name = "details_ea_generated_note_name_28")
    var detailsEaGeneratedNoteName28: String? = null

    @Column(name = "detailsea_first_name_ea")
    var detailseaFirstNameEa: String? = null

    @Column(name = "detailsea_sur_name_ea")
    var detailseaSurNameEa: String? = null

    @Column(name = "detailsea_phone_nr_ea")
    var detailseaPhoneNrEa: String? = null

    @Column(name = "details_ea_gender_ea")
    var detailsEaGenderEa: String? = null

    @Column(name = "details_ea_eaid")
    var detailsEaEaid: String? = null

    @Column(name = "details_ea2_age_ea")
    var detailsEa2AgeEa: String? = null

    @Column(name = "details_ea2_education_ea")
    var detailsEa2EducationEa: String? = null

    @Column(name = "organization_ea_generated_note_name_40")
    var organizationEaGeneratedNoteName40: String? = null

    @Column(name = "organization_ea_gov")
    var organizationEaGov: String? = null

    @Column(name = "organization_ea_title")
    var organizationEaTitle: String? = null

    @Column(name = "organization_ea_role")
    var organizationEaRole: String? = null

    @Column(name = "organization_ea_level")
    var organizationEaLevel: String? = null

    @Column(name = "operation_ea_generated_note_name_47")
    var operationEaGeneratedNoteName47: String? = null

    @Column(name = "operation_ea_level_name")
    var operationEaLevelName: String? = null

    @Column(name = "operation_ea_nr_hh")
    var operationEaNrHh: String? = null

    @Column(name = "operation_ea_freq")
    var operationEaFreq: String? = null

    @Column(name = "accept")
    var accept: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}