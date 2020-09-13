package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
class ScoreWeedControlAcWdDto {
    var imageLeafArea: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfWd: String? = null
}