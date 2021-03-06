package com.tsobu.ona.forms

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class Attachment {
    @JsonProperty("id")
    var id: String? = null

    @JsonProperty("name")
    var name: String? = null

    @JsonProperty("xform")
    var xform: String? = null

    @JsonProperty("filename")
    var filename: String? = null

    @JsonProperty("instance")
    var instance: String? = null

    @JsonProperty("mimetype")
    var mimetype: String? = null

    @JsonProperty("download_url")
    var downloadUrl: String? = null

    @JsonProperty("small_download_url")
    var smallDownloadUrl: String? = null

    @JsonProperty("medium_download_url")
    var mediumDownloadUrl: String? = null
}