package com.tsobu.ona.forms.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sampleList/sample/FW", "sampleList/sample/NA", "sampleList/sample/NF", "sampleList/sample/SB", "sampleList/sample/nr", "sampleList/sample/soilSampleID", "sampleList/sample/plantSampleID", "sampleList/sample/PS_key", "sampleList/sample/noteSB", "sampleList/sample/DC", "sampleList/sample/RS", "sampleList/sample/SS_key", "sampleList/sample/noteRS", "sampleList/sample/reportAction_SS", "sampleList/sample/noteFW", "sampleList/sample/noteDC", "sampleList/sample/noteNA", "sampleList/sample/reportAction_PS")
class SampleListSampleForm {
    @JsonProperty("sampleList/sample/FW")
    var fw: String? = null

    @JsonProperty("sampleList/sample/NA")
    var na: String? = null

    @JsonProperty("sampleList/sample/NF")
    var nf: String? = null

    @JsonProperty("sampleList/sample/SB")
    var sb: String? = null

    @JsonProperty("sampleList/sample/nr")
    var nr: String? = null

    @JsonProperty("sampleList/sample/soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("sampleList/sample/plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("sampleList/sample/PS_key")
    var pSKey: String? = null

    @JsonProperty("sampleList/sample/noteSB")
    var noteSb: String? = null

    @JsonProperty("sampleList/sample/DC")
    var dc: String? = null

    @JsonProperty("sampleList/sample/RS")
    var rs: String? = null

    @JsonProperty("sampleList/sample/SS_key")
    var sSKey: String? = null

    @JsonProperty("sampleList/sample/noteRS")
    var noteRs: String? = null

    @JsonProperty("sampleList/sample/reportAction_SS")
    var reportActionSs: String? = null

    @JsonProperty("sampleList/sample/noteFW")
    var noteFw: String? = null

    @JsonProperty("sampleList/sample/noteDC")
    var noteDc: String? = null

    @JsonProperty("sampleList/sample/noteNA")
    var noteNa: String? = null

    @JsonProperty("sampleList/sample/reportAction_PS")
    var reportActionPs: String? = null
}