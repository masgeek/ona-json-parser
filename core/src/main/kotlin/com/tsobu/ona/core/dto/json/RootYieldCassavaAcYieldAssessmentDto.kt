package com.tsobu.ona.core.dto.json

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

class RootYieldCassavaAcYieldAssessmentDto  {

    var plotId: String? = null
    var sectionId: String? = null
    var plantId: String? = null
    var densityVariable: String? = null
    var nrRowsVariable: String? = null
    var nrPlantsRowVariable: String? = null
    var plotDimNote: String? = null

    var l1Variable: String? = null

    var w1Variable: String? = null
    var l2Variable: String? = null

    var w2Variable: String? = null
    var betweenRowVariable: String? = null
    var withinRowVariable: String? = null
    var densityVariableCalc: String? = null
    var maxStandVariable: String? = null
    var plotSizeVariable: String? = null
    var noteVariable: String? = null
    var nrPlantsNp: String? = null
    var nrPlantsSe: String? = null

    var generatedTableListLabel73: String? = null
    var tuberizedRootsNr: String? = null
    var tuberizedMarketableRootsNr: String? = null

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