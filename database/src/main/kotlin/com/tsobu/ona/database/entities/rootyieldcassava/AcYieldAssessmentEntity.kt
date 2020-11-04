package com.tsobu.ona.database.entities.rootyieldcassava

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_root_yield_cassava_ac_yield_assessment")
class AcYieldAssessmentEntity : BaseEntity() {

    var plotId: String? = null
    var sectionId: String? = null
    var plantId: String? = null
    var densityVariable: String? = null
    var nrRowsVariable: String? = null
    var nrPlantsRowVariable: String? = null
    var plotDimNote: String? = null

    @Column(name = "l1_variable")
    var l1Variable: String? = null

    @Column(name = "w1_variable")
    var w1Variable: String? = null

    @Column(name = "l2_variable")
    var l2Variable: String? = null

    @Column(name = "w2_variable")
    var w2Variable: String? = null
    var betweenRowVariable: String? = null
    var withinRowVariable: String? = null
    var densityVariableCalc: String? = null
    var maxStandVariable: String? = null
    var plotSizeVariable: String? = null
    var noteVariable: String? = null
    var nrPlantsNp: String? = null
    var nrPlantsSe: String? = null

    @Column(name = "generated_table_list_label_73")
    var generatedTableListLabel73: String? = null
    var tuberizedRootsNr: String? = null
    var tuberizedMarketableRootsNr: String? = null

    @Column(name = "generated_table_list_label_77")
    var generatedTableListLabel77: String? = null
    var tuberizedRootsFw: String? = null
    var tuberizedDiseasedRootsFw: String? = null
    var tuberizedSmallRootsFw: String? = null
    var tuberizedMarketableRootsFw: String? = null
    var tuberizedRootsFwSs: String? = null
    var plantSampleIdTuberizedRoots: String? = null
    var tuberizedSmallRootsFwSs: String? = null
    var plantSampleIdTuberizedSmallRoots: String? = null
    var tuberizedMarketableRootsFwSs: String? = null
    var plantSampleIdTuberizedMarketableRoots: String? = null
    var disease: String? = null
    var diseaseScoreRoots: String? = null
    var diseaseScoreRootsIncidence: String? = null
    var diseaseScoreRootsSeverity: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfYieldAssessment: String? = null
}