package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonProperty




class HarvestConTriDetailRemainPlantCon {
    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlantNr_CON")
    var harvestCONTriDetailRemainPlantCONRemainPlantNrCON: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_height_CON")
    var harvestCONTriDetailRemainPlantCONRemainPlantHeightCON = 0.0

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_mainStemNR_CON")
    var harvestCONTriDetailRemainPlantCONRemainPlantMainStemNRCON = 0

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON/remainPlant_primBranchNr_CON")
    var harvestCONTriDetailRemainPlantCONRemainPlantPrimBranchNrCON: String? = null
}