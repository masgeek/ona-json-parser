package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "register_pc")
class PcEntity : BaseEntity() {

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

    @Column(name = "aim")
    var aim: String? = null

    @Column(name = "project_full")
    var projectFull: String? = null

    @Column(name = "project_abbr")
    var projectAbbr: String? = null

    @Column(name = "project_code")
    var projectCode: String? = null

    @Column(name = "project_exist")
    var projectExist: String? = null

    @Column(name = "project_exist_note")
    var projectExistNote: String? = null

    @Column(name = "project_code_exist")
    var projectCodeExist: String? = null

    @Column(name = "project_code_exist_note")
    var projectCodeExistNote: String? = null

    @Column(name = "project")
    var project: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}