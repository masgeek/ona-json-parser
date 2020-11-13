package com.tsobu.ona.core.dto.json.datavalsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("cornerPlantNr_CON",
        "cornerPlant_mainStemNR_CON",
        "cornerPlant_primBranchNr_CON",
        "cornerPlant_height_CON",
        "cornerPlant_marketableRootsNr_CON",
        "cornerPlant_marketableRootsFW_CON",
        "PARENT_KEY",
        "KEY",
        "SET-OF-cornerPlant_CON")
class CornerPlantConDto {

    @JsonProperty("cornerPlantNr_CON")
    var cornerPlantNrCon: String? = null

    @JsonProperty("cornerPlant_mainStemNR_CON")
    var cornerPlantMainStemNrCon: String? = null

    @JsonProperty("cornerPlant_primBranchNr_CON")
    var cornerPlantHeightCon: String? = null

    @JsonProperty("cornerPlant_height_CON")
    var cornerPlantHeightCON: String? = null

    @JsonProperty("cornerPlant_marketableRootsNr_CON")
    var cornerPlantMarketableRootsNrCon: String? = null

    @JsonProperty("cornerPlant_marketableRootsFW_CON")
    var cornerPlantMarketableRootsFwCon: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-cornerPlant_CON")
    var setOfCornerPlantCon: String? = null
}