package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("PW/problemWeed", "PW/problemWeedPic", "PW/problemWeedCover", "PW/problemWeedLabel")
class ValPpTzPwForm {
    @JsonProperty("PW/problemWeed")
    var pWProblemWeed: String? = null

    @JsonProperty("PW/problemWeedPic")
    var pWProblemWeedPic: String? = null

    @JsonProperty("PW/problemWeedCover")
    var pWProblemWeedCover: String? = null

    @JsonProperty("PW/problemWeedLabel")
    var pWProblemWeedLabel: String? = null
}