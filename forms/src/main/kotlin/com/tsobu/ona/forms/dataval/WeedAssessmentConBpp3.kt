package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentConBpp3 {

    @JsonProperty("weedAssessment_CON_BPP3/index_CON_BPP3")
    var indexConBPP3: String? = null

    @JsonProperty("weedAssessment_CON_BPP3/weedCover_CON_BPP3")
    var weedCoverConBpp3: String? = null

    @JsonProperty("weedAssessment_CON_BPP3/weedsHeight_CON_BPP3")
    var weedsHeightConBpp3: String? = null

    @JsonProperty("weedAssessment_CON_BPP3/cassavaHeight_CON_BPP3")
    var cassavaHeightConBpp3: String? = null
}