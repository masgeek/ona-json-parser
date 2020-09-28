package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP2 {
    @JsonProperty("weedAssessment_P2/index_P2")
    var weedAssessmentP2IndexP2: String? = null

    @JsonProperty("weedAssessment_P2/weedpic_P2")
    var weedAssessmentP2WeedpicP2: String? = null

    @JsonProperty("weedAssessment_P2/weedCover_P2")
    var weedAssessmentP2WeedCoverP2 = 0

    @JsonProperty("weedAssessment_P2/weedsHeight_P2")
    var weedAssessmentP2WeedsHeightP2 = 0

    @JsonProperty("weedAssessment_P2/cassavaHeight_P2")
    var weedAssessmentP2CassavaHeightP2 = 0
}