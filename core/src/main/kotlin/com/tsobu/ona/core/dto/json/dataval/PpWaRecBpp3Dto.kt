package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "index_REC_BPP3",
        "weedCover_REC_BPP3",
        "cassavaHeight_REC_BPP3",
        "weedsHeight_REC_BPP3",
        "PARENT_KEY",
        "KEY",
        "SET-OF-weedAssessment_REC_BPP3"
)
class PpWaRecBpp3Dto {
    @JsonProperty("index_REC_BPP3")
    var indexRecBpp3: String? = null

    @JsonProperty("weedCover_REC_BPP3")
    var weedCoverRecBpp3: String? = null

    @JsonProperty("cassavaHeight_REC_BPP3")
    var cassavaHeightRecBpp3: String? = null

    @JsonProperty("weedsHeight_REC_BPP3")
    var weedsHeightRecBpp3: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_REC_BPP3")
    var setOfWeedAssessmentRecBpp3: String? = null
}