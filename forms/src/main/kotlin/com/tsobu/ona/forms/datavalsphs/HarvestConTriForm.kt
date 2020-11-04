package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("harvest_CON_Tri/triangleNr_CON", "harvest_CON_Tri/nrPlants_CON_Tri", "harvest_CON_Tri/tuberizedMarketableRootsFW_CON_Tri", "harvest_CON_Tri/tuberizedMarketableRootsNr_CON_Tri")
class HarvestConTriForm {
    @JsonProperty("harvest_CON_Tri/triangleNr_CON")
    var triangleNrCon: String? = null

    @JsonProperty("harvest_CON_Tri/nrPlants_CON_Tri")
    var nrPlantsCONTri: String? = null

    @JsonProperty("harvest_CON_Tri/tuberizedMarketableRootsFW_CON_Tri")
    var tuberizedMarketableRootsFwConTri: String? = null

    @JsonProperty("harvest_CON_Tri/tuberizedMarketableRootsNr_CON_Tri")
    var tuberizedMarketableRootsNrConTri: String? = null
}