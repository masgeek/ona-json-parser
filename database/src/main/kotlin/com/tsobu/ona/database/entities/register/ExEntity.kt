package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "register_ex")
class ExEntity : BaseEntity() {
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

    @Column(name = "project")
    var project: String? = null

    @Column(name = "project_code")
    var projectCode: String? = null

    @Column(name = "aim")
    var aim: String? = null

    @Column(name = "exp_name")
    var expName: String? = null

    @Column(name = "exp_family")
    var expFamily: String? = null

    @Column(name = "exp_version")
    var expVersion: String? = null

    @Column(name = "exp_code")
    var expCode: String? = null

    @Column(name = "exp_code_label")
    var expCodeLabel: String? = null

    @Column(name = "exp_code_exist")
    var expCodeExist: String? = null

    @Column(name = "exp_code_exist_note")
    var expCodeExistNote: String? = null

    @Column(name = "nr_treats")
    var nrTreats: String? = null

    @Column(name = "exp_code_copy")
    var expCodeCopy: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "treatment_details_note")
    var treatmentDetailsNote: String? = null

    @Column(name = "treatment_repeat_count")
    var treatmentRepeatCount: String? = null

    @Column(name = "set_of_treatment_details_treatment_repeat")
    var setOfTreatmentDetailsTreatmentRepeat: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}