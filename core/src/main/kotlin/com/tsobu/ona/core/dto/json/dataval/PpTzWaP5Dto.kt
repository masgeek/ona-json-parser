package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P5", "weedpic_P5", "weedCover_P5", "cassavaHeight_P5", "weedsHeight_P5", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P5")
class PpTzWaP5Dto {
    @JsonProperty("index_P5")
    var indexP5: String? = null

    @JsonProperty("weedpic_P5")
    var weedPicP5: String? = null

    @JsonProperty("weedCover_P5")
    var weedCoverP5: String? = null

    @JsonProperty("cassavaHeight_P5")
    var cassavaHeightP5: String? = null

    @JsonProperty("weedsHeight_P5")
    var weedsHeightP5: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P5")
    var setOfWeedAssessmentP5: String? = null
}