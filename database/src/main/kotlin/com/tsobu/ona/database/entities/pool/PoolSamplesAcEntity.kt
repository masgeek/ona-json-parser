package com.tsobu.ona.database.entities.pool

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "pool_samples_ac")
class PoolSamplesAcEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

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

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "project")
    var project: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "login")
    var login: String? = null

    @Column(name = "first_name")
    var firstName: String? = null

    @Column(name = "sur_name")
    var surName: String? = null

    @Column(name = "entity")
    var entity: String? = null

    @Column(name = "repeat_value")
    var repeatValue: String? = null

    @Column(name = "set_of_sample")
    var setOfSample: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}