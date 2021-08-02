package com.tsobu.ona.forms.sg

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.ArrayList

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class SgDataValFipForm {
    @JsonProperty("_id")
    var id: Int? = null

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

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formHubUuId: String? = null

    @JsonProperty("purpose/crop")
    var purposeCrop: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var purposeEvent: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

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
    var plotSizeDetailsPlotL: Int? = null

    @JsonProperty("plotSizeDetails/plotW")
    var plotSizeDetailsPlotW: Int? = null

    @JsonProperty("landPreparation/ridging")
    var landPreparationRidging: String? = null

    @JsonProperty("plantingDetails/variety")
    var plantingDetailsVariety: String? = null

    @JsonProperty("landPreparation/clearing")
    var landPreparationClearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var landPreparationNrHarrow: String? = null

    @JsonProperty("plotSizeDetails/plotSize")
    var plotSizeDetailsPlotSize: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var landPreparationNrTillage: String? = null

    @JsonProperty("plantingDetails/trialType")
    var plantingDetailsTrialType: String? = null

    @JsonProperty("plotLayout_FCE/plotL1_FCE")
    var plotLayoutFcePlotL1Fce: Double? = null

    @JsonProperty("plotLayout_FCE/plotL2_FCE")
    var plotLayoutFcePlotL2Fce: Double? = null

    @JsonProperty("plotLayout_FCE/plotW1_FCE")
    var plotLayoutFcePlotW1Fce: Double? = null

    @JsonProperty("plotLayout_FCE/plotW2_FCE")
    var plotLayoutFcePlotW2Fce: Double? = null

    @JsonProperty("landPreparation/vegetation")
    var landPreparationVegetation: String? = null

    @JsonProperty("plotLayout_FIP/plotL1_FIP_C")
    var plotLayoutFipPlotL1FipC: Double? = null

    @JsonProperty("plotLayout_FIP/plotL2_FIP_C")
    var plotLayoutFipPlotL2FipC: Double? = null

    @JsonProperty("plotLayout_FIP/plotW1_FIP_C")
    var plotLayoutFipPlotW1FipC: Double? = null

    @JsonProperty("plotLayout_FIP/plotW2_FIP_C")
    var plotLayoutFipPlotW2FipC: Double? = null

    @JsonProperty("plantingDetails/organicInput")
    var plantingDetailsOrganicInput: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDetailsPlantingDate: String? = null

    @JsonProperty("plantingDetails/plantingDensity")
    var plantingDetailsPlantingDensity: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var landPrepationDetailsHarrowMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var landPrepationDetailsTillageMethod1: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: Int? = null

    @JsonProperty("fertilizers2blue")
    var fertilizers2Blue: String? = null

    @JsonProperty("fertilizers2yellow")
    var fertilizers2Yellow: String? = null

    @JsonProperty("fertilizer2blue/NPK2")
    var fertilizer2BlueNpk2: Int? = null

    @JsonProperty("fertilizer2blue/urea2")
    var fertilizer2BlueUrea2: Int? = null

    @JsonProperty("fertilizer2yellow/NPK2")
    var fertilizer2YellowNpk2:Int? = null

    @JsonProperty("fertilizer2yellow/urea2")
    var fertilizer2YellowUrea2: Int? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var weedingDetailsDateWeeding1: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingDetailsWeedingMethod1: String? = null

    @JsonProperty("fertilizer2blue/dateFertilizer2")
    var fertilizer2BlueDateFertilizer2: String? = null

    @JsonProperty("fertilizer2yellow/dateFertilizer2")
    var fertilizer2YellowDateFertilizer2: String? = null

    @JsonProperty("fertilizers1blue")
    var fertilizers1Blue: String? = null

    @JsonProperty("fertilizers1yellow")
    var fertilizers1Yellow: String? = null

    @JsonProperty("plantStand/nrPlants_FCE")
    var plantStandNrPlantsFce: Int? = null

    @JsonProperty("plantStand/nrPlants_FIP")
    var plantStandNrPlantsFip: Int? = null

    @JsonProperty("fertilizer1blue/dateFertilizer1")
    var fertilizer1BlueDateFertilizer1: String? = null

    @JsonProperty("fertilizer1yellow/dateFertilizer1")
    var fertilizer1YellowDateFertilizer1: String? = null

    @JsonProperty("fertilizer1blue/NPK1")
    var fertilizer1BlueNpk1: Int? = null

    @JsonProperty("fertilizer1blue/urea1")
    var fertilizer1blueUrea1: Int? = null

    @JsonProperty("fertilizer1yellow/NPK1")
    var fertilizer1YellowNpk1: Int? = null

    @JsonProperty("fertilizer1yellow/urea1")
    var fertilizer1yellowUrea1: Int? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var landPrepationDetailsTillageMethod2: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("gappingDetails/gappingDate")
    var gappingDetailsGappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingDetailsGappingType: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var weedingDetailsDateWeeding2: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingDetailsWeedingMethod2: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: Int? = null

    @JsonProperty("farmerEvaluation/costScore")
    var farmerEvaluationCostScore: String? = null

    @JsonProperty("harvestCassava/harvestDate")
    var harvestCassavaHarvestDate: String? = null

    @JsonProperty("trialRatingCassava/rateCMD")
    var trialRatingCassavaRateCmd: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var farmerEvaluationYieldScore: String? = null

    @JsonProperty("trialRatingCassava/rateFire")
    var trialRatingCassavaRateFire: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var farmerEvaluationLabourScore: String? = null

    @JsonProperty("trialRatingCassava/ratePests")
    var trialRatingCassavaRatePests: String? = null

    @JsonProperty("trialRatingCassava/rateWeeds")
    var trialRatingCassavaRateWeeds: String? = null

    @JsonProperty("farmerEvaluation/overallScore")
    var farmerEvaluationOverallScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var farmerEvaluationQualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var farmerEvaluationRevenueScore: String? = null

    @JsonProperty("trialRatingCassava/rateDrought")
    var trialRatingCassavaRateDrought: String? = null

    @JsonProperty("trialRatingCassava/rateGrazing")
    var trialRatingCassavaRateGrazing: String? = null

    @JsonProperty("trialRatingCassava/rateLodging")
    var trialRatingCassavaRateLodging: String? = null

    @JsonProperty("trialRatingCassava/rateOtherDisease")
    var trialRatingCassavaRateOtherDisease: String? = null

    @JsonProperty("trialRatingCassava/rateTheftMissing")
    var trialRatingCassavaRateTheftMissing: String? = null

    @JsonProperty("trialRatingCassava/rateWaterLogging")
    var trialRatingCassavaRateWaterLogging: String? = null

    @JsonProperty("harvestCassava/tuberizedMarketableRootsFW_FCE")
    var harvestCassavaTuberizedMarketableRootsFwFce: Double? = null

    @JsonProperty("harvestCassava/tuberizedMarketableRootsFW_FIP")
    var harvestCassavaTuberizedMarketableRootsFwFip: Double? = null

    @JsonProperty("harvestCassava/tuberizedMarketableRootsNr_FCE")
    var harvestCassavaTuberizedMarketableRootsNrFce: Int? = null

    @JsonProperty("harvestCassava/tuberizedMarketableRootsNr_FIP")
    var harvestCassavaTuberizedMarketableRootsNrFip: Int? = null

    @JsonProperty("waterLevel/rateWater1")
    var waterLevelRateWater1: String? = null

    @JsonProperty("trialRatingRice/rateRat")
    var trialRatingRiceRateRat: String? = null

    @JsonProperty("trialRatingRice/rateBird")
    var trialRatingRiceRateBird: String? = null

    @JsonProperty("trialRatingRice/rateCold")
    var trialRatingRiceRateCold: String? = null

    @JsonProperty("trialRatingRice/rateHeat")
    var trialRatingRiceRateHeat: String? = null

    @JsonProperty("trialRatingRice/rateWeeds")
    var trialRatingRiceRateWeeds: String? = null

    @JsonProperty("trialRatingRice/rateDrought")
    var trialRatingRiceRateDrought: String? = null

    @JsonProperty("trialRatingRice/rateLodging")
    var trialRatingRiceRateLodging: String? = null

    @JsonProperty("trialRatingRice/rateMissing")
    var trialRatingRiceRateMissing: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var weedingDetailsDateWeeding3: String? = null

    @JsonProperty("plantStandRice/nrPlants_FCE1")
    var plantStandRiceNrPlantsFce1: Int? = null

    @JsonProperty("plantStandRice/nrPlants_FCE2")
    var plantStandRiceNrPlantsFce2: Int? = null

    @JsonProperty("plantStandRice/nrPlants_FIP1")
    var plantStandRiceNrPlantsFip1: Int? = null

    @JsonProperty("plantStandRice/nrPlants_FIP2")
    var plantStandRiceNrPlantsFip2: Int? = null

    @JsonProperty("trialRatingRice/rateSalinity")
    var trialRatingRiceRateSalinity: String? = null

    @JsonProperty("trialRatingRice/rateOtherSoil")
    var trialRatingRiceRateOtherSoil: String? = null

    @JsonProperty("waterManagement/rateDrainage1")
    var waterManagementRateDrainage1: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingDetailsWeedingMethod3: String? = null

    @JsonProperty("trialRatingRice/rateOtherPests")
    var trialRatingRiceRateOtherPests: String? = null

    @JsonProperty("trialRatingRice/rateSubmergence")
    var trialRatingRiceRateSubmergence: String? = null

    @JsonProperty("waterManagement/rateIrrigation1")
    var waterManagementRateIrrigation1: String? = null

    @JsonProperty("trialRatingRice/rateDominantPest")
    var trialRatingRiceRateDominantPest: String? = null

    @JsonProperty("trialRatingRice/rateIronToxicity")
    var trialRatingRiceRateIronToxicity: String? = null

    @JsonProperty("trialRatingRice/rateAnimalGrazing")
    var trialRatingRiceRateAnimalGrazing: String? = null

    @JsonProperty("trialRatingRice/rateOtherDiseases")
    var trialRatingRiceRateOtherDiseases: String? = null

    @JsonProperty("trialRatingRice/selectDominantPest")
    var trialRatingRiceSelectDominantPest: String? = null

    @JsonProperty("trialRatingRice/rateDominantDisease")
    var trialRatingRiceRateDominantDisease: String? = null

    @JsonProperty("trialRatingRice/selectDominantDisease")
    var trialRatingRiceSelectDominantDisease: String? = null

    @JsonProperty("plantingDetails/dsMethod")
    var plantingDetailsDsMethod: String? = null

    @JsonProperty("plantingDetails/riceSystem")
    var plantingDetailsRiceSystem: String? = null

    @JsonProperty("plantingDetails/seedingDate")
    var plantingDetailsSeedingDate: String? = null

    @JsonProperty("plantingDetails/plantingMethod")
    var plantingDetailsPlantingMethod: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var landPrepationDetailsHarrowMethod2: String? = null

    @JsonProperty("fertilizers3blue")
    var fertilizers3Blue: String? = null

    @JsonProperty("fertilizers3yellow")
    var fertilizers3Yellow: String? = null

    @JsonProperty("fertilizer3blue/urea3")
    var fertilizer3blueUrea3: Int? = null

    @JsonProperty("fertilizer3yellow/urea3")
    var fertilizer3yellowUrea3: Int? = null

    @JsonProperty("fertilizer3blue/dateFertilizer3")
    var fertilizer3BlueDateFertilizer3: String? = null

    @JsonProperty("fertilizer3yellow/dateFertilizer3")
    var fertilizer3YellowDateFertilizer3: String? = null

    @JsonProperty("trialRatingMaize/rateFire")
    var trialRatingMaizeRateFire: String? = null

    @JsonProperty("trialRatingMaize/rateMite")
    var trialRatingMaizeRateMite: String? = null

    @JsonProperty("trialRatingMaize/rateWeeds")
    var trialRatingMaizeRateWeeds: String? = null

    @JsonProperty("trialRatingMaize/rateDrought")
    var trialRatingMaizeRateDrought: String? = null

    @JsonProperty("trialRatingMaize/rateGrazing")
    var trialRatingMaizeRateGrazing: String? = null

    @JsonProperty("trialRatingMaize/rateLodging")
    var trialRatingMaizeRateLodging: String? = null

    @JsonProperty("trialRatingMaize/rateStemborer")
    var trialRatingMaizeRateStemborer: String? = null

    @JsonProperty("trialRatingMaize/rateOtherPests")
    var trialRatingMaizeRateOtherPests: String? = null

    @JsonProperty("trialRatingMaize/rateFallarmyworm")
    var trialRatingMaizeRateFallArmyworm: String? = null

    @JsonProperty("trialRatingMaize/rateOtherDisease")
    var trialRatingMaizeRateOtherDisease: String? = null

    @JsonProperty("trialRatingMaize/rateTheftMissing")
    var trialRatingMaizeRateTheftMissing: String? = null

    @JsonProperty("trialRatingMaize/rateWaterLogging")
    var trialRatingMaizeRateWaterLogging: String? = null

    @JsonProperty("plantingDetails/tpDate")
    var plantingDetailsTpDate: String? = null

    @JsonProperty("plantingDetails/tpMethod")
    var plantingDetailsTpMethod: String? = null

    @JsonProperty("plantingDetails/nurseryDate")
    var plantingDetailsNurseryDate: String? = null

    @JsonProperty("trialRatingRice/textSoil")
    var trialRatingRiceTextSoil: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var weedingDetailsDateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingDetailsWeedingMethod4: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod3")
    var landPrepationDetailsHarrowMethod3: String? = null
}