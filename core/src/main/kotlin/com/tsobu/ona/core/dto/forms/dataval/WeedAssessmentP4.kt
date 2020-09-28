package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP4 {
    @JsonProperty("weedAssessment_P4/index_P4")
    var weedAssessmentP4IndexP4: String? = null

    @JsonProperty("weedAssessment_P4/weedpic_P4")
    var weedAssessmentP4WeedpicP4: String? = null

    @JsonProperty("weedAssessment_P4/weedCover_P4")
    var weedAssessmentP4WeedCoverP4 = 0

    @JsonProperty("weedAssessment_P4/weedsHeight_P4")
    var weedAssessmentP4WeedsHeightP4 = 0

    @JsonProperty("weedAssessment_P4/cassavaHeight_P4")
    var weedAssessmentP4CassavaHeightP4 = 0
}