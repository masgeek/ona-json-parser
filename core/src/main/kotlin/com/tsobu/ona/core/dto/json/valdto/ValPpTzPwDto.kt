package com.tsobu.ona.core.dto.json.valdto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("problemWeed", "problemWeedLabel", "problemWeedPic", "problemWeedNote", "problemWeedCover", "PARENT_KEY", "KEY", "SET-OF-PW")
class ValPpTzPwDto {
    @JsonProperty("problemWeed")
    var problemWeed: String? = null

    @JsonProperty("problemWeedLabel")
    var problemWeedLabel: String? = null

    @JsonProperty("problemWeedPic")
    var problemWeedPic: String? = null

    @JsonProperty("problemWeedNote")
    var problemWeedNote: String? = null

    @JsonProperty("problemWeedCover")
    var problemWeedCover: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var key: String? = null

    @JsonProperty("SET-OF-PW")
    var setOfPw: String? = null
}