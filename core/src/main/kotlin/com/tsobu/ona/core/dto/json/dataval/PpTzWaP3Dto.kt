package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P3", "weedpic_P3", "weedCover_P3", "cassavaHeight_P3", "weedsHeight_P3", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P3")
class PpTzWaP3Dto {
    @JsonProperty("index_P3")
    var indexP3: String? = null

    @JsonProperty("weedpic_P3")
    var weedPicP3: String? = null

    @JsonProperty("weedCover_P3")
    var weedCoverP3: String? = null

    @JsonProperty("cassavaHeight_P3")
    var cassavaHeightP3: String? = null

    @JsonProperty("weedsHeight_P3")
    var weedsHeightP3: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P3")
    var setOfWeedAssessmentP3: String? = null
}