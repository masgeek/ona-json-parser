package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentAlt {


    @JsonProperty("weedAssessment_ALT/index_ALT")
    var indexAlt: String? = null

    @JsonProperty("weedAssessment_ALT/weedCover_ALT")
    var weedCoverAlt: Int? = null

    @JsonProperty("weedAssessment_ALT/weedsHeight_ALT")
    var weedsHeightAlt: Int? = null

    @JsonProperty("weedAssessment_ALT/cassavaHeight_ALT")
    var cassavaHeightAlt: Int? = null
}