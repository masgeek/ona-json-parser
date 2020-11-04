package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_REC",
        "weedCover_REC",
        "cassavaHeight_REC",
        "weedsHeight_REC",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_REC"
)
class PpWaRecDto {
    @JsonProperty("index_REC")
    var indexRec: String? = null

    @JsonProperty("weedCover_REC")
    var weedCoverRec: String? = null

    @JsonProperty("cassavaHeight_REC")
    var cassavaHeightRec: String? = null

    @JsonProperty("weedsHeight_REC")
    var weedsHeightRec: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_REC")
    var setOfWeedAssessmentRec: String? = null
}