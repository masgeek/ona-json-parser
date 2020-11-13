package com.tsobu.ona.forms.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("ID/sectionID", "ID/tag/dateAttached", "ID/tag/dateRecovered")
class CollectLeafTagsAcIdForm {
    @JsonProperty("ID/sectionID")
    var sectionId: String? = null

    @JsonProperty("ID/tag/dateAttached")
    var dateAttached: String? = null

    @JsonProperty("ID/tag/dateRecovered")
    var dateRecovered: String? = null
}