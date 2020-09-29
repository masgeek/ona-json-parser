package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP4 {
    @JsonProperty("weedAssessment_P4/index_P4")
    var indexP4: String? = null

    @JsonProperty("weedAssessment_P4/weedpic_P4")
    var weedPicP4: String? = null

    @JsonProperty("weedAssessment_P4/weedCover_P4")
    var weedCoverP4 = 0

    @JsonProperty("weedAssessment_P4/weedsHeight_P4")
    var weedsHeightP4 = 0

    @JsonProperty("weedAssessment_P4/cassavaHeight_P4")
    var cassavaHeightP4 = 0
}