package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty



@JsonIgnoreProperties(ignoreUnknown = false)
class HarvestRecTriForm {
    @JsonProperty("harvest_REC_Tri/triangleNr_REC")
    var triangleNrRec: String? = null

    @JsonProperty("harvest_REC_Tri/nrPlants_REC_Tri")
    var nrPlantsRecTri :String?=null

    @JsonProperty("harvest_REC_Tri/tuberizedMarketableRootsFW_REC_Tri")
    var tuberizedMarketableRootsFwRecTri :String?=null

    @JsonProperty("harvest_REC_Tri/tuberizedMarketableRootsNr_REC_Tri")
    var tuberizedMarketableRootsNrRecTri :String?=null
}