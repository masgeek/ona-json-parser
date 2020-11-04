package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_CON_BPP3",
        "weedCover_CON_BPP3",
        "cassavaHeight_CON_BPP3",
        "weedsHeight_CON_BPP3",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_CON_BPP3"
)
class PpWaConBpp3Dto {
    @JsonProperty("index_CON_BPP3")
    var indexConBpp3: String? = null

    @JsonProperty("weedCover_CON_BPP3")
    var weedCoverConBpp3: String? = null

    @JsonProperty("cassavaHeight_CON_BPP3")
    var cassavaHeightConBpp3: String? = null

    @JsonProperty("weedsHeight_CON_BPP3")
    var weedsHeightConBpp3: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_CON_BPP3")
    var setOfWeedAssessmentConBpp3: String? = null
}