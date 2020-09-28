package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P6", "weedpic_P6", "weedCover_P6", "cassavaHeight_P6", "weedsHeight_P6", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P6")
class PpTzWaP6Dto {
    @JsonProperty("index_P6")
    var indexP6: String? = null

    @JsonProperty("weedpic_P6")
    var weedPicP6: String? = null

    @JsonProperty("weedCover_P6")
    var weedCoverP6: String? = null

    @JsonProperty("cassavaHeight_P6")
    var cassavaHeightP6: String? = null

    @JsonProperty("weedsHeight_P6")
    var weedsHeightP6: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P6")
    var setOfWeedAssessmentP6: String? = null
}