package com.tsobu.fuelrod.config.properties

import javax.validation.constraints.NotBlank


class MessagingProperties {

    @NotBlank
    var optOut: String? = null

    @NotBlank
    var endPoint: String? = null

    @NotBlank
    var deliveryReport: Int = 0

    var webHookUrl: String? = null

    var testNumbers: List<String>? = null

    var uploadDirectory: String? = null

}
