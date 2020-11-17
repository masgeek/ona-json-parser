package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestRecTriDetailCornerPlantRecForm {
    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlantNr_REC")
    var nrRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_height_REC")
    var heightRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_mainStemNR_REC")
    var mainStemNrRec: String?=null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_primBranchNr_REC")
    var primBranchNrRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_marketableRootsFW_REC")
    var marketableRootsFwRec: String? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC/cornerPlant_marketableRootsNr_REC")
    var marketableRootsNrRec: String? = null
}