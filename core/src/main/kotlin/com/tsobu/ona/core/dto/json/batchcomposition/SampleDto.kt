package com.tsobu.ona.core.dto.json.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nr", "plantSampleID", "soilSampleID", "PS_key", "SS_key", "reportAction_PS", "reportAction_SS", "FW", "DC", "RS", "NA", "SB", "noteFW", "noteDC", "noteRS", "noteNA", "noteSB", "PARENT_KEY", "KEY", "SET-OF-sample")
class SampleDto {
    @JsonProperty("nr")
    var nr: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleID: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleID: String? = null

    @JsonProperty("PS_key")
    var pSKey: String? = null

    @JsonProperty("SS_key")
    var sSKey: String? = null

    @JsonProperty("reportAction_PS")
    var reportActionPS: String? = null

    @JsonProperty("reportAction_SS")
    var reportActionSS: String? = null

    @JsonProperty("FW")
    var fw: String? = null

    @JsonProperty("DC")
    var dc: String? = null

    @JsonProperty("RS")
    var rs: String? = null

    @JsonProperty("NA")
    var na: String? = null

    @JsonProperty("SB")
    var sb: String? = null

    @JsonProperty("noteFW")
    var noteFW: String? = null

    @JsonProperty("noteDC")
    var noteDC: String? = null

    @JsonProperty("noteRS")
    var noteRS: String? = null

    @JsonProperty("noteNA")
    var noteNA: String? = null

    @JsonProperty("noteSB")
    var noteSB: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-sample")
    var setOfSample: String? = null
}