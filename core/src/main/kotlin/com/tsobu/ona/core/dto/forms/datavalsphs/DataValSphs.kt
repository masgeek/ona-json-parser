package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class DataValSphs {


    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eAID: String? = null

    @JsonProperty("HHID")
    var hHID: String? = null

    @JsonProperty("name")
    var nameValue: String? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_edited")
    var edited = false

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId = 0

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding = 0

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount = 0

    @JsonProperty("_total_media")
    var totalMedia = 0

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("seasonSelect")
    var seasonSelect: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("purpose/event")
    var eventValue: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("purpose/monitored")
    var monitored: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("purpose/rapidYield")
    var rapidYield: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived = false

    @JsonProperty("trialRating/rateCMD")
    var ratecmd: String? = null

    @JsonProperty("trialRating/rateFire")
    var ratefire: String? = null

    @JsonProperty("harvest_CON_Tri_count")
    var harvestConTriCount: String? = null

    @JsonProperty("harvest_REC_Tri_count")
    var harvestRecTriCount: String? = null

    @JsonProperty("trialRating/ratePests")
    var ratepests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateweeds: String? = null

    @JsonProperty("effHarvestDate_REC_Tri")
    var effharvestdateConTri: String? = null


    @JsonProperty("harvest_REC/effHarvestDate_REC")
    var effharvestdateRec: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("trialRating/rateDrought")
    var ratedrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rategrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingDetails/dateWeeding6")
    var dateWeeding6: String? = null


    @JsonProperty("weedingDetails/dateWeeding7")
    var dateWeeding7: String? = null


    @JsonProperty("weedingDetails/dateWeeding8")
    var dateWeeding8: String? = null

    @JsonProperty("weedingDetails/dateWeeding9")
    var dateWeeding9: String? = null

    @JsonProperty("weedingDetails/dateWeeding10")
    var dateWeeding10: String? = null

    @JsonProperty("harvest_CON/effHarvestDate_CON")
    var effharvestdateCon: String? = null

    @JsonProperty("harvest_CON/tuberizedMarketableRootsFW_CON")
    var tuberizedmarketablerootsfwCon = 0.0

    @JsonProperty("harvest_CON/tuberizedMarketableRootsNr_CON")
    var tuberizedmarketablerootsnrCon = 0

    @JsonProperty("harvest_CON_Tri_detail_count")
    var harvestCONTriDetailCount: String? = null

    @JsonProperty("harvest_REC_Tri_detail_count")
    var harvestRECTriDetailCount: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateotherdisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var ratetheftmissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var ratewaterlogging: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("weedingDetails/weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("weedingDetails/weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("weedingDetails/weedingMethod7")
    var weedingMethod7: String? = null

    @JsonProperty("weedingDetails/weedingMethod8")
    var weedingMethod8: String? = null

    @JsonProperty("weedingDetails/weedingMethod9")
    var weedingMethod9: String? = null

    @JsonProperty("weedingDetails/weedingMethod10")
    var weedingMethod10: String? = null

    @JsonProperty("inputs1/orgInputs1")
    var orginputs1: String? = null

    @JsonProperty("inputs2/orgInputs2")
    var orginputs2: String? = null

    @JsonProperty("inputs3/orgInputs3")
    var orginputs3: String? = null

    @JsonProperty("inputs4/orgInputs4")
    var orginputs4: String? = null

    @JsonProperty("inputs5/orgInputs5")
    var orginputs5: String? = null

    @JsonProperty("inputs1/fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("inputs2/fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("inputs3/fertilizer3")
    var fertilizer3: String? = null

    @JsonProperty("inputs4/fertilizer4")
    var fertilizer4: String? = null

    @JsonProperty("inputs5/fertilizer5")
    var fertilizer5: String? = null

    @JsonProperty("landPreparation/ridging")
    var ridging: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("harvestDate/intHarvestDate_CON")
    var intHarvestDateCon: String? = null

    @JsonProperty("harvestDate/intHarvestDate_REC")
    var intHarvestDateRec: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod3")
    var harrowMethod3: String? = null

    @JsonProperty("farmConfirmation/reject")
    var reject: String? = null

    @JsonProperty("harvestDate/harvestDateQuestion_CON")
    var harvestDateQuestionCon: String? = null

    @JsonProperty("harvestDate/harvestDateQuestion_REC")
    var harvestDateQuestionRec: String? = null

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotl1Con: Double? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotl2con: Double? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotw1Con: Double? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotw2Con: Double? = null

    @JsonProperty("plotLayout_REC/plotL1_REC")
    var plotl1Rec: Double? = null

    @JsonProperty("plotLayout_REC/plotL2_REC")
    var plotl2Rec: Double? = null

    @JsonProperty("plotLayout_REC/plotW1_REC")
    var plotw1Rec: Double? = null

    @JsonProperty("plotLayout_REC/plotW2_REC")
    var plotw2Rec: Double? = null

    @JsonProperty("trialRating/rateCBSD")
    var ratecbsd: String? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var nrPlantsCon: Int? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var nrPlantsRec: Int? = null


    @JsonProperty("gappingDetails/gappingDate")
    var gappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingType: String? = null

    @JsonProperty("harvest_REC/priceRoots_REC")
    var pricerootsRec: Double? = null


    @JsonProperty("harvest_CON/priceRoots_CON")
    var pricerootsCon: Double? = null

    @JsonProperty("harvest_REC/tuberizedMarketableRootsNr_REC")
    var tuberizedmarketablerootsnrRec: Double? = null

    @JsonProperty("harvest_REC/tuberizedMarketableRootsFW_REC")
    var tuberizedmarketablerootsfwRec: Double? = null


    @JsonProperty("harvest_REC_Tri_detail")
    var harvestRecTriDetail: List<HarvestRecTriDetail>? = null

    @JsonProperty("harvest_REC_Tri")
    var harvestRecTri: List<HarvestRecTri>? = null

    @JsonProperty("harvest_CON_Tri_detail")
    var harvestConTriDetailList: List<HarvestConTriDetail>? = null
}