package com.tsobu.ona.core.dto.json.sg

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty

//@JsonIgnoreProperties("formhub-uuid")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "formhub-uuid",
    "start",
    "today",
    "deviceid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "purpose-banner",
    "purpose-intro",
    "purpose-crop",
    "purpose-event",
    "EAID",
    "HHID",
    "country",
    "loc_field",
    "geopoint-Latitude",
    "geopoint-Longitude",
    "geopoint-Altitude",
    "geopoint-Accuracy",
    "landPreparation-clearing",
    "landPreparation-vegetation",
    "landPreparation-nrTillage",
    "landPreparation-nrHarrow",
    "landPreparation-ridging",
    "landPrepationDetails-tillageMethod1",
    "landPrepationDetails-tillageMethod2",
    "landPrepationDetails-tillageMethod3",
    "landPrepationDetails-harrowMethod1",
    "landPrepationDetails-harrowMethod2",
    "landPrepationDetails-harrowMethod3",
    "plantingDetails-plantingDate",
    "plantingDetails-trialType",
    "plantingDetails-riceSystem",
    "plantingDetails-variety",
    "plantingDetails-plantingDensity",
    "plantingDetails-densityDetailsCassava-betweenRowC",
    "plantingDetails-densityDetailsCassava-withinRowC",
    "plantingDetails-densityDetailsMaize-betweenRowM",
    "plantingDetails-densityDetailsMaize-withinRowM",
    "plantingDetails-plantingMethod",
    "plantingDetails-tpMethod",
    "plantingDetails-nurseryDate",
    "plantingDetails-tpDate",
    "plantingDetails-dsMethod",
    "plantingDetails-seedingDate",
    "plantingDetails-organicInput",
    "plotSizeDetails-plotW",
    "plotSizeDetails-plotL",
    "plotSizeDetails-plotSize",
    "plantStand-nrPlants_FCE",
    "plantStand-nrPlants_FIP",
    "plantStandRice-nrPlants_FCE1",
    "plantStandRice-nrPlants_FCE2",
    "plantStandRice-nrPlants_FIP1",
    "plantStandRice-nrPlants_FIP2",
    "plotLayout_FCE-plotDim_FCE_C",
    "plotLayout_FCE-plotDim_FCE_M",
    "plotLayout_FCE-plotDim_FCE_R",
    "plotLayout_FCE-plotL1_FCE",
    "plotLayout_FCE-plotW1_FCE",
    "plotLayout_FCE-plotL2_FCE",
    "plotLayout_FCE-plotW2_FCE",
    "plotLayout_FIP-plotDim_FIP_C",
    "plotLayout_FIP-plotDim_FIP_M",
    "plotLayout_FIP-plotDim_FIP_R",
    "plotLayout_FIP-plotL1_FIP_C",
    "plotLayout_FIP-plotW1_FIP_C",
    "plotLayout_FIP-plotL2_FIP_C",
    "plotLayout_FIP-plotW2_FIP_C",
    "gapping",
    "gappingDetails-gappingDate",
    "gappingDetails-gappingType",
    "fertilizers1blue",
    "fertilizer1blue-dateFertilizer1",
    "fertilizer1blue-urea1",
    "fertilizer1blue-NPK1",
    "fertilizers2blue",
    "fertilizer2blue-dateFertilizer2",
    "fertilizer2blue-urea2",
    "fertilizer2blue-NPK2",
    "fertilizers3blue",
    "fertilizer3blue-dateFertilizer3",
    "fertilizer3blue-urea3",
    "fertilizer3blue-NPK3",
    "fertilizers1yellow",
    "fertilizer1yellow-dateFertilizer1",
    "fertilizer1yellow-urea1",
    "fertilizer1yellow-NPK1",
    "fertilizers2yellow",
    "fertilizer2yellow-dateFertilizer2",
    "fertilizer2yellow-urea2",
    "fertilizer2yellow-NPK2",
    "fertilizers3yellow",
    "fertilizer3yellow-dateFertilizer3",
    "fertilizer3yellow-urea3",
    "fertilizer3yellow-NPK3",
    "nrWeeding",
    "weedingDetails-dateWeeding1",
    "weedingDetails-weedingMethod1",
    "weedingDetails-dateWeeding2",
    "weedingDetails-weedingMethod2",
    "weedingDetails-dateWeeding3",
    "weedingDetails-weedingMethod3",
    "weedingDetails-dateWeeding4",
    "weedingDetails-weedingMethod4",
    "weedingDetails-dateWeeding5",
    "weedingDetails-weedingMethod5",
    "weedingDetails-dateWeeding6",
    "weedingDetails-weedingMethod6",
    "weedingDetails-dateWeeding7",
    "weedingDetails-weedingMethod7",
    "weedingDetails-dateWeeding8",
    "weedingDetails-weedingMethod8",
    "weedingDetails-dateWeeding9",
    "weedingDetails-weedingMethod9",
    "weedingDetails-dateWeeding10",
    "weedingDetails-weedingMethod10",
    "trialRatingCassava-rateNote",
    "trialRatingCassava-rateDrought",
    "trialRatingCassava-rateWaterLogging",
    "trialRatingCassava-rateLodging",
    "trialRatingCassava-rateGrazing",
    "trialRatingCassava-rateFire",
    "trialRatingCassava-ratePests",
    "trialRatingCassava-rateWeeds",
    "trialRatingCassava-rateCMD",
    "trialRatingCassava-rateOtherDisease",
    "trialRatingCassava-rateTheftMissing",
    "trialRatingMaize-rateNote",
    "trialRatingMaize-rateDrought",
    "trialRatingMaize-rateWaterLogging",
    "trialRatingMaize-rateLodging",
    "trialRatingMaize-rateGrazing",
    "trialRatingMaize-rateFire",
    "trialRatingMaize-rateFallarmyworm",
    "trialRatingMaize-rateStemborer",
    "trialRatingMaize-rateMite",
    "trialRatingMaize-rateOtherPests",
    "trialRatingMaize-rateWeeds",
    "trialRatingMaize-rateOtherDisease",
    "trialRatingMaize-rateTheftMissing",
    "trialRatingRice-rateNote",
    "trialRatingRice-rateLodging",
    "trialRatingRice-rateMissing",
    "trialRatingRice-rateDrought",
    "trialRatingRice-rateCold",
    "trialRatingRice-rateHeat",
    "trialRatingRice-rateSubmergence",
    "trialRatingRice-rateIronToxicity",
    "trialRatingRice-rateSalinity",
    "trialRatingRice-rateOtherSoil",
    "trialRatingRice-textSoil",
    "trialRatingRice-rateAnimalGrazing",
    "trialRatingRice-rateBird",
    "trialRatingRice-rateRat",
    "trialRatingRice-selectDominantPest",
    "trialRatingRice-rateDominantPest",
    "trialRatingRice-rateOtherPests",
    "trialRatingRice-selectDominantDisease",
    "trialRatingRice-rateDominantDisease",
    "trialRatingRice-rateOtherDiseases",
    "trialRatingRice-rateWeeds",
    "waterManagement-rateNote",
    "waterManagement-rateIrrigation1",
    "waterManagement-rateDrainage1",
    "waterManagement-rateIrrigation2",
    "waterManagement-rateDrainage2",
    "waterLevel-rateNote",
    "waterLevel-rateWater1",
    "waterLevel-rateWater2",
    "harvestCassava-harvestDate",
    "harvestCassava-tuberizedMarketableRootsNr_FCE",
    "harvestCassava-tuberizedMarketableRootsFW_FCE",
    "harvestCassava-tuberizedMarketableRootsNr_FIP",
    "harvestCassava-tuberizedMarketableRootsFW_FIP",
    "harvestMaize-harvestDate",
    "harvestMaize-maizeCobsNr_ss_FCE",
    "harvestMaize-maizeCobsFW_ss_FCE",
    "harvestMaize-plantSampleID_maizeCobs_FCE",
    "harvestMaize-maizeCobsNr_plot_FCE",
    "harvestMaize-maizeCobsFW_plot_FCE",
    "harvestMaize-maizeCobsNr_ss_FIP",
    "harvestMaize-maizeCobsFW_ss_FIP",
    "harvestMaize-plantSampleID_maizeCobs_FIP",
    "harvestMaize-maizeCobsNr_plot_FIP",
    "harvestMaize-maizeCobsFW_plot_FIP",
    "harvestRice-harvestDate",
    "harvestRice-ricePaniclesFW_plot_FCE",
    "harvestRice-ricePaniclesFW_ss_FCE",
    "harvestRice-plantSampleID_ricePanicles_FCE",
    "harvestRice-ricePaniclesFW_plot_FIP",
    "harvestRice-ricePaniclesFW_ss_FIP",
    "harvestRice-plantSampleID_ricePanicles_FIP",
    "farmerEvaluation-scoreNote",
    "farmerEvaluation-costScore",
    "farmerEvaluation-labourScore",
    "farmerEvaluation-yieldScore",
    "farmerEvaluation-qualityScore",
    "farmerEvaluation-revenueScore",
    "farmerEvaluation-overallScore",
    "priceRoots",
    "priceMaize",
    "priceRice",
    "comment",
    "thankyou",
    "end",
    "meta-instanceID",
    "KEY"
)
class DataValFipDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("formhub-uuid")
    var formHubUuId: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("purpose-banner")
    var purposeBanner: String? = null

    @JsonProperty("purpose-intro")
    var intro: String? = null

    @JsonProperty("purpose-crop")
    var crop: String? = null

    @JsonProperty("purpose-event")
    var event: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("landPreparation-clearing")
    var landPreparationClearing: String? = null

    @JsonProperty("landPreparation-vegetation")
    var landPreparationVegetation: String? = null

    @JsonProperty("landPreparation-nrTillage")
    var landPreparationNrTillage: String? = null

    @JsonProperty("landPreparation-nrHarrow")
    var landPreparationNrHarrow: String? = null

    @JsonProperty("landPreparation-ridging")
    var landPreparationRidging: String? = null

    @JsonProperty("landPrepationDetails-tillageMethod1")
    var landPrepationDetailsTillageMethod1: String? = null

    @JsonProperty("landPrepationDetails-tillageMethod2")
    var landPrepationDetailsTillageMethod2: String? = null

    @JsonProperty("landPrepationDetails-tillageMethod3")
    var landPrepationDetailsTillageMethod3: String? = null

    @JsonProperty("landPrepationDetails-harrowMethod1")
    var landPrepationDetailsHarrowMethod1: String? = null

    @JsonProperty("landPrepationDetails-harrowMethod2")
    var landPrepationDetailsHarrowMethod2: String? = null

    @JsonProperty("landPrepationDetails-harrowMethod3")
    var landPrepationDetailsHarrowMethod3: String? = null

    @JsonProperty("plantingDetails-plantingDate")
    var plantingDetailsPlantingDate: String? = null

    @JsonProperty("plantingDetails-trialType")
    var plantingDetailsTrialType: String? = null

    @JsonProperty("plantingDetails-riceSystem")
    var plantingDetailsRiceSystem: String? = null

    @JsonProperty("plantingDetails-variety")
    var plantingDetailsVariety: String? = null

    @JsonProperty("plantingDetails-plantingDensity")
    var plantingDetailsPlantingDensity: String? = null

    @JsonProperty("plantingDetails-densityDetailsCassava-betweenRowC")
    var plantingDetailsDensityDetailsCassavaBetweenRowC: String? = null

    @JsonProperty("plantingDetails-densityDetailsCassava-withinRowC")
    var plantingDetailsDensityDetailsCassavaWithinRowC: String? = null

    @JsonProperty("plantingDetails-densityDetailsMaize-betweenRowM")
    var plantingDetailsDensityDetailsMaizeBetweenRowM: String? = null

    @JsonProperty("plantingDetails-densityDetailsMaize-withinRowM")
    var plantingDetailsDensityDetailsMaizeWithinRowM: String? = null

    @JsonProperty("plantingDetails-plantingMethod")
    var plantingDetailsPlantingMethod: String? = null

    @JsonProperty("plantingDetails-tpMethod")
    var plantingDetailsTpMethod: String? = null

    @JsonProperty("plantingDetails-nurseryDate")
    var plantingDetailsNurseryDate: String? = null

    @JsonProperty("plantingDetails-tpDate")
    var plantingDetailsTpDate: String? = null

    @JsonProperty("plantingDetails-dsMethod")
    var plantingDetailsDsMethod: String? = null

    @JsonProperty("plantingDetails-seedingDate")
    var plantingDetailsSeedingDate: String? = null

    @JsonProperty("plantingDetails-organicInput")
    var plantingDetailsOrganicInput: String? = null

    @JsonProperty("plotSizeDetails-plotW")
    var plotSizeDetailsPlotW: String? = null

    @JsonProperty("plotSizeDetails-plotL")
    var plotSizeDetailsPlotL: String? = null

    @JsonProperty("plotSizeDetails-plotSize")
    var plotSizeDetailsPlotSize: String? = null

    @JsonProperty("plantStand-nrPlants_FCE")
    var plantStandNrPlantsFce: String? = null

    @JsonProperty("plantStand-nrPlants_FIP")
    var plantStandNrPlantsFip: String? = null

    @JsonProperty("plantStandRice-nrPlants_FCE1")
    var plantStandRiceNrPlantsFce1:String? = null

    @JsonProperty("plantStandRice-nrPlants_FCE2")
    var plantStandRiceNrPlantsFce2: String? = null

    @JsonProperty("plantStandRice-nrPlants_FIP1")
    var plantStandRiceNrPlantsFip1: String? = null

    @JsonProperty("plantStandRice-nrPlants_FIP2")
    var plantStandRiceNrPlantsFip2: String? = null

    @JsonProperty("plotLayout_FCE-plotDim_FCE_C")
    var plotLayoutFCEPlotDimFceC: String? = null

    @JsonProperty("plotLayout_FCE-plotDim_FCE_M")
    var plotLayoutFCEPlotDimFceM: String? = null

    @JsonProperty("plotLayout_FCE-plotDim_FCE_R")
    var plotLayoutFCEPlotDimFceR: String? = null

    @JsonProperty("plotLayout_FCE-plotL1_FCE")
    var plotLayoutFCEPlotL1Fce: String? = null

    @JsonProperty("plotLayout_FCE-plotW1_FCE")
    var plotLayoutFCEPlotW1Fce: String? = null

    @JsonProperty("plotLayout_FCE-plotL2_FCE")
    var plotLayoutFCEPlotL2Fce: String? = null

    @JsonProperty("plotLayout_FCE-plotW2_FCE")
    var plotLayoutFCEPlotW2Fce: String? = null

    @JsonProperty("plotLayout_FIP-plotDim_FIP_C")
    var plotLayoutFIPPlotDimFipC: String? = null

    @JsonProperty("plotLayout_FIP-plotDim_FIP_M")
    var plotLayoutFIPPlotDimFipM: String? = null

    @JsonProperty("plotLayout_FIP-plotDim_FIP_R")
    var plotLayoutFIPPlotDimFipR: String? = null

    @JsonProperty("plotLayout_FIP-plotL1_FIP_C")
    var plotLayoutFIPPlotL1FipC: String? = null

    @JsonProperty("plotLayout_FIP-plotW1_FIP_C")
    var plotLayoutFIPPlotW1FipC: String? = null

    @JsonProperty("plotLayout_FIP-plotL2_FIP_C")
    var plotLayoutFIPPlotL2FipC: String? = null

    @JsonProperty("plotLayout_FIP-plotW2_FIP_C")
    var plotLayoutFIPPlotW2FipC: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("gappingDetails-gappingDate")
    var gappingDetailsGappingDate: String? = null

    @JsonProperty("gappingDetails-gappingType")
    var gappingDetailsGappingType: String? = null

    @JsonProperty("fertilizers1blue")
    var fertilizers1Blue: String? = null

    @JsonProperty("fertilizer1blue-dateFertilizer1")
    var fertilizer1BlueDateFertilizer1: String? = null

    @JsonProperty("fertilizer1blue-urea1")
    var fertilizer1BlueUrea1: String? = null

    @JsonProperty("fertilizer1blue-NPK1")
    var fertilizer1BlueNPK1: String? = null

    @JsonProperty("fertilizers2blue")
    var fertilizers2Blue: String? = null

    @JsonProperty("fertilizer2blue-dateFertilizer2")
    var fertilizer2BlueDateFertilizer2: String? = null

    @JsonProperty("fertilizer2blue-urea2")
    var fertilizer2BlueUrea2: String? = null

    @JsonProperty("fertilizer2blue-NPK2")
    var fertilizer2BlueNpk2: String? = null

    @JsonProperty("fertilizers3blue")
    var fertilizers3Blue: String? = null

    @JsonProperty("fertilizer3blue-dateFertilizer3")
    var fertilizer3BlueDateFertilizer3: String? = null

    @JsonProperty("fertilizer3blue-urea3")
    var fertilizer3BlueUrea3: String? = null

    @JsonProperty("fertilizer3blue-NPK3")
    var fertilizer3BlueNpk3: String? = null

    @JsonProperty("fertilizers1yellow")
    var fertilizers1Yellow: String? = null

    @JsonProperty("fertilizer1yellow-dateFertilizer1")
    var fertilizer1yellowDateFertilizer1: String? = null

    @JsonProperty("fertilizer1yellow-urea1")
    var fertilizer1YellowUrea1: String? = null

    @JsonProperty("fertilizer1yellow-NPK1")
    var fertilizer1YellowNPK1: String? = null

    @JsonProperty("fertilizers2yellow")
    var fertilizers2Yellow: String? = null

    @JsonProperty("fertilizer2yellow-dateFertilizer2")
    var fertilizer2yellowDateFertilizer2: String? = null

    @JsonProperty("fertilizer2yellow-urea2")
    var fertilizer2YellowUrea2: String? = null

    @JsonProperty("fertilizer2yellow-NPK2")
    var fertilizer2YellowNpk2: String? = null

    @JsonProperty("fertilizers3yellow")
    var fertilizers3Yellow: String? = null

    @JsonProperty("fertilizer3yellow-dateFertilizer3")
    var fertilizer3yellowDateFertilizer3: String? = null

    @JsonProperty("fertilizer3yellow-urea3")
    var fertilizer3YellowUrea3: String? = null

    @JsonProperty("fertilizer3yellow-NPK3")
    var fertilizer3YellowNpk3: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("weedingDetails-dateWeeding1")
    var weedingDetailsDateWeeding1: String? = null

    @JsonProperty("weedingDetails-weedingMethod1")
    var weedingDetailsWeedingMethod1: String? = null

    @JsonProperty("weedingDetails-dateWeeding2")
    var weedingDetailsDateWeeding2: String? = null

    @JsonProperty("weedingDetails-weedingMethod2")
    var weedingDetailsWeedingMethod2: String? = null

    @JsonProperty("weedingDetails-dateWeeding3")
    var weedingDetailsDateWeeding3: String? = null

    @JsonProperty("weedingDetails-weedingMethod3")
    var weedingDetailsWeedingMethod3: String? = null

    @JsonProperty("weedingDetails-dateWeeding4")
    var weedingDetailsDateWeeding4: String? = null

    @JsonProperty("weedingDetails-weedingMethod4")
    var weedingDetailsWeedingMethod4: String? = null

    @JsonProperty("weedingDetails-dateWeeding5")
    var weedingDetailsDateWeeding5: String? = null

    @JsonProperty("weedingDetails-weedingMethod5")
    var weedingDetailsWeedingMethod5: String? = null

    @JsonProperty("weedingDetails-dateWeeding6")
    var weedingDetailsDateWeeding6: String? = null

    @JsonProperty("weedingDetails-weedingMethod6")
    var weedingDetailsWeedingMethod6: String? = null

    @JsonProperty("weedingDetails-dateWeeding7")
    var weedingDetailsDateWeeding7: String? = null

    @JsonProperty("weedingDetails-weedingMethod7")
    var weedingDetailsWeedingMethod7: String? = null

    @JsonProperty("weedingDetails-dateWeeding8")
    var weedingDetailsDateWeeding8: String? = null

    @JsonProperty("weedingDetails-weedingMethod8")
    var weedingDetailsWeedingMethod8: String? = null

    @JsonProperty("weedingDetails-dateWeeding9")
    var weedingDetailsDateWeeding9: String? = null

    @JsonProperty("weedingDetails-weedingMethod9")
    var weedingDetailsWeedingMethod9: String? = null

    @JsonProperty("weedingDetails-dateWeeding10")
    var weedingDetailsDateWeeding10: String? = null

    @JsonProperty("weedingDetails-weedingMethod10")
    var weedingDetailsWeedingMethod10: String? = null

    @JsonProperty("trialRatingCassava-rateNote")
    var trialRatingCassavaRateNote: String? = null

    @JsonProperty("trialRatingCassava-rateDrought")
    var trialRatingCassavaRateDrought: String? = null

    @JsonProperty("trialRatingCassava-rateWaterLogging")
    var trialRatingCassavaRateWaterLogging: String? = null

    @JsonProperty("trialRatingCassava-rateLodging")
    var trialRatingCassavaRateLodging: String? = null

    @JsonProperty("trialRatingCassava-rateGrazing")
    var trialRatingCassavaRateGrazing: String? = null

    @JsonProperty("trialRatingCassava-rateFire")
    var trialRatingCassavaRateFire: String? = null

    @JsonProperty("trialRatingCassava-ratePests")
    var trialRatingCassavaRatePests: String? = null

    @JsonProperty("trialRatingCassava-rateWeeds")
    var trialRatingCassavaRateWeeds: String? = null

    @JsonProperty("trialRatingCassava-rateCMD")
    var trialRatingCassavaRateCmd: String? = null

    @JsonProperty("trialRatingCassava-rateOtherDisease")
    var trialRatingCassavaRateOtherDisease: String? = null

    @JsonProperty("trialRatingCassava-rateTheftMissing")
    var trialRatingCassavaRateTheftMissing: String? = null

    @JsonProperty("trialRatingMaize-rateNote")
    var trialRatingMaizeRateNote: String? = null

    @JsonProperty("trialRatingMaize-rateDrought")
    var trialRatingMaizeRateDrought: String? = null

    @JsonProperty("trialRatingMaize-rateWaterLogging")
    var trialRatingMaizeRateWaterLogging: String? = null

    @JsonProperty("trialRatingMaize-rateLodging")
    var trialRatingMaizeRateLodging: String? = null

    @JsonProperty("trialRatingMaize-rateGrazing")
    var trialRatingMaizeRateGrazing: String? = null

    @JsonProperty("trialRatingMaize-rateFire")
    var trialRatingMaizeRateFire: String? = null

    @JsonProperty("trialRatingMaize-rateFallarmyworm")
    var trialRatingMaizeRateFallArmyworm: String? = null

    @JsonProperty("trialRatingMaize-rateStemborer")
    var trialRatingMaizeRateStemborer: String? = null

    @JsonProperty("trialRatingMaize-rateMite")
    var trialRatingMaizeRateMite: String? = null

    @JsonProperty("trialRatingMaize-rateOtherPests")
    var trialRatingMaizeRateOtherPests: String? = null

    @JsonProperty("trialRatingMaize-rateWeeds")
    var trialRatingMaizeRateWeeds: String? = null

    @JsonProperty("trialRatingMaize-rateOtherDisease")
    var trialRatingMaizeRateOtherDisease: String? = null

    @JsonProperty("trialRatingMaize-rateTheftMissing")
    var trialRatingMaizeRateTheftMissing: String? = null

    @JsonProperty("trialRatingRice-rateNote")
    var trialRatingRiceRateNote: String? = null

    @JsonProperty("trialRatingRice-rateLodging")
    var trialRatingRiceRateLodging: String? = null

    @JsonProperty("trialRatingRice-rateMissing")
    var trialRatingRiceRateMissing: String? = null

    @JsonProperty("trialRatingRice-rateDrought")
    var trialRatingRiceRateDrought: String? = null

    @JsonProperty("trialRatingRice-rateCold")
    var trialRatingRiceRateCold: String? = null

    @JsonProperty("trialRatingRice-rateHeat")
    var trialRatingRiceRateHeat: String? = null

    @JsonProperty("trialRatingRice-rateSubmergence")
    var trialRatingRiceRateSubmergence: String? = null

    @JsonProperty("trialRatingRice-rateIronToxicity")
    var trialRatingRiceRateIronToxicity: String? = null

    @JsonProperty("trialRatingRice-rateSalinity")
    var trialRatingRiceRateSalinity: String? = null

    @JsonProperty("trialRatingRice-rateOtherSoil")
    var trialRatingRiceRateOtherSoil: String? = null

    @JsonProperty("trialRatingRice-textSoil")
    var trialRatingRiceTextSoil: String? = null

    @JsonProperty("trialRatingRice-rateAnimalGrazing")
    var trialRatingRiceRateAnimalGrazing: String? = null

    @JsonProperty("trialRatingRice-rateBird")
    var trialRatingRiceRateBird: String? = null

    @JsonProperty("trialRatingRice-rateRat")
    var trialRatingRiceRateRat: String? = null

    @JsonProperty("trialRatingRice-selectDominantPest")
    var trialRatingRiceSelectDominantPest: String? = null

    @JsonProperty("trialRatingRice-rateDominantPest")
    var trialRatingRiceRateDominantPest: String? = null

    @JsonProperty("trialRatingRice-rateOtherPests")
    var trialRatingRiceRateOtherPests: String? = null

    @JsonProperty("trialRatingRice-selectDominantDisease")
    var trialRatingRiceSelectDominantDisease: String? = null

    @JsonProperty("trialRatingRice-rateDominantDisease")
    var trialRatingRiceRateDominantDisease: String? = null

    @JsonProperty("trialRatingRice-rateOtherDiseases")
    var trialRatingRiceRateOtherDiseases: String? = null

    @JsonProperty("trialRatingRice-rateWeeds")
    var trialRatingRiceRateWeeds: String? = null

    @JsonProperty("waterManagement-rateNote")
    var waterManagementRateNote: String? = null

    @JsonProperty("waterManagement-rateIrrigation1")
    var waterManagementRateIrrigation1: String? = null

    @JsonProperty("waterManagement-rateDrainage1")
    var waterManagementRateDrainage1: String? = null

    @JsonProperty("waterManagement-rateIrrigation2")
    var waterManagementRateIrrigation2: String? = null

    @JsonProperty("waterManagement-rateDrainage2")
    var waterManagementRateDrainage2: String? = null

    @JsonProperty("waterLevel-rateNote")
    var waterLevelRateNote: String? = null

    @JsonProperty("waterLevel-rateWater1")
    var waterLevelRateWater1: String? = null

    @JsonProperty("waterLevel-rateWater2")
    var waterLevelRateWater2: String? = null

    @JsonProperty("harvestCassava-harvestDate")
    var harvestCassavaHarvestDate: String? = null

    @JsonProperty("harvestCassava-tuberizedMarketableRootsNr_FCE")
    var harvestCassavaTuberizedMarketableRootsNrFce: String? = null

    @JsonProperty("harvestCassava-tuberizedMarketableRootsFW_FCE")
    var harvestCassavaTuberizedMarketableRootsFwFce: String? = null

    @JsonProperty("harvestCassava-tuberizedMarketableRootsNr_FIP")
    var harvestCassavaTuberizedMarketableRootsNrFip: String? = null

    @JsonProperty("harvestCassava-tuberizedMarketableRootsFW_FIP")
    var harvestCassavaTuberizedMarketableRootsFwFip: String? = null

    @JsonProperty("harvestMaize-harvestDate")
    var harvestMaizeHarvestDate: String? = null

    @JsonProperty("harvestMaize-maizeCobsNr_ss_FCE")
    var harvestMaizeMaizeCobsNrSsFce: String? = null

    @JsonProperty("harvestMaize-maizeCobsFW_ss_FCE")
    var harvestMaizeMaizeCobsFwSsFce: String? = null

    @JsonProperty("harvestMaize-plantSampleID_maizeCobs_FCE")
    var harvestMaizePlantSampleIdMaizeCobsFce: String? = null

    @JsonProperty("harvestMaize-maizeCobsNr_plot_FCE")
    var harvestMaizeMaizeCobsNrPlotFce: String? = null

    @JsonProperty("harvestMaize-maizeCobsFW_plot_FCE")
    var harvestMaizeMaizeCobsFwPlotFce: String? = null

    @JsonProperty("harvestMaize-maizeCobsNr_ss_FIP")
    var harvestMaizeMaizeCobsNrSsFip: String? = null

    @JsonProperty("harvestMaize-maizeCobsFW_ss_FIP")
    var harvestMaizeMaizeCobsFwSsFip: String? = null

    @JsonProperty("harvestMaize-plantSampleID_maizeCobs_FIP")
    var harvestMaizePlantSampleIdMaizeCobsFip: String? = null

    @JsonProperty("harvestMaize-maizeCobsNr_plot_FIP")
    var harvestMaizeMaizeCobsNrPlotFip: String? = null

    @JsonProperty("harvestMaize-maizeCobsFW_plot_FIP")
    var harvestMaizeMaizeCobsFwPlotFip: String? = null

    @JsonProperty("harvestRice-harvestDate")
    var harvestRiceHarvestDate: String? = null

    @JsonProperty("harvestRice-ricePaniclesFW_plot_FCE")
    var harvestRiceRicePaniclesFwPlotFce: String? = null

    @JsonProperty("harvestRice-ricePaniclesFW_ss_FCE")
    var harvestRiceRicePaniclesFwSsFce: String? = null

    @JsonProperty("harvestRice-plantSampleID_ricePanicles_FCE")
    var harvestRicePlantSampleIDRicePaniclesFce: String? = null

    @JsonProperty("harvestRice-ricePaniclesFW_plot_FIP")
    var harvestRiceRicePaniclesFwPlotFip: String? = null

    @JsonProperty("harvestRice-ricePaniclesFW_ss_FIP")
    var harvestRiceRicePaniclesFwSsFip: String? = null

    @JsonProperty("harvestRice-plantSampleID_ricePanicles_FIP")
    var harvestRicePlantSampleIDRicePaniclesFip: String? = null

    @JsonProperty("farmerEvaluation-scoreNote")
    var farmerEvaluationScoreNote: String? = null

    @JsonProperty("farmerEvaluation-costScore")
    var farmerEvaluationCostScore: String? = null

    @JsonProperty("farmerEvaluation-labourScore")
    var farmerEvaluationLabourScore: String? = null

    @JsonProperty("farmerEvaluation-yieldScore")
    var farmerEvaluationYieldScore: String? = null

    @JsonProperty("farmerEvaluation-qualityScore")
    var farmerEvaluationQualityScore: String? = null

    @JsonProperty("farmerEvaluation-revenueScore")
    var farmerEvaluationRevenueScore: String? = null

    @JsonProperty("farmerEvaluation-overallScore")
    var farmerEvaluationOverallScore: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("priceMaize")
    var priceMaize: String? = null

    @JsonProperty("priceRice")
    var priceRice: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("thankyou")
    var thankYou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("meta-instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}