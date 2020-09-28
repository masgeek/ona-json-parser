package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_ALT",
        "weedCover_ALT",
        "cassavaHeight_ALT",
        "weedsHeight_ALT",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_ALT"
)
class PpWaAltDto {
    @JsonProperty("index_ALT")
    var indexAlt: String? = null

    @JsonProperty("weedCover_ALT")
    var weedCoverAlt: String? = null

    @JsonProperty("cassavaHeight_ALT")
    var cassavaHeightAlt: String? = null

    @JsonProperty("weedsHeight_ALT")
    var weedsHeightAlt: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_ALT")
    var setOfWeedAssessmentAlt: String? = null
}