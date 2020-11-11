package com.tsobu.ona.database.entities.greenbiomass

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_green_biomass_yield_cass_ya")
class YieldCassYaEntity : BaseEntity() {
    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "nr_plants_np")
    var nrPlantsNp: String? = null

    @Column(name = "nr_plants_se")
    var nrPlantsSe: String? = null

    @Column(name = "sec_value")
    var secValue: String? = null

    @Column(name = "generated_table_list_label_37")
    var generatedTableListLabel37: String? = null

    @Column(name = "leaves_fw")
    var leavesFw: String? = null

    @Column(name = "green_stems_fw")
    var greenStemsFw: String? = null

    @Column(name = "green_stems_leaves_fw")
    var greenStemsLeavesFw: String? = null

    @Column(name = "leaves_sec_fw")
    var leavesSecFw: String? = null

    @Column(name = "green_stems_sec_fw")
    var greenStemsSecFw: String? = null

    @Column(name = "green_stems_leaves_sec_fw")
    var greenStemsLeavesSecFw: String? = null

    @Column(name = "leaves_fw_ss")
    var leavesFwSs: String? = null

    @Column(name = "plant_sample_id_leaves")
    var plantSampleIdLeaves: String? = null

    @Column(name = "green_stems_fw_ss")
    var greenStemsFwSs: String? = null

    @Column(name = "plant_sample_id_green_stems")
    var plantSampleIdGreenStems: String? = null

    @Column(name = "green_stems_leaves_fw_ss")
    var greenStemsLeavesFwSs: String? = null

    @Column(name = "plant_sample_id_green_stems_leaves")
    var plantSampleIdGreenStemsLeaves: String? = null

    @Column(name = "leaves_sec_fw_ss")
    var leavesSecFwSs: String? = null

    @Column(name = "plant_sample_id_leaves_sec")
    var plantSampleIdLeavesSec: String? = null

    @Column(name = "green_stems_sec_fw_ss")
    var greenStemsSecFwSs: String? = null

    @Column(name = "plant_sample_id_green_stems_sec")
    var plantSampleIdGreenStemsSec: String? = null

    @Column(name = "green_stems_leaves_sec_fw_ss")
    var greenStemsLeavesSecFwSs: String? = null

    @Column(name = "plant_sample_id_green_stems_leaves_sec")
    var plantsampleidGreenstemsleavessec: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_yield_assessment")
    var setOfYieldAssessment: String? = null
}