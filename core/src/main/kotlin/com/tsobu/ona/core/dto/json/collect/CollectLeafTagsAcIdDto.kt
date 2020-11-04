package com.tsobu.ona.core.dto.json.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sectionID", "plotID", "dateAttached", "dateRecovered", "PARENT_KEY", "KEY", "SET-OF-ID")
class CollectLeafTagsAcIdDto {
    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("dateAttached")
    var dateAttached: String? = null

    @JsonProperty("dateRecovered")
    var dateRecovered: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var key: String? = null

    @JsonProperty("SET-OF-ID")
    var setOfId: String? = null
}