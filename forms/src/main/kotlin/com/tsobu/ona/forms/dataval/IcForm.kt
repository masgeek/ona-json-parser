package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class IcForm {
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
    var commentValue: String? = null

    @JsonProperty("country")
    var country: String? = null

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
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("fertilizer0")
    var fertilizer0: String? = null

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

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var purposeEvent: String? = null

    @JsonProperty("dateFertilizer0")
    var dateFertilizer0: String? = null

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

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("plotSizeDetails/plotSize")
    var plotSize: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("plantingDetails/maizeVariety")
    var maizeVariety: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingDetails/cassavaVariety")
    var cassavaVariety: String? = null

    @JsonProperty("plantingDetails/plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("maizeThinning")
    var maizeThinning: String? = null

    @JsonProperty("maizeReseeding")
    var maizeReseeding: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("maizeThinningDate")
    var maizeThinningDate: String? = null

    @JsonProperty("maizeReseedingDate")
    var maizeReseedingDate: String? = null

    @JsonProperty("nrRows")
    var nrRows: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("cassavaGapping")
    var cassavaGapping: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants1_D")
    var nrMaizePlants1d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants2_D")
    var nrMaizePlants2d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants3_D")
    var nrMaizePlants3d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants4_D")
    var nrMaizePlants4d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants5_D")
    var nrMaizePlants5d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants6_D")
    var nrMaizePlants6d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants7_D")
    var nrMaizePlants7d: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_D")
    var nrCassavaPlantsd: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_F1")
    var nrCassavaPlantsF1: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_LM")
    var nrCassavaPlantsLm: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants1_F1")
    var nrMaizePlants1F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants2_F1")
    var nrMaizePlants2F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants3_F1")
    var nrMaizePlants3F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants4_F1")
    var nrMaizePlants4F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants5_F1")
    var nrMaizePlants5F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants6_F1")
    var nrMaizePlants6F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants7_F1")
    var nrMaizePlants7F1: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants1_LM")
    var nrMaizePlants1Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants2_LM")
    var nrMaizePlants2Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants3_LM")
    var nrMaizePlants3Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants4_LM")
    var nrMaizePlants4Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants5_LM")
    var nrMaizePlants5Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants6_LM")
    var nrMaizePlants6Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants7_LM")
    var nrMaizePlants7Lm: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingDate")
    var cassavaGappingDate: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingType")
    var cassavaGappingType: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants8_D")
    var nrMaizePlants8d: String? = null

    @JsonProperty("maizePlantStand_D/nrMaizePlants9_D")
    var nrMaizePlants9d: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants8_F1")
    var nrMaizePlants8F1: String? = null

    @JsonProperty("maizePlantStand_F1/nrMaizePlants9_F1")
    var nrMaizePlants9F1: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants8_LM")
    var nrMaizePlants8Lm: String? = null

    @JsonProperty("maizePlantStand_LM/nrMaizePlants9_LM")
    var nrMaizePlants9Lm: String? = null

    @JsonProperty("fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("trialRating/rateCMD")
    var rateCMd: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("trialRating/ratePestsMaize")
    var ratePestsMaize: String? = null

    @JsonProperty("trialRating/rateDiseaseMaize")
    var rateDiseaseMaize: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/ratePestsCassava")
    var ratePestsCassava: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("trialRating/rateTheftMissingMaize")
    var rateTheftMissingMaize: String? = null

    @JsonProperty("trialRating/rateTheftMissingCassava")
    var rateTheftMissingCassava: String? = null

    @JsonProperty("dateMaizeHarvest")
    var dateMaizeHarvest: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("maizeHarvest_D/largeFreshCobsFW_D")
    var largeFreshCobsFwd: String?=null

    @JsonProperty("maizeHarvest_D/largeFreshCobsNr_D")
    var largeFreshCobsNrd: String? = null

    @JsonProperty("maizeHarvest_D/smallFreshCobsFW_D")
    var smallFreshCobsFwd: String?=null

    @JsonProperty("maizeHarvest_D/smallFreshCobsNr_D")
    var smallFreshCobsNrd: String? = null

    @JsonProperty("maizeHarvest_D/mediumFreshCobsFW_D")
    var mediumFreshCobsFwd: String?=null

    @JsonProperty("maizeHarvest_D/mediumFreshCobsNr_D")
    var mediumFreshCobsNrd: String? = null

    @JsonProperty("maizeHarvest_D/missingFreshCobsNr_D")
    var missingFreshCobsNrd: String? = null

    @JsonProperty("maizeHarvest_F1/largeFreshCobsFW_F1")
    var largeFreshCobsFwF1: String?=null

    @JsonProperty("maizeHarvest_F1/largeFreshCobsNr_F1")
    var largeFreshCobsNrF1: String? = null

    @JsonProperty("maizeHarvest_F1/smallFreshCobsFW_F1")
    var smallFreshCobsFwF1: String?=null

    @JsonProperty("maizeHarvest_F1/smallFreshCobsNr_F1")
    var smallFreshCobsNrF1: String? = null

    @JsonProperty("maizeHarvest_LM/largeFreshCobsFW_LM")
    var largeFreshCobsFWLm: String?=null

    @JsonProperty("maizeHarvest_LM/largeFreshCobsNr_LM")
    var largeFreshCobsNrLm: String? = null

    @JsonProperty("maizeHarvest_LM/smallFreshCobsFW_LM")
    var smallFreshCobsFwLm: String?=null

    @JsonProperty("maizeHarvest_LM/smallFreshCobsNr_LM")
    var smallFreshCobsNrLm: String? = null

    @JsonProperty("maizeHarvest_F1/mediumFreshCobsFW_F1")
    var mediumFreshCobsFwF1: String?=null

    @JsonProperty("maizeHarvest_F1/mediumFreshCobsNr_F1")
    var mediumFreshCobsNrF1: String? = null

    @JsonProperty("maizeHarvest_LM/mediumFreshCobsFW_LM")
    var mediumFreshCobsFWLm: String?=null

    @JsonProperty("maizeHarvest_LM/mediumFreshCobsNr_LM")
    var mediumFreshCobsNrLm: String? = null

    @JsonProperty("maizeHarvest_D/unfitSaleFreshCobsNr_D")
    var maizeHarvestDUnfitSaleFreshCobsNrd: String? = null

    @JsonProperty("maizeHarvest_F1/missingFreshCobsNr_F1")
    var missingFreshCobsNrF1: String? = null

    @JsonProperty("maizeHarvest_LM/missingFreshCobsNr_LM")
    var missingFreshCobsNrLm: String? = null

    @JsonProperty("maizeHarvest_F1/unfitSaleFreshCobsNr_F1")
    var unfitSaleFreshCobsNrF1: String? = null

    @JsonProperty("maizeHarvest_LM/unfitSaleFreshCobsNr_LM")
    var unfitSaleFreshCobsNrLm: String? = null

    @JsonProperty("cobsDried")
    var cobsDried: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: String?=null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: String?=null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("prefPlot")
    var prefPlot: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("farmerEvaluation/costScore")
    var costScore: String? = null

    @JsonProperty("purpose/maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var yieldScore: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var labourScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var qualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var revenueScore: String? = null

    @JsonProperty("cassavaHarvest/dateCassavaHarvest")
    var dateCassavaHarvest: String? = null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsFW_D")
    var tuberizedMarketableRootsFwd: String?=null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsNr_D")
    var tuberizedMarketableRootsNrd: String? = null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsFW_F1")
    var tuberizedMarketableRootsFwF1: String?=null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsFW_LM")
    var tuberizedMarketableRootsFwLm: String?=null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsNr_F1")
    var tuberizedMarketableRootsNrF1: String? = null

    @JsonProperty("cassavaHarvest/tuberizedMarketableRootsNr_LM")
    var tuberizedMarketableRootsNrLm: String? = null

    @JsonProperty("maizeGrain")
    var maizeGrain: String? = null

    @JsonProperty("maizeGrainUnit")
    var maizeGrainUnit: String? = null

    @JsonProperty("prefPlot_maize")
    var prefPlotMaize: String? = null

    @JsonProperty("maizeGrainPrice")
    var maizeGrainPrice: String? = null

    @JsonProperty("maizeGrainUnitName")
    var maizeGrainUnitName: String? = null

    @JsonProperty("overallScore_maize")
    var overallScoreMaize: String? = null

    @JsonProperty("priceMaizeCobFreshLarge")
    var priceMaizeCobFreshLarge: String? = null

    @JsonProperty("farmerEvaluation_maize/costScore_maize")
    var costScoreMaize: String? = null

    @JsonProperty("farmerEvaluation_maize/yieldScore_maize")
    var yieldScoreMaize: String? = null

    @JsonProperty("farmerEvaluation_maize/labourScore_maize")
    var labourScoreMaize: String? = null

    @JsonProperty("farmerEvaluation_maize/qualityScore_maize")
    var qualityScoreMaize: String? = null

    @JsonProperty("farmerEvaluation_maize/revenueScore_maize")
    var revenueScoreMaize: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitPrice")
    var maizeGrainUnitPrice: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitWeight")
    var maizeGrainUnitWeight: String?=null

    @JsonProperty("plotLayout_D/plotL1_D")
    var plotL1d: String?=null

    @JsonProperty("plotLayout_D/plotL2_D")
    var plotL2d: String?=null

    @JsonProperty("plotLayout_D/plotW1_D")
    var plotW1d: String?=null

    @JsonProperty("plotLayout_D/plotW2_D")
    var plotW2d: String?=null

    @JsonProperty("plotLayout_F1/plotL1_F1")
    var plotL1F1: String?=null

    @JsonProperty("plotLayout_F1/plotL2_F1")
    var plotL2F1: String?=null

    @JsonProperty("plotLayout_F1/plotW1_F1")
    var plotW1F1: String?=null

    @JsonProperty("plotLayout_F1/plotW2_F1")
    var plotW2F1: String?=null

    @JsonProperty("plotLayout_LM/plotL1_LM")
    var plotL1Lm: String?=null

    @JsonProperty("plotLayout_LM/plotL2_LM")
    var plotL2Lm: String?=null

    @JsonProperty("plotLayout_LM/plotW1_LM")
    var plotW1Lm: String?=null

    @JsonProperty("plotLayout_LM/plotW2_LM")
    var plotW2Lm: String?=null

    @JsonProperty("weedingDetails/dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingDetails/weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("maizeGrainPriceKg")
    var maizeGrainPriceKg: String? = null

    @JsonProperty("weedingDetails/dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingDetails/weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("weedingDetails/dateWeeding7")
    var dateWeeding7: String? = null

    @JsonProperty("weedingDetails/weedingMethod7")
    var weedingMethod7: String? = null
}