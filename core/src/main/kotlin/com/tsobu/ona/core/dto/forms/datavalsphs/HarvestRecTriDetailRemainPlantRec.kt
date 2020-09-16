package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestRecTriDetailRemainPlantRec {
    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlantNr_REC")
    var harvestRECTriDetailRemainPlantRECRemainPlantNrREC: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_height_REC")
    var harvestRECTriDetailRemainPlantRECRemainPlantHeightREC: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_mainStemNR_REC")
    var harvestRECTriDetailRemainPlantRECRemainPlantMainStemNRREC: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_primBranchNr_REC")
    var harvestRECTriDetailRemainPlantRECRemainPlantPrimBranchNrREC: String? = null
}