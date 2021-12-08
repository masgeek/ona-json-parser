package com.tsobu.ona.core.dto.json.validation

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.processing.Generated

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
    "Recommendations-firstCropPackageFIP3",
    "Recommendations-firstCropPackageFIPKaduna",
    "Recommendations-secondCropPackageFIP3",
    "Recommendations-secondCropPackageFIPKano",
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
class ChoiceValidationKanoKadunaDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("formhub-uuid")
    var formhubUuid: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("toolDescription-generated_note_name_7")
    var toolDescriptionGeneratedNoteName7: String? = null

    @JsonProperty("toolDescription-banner")
    var toolDescriptionBanner: String? = null

    @JsonProperty("toolDescription-intro")
    var toolDescriptionIntro: String? = null

    @JsonProperty("farmeradress-generated_note_name_12")
    var farmeradressGeneratedNoteName12: String? = null

    @JsonProperty("farmeradress-state")
    var farmeradressState: String? = null

    @JsonProperty("farmeradress-crops")
    var farmeradressCrops: String? = null

    @JsonProperty("farmeradress-generated_note_name_15")
    var farmeradressGeneratedNoteName15: String? = null

    @JsonProperty("farmeradress-EAID")
    var farmeradressEAID: String? = null

    @JsonProperty("farmeradress-HHID")
    var farmeradressHHID: String? = null

    @JsonProperty("farmeradress-firstCrop")
    var farmeradressFirstCrop: String? = null

    @JsonProperty("farmeradress-secondCrop")
    var farmeradressSecondCrop: String? = null

    @JsonProperty("farmeradress-cropesta")
    var farmeradressCropesta: String? = null

    @JsonProperty("farmeradress-plm")
    var farmeradressPlm: String? = null

    @JsonProperty("farmeradress-crop1Area")
    var farmeradressCrop1Area: String? = null

    @JsonProperty("farmeradress-crop2Area")
    var farmeradressCrop2Area: String? = null

    @JsonProperty("farmeradress-NPKPrice")
    var farmeradressNPKPrice: String? = null

    @JsonProperty("farmeradress-ureaPrice")
    var farmeradressUreaPrice: String? = null

    @JsonProperty("farmeradress-lookup_1A")
    var farmeradressLookup1A: String? = null

    @JsonProperty("farmeradress-lookup_1B")
    var farmeradressLookup1B: String? = null

    @JsonProperty("farmeradress-lookup_1C")
    var farmeradressLookup1C: String? = null

    @JsonProperty("farmeradress-lookup_2A")
    var farmeradressLookup2A: String? = null

    @JsonProperty("farmeradress-lookup_2B")
    var farmeradressLookup2B: String? = null

    @JsonProperty("farmeradress-lookup_2C")
    var farmeradressLookup2C: String? = null

    @JsonProperty("farmeradress-crop1Low_NPK")
    var farmeradressCrop1LowNPK: String? = null

    @JsonProperty("farmeradress-crop1Low_Urea")
    var farmeradressCrop1LowUrea: String? = null

    @JsonProperty("farmeradress-crop1Low_TC")
    var farmeradressCrop1LowTC: String? = null

    @JsonProperty("farmeradress-crop1Low_TY")
    var farmeradressCrop1LowTY: String? = null

    @JsonProperty("farmeradress-crop1Medium_NPK")
    var farmeradressCrop1MediumNPK: String? = null

    @JsonProperty("farmeradress-crop1Medium_Urea")
    var farmeradressCrop1MediumUrea: String? = null

    @JsonProperty("farmeradress-crop1Medium_TC")
    var farmeradressCrop1MediumTC: String? = null

    @JsonProperty("farmeradress-crop1Medium_TY")
    var farmeradressCrop1MediumTY: String? = null

    @JsonProperty("farmeradress-crop1High_NPK")
    var farmeradressCrop1HighNPK: String? = null

    @JsonProperty("farmeradress-crop1High_Urea")
    var farmeradressCrop1HighUrea: String? = null

    @JsonProperty("farmeradress-crop1High_TC")
    var farmeradressCrop1HighTC: String? = null

    @JsonProperty("farmeradress-crop1High_TY")
    var farmeradressCrop1HighTY: String? = null

    @JsonProperty("farmeradress-crop2Low_NPK")
    var farmeradressCrop2LowNPK: String? = null

    @JsonProperty("farmeradress-crop2Low_Urea")
    var farmeradressCrop2LowUrea: String? = null

    @JsonProperty("farmeradress-crop2Low_TC")
    var farmeradressCrop2LowTC: String? = null

    @JsonProperty("farmeradress-crop2Low_TY")
    var farmeradressCrop2LowTY: String? = null

    @JsonProperty("farmeradress-crop2Medium_NPK")
    var farmeradressCrop2MediumNPK: String? = null

    @JsonProperty("farmeradress-crop2Medium_Urea")
    var farmeradressCrop2MediumUrea: String? = null

    @JsonProperty("farmeradress-crop2Medium_TC")
    var farmeradressCrop2MediumTC: String? = null

    @JsonProperty("farmeradress-crop2Medium_TY")
    var farmeradressCrop2MediumTY: String? = null

    @JsonProperty("farmeradress-crop2High_NPK")
    var farmeradressCrop2HighNPK: String? = null

    @JsonProperty("farmeradress-crop2High_Urea")
    var farmeradressCrop2HighUrea: String? = null

    @JsonProperty("farmeradress-crop2High_TC")
    var farmeradressCrop2HighTC: String? = null

    @JsonProperty("farmeradress-crop2High_TY")
    var farmeradressCrop2HighTY: String? = null

    @JsonProperty("farmeradress-crop1low_YI")
    var farmeradressCrop1lowYI: String? = null

    @JsonProperty("farmeradress-crop1low_Ybag")
    var farmeradressCrop1lowYbag: String? = null

    @JsonProperty("farmeradress-crop1low_quantityNPK")
    var farmeradressCrop1lowQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1low_quantityUrea")
    var farmeradressCrop1lowQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1lowTC1")
    var farmeradressCrop1lowTC1: String? = null

    @JsonProperty("farmeradress-crop1lowTC2")
    var farmeradressCrop1lowTC2: String? = null

    @JsonProperty("farmeradress-crop1lowTC")
    var farmeradressCrop1lowTC: String? = null

    @JsonProperty("farmeradress-crop2low_YI")
    var farmeradressCrop2lowYI: String? = null

    @JsonProperty("farmeradress-crop2low_Ybag")
    var farmeradressCrop2lowYbag: String? = null

    @JsonProperty("farmeradress-crop2low_quantityNPK")
    var farmeradressCrop2lowQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2low_quantityUrea")
    var farmeradressCrop2lowQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2lowTC1")
    var farmeradressCrop2lowTC1: String? = null

    @JsonProperty("farmeradress-crop2lowTC2")
    var farmeradressCrop2lowTC2: String? = null

    @JsonProperty("farmeradress-crop2lowTC")
    var farmeradressCrop2lowTC: String? = null

    @JsonProperty("farmeradress-crop1medium_YI")
    var farmeradressCrop1mediumYI: String? = null

    @JsonProperty("farmeradress-crop1medium_Ybag")
    var farmeradressCrop1mediumYbag: String? = null

    @JsonProperty("farmeradress-crop1medium_quantityNPK")
    var farmeradressCrop1mediumQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1medium_quantityUrea")
    var farmeradressCrop1mediumQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1mediumTC1")
    var farmeradressCrop1mediumTC1: String? = null

    @JsonProperty("farmeradress-crop1mediumTC2")
    var farmeradressCrop1mediumTC2: String? = null

    @JsonProperty("farmeradress-crop1mediumTC")
    var farmeradressCrop1mediumTC: String? = null

    @JsonProperty("farmeradress-crop2medium_YI")
    var farmeradressCrop2mediumYI: String? = null

    @JsonProperty("farmeradress-crop2medium_Ybag")
    var farmeradressCrop2mediumYbag: String? = null

    @JsonProperty("farmeradress-crop2medium_quantityNPK")
    var farmeradressCrop2mediumQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2medium_quantityUrea")
    var farmeradressCrop2mediumQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2mediumTC1")
    var farmeradressCrop2mediumTC1: String? = null

    @JsonProperty("farmeradress-crop2mediumTC2")
    var farmeradressCrop2mediumTC2: String? = null

    @JsonProperty("farmeradress-crop2mediumTC")
    var farmeradressCrop2mediumTC: String? = null

    @JsonProperty("farmeradress-crop1high_YI")
    var farmeradressCrop1highYI: String? = null

    @JsonProperty("farmeradress-crop1high_Ybag")
    var farmeradressCrop1highYbag: String? = null

    @JsonProperty("farmeradress-crop1high_quantityNPK")
    var farmeradressCrop1highQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop1high_quantityUrea")
    var farmeradressCrop1highQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop1highTC1")
    var farmeradressCrop1highTC1: String? = null

    @JsonProperty("farmeradress-crop1highTC2")
    var farmeradressCrop1highTC2: String? = null

    @JsonProperty("farmeradress-crop1highTC")
    var farmeradressCrop1highTC: String? = null

    @JsonProperty("farmeradress-crop2high_YI")
    var farmeradressCrop2highYI: String? = null

    @JsonProperty("farmeradress-crop2high_Ybag")
    var farmeradressCrop2highYbag: String? = null

    @JsonProperty("farmeradress-crop2high_quantityNPK")
    var farmeradressCrop2highQuantityNPK: String? = null

    @JsonProperty("farmeradress-crop2high_quantityUrea")
    var farmeradressCrop2highQuantityUrea: String? = null

    @JsonProperty("farmeradress-crop2highTC1")
    var farmeradressCrop2highTC1: String? = null

    @JsonProperty("farmeradress-crop2highTC2")
    var farmeradressCrop2highTC2: String? = null

    @JsonProperty("farmeradress-crop2highTC")
    var farmeradressCrop2highTC: String? = null

    @JsonProperty("farmeradress-ricelowbags")
    var farmeradressRicelowbags: String? = null

    @JsonProperty("farmeradress-ricemediumbags")
    var farmeradressRicemediumbags: String? = null

    @JsonProperty("farmeradress-ricehighbags")
    var farmeradressRicehighbags: String? = null

    @JsonProperty("farmeradress-maizelowbags")
    var farmeradressMaizelowbags: String? = null

    @JsonProperty("farmeradress-maizemediumbags")
    var farmeradressMaizemediumbags: String? = null

    @JsonProperty("farmeradress-maizehighbags")
    var farmeradressMaizehighbags: String? = null

    @JsonProperty("farmeradress-cassavalowbags")
    var farmeradressCassavalowbags: String? = null

    @JsonProperty("farmeradress-cassavamediumbags")
    var farmeradressCassavamediumbags: String? = null

    @JsonProperty("farmeradress-cassavahighbags")
    var farmeradressCassavahighbags: String? = null

    @JsonProperty("farmeradress-ricelowbags2")
    var farmeradressRicelowbags2: String? = null

    @JsonProperty("farmeradress-ricemediumbags2")
    var farmeradressRicemediumbags2: String? = null

    @JsonProperty("farmeradress-ricehighbags2")
    var farmeradressRicehighbags2: String? = null

    @JsonProperty("farmeradress-maizelowbags2")
    var farmeradressMaizelowbags2: String? = null

    @JsonProperty("farmeradress-maizemediumbags2")
    var farmeradressMaizemediumbags2: String? = null

    @JsonProperty("farmeradress-maizehighbags2")
    var farmeradressMaizehighbags2: String? = null

    @JsonProperty("farmeradress-cassavalowbags2")
    var farmeradressCassavalowbags2: String? = null

    @JsonProperty("farmeradress-cassavamediumbags2")
    var farmeradressCassavamediumbags2: String? = null

    @JsonProperty("farmeradress-cassavahighbags2")
    var farmeradressCassavahighbags2: String? = null

    @JsonProperty("farmeradress-crop1low_YbagC")
    var farmeradressCrop1lowYbagC: String? = null

    @JsonProperty("farmeradress-crop1medium_YbagC")
    var farmeradressCrop1mediumYbagC: String? = null

    @JsonProperty("farmeradress-crop1high_YbagC")
    var farmeradressCrop1highYbagC: String? = null

    @JsonProperty("farmeradress-crop2low_YbagC")
    var farmeradressCrop2lowYbagC: String? = null

    @JsonProperty("farmeradress-crop2medium_YbagC")
    var farmeradressCrop2mediumYbagC: String? = null

    @JsonProperty("farmeradress-crop2high_YbagC")
    var farmeradressCrop2highYbagC: String? = null

    @JsonProperty("farmeradress-C1showoption3")
    var farmeradressC1showoption3: String? = null

    @JsonProperty("farmeradress-C2showoption3")
    var farmeradressC2showoption3: String? = null

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

    @JsonProperty("Recommendations-firstCropPackageFIP3")
    var recommendationsFirstCropPackageFIP3: String? = null

    @JsonProperty("Recommendations-firstCropPackageFIPKaduna")
    var recommendationsFirstCropPackageFIPKaduna: String? = null

    @JsonProperty("Recommendations-secondCropPackageFIP3")
    var recommendationsSecondCropPackageFIP3: String? = null

    @JsonProperty("Recommendations-secondCropPackageFIPKano")
    var recommendationsSecondCropPackageFIPKano: String? = null

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
    var end: String? = null

    @JsonProperty("meta-instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}