package com.tsobu.ona.database.entities.rootyieldcassava

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_root_yield_cassava_ac")
class RootYieldCassavaAcEntity : BaseEntity() {

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

    @Column(name = "sim_serial")
    var simSerial: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

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

    @Column(name = "surname")
    var surname: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "root_entity")
    var rootEntity: String? = null

    @Column(name = "generated_table_list_label_23")
    var generatedTableListLabel23: String? = null

    @Column(name = "reserved_name_for_field_list_labels_24")
    var reservedNameForFieldListLabels24: String? = null

    @Column(name = "disease_scoring")
    var diseaseScoring: String? = null

    @Column(name = "root_quality")
    var rootQuality: String? = null

    @Column(name = "detail_sampling")
    var detailSampling: String? = null

    @Column(name = "fixed_size")
    var fixedSize: String? = null

    @Column(name = "root_method")
    var rootMethod: String? = null

    @Column(name = "density_fixed")
    var densityFixed: String? = null

    @Column(name = "nr_rows_fixed")
    var nrRowsFixed: Int? = null

    @Column(name = "nr_plants_row_fixed")
    var nrPlantsRowFixed: Int? = null

    @Column(name = "plot_dim_note")
    var plotDimNote: String? = null

    @Column(name = "l1_fixed")
    var l1Fixed: String? = null

    @Column(name = "w1_fixed")
    var w1Fixed: String? = null

    @Column(name = "ls_fixed")
    var lsFixed: String? = null

    @Column(name = "w2_fixed")
    var w2Fixed: String? = null

    @Column(name = "between_row_fixed")
    var betweenRowFixed: String? = null

    @Column(name = "within_row_fixed")
    var withinRowFixed: String? = null

    @Column(name = "density_fixed_calc")
    var densityFixedCalc: String? = null

    @Column(name = "max_stand_fixed")
    var maxStandFixed: String? = null

    @Column(name = "plot_size_fixed")
    var plotSizeFixed: String? = null

    @Column(name = "note_fixed")
    var noteFixed: String? = null

    @Column(name = "root_repeat")
    var rootRepeat: String? = null

    @Column(name = "set_of_yield_assesment")
    var setOfYieldAssesment: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}