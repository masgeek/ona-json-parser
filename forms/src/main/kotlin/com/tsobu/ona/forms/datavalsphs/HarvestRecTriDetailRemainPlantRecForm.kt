package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestRecTriDetailRemainPlantRecForm {
    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlantNr_REC")
    var remainPlantNrRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_height_REC")
    var remainPlantHeightRec: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_mainStemNR_REC")
    var remainPlantMainStemNrRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC/remainPlant_primBranchNr_REC")
    var remainPlantPrimBranchNrRec: String? = null
}