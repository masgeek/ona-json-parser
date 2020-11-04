package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_CON",
        "weedCover_CON",
        "cassavaHeight_CON",
        "weedsHeight_CON",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_CON"
)
class PpWaConDto {
    @JsonProperty("index_CON")
    var indexCon: String? = null

    @JsonProperty("weedCover_CON")
    var weedCoverCon: String? = null

    @JsonProperty("cassavaHeight_CON")
    var cassavaHeightCon: String? = null

    @JsonProperty("weedsHeight_CON")
    var weedsHeightCon: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_CON")
    var setOfWeedAssessmentCon: String? = null
}