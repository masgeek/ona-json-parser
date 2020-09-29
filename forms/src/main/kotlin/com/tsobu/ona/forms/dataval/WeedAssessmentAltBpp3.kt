package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentAltBpp3 {

    @JsonProperty("weedAssessment_ALT_BPP3/index_ALT_BPP3")
    var indexAltBpp3: String? = null

    @JsonProperty("weedAssessment_ALT_BPP3/weedCover_ALT_BPP3")
    var weedCoverAltBpp3: Int? = null

    @JsonProperty("weedAssessment_ALT_BPP3/weedsHeight_ALT_BPP3")
    var weedsHeightAltBpp33: Int? = null

    @JsonProperty("weedAssessment_ALT_BPP3/cassavaHeight_ALT_BPP3")
    var cassavaHeightAltBpp3: Int? = null
}