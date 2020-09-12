package com.tsobu.fuelrod.config.properties

import javax.validation.constraints.NotBlank


class OnaProperties {
    @NotBlank
    var folderPath: String? = null
}
