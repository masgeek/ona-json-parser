package com.tsobu.ona.database.entities.lignifiedstem

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_lignified_stem_yield_cass_ac_ya")
class LignifiedStemYieldCassAcYaEntity : BaseEntity() {
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

    @Column(name = "generated_table_list_label_32")
    var generatedTableListLabel32: String? = null

    @Column(name = "nr_main_stems")
    var nrMainStems: String? = null

    @Column(name = "nr_primary_branches")
    var nrPrimaryBranches: String? = null

    @Column(name = "generated_table_list_label_36")
    var generatedTableListLabel36: String? = null

    @Column(name = "lignified_stems_fw")
    var lignifiedStemsFw: String? = null

    @Column(name = "old_planting_stick_fw")
    var oldPlantingStickFw: String? = null

    @Column(name = "lignified_stems_fw_ss")
    var lignifiedStemsFwSs: String? = null

    @Column(name = "plant_sample_id_lignified_stems")
    var plantSampleIdLignifiedStems: String? = null

    @Column(name = "old_planting_stick_fw_ss")
    var oldPlantingStickFwSs: String? = null

    @Column(name = "plant_sample_id_old_planting_stick")
    var plantSampleIdOldPlantingStick: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_yield_assessment")
    var setOfYieldAssessment: String? = null
}