package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentCon {

    @JsonProperty("weedAssessment_CON/index_CON")
    var indexCon: String? = null

    @JsonProperty("weedAssessment_CON/weedCover_CON")
    var weedCoverCon: String? = null

    @JsonProperty("weedAssessment_CON/weedsHeight_CON")
    var weedsHeightCon: String? = null

    @JsonProperty("weedAssessment_CON/cassavaHeight_CON")
    var cassavaHeightCon: String? = null
}