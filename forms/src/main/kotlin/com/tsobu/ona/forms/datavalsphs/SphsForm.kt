package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class SphsForm {

    @JsonProperty("_id")
    var dataId: String? = null

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

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("today2")
    var today2: String? = null

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

    @JsonProperty("simserial")
    var simserial: String? = null

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
    var formHubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

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

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotL1Con: String? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotL2Con: String? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotW1Con: String? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotW2Con: String? = null

    @JsonProperty("plotLayout_REC/plotL1_REC")
    var plotL1Rec: String? = null

    @JsonProperty("plotLayout_REC/plotL2_REC")
    var plotL2Rec: String? = null

    @JsonProperty("plotLayout_REC/plotW1_REC")
    var plotW1Rec: String? = null

    @JsonProperty("plotLayout_REC/plotW2_REC")
    var plotW2Rec: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("inputs2/orgInputs2")
    var orgInputs2: String? = null

    @JsonProperty("inputs2/fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("trialRating/rateCMD")
    var rateCmd: String? = null

    @JsonProperty("trialRating/ratePests")
    var ratePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var nrPlantsRec: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding10")
    var dateWeeding10: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("gappingDetails/gappingDate")
    var gappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingType: String? = null

    @JsonProperty("inputs3/orgInputs3")
    var orgInputs3: String? = null

    @JsonProperty("inputs3/fertilizer3")
    var fertilizer3: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("inputs1/orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("inputs1/fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("landPreparation/ridging")
    var ridging: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("harvestDate/intHarvestDate_CON")
    var intHarvestDateCon: String? = null

    @JsonProperty("harvestDate/intHarvestDate_REC")
    var intHarvestDateRec: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("inputs4/orgInputs4")
    var orgInputs4: String? = null

    @JsonProperty("inputs4/fertilizer4")
    var fertilizer4: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("harvest_CON/effHarvestDate_CON")
    var effHarvestDateCon: String? = null

    @JsonProperty("harvest_CON/tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFwCon: String? = null

    @JsonProperty("harvest_CON/tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("harvest_REC/effHarvestDate_REC")
    var effHarvestDateRec: String? = null

    @JsonProperty("harvest_REC/tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: String? = null

    @JsonProperty("harvest_REC/tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("weedingDetails/dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingDetails/weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("weedingDetails/dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingDetails/weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("lastPlot")
    var lastPlot: String? = null

    @JsonProperty("harvest_REC/priceRoots_REC")
    var priceRootsRec: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("farmerEvaluation/costScore")
    var costScore: String? = null

    @JsonProperty("harvest_CON/priceRoots_CON")
    var priceRootsCon: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var yieldScore: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var labourScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var qualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var revenueScore: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("seasonSelect")
    var seasonSelect: String? = null

    @JsonProperty("weedingDetails/dateWeeding7")
    var dateWeeding7: String? = null

    @JsonProperty("weedingDetails/dateWeeding8")
    var dateWeeding8: String? = null

    @JsonProperty("weedingDetails/dateWeeding9")
    var dateWeeding9: String? = null

    @JsonProperty("weedingDetails/weedingMethod7")
    var weedingMethod7: String? = null

    @JsonProperty("weedingDetails/weedingMethod8")
    var weedingMethod8: String? = null

    @JsonProperty("weedingDetails/weedingMethod9")
    var weedingMethod9: String? = null

    @JsonProperty("name")
    var nameValue: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("purpose/monitored")
    var monitored: String? = null

    @JsonProperty("purpose/rapidYield")
    var rapidYield: String? = null

    @JsonProperty("harvest_CON_Tri_count")
    var harvestConTriCount: String? = null

    @JsonProperty("harvest_REC_Tri_count")
    var harvestRecTriCount: String? = null

    @JsonProperty("farmConfirmation/reject")
    var reject: String? = null

    @JsonProperty("harvest_CON_Tri_detail_count")
    var harvestConTriDetailCount: String? = null

    @JsonProperty("harvest_REC_Tri_detail_count")
    var harvestRecDetailTriCount: String? = null

    @JsonProperty("harvestDate/harvestDateQuestion_CON")
    var harvestDateQuestionCon: String? = null

    @JsonProperty("harvestDate/harvestDateQuestion_REC")
    var harvestDateQuestionRec: String? = null

    @JsonProperty("inputs5/orgInputs5")
    var orgInputs5: String? = null

    @JsonProperty("inputs5/fertilizer5")
    var fertilizer5: String? = null

    @JsonProperty("effHarvestDate_REC_Tri")
    var effHarvestDateRecTri: String? = null


    @JsonProperty("landPrepationDetails/harrowMethod3")
    var harrowMethod3: String? = null

    @JsonProperty("effHarvestDate_CON_Tri")
    var effHarvestDateConTri: String? = null

    @JsonProperty("meta/deprecatedID")
    var deprecatedId: String? = null


    @JsonProperty("harvest_REC_Tri_detail")
    var harvestRecTriDetailForm: List<HarvestRecTriDetailForm>? = null

    @JsonProperty("harvest_REC_Tri")
    var harvestRecTriForm: List<HarvestRecTriForm>? = null

    @JsonProperty("harvest_CON_Tri_detail")
    var harvestConTriDetailForm: List<HarvestConTriDetailForm>? = null

    @JsonProperty("harvest_CON_Tri")
    var harvestConTriForm: List<HarvestConTriForm>? = null
}