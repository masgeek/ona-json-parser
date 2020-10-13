package com.tsobu.ona.database.entities.batchcomposition

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "sample_batch_composition_sample")
class SampleEntity : BaseEntity() {
    @Column(name = "nr")
    var nr: String? = null

    @Column(name = "plant_sample_id",columnDefinition = "TEXT")
    var plantSampleId: String? = null

    @Column(name = "soil_sample_id", columnDefinition = "TEXT")
    var soilSampleId: String? = null

    @Column(name = "ps_key")
    var psKey: String? = null

    @Column(name = "ss_key")
    var ssKey: String? = null

    @Column(name = "report_action_ps")
    var reportActionPs: String? = null

    @Column(name = "report_action_ss")
    var reportActionSs: String? = null

    @Column(name = "fw")
    var fw: String? = null

    @Column(name = "dc")
    var dc: String? = null

    @Column(name = "rs")
    var rs: String? = null

    @Column(name = "na")
    var na: String? = null

    @Column(name = "sb")
    var sb: String? = null

    @Column(name = "note_fw")
    var noteFw: String? = null

    @Column(name = "note_dc")
    var noteDc: String? = null

    @Column(name = "note_rs")
    var noteRs: String? = null

    @Column(name = "note_na")
    var noteNa: String? = null

    @Column(name = "note_sb")
    var noteSb: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_sample")
    var setOfSample: String? = null
}