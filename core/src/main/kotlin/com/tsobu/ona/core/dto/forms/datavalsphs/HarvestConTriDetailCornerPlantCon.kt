package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonProperty


class HarvestConTriDetailCornerPlantCon {
    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlantNr_CON")
    var cornerPlantNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_height_CON")
    var cornerPlantHeightCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_mainStemNR_CON")
    var cornerPlantMainStemNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_primBranchNr_CON")
    var cornerPlantPrimBranchNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_marketableRootsFW_CON")
    var cornerPlantMarketableRootsFWCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_marketableRootsNr_CON")
    var cornerPlantMarketableRootsNrCon: String? = null
}