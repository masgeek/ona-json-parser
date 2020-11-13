package com.tsobu.ona.core.dto.json.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "triangleNr_CON_detail",
        "nrPlants_CON_Tri_detail",
        "cornerPlant_CON_count",
        "SET-OF-cornerPlant_CON",
        "remainPlantTotalNr_CON",
        "remainPlant_CON_count",
        "SET-OF-remainPlant_CON",
        "remainPlants_tuberizedMarketableRootsNr_CON_Tri_detail",
        "remainPlant_tuberizedMarketableRootsFW_CON_Tri_detail",
        "PARENT_KEY",
        "KEY",
        "SET-OF-harvest_CON_Tri_detail"
)
class ConTriDetailDto {
    @JsonProperty("triangleNr_CON_detail")
    var triangleNrConDetail: String? = null

    @JsonProperty("nrPlants_CON_Tri_detail")
    var nrPlantsConTriDetail: String? = null

    @JsonProperty("cornerPlant_CON_count")
    var cornerPlantConCount: String? = null

    @JsonProperty("SET-OF-cornerPlant_CON")
    var setOfCornerPlantCon: String? = null

    @JsonProperty("remainPlantTotalNr_CON")
    var remainPlantTotalNrCON: String? = null

    @JsonProperty("remainPlant_CON_count")
    var remainPlantConCount: String? = null

    @JsonProperty("SET-OF-remainPlant_CON")
    var setOfRemainPlantCon: String? = null

    @JsonProperty("remainPlants_tuberizedMarketableRootsNr_CON_Tri_detail")
    var tuberizedMarketableRootsNrConTriDetail: String? = null

    @JsonProperty("remainPlant_tuberizedMarketableRootsFW_CON_Tri_detail")
    var tuberizedMarketableRootsFwConTriDetail: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-harvest_CON_Tri_detail")
    var setOfHarvestConTriDetail: String? = null
}
