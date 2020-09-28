package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P2", "weedpic_P2", "weedCover_P2", "cassavaHeight_P2", "weedsHeight_P2", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P2")
class PpTzWaP2Dto {
    @JsonProperty("index_P2")
    var indexP2: String? = null

    @JsonProperty("weedpic_P2")
    var weedPicP2: String? = null

    @JsonProperty("weedCover_P2")
    var weedCoverP2: String? = null

    @JsonProperty("cassavaHeight_P2")
    var cassavaHeightP2: String? = null

    @JsonProperty("weedsHeight_P2")
    var weedsHeightP2: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P2")
    var setOfWeedAssessmentP2: String? = null
}