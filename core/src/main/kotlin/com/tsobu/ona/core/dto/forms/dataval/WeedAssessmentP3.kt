package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP3 {
    @JsonProperty("weedAssessment_P3/index_P3")
    var weedAssessmentP3IndexP3: String? = null

    @JsonProperty("weedAssessment_P3/weedpic_P3")
    var weedAssessmentP3WeedpicP3: String? = null

    @JsonProperty("weedAssessment_P3/weedCover_P3")
    var weedAssessmentP3WeedCoverP3 = 0

    @JsonProperty("weedAssessment_P3/weedsHeight_P3")
    var weedAssessmentP3WeedsHeightP3 = 0

    @JsonProperty("weedAssessment_P3/cassavaHeight_P3")
    var weedAssessmentP3CassavaHeightP3 = 0
}