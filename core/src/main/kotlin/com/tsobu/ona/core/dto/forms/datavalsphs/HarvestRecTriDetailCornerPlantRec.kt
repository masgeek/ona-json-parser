package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestRecTriDetailCornerPlantRec {
    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlantNr_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantNrREC: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_height_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantHeightREC: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_mainStemNR_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantMainStemNRREC: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_primBranchNr_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantPrimBranchNrREC: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_marketableRootsFW_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantMarketableRootsFWREC: Double? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_marketableRootsNr_REC")
    var harvestRECTriDetailCornerPlantRECCornerPlantMarketableRootsNrREC: Double? = null
}