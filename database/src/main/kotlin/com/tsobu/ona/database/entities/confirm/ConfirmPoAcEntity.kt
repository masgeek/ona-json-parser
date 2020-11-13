package com.tsobu.ona.database.entities.confirm

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "confirm_po_assign_ac")
class ConfirmPoAcEntity : BaseEntity() {

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

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "field_id")
    var fieldId: String? = null

    @Column(name = "trial_id")
    var trialId: String? = null

    @Column(name = "field_book_id")
    var fieldBookId: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "trial_code")
    var trialCode: String? = null

    @Column(name = "nr_treatments_complete")
    var nrTreatmentsComplete: String? = null

    @Column(name = "complete_setup")
    var completeSetup: String? = null

    @Column(name = "treats", columnDefinition = "TEXT")
    var treats: String? = null

    @Column(name = "nr_treatments")
    var nrTreatments: String? = null

    @Column(name = "note_barcode")
    var noteBarcode: String? = null

    @Column(name = "plot_labeling_count")
    var plotLabelingCount: String? = null

    @Column(name = "set_of_plot_labeling")
    var setOfPlotLabeling: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instanceid")
    var instanceid: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}