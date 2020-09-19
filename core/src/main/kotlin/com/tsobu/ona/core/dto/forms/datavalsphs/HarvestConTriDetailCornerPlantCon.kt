package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonProperty




class HarvestConTriDetailCornerPlantCon {
    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlantNr_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantNrCON: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_height_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantHeightCON = 0.0

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_mainStemNR_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantMainStemNRCON = 0

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_primBranchNr_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantPrimBranchNrCON: String? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_marketableRootsFW_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantMarketableRootsFWCON = 0.0

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON/cornerPlant_marketableRootsNr_CON")
    var harvestCONTriDetailCornerPlantCONCornerPlantMarketableRootsNrCON = 0
}