package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonProperty


class HarvestConTriDetailRemainPlantConForm {
    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlantNr_CON")
    var remainPlantNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_height_CON")
    var remainPlantHeightCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_mainStemNR_CON")
    var remainPlantMainStemNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_primBranchNr_CON")
    var remainPlantPrimBranchNrCon: String? = null
}