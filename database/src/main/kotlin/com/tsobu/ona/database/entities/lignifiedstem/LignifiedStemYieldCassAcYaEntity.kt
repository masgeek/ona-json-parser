package com.tsobu.ona.database.entities.lignifiedstem

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_lignified_stem_yield_cass_ac_ya")
class LignifiedStemYieldCassAcYaEntity : BaseEntity() {
    @Column(name = "plot_id")
    private val plotId: String? = null

    @Column(name = "section_id")
    private val sectionId: String? = null

    @Column(name = "plant_id")
    private val plantId: String? = null

    @Column(name = "nr_plants_np")
    private val nrPlantsNp: String? = null

    @Column(name = "nr_plants_se")
    private val nrPlantsSe: String? = null

    @Column(name = "generated_table_list_label_32")
    private val generatedTableListLabel32: String? = null

    @Column(name = "nr_main_stems")
    private val nrMainStems: String? = null

    @Column(name = "nr_primary_branches")
    private val nrPrimaryBranches: String? = null

    @Column(name = "generated_table_list_label_36")
    private val generatedTableListLabel36: String? = null

    @Column(name = "lignified_stems_fw")
    private val lignifiedStemsFw: String? = null

    @Column(name = "old_planting_stick_fw")
    private val oldPlantingStickFw: String? = null

    @Column(name = "lignified_stems_fw_ss")
    private val lignifiedStemsFwSs: String? = null

    @Column(name = "plant_sample_id_lignified_stems")
    private val plantSampleIdLignifiedStems: String? = null

    @Column(name = "old_planting_stick_fw_ss")
    private val oldPlantingStickFwSs: String? = null

    @Column(name = "plant_sample_id_old_planting_stick")
    private val plantSampleIdOldPlantingStick: String? = null

    @Column(name = "parent_key")
    private val parentKey: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null

    @Column(name = "set_of_yield_assessment")
    private val setOfYieldAssessment: String? = null
}