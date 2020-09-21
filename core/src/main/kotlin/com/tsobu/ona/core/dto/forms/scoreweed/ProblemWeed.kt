package com.tsobu.ona.core.dto.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class ProblemWeed {

    @JsonProperty("PW/problemWeed")
    var problemWeed: String? = null

    @JsonProperty("PW/problemWeedPic")
    var problemWeedPic: String? = null

    @JsonProperty("PW/problemWeedCover")
    var problemWeedCover: String? = null

    @JsonProperty("PW/problemWeedLabel")
    var problemWeedLabel: String? = null
}