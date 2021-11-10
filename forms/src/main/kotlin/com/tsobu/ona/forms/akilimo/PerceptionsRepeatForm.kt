package com.tsobu.ona.forms.akilimo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class PerceptionsRepeatForm {
    @JsonProperty("perceptions/perceptions_repeat/response")
    var response: String? = null

    @JsonProperty("perceptions/perceptions_repeat/repeat_nr")
    var repeatNr: String? = null

    @JsonProperty("perceptions/perceptions_repeat/statement")
    var statement: String? = null

    @JsonProperty("perceptions/perceptions_repeat/run_choice")
    var runChoice: String? = null

    @JsonProperty("perceptions/perceptions_repeat/statement_nr")
    var statementNr: String? = null
}