package com.tsobu.ona.database.entities.assign

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assign_fd_tl_po")
class AssignFdTlPoEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var formHubUuid: String? = null

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

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "barcode")
    var barcode: String? = null

    @Column(name = "enid")
    var enid: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "project_code")
    var projectCode: String? = null

    @Column(name = "entity")
    var entity: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "lat")
    var lat: String? = null

    @Column(name = "lon")
    var lon: String? = null

    @Column(name = "latr")
    var latr: String? = null

    @Column(name = "lonr")
    var lonr: String? = null

    @Column(name = "lookup")
    var lookup: String? = null

    @Column(name = "fdid_note")
    var fdidNote: String? = null

    @Column(name = "fdid")
    var fdid: String? = null

    @Column(name = "fd_name_new")
    var fdNameNew: String? = null

    @Column(name = "fd_id2_new")
    var fdId2New: String? = null

    @Column(name = "fd_owner")
    var fdOwner: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "fd_id2")
    var fdId2: String? = null

    @Column(name = "exp_code")
    var expCode: String? = null

    @Column(name = "exp_code_label")
    var expCodeLabel: String? = null

    @Column(name = "nr_treats")
    var nrTreats: String? = null

    @Column(name = "tl_name1_new")
    var tlName1New: String? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "rcbd")
    var rcbd: String? = null

    @Column(name = "nr_blocks")
    var nrBlocks: String? = null

    @Column(name = "trial_count")
    var trialCount: String? = null

    @Column(name = "set_of_trial")
    var setOfTrial: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}