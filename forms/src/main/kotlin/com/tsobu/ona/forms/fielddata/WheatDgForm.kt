package com.tsobu.ona.forms.fielddata

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WheatDgForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("period")
    var period: String? = null

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
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("eaidscan/EAID")
    var eaid: String? = null

    @JsonProperty("hhidscan/HHID")
    var hhid: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("hhidscan/country")
    var country: String? = null

    @JsonProperty("eaidscan/EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("hhidscan/HHIDscan")
    var hhidscan: String? = null

    @JsonProperty("location/geopoint")
    var locationGeopoint: String? = null

    @JsonProperty("selectEvent/event")
    var eventValue: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("landHistory/Fallow")
    var fallow: String? = null

    @JsonProperty("location/loc_field")
    var locField: String? = null

    @JsonProperty("plotsize/plotL_CON")
    var plotLCon: Double? = null

    @JsonProperty("plotsize/plotL_SSR")
    var plotLSsr: Double? = null

    @JsonProperty("plotsize/plotW_CON")
    var plotWCon: Double? = null

    @JsonProperty("plotsize/plotW_SSR")
    var plotWSsr: Double? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("landHistory/drainage")
    var drainage: String? = null

    @JsonProperty("landHistory/soilType")
    var soilType: String? = null

    @JsonProperty("plotsize/plotL_Local")
    var plotLLocal: Double? = null

    @JsonProperty("plotsize/plotW_Local")
    var plotWLocal: Double? = null

    @JsonProperty("landHistory/weedTypes")
    var weedTypes: String? = null

    @JsonProperty("plotsize/plotSize_CON")
    var plotSizeCon: String? = null

    @JsonProperty("plotsize/plotSize_SSR")
    var plotSizeSsr: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("plotsize/plotSize_Local")
    var plotSizeLocal: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("plantingDetails/withinRow")
    var withinRow: Int? = null

    @JsonProperty("landHistory/commonDiseases")
    var commonDiseases: String? = null

    @JsonProperty("plantingDetails/betweenRow")
    var betweenRow: Int? = null

    @JsonProperty("fertilizer1/dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("fertilizer1/fertilizer1_CON")
    var fertilizer1Con: String? = null

    @JsonProperty("fertilizer1/fertilizer1_SSR")
    var fertilizer1Ssr: String? = null

    @JsonProperty("landPreparation/typeTillage")
    var typeTillage: String? = null

    @JsonProperty("landPreparation/tillageForce")
    var tillageForce: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("fertilizer1/fertilizer1_Local")
    var fertilizer1Local: String? = null

    @JsonProperty("landHistory/weedControlMethods")
    var weedControlMethods: String? = null

    @JsonProperty("physiologicalMaturity_CON_count")
    var physiologicalMaturityConCount: String? = null

    @JsonProperty("physiologicalMaturity_SSR_count")
    var physiologicalMaturitySsrCount: String? = null

    @JsonProperty("landHistory/previousFertilizerUse")
    var previousFertilizerUse: String? = null

    @JsonProperty("physiologicalMaturity_Local_count")
    var physiologicalMaturityLocalCount: String? = null

    @JsonProperty("organicInputsDetails/organicInputs")
    var organicInputs: String? = null

    @JsonProperty("organicInputsDetails/dateOrganicInputs")
    var dateOrganicInputs: String? = null

    @JsonProperty("organicInputsDetails/organicInputTypes")
    var organicInputTypes: String? = null

    @JsonProperty("organicInputsDetails/organicInoutAmount")
    var organicInoutAmount: String? = null

    @JsonProperty("eaidscan/EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("hhidscan/HHIDtext")
    var hhidtext: String? = null

    @JsonProperty("landHistory/cropResidue")
    var cropResidue: String? = null

    @JsonProperty("landHistory/lastSeasonCrop")
    var lastSeasonCrop: String? = null

    @JsonProperty("plantingDetails/varietyName")
    var varietyName: String? = null

    @JsonProperty("landHistory/cropResiduePurpose")
    var cropResiduePurpose: String? = null

    @JsonProperty("vigorScore/vigor_CON")
    var vigorCon: String? = null

    @JsonProperty("vigorScore/vigor_SSR")
    var vigorSsr: String? = null

    @JsonProperty("vigorScore/vigor_Local")
    var vigorLocal: String? = null

    @JsonProperty("plotSizeDetails_CON/nrPlants_Emerg_CON")
    var nrPlantsEmergCon: Int? = null

    @JsonProperty("plotSizeDetails_CON/nrPlants_Emerg_SSR")
    var nrPlantsEmergSsr: Int? = null

    @JsonProperty("plotSizeDetails_CON/nrPlants_Emerg_Local")
    var nrPlantsEmergLocal: Int? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: Int? = null

    @JsonProperty("nrSpraying")
    var nrSpraying: Int? = null

    @JsonProperty("Tillering/dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("Tillering/fertilizer2_CON")
    var fertilizer2Con: String? = null

    @JsonProperty("Tillering/fertilizer2_SSR")
    var fertilizer2Ssr: String? = null

    @JsonProperty("trialRatingCON/ratePLB_CON")
    var ratePlbCon: String? = null

    @JsonProperty("trialRatingSSR/ratePLB_SSR")
    var ratePlbSsr: String? = null

    @JsonProperty("Tillering/fertilizer2_Local")
    var fertilizer2Local: String? = null

    @JsonProperty("trialRatingCON/rateFire_CON")
    var rateFireCon: String? = null

    @JsonProperty("trialRatingSSR/rateFire_SSR")
    var rateFireSsr: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("trialRatingCON/ratePests_CON")
    var ratePestsCon: String? = null

    @JsonProperty("trialRatingCON/rateWeeds_CON")
    var rateWeedsCon: String? = null

    @JsonProperty("trialRatingSSR/ratePests_SSR")
    var ratePestsSsr: String? = null

    @JsonProperty("trialRatingSSR/rateWeeds_SSR")
    var rateWeedsSsr: String? = null

    @JsonProperty("trialRatingCON/rateDrought_CON")
    var rateDroughtCon: String? = null

    @JsonProperty("trialRatingCON/rateErosion_CON")
    var rateErosionCon: String? = null

    @JsonProperty("trialRatingCON/rateGrazing_CON")
    var rateGrazingCon: String? = null

    @JsonProperty("trialRatingCON/rateLodging_CON")
    var rateLodgingCon: String? = null

    @JsonProperty("trialRatingLocal/ratePLB_Local")
    var ratePlbLocal: String? = null

    @JsonProperty("trialRatingSSR/rateDrought_SSR")
    var rateDroughtSsr: String? = null

    @JsonProperty("trialRatingSSR/rateErosion_SSR")
    var rateErosionSsr: String? = null

    @JsonProperty("trialRatingSSR/rateGrazing_SSR")
    var rateGrazingSsr: String? = null

    @JsonProperty("trialRatingSSR/rateLodging_SSR")
    var rateLodgingSsr: String? = null

    @JsonProperty("trialRatingCON/nutrientDeff_CON")
    var nutrientDeffCon: String? = null

    @JsonProperty("trialRatingLocal/rateFire_Local")
    var rateFireLocal: String? = null

    @JsonProperty("trialRatingSSR/nutrientDeff_SSR")
    var nutrientDeffSsr: String? = null

    @JsonProperty("trialRatingLocal/ratePests_Local")
    var ratePestsLocal: String? = null

    @JsonProperty("trialRatingLocal/rateWeeds_Local")
    var rateWeedsLocal: String? = null

    @JsonProperty("trialRatingLocal/rateDrought_Local")
    var rateDroughtLocal: String? = null

    @JsonProperty("trialRatingLocal/rateGrazing_Local")
    var rateGrazingLocal: String? = null

    @JsonProperty("trialRatingLocal/rateLodging_Local")
    var rateLodgingLocal: String? = null

    @JsonProperty("trialRatingCON/rateOtherDisease_CON")
    var rateOtherDiseaseCon: String? = null

    @JsonProperty("trialRatingCON/rateTheftMissing_CON")
    var rateTheftMissingCon: String? = null

    @JsonProperty("trialRatingCON/rateWaterLogging_CON")
    var rateWaterLoggingCon: String? = null

    @JsonProperty("trialRatingLocal/nutrientDeff_Local")
    var nutrientDeffLocal: String? = null

    @JsonProperty("trialRatingSSR/rateOtherDisease_SSR")
    var rateOtherDiseaseSsr: String? = null

    @JsonProperty("trialRatingSSR/rateTheftMissing_SSR")
    var rateTheftMissingSsr: String? = null

    @JsonProperty("trialRatingSSR/rateWaterLogging_SSR")
    var rateWaterLoggingSsr: String? = null

    @JsonProperty("trialRatingLocal/rateErosion_SSR_Local")
    var rateErosionSSRLocal: String? = null

    @JsonProperty("trialRatingLocal/rateOtherDisease_Local")
    var rateOtherDiseaseLocal: String? = null

    @JsonProperty("trialRatingLocal/rateTheftMissing_Local")
    var rateTheftMissingLocal: String? = null

    @JsonProperty("trialRatingLocal/rateWaterLogging_SSR_Local")
    var rateWaterLoggingSSRLocal: String? = null

    @JsonProperty("sprayingDetails/dateSpraying1")
    var dateSpraying1: String? = null

    @JsonProperty("sprayingDetails/dateSpraying2")
    var dateSpraying2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("sprayingDetails/dateSpraying3")
    var dateSpraying3: String? = null
}