package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentRec {


    @JsonProperty("weedAssessment_REC/index_REC")
    var indexRec: String? = null

    @JsonProperty("weedAssessment_REC/weedCover_REC")
    var weedCoverRec: String? = null

    @JsonProperty("weedAssessment_REC/weedsHeight_REC")
    var weedsHeightRec: String? = null

    @JsonProperty("weedAssessment_REC/cassavaHeight_REC")
    var cassavaHeightRec: String? = null
}