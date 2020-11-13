package com.tsobu.ona.core.dto.json.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("triangleNr_CON", "nrPlants_CON_Tri", "tuberizedMarketableRootsNr_CON_Tri", "tuberizedMarketableRootsFW_CON_Tri", "PARENT_KEY", "KEY", "SET-OF-harvest_CON_Tri")
class HarvestConTriDto {
    @JsonProperty("triangleNr_CON")
    var triangleNrCon: String? = null

    @JsonProperty("nrPlants_CON_Tri")
    var nrPlantsConTri: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CON_Tri")
    var tuberizedMarketableRootsNrConTri: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CON_Tri")
    var tuberizedMarketableRootsFwConTri: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-harvest_CON_Tri")
    var setOfHarvestConTri: String? = null
}