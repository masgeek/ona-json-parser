package com.tsobu.ona.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedIdentifierForm {
    @JsonProperty("ID/WD/imageLeafArea")
    var imageLeafArea: String? = null
}