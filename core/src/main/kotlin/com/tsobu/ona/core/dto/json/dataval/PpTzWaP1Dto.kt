package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P1", "weedpic_P1", "weedCover_P1", "cassavaHeight_P1", "weedsHeight_P1", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P1")
class PpTzWaP1Dto {
    @JsonProperty("index_P1")
    var indexP1: String? = null

    @JsonProperty("weedpic_P1")
    var weedPicP1: String? = null

    @JsonProperty("weedCover_P1")
    var weedCoverP1: String? = null

    @JsonProperty("cassavaHeight_P1")
    var cassavaHeightP1: String? = null

    @JsonProperty("weedsHeight_P1")
    var weedsHeightP1: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P1")
    var setOfWeedAssessmentP1: String? = null
}