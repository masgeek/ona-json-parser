package com.tsobu.fuelrod.config.properties

import javax.validation.constraints.NotBlank


class OnaProperties {
    @NotBlank
    var jsonPath: String? = null

    @NotBlank
    var outputPath: String? = null
}
