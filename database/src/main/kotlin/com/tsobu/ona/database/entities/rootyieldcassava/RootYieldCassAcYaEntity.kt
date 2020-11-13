package com.tsobu.ona.database.entities.rootyieldcassava

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_root_yield_cassava_ac_ya")
class RootYieldCassAcYaEntity : BaseEntity() {

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "density_variable")
    var densityVariable: String? = null

    @Column(name = "nr_rows_variable")
    var nrRowsVariable: String? = null

    @Column(name = "nr_plants_row_variable")
    var nrPlantsRowVariable: String? = null

    @Column(name = "plot_dim_note")
    var plotDimNote: String? = null

    @Column(name = "l1_variable")
    var l1Variable: String? = null

    @Column(name = "w1_variable")
    var w1Variable: String? = null

    @Column(name = "l2_variable")
    var l2Variable: String? = null

    @Column(name = "w2_variable")
    var w2Variable: String? = null

    @Column(name = "between_row_variable")
    var betweenRowVariable: String? = null

    @Column(name = "within_row_variable")
    var withinRowVariable: String? = null

    @Column(name = "density_variable_calc")
    var densityVariableCalc: String? = null

    @Column(name = "max_stand_variable")
    var maxStandVariable: String? = null

    @Column(name = "plot_size_variable")
    var plotSizeVariable: String? = null

    @Column(name = "note_variable")
    var noteVariable: String? = null

    @Column(name = "nr_plants_np")
    var nrPlantsNp: String? = null

    @Column(name = "nr_plants_se")
    var nrPlantsSe: String? = null

    @Column(name = "generated_table_list_label_73")
    var generatedTableListLabel73: String? = null

    @Column(name = "tuberized_roots_nr")
    var tuberizedRootsNr: String? = null

    @Column(name = "tuberized_marketable_roots_nr")
    var tuberizedMarketableRootsNr: String? = null

    @Column(name = "generated_table_list_label_77")
    var generatedTableListLabel77: String? = null

    @Column(name = "tuberized_roots_fw")
    var tuberizedRootsFw: String? = null

    @Column(name = "tuberized_diseased_roots_fw")
    var tuberizedDiseasedRootsFw: String? = null

    @Column(name = "tuberized_small_roots_fw")
    var tuberizedSmallRootsFw: String? = null

    @Column(name = "tuberized_marketable_roots_fw")
    var tuberizedMarketableRootsFw: String? = null

    @Column(name = "tuberized_roots_fw_ss")
    var tuberizedRootsFwSs: String? = null

    @Column(name = "plant_sample_id_tuberized_roots")
    var plantSampleIdTuberizedRoots: String? = null

    @Column(name = "tuberized_small_roots_fw_ss")
    var tuberizedSmallRootsFwSs: String? = null

    @Column(name = "plant_sample_id_tuberized_small_roots")
    var plantSampleIdTuberizedSmallRoots: String? = null

    @Column(name = "tuberized_marketable_roots_fw_ss")
    var tuberizedMarketableRootsFwSs: String? = null

    @Column(name = "plant_sample_id_tuberized_marketable_roots")
    var plantSampleIdTuberizedMarketableRoots: String? = null

    @Column(name = "disease")
    var disease: String? = null

    @Column(name = "disease_score_roots")
    var diseaseScoreRoots: String? = null

    @Column(name = "disease_score_roots_incidence")
    var diseaseScoreRootsIncidence: String? = null

    @Column(name = "disease_score_roots_severity")
    var diseaseScoreRootsSeverity: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_yield_assessment")
    var setOfYieldAssessment: String? = null
}