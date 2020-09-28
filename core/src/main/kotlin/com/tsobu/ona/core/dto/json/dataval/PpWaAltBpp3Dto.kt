package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_ALT_BPP3",
        "weedCover_ALT_BPP3",
        "cassavaHeight_ALT_BPP3",
        "weedsHeight_ALT_BPP3",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_ALT_BPP3"
)
class PpWaAltBpp3Dto {
    @JsonProperty("index_ALT_BPP3")
    var indexAltBpp3: String? = null

    @JsonProperty("weedCover_ALT_BPP3")
    var weedCoverAltBpp3: String? = null

    @JsonProperty("cassavaHeight_ALT_BPP3")
    var cassavaHeightAltBpp3: String? = null

    @JsonProperty("weedsHeight_ALT_BPP3")
    var weedsHeightAltBpp3: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_ALT_BPP3")
    var setOfWeedAssessmentAltBpp3: String? = null
}