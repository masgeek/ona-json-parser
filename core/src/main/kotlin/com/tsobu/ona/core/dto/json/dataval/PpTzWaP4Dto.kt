package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_P4", "weedpic_P4", "weedCover_P4", "cassavaHeight_P4", "weedsHeight_P4", "PARENT_KEY", "KEY", "SET-OF-weedAssessment_P4")
class PpTzWaP4Dto {
    @JsonProperty("index_P4")
    var indexP4: String? = null

    @JsonProperty("weedpic_P4")
    var weedPicP4: String? = null

    @JsonProperty("weedCover_P4")
    var weedCoverP4: String? = null

    @JsonProperty("cassavaHeight_P4")
    var cassavaHeightP4: String? = null

    @JsonProperty("weedsHeight_P4")
    var weedsHeightP4: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-weedAssessment_P4")
    var setOfWeedAssessmentP4: String? = null
}