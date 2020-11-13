package com.tsobu.ona.database.entities.batchcomposition

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "sample_batch_composition")
class CompositionEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

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

    @Column(name = "project")
    var project: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "aim")
    var aim: String? = null

    @Column(name = "station")
    var station: String? = null

    @Column(name = "station_other")
    var stationOther: String? = null

    @Column(name = "entity_value")
    var entityValue: String? = null

    @Column(name = "batch_type")
    var batchType: String? = null

    @Column(name = "batch_type_note")
    var batchTypeNote: String? = null

    @Column(name = "sample_batch_id_exist")
    var sampleBatchIdExist: String? = null

    @Column(name = "description_pull")
    var descriptionPull: String? = null

    @Column(name = "batch_name_pull")
    var batchNamePull: String? = null

    @Column(name = "receive_confirm")
    var receiveConfirm: String? = null

    @Column(name = "receive_error_note")
    var receiveErrorNote: String? = null

    @Column(name = "set_of_sample_list_sample")
    var setOfSampleListSample: String? = null

    @Column(name = "count_fw")
    var countFw: String? = null

    @Column(name = "count_dc")
    var countDc: String? = null

    @Column(name = "count_rs")
    var countRs: String? = null

    @Column(name = "count_sb")
    var countSb: String? = null

    @Column(name = "confirm_all")
    var confirmAll: String? = null

    @Column(name = "confirm_fw")
    var confirmFw: String? = null

    @Column(name = "confirm_dc")
    var confirmDc: String? = null

    @Column(name = "confirm_rs")
    var confirmRs: String? = null

    @Column(name = "confirm_sb")
    var confirmSb: String? = null

    @Column(name = "next_count")
    var nextCount: String? = null

    @Column(name = "set_of_next_step_next")
    var setOfNextStepNext: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}