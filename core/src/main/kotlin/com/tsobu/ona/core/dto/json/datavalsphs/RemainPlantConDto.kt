package com.tsobu.ona.core.dto.json.datavarsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "remainPlantNr_CON",
        "remainPlant_mainStemNR_CON",
        "remainPlant_primBranchNr_CON",
        "remainPlant_height_CON",
        "PARENT_KEY",
        "KEY",
        "SET-OF-remainPlant_CON"
)
class RemainPlantConDto {

    @JsonProperty("remainPlantNr_CON")
    var remainPlantNrCON: String? = null

    @JsonProperty("remainPlant_mainStemNR_CON")
    var remainPlantMainStemNrCon: String? = null

    @JsonProperty("remainPlant_primBranchNr_CON")
    var remainPlantPrimBranchNrCon: String? = null

    @JsonProperty("remainPlant_height_CON")
    var remainPlantHeightCon: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-remainPlant_CON")
    var setOfRemainPlantCon: String? = null
}