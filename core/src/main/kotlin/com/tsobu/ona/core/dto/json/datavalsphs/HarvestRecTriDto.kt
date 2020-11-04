package com.tsobu.ona.core.dto.json.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "triangleNr_REC",
        "nrPlants_REC_Tri",
        "tuberizedMarketableRootsNr_REC_Tri",
        "tuberizedMarketableRootsFW_REC_Tri",
        "PARENT_KEY",
        "KEY",
)
class HarvestRecTriDto {
    @JsonProperty("triangleNr_REC")
    var triangleNrRec: String? = null

    @JsonProperty("nrPlants_REC_Tri")
    var nrPlantsRecTri: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_REC_Tri")
    var tuberizedMarketableRootsNrRecTri: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_REC_Tri")
    var tuberizedMarketableRootsFwRecTri: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-harvest_REC_Tri")
    var setOfHarvestRecTri: String? = null
}
