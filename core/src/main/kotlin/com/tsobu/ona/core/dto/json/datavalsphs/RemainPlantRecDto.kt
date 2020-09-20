package com.tsobu.ona.core.dto.json.datavarsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "remainPlantNr_REC",
        "remainPlant_mainStemNR_REC",
        "remainPlant_primBranchNr_REC",
        "remainPlant_height_REC",
        "PARENT_KEY",
        "KEY",
        "SET-OF-remainPlant_REC"
)
class RemainPlantRecDto {
    @JsonProperty("remainPlantNr_REC")
    var remainPlantNrRec: String? = null

    @JsonProperty("remainPlant_mainStemNR_REC")
    var remainPlantMainStemNrRec: String? = null

    @JsonProperty("remainPlant_primBranchNr_REC")
    var remainPlantPrimBranchNrRec: String? = null

    @JsonProperty("remainPlant_height_REC")
    var remainPlantHeightRec: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-remainPlant_REC")
    var setOfRemainPlantRec: String? = null
}