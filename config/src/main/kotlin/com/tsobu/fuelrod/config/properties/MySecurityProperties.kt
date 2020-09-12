package com.tsobu.fuelrod.config.properties

import javax.validation.constraints.NotBlank

class MySecurityProperties {

    @NotBlank
    var key: String = ""

    @NotBlank
    var salt: String = ""

}