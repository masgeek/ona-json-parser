package com.tsobu.ona.core.dto.json.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "triangleNr_REC_detail",
        "nrPlants_REC_Tri_detail",
        "cornerPlant_REC_count",
        "SET-OF-cornerPlant_REC",
        "remainPlantTotalNr_REC",
        "remainPlant_REC_count",
        "SET-OF-remainPlant_REC",
        "remainPlants_tuberizedMarketableRootsNr_REC_Tri_detail",
        "remainPlant_tuberizedMarketableRootsFW_REC_Tri_detail",
        "PARENT_KEY",
        "KEY",
        "SET-OF-harvest_REC_Tri_detail"
)
class RecTriDetailDto {
    @JsonProperty("triangleNr_REC_detail")
    var triangleNr: String? = null

    @JsonProperty("nrPlants_REC_Tri_detail")
    var nrPlants: String? = null

    @JsonProperty("cornerPlant_REC_count")
    var cornerPlantRecCount: String? = null

    @JsonProperty("SET-OF-cornerPlant_REC")
    var setOfCornerPlant: String? = null

    @JsonProperty("remainPlantTotalNr_REC")
    var remainPlantTotalNr: String? = null

    @JsonProperty("remainPlant_REC_count")
    var remainPlantRecCount: String? = null

    @JsonProperty("SET-OF-remainPlant_REC")
    var setOfRemainPlant: String? = null

    @JsonProperty("remainPlants_tuberizedMarketableRootsNr_REC_Tri_detail")
    var remainPlantsTuberizedMarketableRootsNr: String? = null

    @JsonProperty("remainPlant_tuberizedMarketableRootsFW_REC_Tri_detail")
    var remainPlantTuberizedMarketableRootsFw: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-harvest_REC_Tri_detail")
    var setOfHarvest: String? = null
}
