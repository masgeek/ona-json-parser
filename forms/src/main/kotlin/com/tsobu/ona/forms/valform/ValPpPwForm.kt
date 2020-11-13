package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("PW/problemWeed", "PW/problemWeedPic", "PW/problemWeedCover", "PW/problemWeedLabel")
class ValPpPwForm {
    @JsonProperty("PW/problemWeed")
    var problemWeed: String? = null

    @JsonProperty("PW/problemWeedPic")
    var problemWeedPic: String? = null

    @JsonProperty("PW/problemWeedCover")
    var problemWeedCover: String? = null

    @JsonProperty("PW/problemWeedLabel")
    var problemWeedLabel: String? = null
}