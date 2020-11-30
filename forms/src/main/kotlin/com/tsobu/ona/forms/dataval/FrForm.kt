package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*


@JsonIgnoreProperties("_id")
@JsonInclude(JsonInclude.Include.NON_NULL)
class FrForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String? = null

    @JsonProperty("_xform_id")
    var xformId: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var purposeEvent: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("plotSizeDetails/plotL")
    var plotLength: String? = null

    @JsonProperty("plotSizeDetails/plotW")
    var plotWidth: String? = null

    @JsonProperty("landPreparation/ridging")
    var ridging: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("plotSizeDetails/plotSize")
    var plotSize: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("plantingDetails/trialType")
    var trialType: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingDetails/plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    @JsonProperty("trialRating/rateCMD")
    var rateCmd: String? = null

    @JsonProperty("trialRating/ratePests")
    var ratePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("plantStand/nrPlants_SSR")
    var nrPlantsSsr: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFwCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_SSR")
    var tuberizedMarketableRootsFwSsr: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_SSR")
    var tuberizedMarketableRootsNrSsr: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("gappingDetails/gappingDate")
    var gappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingType: String? = null

    @JsonProperty("fertilizers1")
    var fertilizers1: String? = null

    @JsonProperty("fertilizer1/MOP1")
    var mop1: String? = null

    @JsonProperty("fertilizer1/urea1")
    var urea1: String? = null

    @JsonProperty("fertilizer1/dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("fertilizers2")
    var fertilizers2: String? = null

    @JsonProperty("fertilizer2/MOP2")
    var mop2: String? = null

    @JsonProperty("fertilizer2/urea2")
    var urea2: String? = null

    @JsonProperty("fertilizer2/dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("fertilizer1/TSP1")
    var tsp1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: String? = null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("weedingDetails/dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingDetails/weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("fertilizer2/TSP2")
    var tsp2: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("farmerEvaluation/costScore")
    var costScore: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var yieldScore: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var labourScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var qualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var revenueScore: String? = null

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotL1Con: String? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotL2Con: String? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotW1Con: String? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotW2Con: String? = null

    @JsonProperty("plotLayout_SSR/plotL1_SSR")
    var plotL1Ssr: String? = null

    @JsonProperty("plotLayout_SSR/plotL2_SSR")
    var plotL2Ssr: String? = null

    @JsonProperty("plotLayout_SSR/plotW1_SSR")
    var plotW1Ssr: String? = null

    @JsonProperty("plotLayout_SSR/plotW2_SSR")
    var plotW2Ssr: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod3")
    var harrowMethod3: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("weedingDetails/dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingDetails/weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("fertilizer1/DAP1")
    var dap1: String? = null

    @JsonProperty("fertilizer1/NPK1")
    var npk1: String? = null

    @JsonProperty("fertilizer2/NPK2")
    var npk2: String? = null

    @JsonProperty("fertilizer2/DAP2")
    var dap2: String? = null
}