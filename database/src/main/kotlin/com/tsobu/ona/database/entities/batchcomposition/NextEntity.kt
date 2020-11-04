package com.tsobu.ona.database.entities.batchcomposition

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "sample_batch_composition_next")
class NextEntity : BaseEntity() {
    @Column(name = "res_value")
    var resValue: String? = null

    @Column(name = "batch_name")
    var batchName: String? = null

    @Column(name = "description_fw")
    var descriptionFw: String? = null

    @Column(name = "description_dc")
    var descriptionDc: String? = null

    @Column(name = "description_rs")
    var descriptionRs: String? = null

    @Column(name = "description_sb")
    var descriptionSb: String? = null

    @Column(name = "description")
    var description: String? = null

    @Column(name = "confirm_dc")
    var confirmDc: String? = null

    @Column(name = "sample_batch_id")
    var sampleBatchId: String? = null

    @Column(name = "confirm_name")
    var confirmName: String? = null

    @Column(name = "next_action")
    var nextAction: String? = null

    @Column(name = "next_station")
    var nextStation: String? = null

    @Column(name = "batch_quality")
    var batchQuality: String? = null

    @Column(name = "batch_status")
    var batchStatus: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_next")
    var setOfNext: String? = null
}