package com.tsobu.ona.core.dto.json.validation

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "formhub-uuid",
    "today",
    "deviceid",
    "phonenumber",
    "username",
    "toolDescription-generated_note_name_7",
    "toolDescription-banner",
    "toolDescription-intro",
    "farmeradress-generated_note_name_12",
    "farmeradress-state",
    "farmeradress-crops",
    "farmeradress-generated_note_name_15",
    "farmeradress-EAID",
    "farmeradress-HHID",
    "farmeradress-firstCrop",
    "farmeradress-secondCrop",
    "farmeradress-cropesta",
    "farmeradress-plm",
    "farmeradress-crop1Area",
    "farmeradress-crop2Area",
    "farmeradress-NPKPrice",
    "farmeradress-ureaPrice",
    "farmeradress-lookup_1A",
    "farmeradress-lookup_1B",
    "farmeradress-lookup_1C",
    "farmeradress-lookup_2A",
    "farmeradress-lookup_2B",
    "farmeradress-lookup_2C",
    "farmeradress-crop1Low_NPK",
    "farmeradress-crop1Low_Urea",
    "farmeradress-crop1Low_TC",
    "farmeradress-crop1Low_TY",
    "farmeradress-crop1Medium_NPK",
    "farmeradress-crop1Medium_Urea",
    "farmeradress-crop1Medium_TC",
    "farmeradress-crop1Medium_TY",
    "farmeradress-crop1High_NPK",
    "farmeradress-crop1High_Urea",
    "farmeradress-crop1High_TC",
    "farmeradress-crop1High_TY",
    "farmeradress-crop2Low_NPK",
    "farmeradress-crop2Low_Urea",
    "farmeradress-crop2Low_TC",
    "farmeradress-crop2Low_TY",
    "farmeradress-crop2Medium_NPK",
    "farmeradress-crop2Medium_Urea",
    "farmeradress-crop2Medium_TC",
    "farmeradress-crop2Medium_TY",
    "farmeradress-crop2High_NPK",
    "farmeradress-crop2High_Urea",
    "farmeradress-crop2High_TC",
    "farmeradress-crop2High_TY",
    "farmeradress-crop1low_YI",
    "farmeradress-crop1low_Ybag",
    "farmeradress-crop1low_quantityNPK",
    "farmeradress-crop1low_quantityUrea",
    "farmeradress-crop1lowTC1",
    "farmeradress-crop1lowTC2",
    "farmeradress-crop1lowTC",
    "farmeradress-crop2low_YI",
    "farmeradress-crop2low_Ybag",
    "farmeradress-crop2low_quantityNPK",
    "farmeradress-crop2low_quantityUrea",
    "farmeradress-crop2lowTC1",
    "farmeradress-crop2lowTC2",
    "farmeradress-crop2lowTC",
    "farmeradress-crop1medium_YI",
    "farmeradress-crop1medium_Ybag",
    "farmeradress-crop1medium_quantityNPK",
    "farmeradress-crop1medium_quantityUrea",
    "farmeradress-crop1mediumTC1",
    "farmeradress-crop1mediumTC2",
    "farmeradress-crop1mediumTC",
    "farmeradress-crop2medium_YI",
    "farmeradress-crop2medium_Ybag",
    "farmeradress-crop2medium_quantityNPK",
    "farmeradress-crop2medium_quantityUrea",
    "farmeradress-crop2mediumTC1",
    "farmeradress-crop2mediumTC2",
    "farmeradress-crop2mediumTC",
    "farmeradress-crop1high_YI",
    "farmeradress-crop1high_Ybag",
    "farmeradress-crop1high_quantityNPK",
    "farmeradress-crop1high_quantityUrea",
    "farmeradress-crop1highTC1",
    "farmeradress-crop1highTC2",
    "farmeradress-crop1highTC",
    "farmeradress-crop2high_YI",
    "farmeradress-crop2high_Ybag",
    "farmeradress-crop2high_quantityNPK",
    "farmeradress-crop2high_quantityUrea",
    "farmeradress-crop2highTC1",
    "farmeradress-crop2highTC2",
    "farmeradress-crop2highTC",
    "farmeradress-ricelowbags",
    "farmeradress-ricemediumbags",
    "farmeradress-ricehighbags",
    "farmeradress-maizelowbags",
    "farmeradress-maizemediumbags",
    "farmeradress-maizehighbags",
    "farmeradress-cassavalowbags",
    "farmeradress-cassavamediumbags",
    "farmeradress-cassavahighbags",
    "farmeradress-ricelowbags2",
    "farmeradress-ricemediumbags2",
    "farmeradress-ricehighbags2",
    "farmeradress-maizelowbags2",
    "farmeradress-maizemediumbags2",
    "farmeradress-maizehighbags2",
    "farmeradress-cassavalowbags2",
    "farmeradress-cassavamediumbags2",
    "farmeradress-cassavahighbags2",
    "farmeradress-crop1low_YbagC",
    "farmeradress-crop1medium_YbagC",
    "farmeradress-crop1high_YbagC",
    "farmeradress-crop2low_YbagC",
    "farmeradress-crop2medium_YbagC",
    "farmeradress-crop2high_YbagC",
    "farmeradress-C1showoption3",
    "farmeradress-C2showoption3",
    "firstcropoptions-firstCropPackagenote",
    "firstcropoptions-firstCropPackage1",
    "firstcropoptions-firstCropPackage2",
    "firstcropoptions-firstCropPackage3",
    "secondcropoptions-firstCropPackage",
    "secondcropoptions-secondCropPackagenote",
    "secondcropoptions-secondCropPackage1",
    "secondcropoptions-secondCropPackage2",
    "secondcropoptions-secondCropPackage3",
    "secondcropoptions-secondCropPackage",
    "Recommendations-firstCropPackageFIP",
    "Recommendations-secondCropPackageFIP",
    "Recommendations-firstCropPackageNPK",
    "Recommendations-firstCropPackageFIPNPK",
    "Recommendations-firstCropPackageUrea",
    "Recommendations-firstCropPackageFIPUrea",
    "Recommendations-secondCropPackageNPK",
    "Recommendations-secondCropPackageFIPNPK",
    "Recommendations-secondCropPackageUrea",
    "Recommendations-secondCropPackageFIPUrea",
    "Recommendations-Farmersplotcrop1",
    "Recommendations-Validationplotcrop1",
    "Recommendations-Farmersplotcrop2",
    "Recommendations-Validationplotcrop2",
    "end",
    "meta-instanceID",
    "KEY"
)
@Generated("jsonschema2pojo")
class ChoiceValidationDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("formhub-uuid")
    var formHubUuid: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("username")
    var userName: String? = null

    @JsonProperty("toolDescription-generated_note_name_7")
    var generatedNoteName7: String? = null

    @JsonProperty("toolDescription-banner")
    var toolDescriptionBanner: String? = null

    @JsonProperty("toolDescription-intro")
    var toolDescriptionIntro: String? = null

    @JsonProperty("farmeradress-generated_note_name_12")
    var farmerAdressGeneratedNoteName12: String? = null

    @JsonProperty("farmeradress-state")
    var farmerAdressState: String? = null

    @JsonProperty("farmeradress-crops")
    var farmerAdressCrops: String? = null

    @JsonProperty("farmeradress-generated_note_name_15")
    var farmerAdressGeneratedNoteName15: String? = null

    @JsonProperty("farmeradress-EAID")
    var farmerAdressEaid: String? = null

    @JsonProperty("farmeradress-HHID")
    var farmerAdressHhid: String? = null

    @JsonProperty("farmeradress-firstCrop")
    var farmerAdressFirstCrop: String? = null

    @JsonProperty("farmeradress-secondCrop")
    var farmerAdressSecondCrop: String? = null

    @JsonProperty("farmeradress-cropesta")
    var farmerAdressCropesta: String? = null

    @JsonProperty("farmeradress-plm")
    var farmerAdressPlm: String? = null

    @JsonProperty("farmeradress-crop1Area")
    var farmerAdressCrop1Area: String? = null

    @JsonProperty("farmeradress-crop2Area")
    var farmerAdressCrop2Area: String? = null

    @JsonProperty("farmeradress-NPKPrice")
    var farmerAdressNPKPrice: String? = null

    @JsonProperty("farmeradress-ureaPrice")
    var farmerAdressUreaPrice: String? = null

    @JsonProperty("farmeradress-lookup_1A")
    var farmerAdressLookup1A: String? = null

    @JsonProperty("farmeradress-lookup_1B")
    var farmerAdressLookup1B: String? = null

    @JsonProperty("farmeradress-lookup_1C")
    var farmerAdressLookup1C: String? = null

    @JsonProperty("farmeradress-lookup_2A")
    var farmerAdressLookup2A: String? = null

    @JsonProperty("farmeradress-lookup_2B")
    var farmerAdressLookup2B: String? = null

    @JsonProperty("farmeradress-lookup_2C")
    var farmerAdressLookup2C: String? = null

    @JsonProperty("farmeradress-crop1Low_NPK")
    var farmerAdressCrop1LowNPK: String? = null

    @JsonProperty("farmeradress-crop1Low_Urea")
    var farmerAdressCrop1LowUrea: String? = null

    @JsonProperty("farmeradress-crop1Low_TC")
    var farmerAdressCrop1LowTC: String? = null

    @JsonProperty("farmeradress-crop1Low_TY")
    var farmerAdressCrop1LowTY: String? = null

    @JsonProperty("farmeradress-crop1Medium_NPK")
    var farmerAdressCrop1MediumNPK: String? = null

    @JsonProperty("farmeradress-crop1Medium_Urea")
    var farmerAdressCrop1MediumUrea: String? = null

    @JsonProperty("farmeradress-crop1Medium_TC")
    var farmerAdressCrop1MediumTC: String? = null

    @JsonProperty("farmeradress-crop1Medium_TY")
    var farmerAdressCrop1MediumTY: String? = null

    @JsonProperty("farmeradress-crop1High_NPK")
    var farmerAdressCrop1HighNPK: String? = null

    @JsonProperty("farmeradress-crop1High_Urea")
    var farmerAdressCrop1HighUrea: String? = null

    @JsonProperty("farmeradress-crop1High_TC")
    var farmerAdressCrop1HighTC: String? = null

    @JsonProperty("farmeradress-crop1High_TY")
    var farmerAdressCrop1HighTY: String? = null

    @JsonProperty("farmeradress-crop2Low_NPK")
    var farmerAdressCrop2LowNPK: String? = null

    @JsonProperty("farmeradress-crop2Low_Urea")
    var farmerAdressCrop2LowUrea: String? = null

    @JsonProperty("farmeradress-crop2Low_TC")
    var farmerAdressCrop2LowTC: String? = null

    @JsonProperty("farmeradress-crop2Low_TY")
    var farmerAdressCrop2LowTY: String? = null

    @JsonProperty("farmeradress-crop2Medium_NPK")
    var farmerAdressCrop2MediumNPK: String? = null

    @JsonProperty("farmeradress-crop2Medium_Urea")
    var farmerAdressCrop2MediumUrea: String? = null

    @JsonProperty("farmeradress-crop2Medium_TC")
    var farmerAdressCrop2MediumTC: String? = null

    @JsonProperty("farmeradress-crop2Medium_TY")
    var farmerAdressCrop2MediumTY: String? = null

    @JsonProperty("farmeradress-crop2High_NPK")
    var farmerAdressCrop2HighNPK: String? = null

    @JsonProperty("farmeradress-crop2High_Urea")
    var farmerAdressCrop2HighUrea: String? = null

    @JsonProperty("farmeradress-crop2High_TC")
    var farmerAdressCrop2HighTC: String? = null

    @JsonProperty("farmeradress-crop2High_TY")
    var farmerAdressCrop2HighTY: String? = null

    @JsonProperty("farmeradress-crop1low_YI")
    var farmerAdressCrop1lowYI: String? = null

    @JsonProperty("farmeradress-crop1low_Ybag")
    var farmerAdressCrop1lowYbag: String? = null

    @JsonProperty("farmeradress-crop1low_quantityNPK")
    var farmerAdressCrop1lowQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1low_quantityUrea")
    var farmerAdressCrop1lowQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1lowTC1")
    var farmerAdressCrop1lowTC1: String? = null

    @JsonProperty("farmeradress-crop1lowTC2")
    var farmerAdressCrop1lowTC2: String? = null

    @JsonProperty("farmeradress-crop1lowTC")
    var farmerAdressCrop1lowTC: String? = null

    @JsonProperty("farmeradress-crop2low_YI")
    var farmerAdressCrop2lowYI: String? = null

    @JsonProperty("farmeradress-crop2low_Ybag")
    var farmerAdressCrop2lowYbag: String? = null

    @JsonProperty("farmeradress-crop2low_quantityNPK")
    var farmerAdressCrop2lowQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2low_quantityUrea")
    var farmerAdressCrop2lowQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2lowTC1")
    var farmerAdressCrop2lowTC1: String? = null

    @JsonProperty("farmeradress-crop2lowTC2")
    var farmerAdressCrop2lowTC2: String? = null

    @JsonProperty("farmeradress-crop2lowTC")
    var farmerAdressCrop2lowTC: String? = null

    @JsonProperty("farmeradress-crop1medium_YI")
    var farmerAdressCrop1mediumYI: String? = null

    @JsonProperty("farmeradress-crop1medium_Ybag")
    var farmerAdressCrop1mediumYbag: String? = null

    @JsonProperty("farmeradress-crop1medium_quantityNPK")
    var farmerAdressCrop1mediumQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1medium_quantityUrea")
    var farmerAdressCrop1mediumQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1mediumTC1")
    var farmerAdressCrop1mediumTC1: String? = null

    @JsonProperty("farmeradress-crop1mediumTC2")
    var farmerAdressCrop1mediumTC2: String? = null

    @JsonProperty("farmeradress-crop1mediumTC")
    var farmerAdressCrop1mediumTC: String? = null

    @JsonProperty("farmeradress-crop2medium_YI")
    var farmerAdressCrop2mediumYI: String? = null

    @JsonProperty("farmeradress-crop2medium_Ybag")
    var farmerAdressCrop2mediumYbag: String? = null

    @JsonProperty("farmeradress-crop2medium_quantityNPK")
    var farmerAdressCrop2mediumQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2medium_quantityUrea")
    var farmerAdressCrop2mediumQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2mediumTC1")
    var farmerAdressCrop2mediumTC1: String? = null

    @JsonProperty("farmeradress-crop2mediumTC2")
    var farmerAdressCrop2mediumTC2: String? = null

    @JsonProperty("farmeradress-crop2mediumTC")
    var farmerAdressCrop2mediumTC: String? = null

    @JsonProperty("farmeradress-crop1high_YI")
    var farmerAdressCrop1highYI: String? = null

    @JsonProperty("farmeradress-crop1high_Ybag")
    var farmerAdressCrop1highYbag: String? = null

    @JsonProperty("farmeradress-crop1high_quantityNPK")
    var farmerAdressCrop1highQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1high_quantityUrea")
    var farmerAdressCrop1highQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1highTC1")
    var farmerAdressCrop1highTC1: String? = null

    @JsonProperty("farmeradress-crop1highTC2")
    var farmerAdressCrop1highTC2: String? = null

    @JsonProperty("farmeradress-crop1highTC")
    var farmerAdressCrop1highTC: String? = null

    @JsonProperty("farmeradress-crop2high_YI")
    var farmerAdressCrop2highYI: String? = null

    @JsonProperty("farmeradress-crop2high_Ybag")
    var farmerAdressCrop2highYbag: String? = null

    @JsonProperty("farmeradress-crop2high_quantityNPK")
    var farmerAdressCrop2highQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2high_quantityUrea")
    var farmerAdressCrop2highQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2highTC1")
    var farmerAdressCrop2highTC1: String? = null

    @JsonProperty("farmeradress-crop2highTC2")
    var farmerAdressCrop2highTC2: String? = null

    @JsonProperty("farmeradress-crop2highTC")
    var farmerAdressCrop2highTC: String? = null

    @JsonProperty("farmeradress-ricelowbags")
    var farmerAdressRicelowbags: String? = null

    @JsonProperty("farmeradress-ricemediumbags")
    var farmerAdressRicemediumbags: String? = null

    @JsonProperty("farmeradress-ricehighbags")
    var farmerAdressRicehighbags: String? = null

    @JsonProperty("farmeradress-maizelowbags")
    var farmerAdressMaizelowbags: String? = null

    @JsonProperty("farmeradress-maizemediumbags")
    var farmerAdressMaizemediumbags: String? = null

    @JsonProperty("farmeradress-maizehighbags")
    var farmerAdressMaizehighbags: String? = null

    @JsonProperty("farmeradress-cassavalowbags")
    var farmerAdressCassavalowbags: String? = null

    @JsonProperty("farmeradress-cassavamediumbags")
    var farmerAdressCassavamediumbags: String? = null

    @JsonProperty("farmeradress-cassavahighbags")
    var farmerAdressCassavahighbags: String? = null

    @JsonProperty("farmeradress-ricelowbags2")
    var farmerAdressRicelowbags2: String? = null

    @JsonProperty("farmeradress-ricemediumbags2")
    var farmerAdressRicemediumbags2: String? = null

    @JsonProperty("farmeradress-ricehighbags2")
    var farmerAdressRicehighbags2: String? = null

    @JsonProperty("farmeradress-maizelowbags2")
    var farmerAdressMaizelowbags2: String? = null

    @JsonProperty("farmeradress-maizemediumbags2")
    var farmerAdressMaizemediumbags2: String? = null

    @JsonProperty("farmeradress-maizehighbags2")
    var farmerAdressMaizehighbags2: String? = null

    @JsonProperty("farmeradress-cassavalowbags2")
    var farmerAdressCassavalowbags2: String? = null

    @JsonProperty("farmeradress-cassavamediumbags2")
    var farmerAdressCassavamediumbags2: String? = null

    @JsonProperty("farmeradress-cassavahighbags2")
    var farmerAdressCassavahighbags2: String? = null

    @JsonProperty("farmeradress-crop1low_YbagC")
    var farmerAdressCrop1lowYbagC: String? = null

    @JsonProperty("farmeradress-crop1medium_YbagC")
    var farmerAdressCrop1mediumYbagC: String? = null

    @JsonProperty("farmeradress-crop1high_YbagC")
    var farmerAdressCrop1highYbagC: String? = null

    @JsonProperty("farmeradress-crop2low_YbagC")
    var farmerAdressCrop2lowYbagC: String? = null

    @JsonProperty("farmeradress-crop2medium_YbagC")
    var farmerAdressCrop2mediumYbagC: String? = null

    @JsonProperty("farmeradress-crop2high_YbagC")
    var farmerAdressCrop2highYbagC: String? = null

    @JsonProperty("farmeradress-C1showoption3")
    var farmerAdressC1showoption3: String? = null

    @JsonProperty("farmeradress-C2showoption3")
    var farmerAdressC2showoption3: String? = null

    @JsonProperty("firstcropoptions-firstCropPackagenote")
    var firstcropoptionsFirstCropPackagenote: String? = null

    @JsonProperty("firstcropoptions-firstCropPackage1")
    var firstcropoptionsFirstCropPackage1: String? = null

    @JsonProperty("firstcropoptions-firstCropPackage2")
    var firstcropoptionsFirstCropPackage2: String? = null

    @JsonProperty("firstcropoptions-firstCropPackage3")
    var firstcropoptionsFirstCropPackage3: String? = null

    @JsonProperty("secondcropoptions-firstCropPackage")
    var secondcropoptionsFirstCropPackage: String? = null

    @JsonProperty("secondcropoptions-secondCropPackagenote")
    var secondcropoptionsSecondCropPackagenote: String? = null

    @JsonProperty("secondcropoptions-secondCropPackage1")
    var secondcropoptionsSecondCropPackage1: String? = null

    @JsonProperty("secondcropoptions-secondCropPackage2")
    var secondcropoptionsSecondCropPackage2: String? = null

    @JsonProperty("secondcropoptions-secondCropPackage3")
    var secondcropoptionsSecondCropPackage3: String? = null

    @JsonProperty("secondcropoptions-secondCropPackage")
    var secondcropoptionsSecondCropPackage: String? = null

    @JsonProperty("Recommendations-firstCropPackageFIP")
    var recommendationsFirstCropPackageFIP: String? = null

    @JsonProperty("Recommendations-secondCropPackageFIP")
    var recommendationsSecondCropPackageFIP: String? = null

    @JsonProperty("Recommendations-firstCropPackageNPK")
    var recommendationsFirstCropPackageNPK: String? = null

    @JsonProperty("Recommendations-firstCropPackageFIPNPK")
    var recommendationsFirstCropPackageFIPNPK: String? = null

    @JsonProperty("Recommendations-firstCropPackageUrea")
    var recommendationsFirstCropPackageUrea: String? = null

    @JsonProperty("Recommendations-firstCropPackageFIPUrea")
    var recommendationsFirstCropPackageFIPUrea: String? = null

    @JsonProperty("Recommendations-secondCropPackageNPK")
    var recommendationsSecondCropPackageNPK: String? = null

    @JsonProperty("Recommendations-secondCropPackageFIPNPK")
    var recommendationsSecondCropPackageFIPNPK: String? = null

    @JsonProperty("Recommendations-secondCropPackageUrea")
    var recommendationsSecondCropPackageUrea: String? = null

    @JsonProperty("Recommendations-secondCropPackageFIPUrea")
    var recommendationsSecondCropPackageFIPUrea: String? = null

    @JsonProperty("Recommendations-Farmersplotcrop1")
    var recommendationsFarmersplotcrop1: String? = null

    @JsonProperty("Recommendations-Validationplotcrop1")
    var recommendationsValidationplotcrop1: String? = null

    @JsonProperty("Recommendations-Farmersplotcrop2")
    var recommendationsFarmersplotcrop2: String? = null

    @JsonProperty("Recommendations-Validationplotcrop2")
    var recommendationsValidationplotcrop2: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("meta-instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}