package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty



@JsonIgnoreProperties(ignoreUnknown = true)
class HarvestRecTri {
    @JsonProperty("harvest_REC_Tri/triangleNr_REC")
    var triangleNrRec: String? = null

    @JsonProperty("harvest_REC_Tri/nrPlants_REC_Tri")
    var nrPlantsRecTri = 0

    @JsonProperty("harvest_REC_Tri/tuberizedMarketableRootsFW_REC_Tri")
    var tuberizedMarketableRootsFwRecTri = 0.0

    @JsonProperty("harvest_REC_Tri/tuberizedMarketableRootsNr_REC_Tri")
    var tuberizedMarketableRootsNrRecTri = 0
}