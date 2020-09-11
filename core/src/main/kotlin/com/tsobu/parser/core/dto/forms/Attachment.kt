package com.tsobu.parser.core.dto.forms

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class Attachment {
    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("name")
    var name: String? = null

    @JsonProperty("xform")
    var xform: Int? = null

    @JsonProperty("filename")
    var filename: String? = null

    @JsonProperty("instance")
    var instance: Int? = null

    @JsonProperty("mimetype")
    var mimetype: String? = null

    @JsonProperty("download_url")
    var downloadUrl: String? = null

    @JsonProperty("small_download_url")
    var smallDownloadUrl: String? = null

    @JsonProperty("medium_download_url")
    var mediumDownloadUrl: String? = null
}