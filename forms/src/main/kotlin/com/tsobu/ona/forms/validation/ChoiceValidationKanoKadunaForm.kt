package com.tsobu.ona.forms.validation

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.ArrayList

@JsonInclude(JsonInclude.Include.NON_NULL)
class ChoiceValidationKanoKadunaForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("farmeradress/EAID")
    var farmeradressEAID: String? = null

    @JsonProperty("farmeradress/HHID")
    var farmeradressHHID: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("farmeradress/crops")
    var farmeradressCrops: String? = null

    @JsonProperty("farmeradress/state")
    var farmeradressState: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("farmeradress/NPKPrice")
    var farmeradressNPKPrice: String? = null

    @JsonProperty("farmeradress/cropesta")
    var farmeradressCropesta: String? = null

    @JsonProperty("farmeradress/crop1Area")
    var farmeradressCrop1Area: Int? = null

    @JsonProperty("farmeradress/crop2Area")
    var farmeradressCrop2Area: Int? = null

    @JsonProperty("farmeradress/firstCrop")
    var farmeradressFirstCrop: String? = null

    @JsonProperty("farmeradress/lookup_1A")
    var farmeradressLookup1A: String? = null

    @JsonProperty("farmeradress/lookup_1B")
    var farmeradressLookup1B: String? = null

    @JsonProperty("farmeradress/lookup_1C")
    var farmeradressLookup1C: String? = null

    @JsonProperty("farmeradress/lookup_2A")
    var farmeradressLookup2A: String? = null

    @JsonProperty("farmeradress/lookup_2B")
    var farmeradressLookup2B: String? = null

    @JsonProperty("farmeradress/lookup_2C")
    var farmeradressLookup2C: String? = null

    @JsonProperty("farmeradress/ureaPrice")
    var farmeradressUreaPrice: String? = null

    @JsonProperty("farmeradress/crop1lowTC")
    var farmeradressCrop1lowTC: String? = null

    @JsonProperty("farmeradress/crop2lowTC")
    var farmeradressCrop2lowTC: String? = null

    @JsonProperty("farmeradress/secondCrop")
    var farmeradressSecondCrop: String? = null

    @JsonProperty("farmeradress/crop1Low_TC")
    var farmeradressCrop1LowTC: String? = null

    @JsonProperty("farmeradress/crop1Low_TY")
    var farmeradressCrop1LowTY: String? = null

    @JsonProperty("farmeradress/crop1lowTC1")
    var farmeradressCrop1lowTC1: String? = null

    @JsonProperty("farmeradress/crop1lowTC2")
    var farmeradressCrop1lowTC2: String? = null

    @JsonProperty("farmeradress/crop1low_YI")
    var farmeradressCrop1lowYI: String? = null

    @JsonProperty("farmeradress/crop2Low_TC")
    var farmeradressCrop2LowTC: String? = null

    @JsonProperty("farmeradress/crop2Low_TY")
    var farmeradressCrop2LowTY: String? = null

    @JsonProperty("farmeradress/crop2highTC")
    var farmeradressCrop2highTC: String? = null

    @JsonProperty("farmeradress/crop2lowTC1")
    var farmeradressCrop2lowTC1: String? = null

    @JsonProperty("farmeradress/crop2lowTC2")
    var farmeradressCrop2lowTC2: String? = null

    @JsonProperty("farmeradress/crop2low_YI")
    var farmeradressCrop2lowYI: String? = null

    @JsonProperty("farmeradress/ricelowbags")
    var farmeradressRicelowbags: String? = null

    @JsonProperty("farmeradress/crop1Low_NPK")
    var farmeradressCrop1LowNPK: String? = null

    @JsonProperty("farmeradress/crop2High_TC")
    var farmeradressCrop2HighTC: String? = null

    @JsonProperty("farmeradress/crop2High_TY")
    var farmeradressCrop2HighTY: String? = null

    @JsonProperty("farmeradress/crop2Low_NPK")
    var farmeradressCrop2LowNPK: String? = null

    @JsonProperty("farmeradress/crop2highTC1")
    var farmeradressCrop2highTC1: String? = null

    @JsonProperty("farmeradress/crop2highTC2")
    var farmeradressCrop2highTC2: String? = null

    @JsonProperty("farmeradress/crop2high_YI")
    var farmeradressCrop2highYI: String? = null

    @JsonProperty("farmeradress/maizelowbags")
    var farmeradressMaizelowbags: String? = null

    @JsonProperty("farmeradress/ricehighbags")
    var farmeradressRicehighbags: String? = null

    @JsonProperty("farmeradress/ricelowbags2")
    var farmeradressRicelowbags2: String? = null

    @JsonProperty("farmeradress/C1showoption3")
    var farmeradressC1showoption3: String? = null

    @JsonProperty("farmeradress/C2showoption3")
    var farmeradressC2showoption3: String? = null

    @JsonProperty("farmeradress/crop1Low_Urea")
    var farmeradressCrop1LowUrea: String? = null

    @JsonProperty("farmeradress/crop1low_Ybag")
    var farmeradressCrop1lowYbag: String? = null

    @JsonProperty("farmeradress/crop1mediumTC")
    var farmeradressCrop1mediumTC: String? = null

    @JsonProperty("farmeradress/crop2High_NPK")
    var farmeradressCrop2HighNPK: String? = null

    @JsonProperty("farmeradress/crop2Low_Urea")
    var farmeradressCrop2LowUrea: String? = null

    @JsonProperty("farmeradress/crop2low_Ybag")
    var farmeradressCrop2lowYbag: String? = null

    @JsonProperty("farmeradress/crop2mediumTC")
    var farmeradressCrop2mediumTC: String? = null

    @JsonProperty("farmeradress/maizehighbags")
    var farmeradressMaizehighbags: String? = null

    @JsonProperty("farmeradress/maizelowbags2")
    var farmeradressMaizelowbags2: String? = null

    @JsonProperty("farmeradress/ricehighbags2")
    var farmeradressRicehighbags2: String? = null

    @JsonProperty("farmeradress/cassavalowbags")
    var farmeradressCassavalowbags: String? = null

    @JsonProperty("farmeradress/crop1Medium_TC")
    var farmeradressCrop1MediumTC: String? = null

    @JsonProperty("farmeradress/crop1Medium_TY")
    var farmeradressCrop1MediumTY: String? = null

    @JsonProperty("farmeradress/crop1low_YbagC")
    var farmeradressCrop1lowYbagC: String? = null

    @JsonProperty("farmeradress/crop1mediumTC1")
    var farmeradressCrop1mediumTC1: String? = null

    @JsonProperty("farmeradress/crop1mediumTC2")
    var farmeradressCrop1mediumTC2: String? = null

    @JsonProperty("farmeradress/crop1medium_YI")
    var farmeradressCrop1mediumYI: String? = null

    @JsonProperty("farmeradress/crop2High_Urea")
    var farmeradressCrop2HighUrea: String? = null

    @JsonProperty("farmeradress/crop2Medium_TC")
    var farmeradressCrop2MediumTC: String? = null

    @JsonProperty("farmeradress/crop2Medium_TY")
    var farmeradressCrop2MediumTY: String? = null

    @JsonProperty("farmeradress/crop2high_Ybag")
    var farmeradressCrop2highYbag: String? = null

    @JsonProperty("farmeradress/crop2low_YbagC")
    var farmeradressCrop2lowYbagC: String? = null

    @JsonProperty("farmeradress/crop2mediumTC1")
    var farmeradressCrop2mediumTC1: String? = null

    @JsonProperty("farmeradress/crop2mediumTC2")
    var farmeradressCrop2mediumTC2: String? = null

    @JsonProperty("farmeradress/crop2medium_YI")
    var farmeradressCrop2mediumYI: String? = null

    @JsonProperty("farmeradress/maizehighbags2")
    var farmeradressMaizehighbags2: String? = null

    @JsonProperty("farmeradress/ricemediumbags")
    var farmeradressRicemediumbags: String? = null

    @JsonProperty("farmeradress/cassavahighbags")
    var farmeradressCassavahighbags: String? = null

    @JsonProperty("farmeradress/cassavalowbags2")
    var farmeradressCassavalowbags2: String? = null

    @JsonProperty("farmeradress/crop1Medium_NPK")
    var farmeradressCrop1MediumNPK: String? = null

    @JsonProperty("farmeradress/crop1high_YbagC")
    var farmeradressCrop1highYbagC: String? = null

    @JsonProperty("farmeradress/crop2Medium_NPK")
    var farmeradressCrop2MediumNPK: String? = null

    @JsonProperty("farmeradress/crop2high_YbagC")
    var farmeradressCrop2highYbagC: String? = null

    @JsonProperty("farmeradress/maizemediumbags")
    var farmeradressMaizemediumbags: String? = null

    @JsonProperty("farmeradress/ricemediumbags2")
    var farmeradressRicemediumbags2: String? = null

    @JsonProperty("farmeradress/cassavahighbags2")
    var farmeradressCassavahighbags2: String? = null

    @JsonProperty("farmeradress/crop1Medium_Urea")
    var farmeradressCrop1MediumUrea: String? = null

    @JsonProperty("farmeradress/crop1medium_Ybag")
    var farmeradressCrop1mediumYbag: String? = null

    @JsonProperty("farmeradress/crop2Medium_Urea")
    var farmeradressCrop2MediumUrea: String? = null

    @JsonProperty("farmeradress/crop2medium_Ybag")
    var farmeradressCrop2mediumYbag: String? = null

    @JsonProperty("farmeradress/maizemediumbags2")
    var farmeradressMaizemediumbags2: String? = null

    @JsonProperty("farmeradress/cassavamediumbags")
    var farmeradressCassavamediumbags: String? = null

    @JsonProperty("farmeradress/crop1medium_YbagC")
    var farmeradressCrop1mediumYbagC: String? = null

    @JsonProperty("farmeradress/crop2medium_YbagC")
    var farmeradressCrop2mediumYbagC: String? = null

    @JsonProperty("farmeradress/cassavamediumbags2")
    var farmeradressCassavamediumbags2: String? = null

    @JsonProperty("farmeradress/crop1low_quantityNPK")
    var farmeradressCrop1lowQuantityNPK: String? = null

    @JsonProperty("farmeradress/crop2low_quantityNPK")
    var farmeradressCrop2lowQuantityNPK: String? = null

    @JsonProperty("farmeradress/crop1low_quantityUrea")
    var farmeradressCrop1lowQuantityUrea: String? = null

    @JsonProperty("farmeradress/crop2high_quantityNPK")
    var farmeradressCrop2highQuantityNPK: String? = null

    @JsonProperty("farmeradress/crop2low_quantityUrea")
    var farmeradressCrop2lowQuantityUrea: String? = null

    @JsonProperty("secondcropoptions/firstCropPackage")
    var secondcropoptionsFirstCropPackage: String? = null

    @JsonProperty("Recommendations/firstCropPackageNPK")
    var recommendationsFirstCropPackageNPK: String? = null

    @JsonProperty("farmeradress/crop2high_quantityUrea")
    var farmeradressCrop2highQuantityUrea: String? = null

    @JsonProperty("secondcropoptions/secondCropPackage")
    var secondcropoptionsSecondCropPackage: String? = null

    @JsonProperty("Recommendations/firstCropPackageUrea")
    var recommendationsFirstCropPackageUrea: String? = null

    @JsonProperty("Recommendations/secondCropPackageNPK")
    var recommendationsSecondCropPackageNPK: String? = null

    @JsonProperty("farmeradress/crop1medium_quantityNPK")
    var farmeradressCrop1mediumQuantityNPK: String? = null

    @JsonProperty("farmeradress/crop2medium_quantityNPK")
    var farmeradressCrop2mediumQuantityNPK: String? = null

    @JsonProperty("Recommendations/secondCropPackageFIP3")
    var recommendationsSecondCropPackageFIP3: String? = null

    @JsonProperty("Recommendations/secondCropPackageUrea")
    var recommendationsSecondCropPackageUrea: String? = null

    @JsonProperty("farmeradress/crop1medium_quantityUrea")
    var farmeradressCrop1mediumQuantityUrea: String? = null

    @JsonProperty("farmeradress/crop2medium_quantityUrea")
    var farmeradressCrop2mediumQuantityUrea: String? = null

    @JsonProperty("Recommendations/firstCropPackageFIPNPK")
    var recommendationsFirstCropPackageFIPNPK: String? = null

    @JsonProperty("Recommendations/firstCropPackageFIPUrea")
    var recommendationsFirstCropPackageFIPUrea: String? = null

    @JsonProperty("Recommendations/secondCropPackageFIPNPK")
    var recommendationsSecondCropPackageFIPNPK: String? = null

    @JsonProperty("Recommendations/secondCropPackageFIPUrea")
    var recommendationsSecondCropPackageFIPUrea: String? = null

    @JsonProperty("Recommendations/firstCropPackageFIPKaduna")
    var recommendationsFirstCropPackageFIPKaduna: String? = null

    @JsonProperty("farmeradress/crop1highTC")
    var farmeradressCrop1highTC: String? = null

    @JsonProperty("farmeradress/crop1High_TC")
    var farmeradressCrop1HighTC: String? = null

    @JsonProperty("farmeradress/crop1High_TY")
    var farmeradressCrop1HighTY: String? = null

    @JsonProperty("farmeradress/crop1highTC1")
    var farmeradressCrop1highTC1: String? = null

    @JsonProperty("farmeradress/crop1highTC2")
    var farmeradressCrop1highTC2: String? = null

    @JsonProperty("farmeradress/crop1high_YI")
    var farmeradressCrop1highYI: String? = null

    @JsonProperty("farmeradress/crop1High_NPK")
    var farmeradressCrop1HighNPK: String? = null

    @JsonProperty("farmeradress/crop1High_Urea")
    var farmeradressCrop1HighUrea: String? = null

    @JsonProperty("farmeradress/crop1high_Ybag")
    var farmeradressCrop1highYbag: String? = null

    @JsonProperty("farmeradress/crop1high_quantityNPK")
    var farmeradressCrop1highQuantityNPK: String? = null

    @JsonProperty("farmeradress/crop1high_quantityUrea")
    var farmeradressCrop1highQuantityUrea: String? = null

    @JsonProperty("Recommendations/firstCropPackageFIP3")
    var recommendationsFirstCropPackageFIP3: String? = null

    @JsonProperty("Recommendations/secondCropPackageFIPKano")
    var recommendationsSecondCropPackageFIPKano: String? = null
}