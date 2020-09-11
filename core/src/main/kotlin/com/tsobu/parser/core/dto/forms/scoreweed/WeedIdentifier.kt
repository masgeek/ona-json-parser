package com.tsobu.parser.core.dto.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedIdentifier {
    @JsonProperty("ID/WD/imageLeafArea")
    var imageLeafArea: String? = null
}