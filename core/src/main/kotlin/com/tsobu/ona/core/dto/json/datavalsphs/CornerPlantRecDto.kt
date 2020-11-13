package com.tsobu.ona.core.dto.json.datavarsphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "cornerPlantNr_REC",
        "cornerPlant_mainStemNR_REC",
        "cornerPlant_primBranchNr_REC",
        "cornerPlant_height_REC",
        "cornerPlant_marketableRootsNr_REC",
        "cornerPlant_marketableRootsFW_REC",
        "PARENT_KEY",
        "KEY",
        "SET-OF-cornerPlant_REC"
)
class CornerPlantRecDto {
    @JsonProperty("cornerPlantNr_REC")
    var nrRec: String? = null

    @JsonProperty("cornerPlant_mainStemNR_REC")
    var mainStemNrRec: String? = null

    @JsonProperty("cornerPlant_primBranchNr_REC")
    var primBranchNrRec: String? = null

    @JsonProperty("cornerPlant_height_REC")
    var heightRec: String? = null

    @JsonProperty("cornerPlant_marketableRootsNr_REC")
    var marketableRootsNrRec: String? = null

    @JsonProperty("cornerPlant_marketableRootsFW_REC")
    var marketableRootsFwRec: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-cornerPlant_REC")
    var setOfCornerPlantRec: String? = null
}