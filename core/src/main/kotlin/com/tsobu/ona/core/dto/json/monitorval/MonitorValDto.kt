package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "login", "firstName", "surName", "EAID", "firstNameEA", "surNameEA", "nameEA", "detailsEA", "detailsEANote", "HHID", "firstNameHH", "surNameHH", "nameHH", "detailsHH", "detailsHHNote", "country", "currency", "conversion", "loc_field", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "zoneSelect", "zone", "useCase", "maizeVarietySelect", "maizeVarietyOther", "maizeVarietyDuration", "maizeVariety", "plots", "nrPlots", "knowledgeNote", "knowledgeHH", "knowledgeEA", "installCorrect", "installCorrectDetails_count", "SET-OF-installCorrectDetails", "nrPlotsCorrect", "correctScore", "heterogeneities", "intercrops", "borderEffects", "trialQualityIncidence_All", "trialQualitySeverity_All", "trialQualityScore_All", "trialQuality_Some_count", "SET-OF-trialQuality_Some", "trialQualityScore", "management", "embedded", "bufferRows", "managementDetails", "problems_All", "trialRating_All_count", "SET-OF-trialRating_All", "problems_Some", "trialRating_Some_count", "SET-OF-trialRating_Some", "trialQualityScoreNote", "trialRatingNote1", "trialRatingNote2", "trialCorrectNote1", "trialCorrectNote2", "trialValidityNote1", "trialValidityNote2", "trialValid", "plotLayout_count", "SET-OF-plotLayout", "nrPlants", "maizePlantHeight_count", "SET-OF-maizePlantHeight", "leafSample_count", "SET-OF-leafSample", "depths", "soilSample_count", "SET-OF-soilSample", "soilSampleTool", "soilSampleTool_other", "positionLandscape", "slope", "generated_table_list_label_166", "reserved_name_for_field_list_labels_167", "conservation", "ridges", "irrigated", "fallow", "fertilizer", "organicInput", "cassavaGrownMonocrop", "cassavaGrownIntercrop", "conservationMeasures", "distanceBetweenRidges", "widthRidges", "heightRidges", "yearsFallow", "yearsSinceCassavaMonocrop", "yearsSinceCassavaIntercrop", "predominantIntercrops", "predominantIntercrops_other", "previousCrop", "previousCrop_other", "previousOtherCrops", "previousOtherCrops_other", "fertilizerApplied", "fertilizerApplied_other", "localSoilName", "localSoilNameTranslated", "distance", "fertilityFarmer", "fertilityResearcher", "drainage", "soilDepth", "comment", "end", "instanceID", "KEY")
class MonitorValDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("firstName")
    var firstName: String? = null

    @JsonProperty("surName")
    var surName: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("firstNameEA")
    var firstNameEa: String? = null

    @JsonProperty("surNameEA")
    var surNameEa: String? = null

    @JsonProperty("nameEA")
    var nameEa: String? = null

    @JsonProperty("detailsEA")
    var detailsEa: String? = null

    @JsonProperty("detailsEANote")
    var detailsEANote: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("firstNameHH")
    var firstNameHh: String? = null

    @JsonProperty("surNameHH")
    var surNameHh: String? = null

    @JsonProperty("nameHH")
    var nameHh: String? = null

    @JsonProperty("detailsHH")
    var detailsHh: String? = null

    @JsonProperty("detailsHHNote")
    var detailsHhNote: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

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

    @JsonProperty("zoneSelect")
    var zoneSelect: String? = null

    @JsonProperty("zone")
    var zoneValue: String? = null

    @JsonProperty("useCase")
    var useCase: String? = null

    @JsonProperty("maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("maizeVarietyOther")
    var maizeVarietyOther: String? = null

    @JsonProperty("maizeVarietyDuration")
    var maizeVarietyDuration: String? = null

    @JsonProperty("maizeVariety")
    var maizeVariety: String? = null

    @JsonProperty("plots")
    var plots: String? = null

    @JsonProperty("nrPlots")
    var nrPlots: String? = null

    @JsonProperty("knowledgeNote")
    var knowledgeNote: String? = null

    @JsonProperty("knowledgeHH")
    var knowledgeHh: String? = null

    @JsonProperty("knowledgeEA")
    var knowledgeEa: String? = null

    @JsonProperty("installCorrect")
    var installCorrect: String? = null

    @JsonProperty("installCorrectDetails_count")
    var installCorrectDetailsCount: String? = null

    @JsonProperty("SET-OF-installCorrectDetails")
    var setOfInstallCorrectDetails: String? = null

    @JsonProperty("nrPlotsCorrect")
    var nrPlotsCorrect: String? = null

    @JsonProperty("correctScore")
    var correctScore: String? = null

    @JsonProperty("heterogeneities")
    var heterogeneities: String? = null

    @JsonProperty("intercrops")
    var intercrops: String? = null

    @JsonProperty("borderEffects")
    var borderEffects: String? = null

    @JsonProperty("trialQualityIncidence_All")
    var trialQualityIncidenceAll: String? = null

    @JsonProperty("trialQualitySeverity_All")
    var trialQualitySeverityAll: String? = null

    @JsonProperty("trialQualityScore_All")
    var trialQualityScoreAll: String? = null

    @JsonProperty("trialQuality_Some_count")
    var trialQualitySomeCount: String? = null

    @JsonProperty("SET-OF-trialQuality_Some")
    var setOfTrialQualitySome: String? = null

    @JsonProperty("trialQualityScore")
    var trialQualityScore: String? = null

    @JsonProperty("management")
    var management: String? = null

    @JsonProperty("embedded")
    var embedded: String? = null

    @JsonProperty("bufferRows")
    var bufferRows: String? = null

    @JsonProperty("managementDetails")
    var managementDetails: String? = null

    @JsonProperty("problems_All")
    var problemsAll: String? = null

    @JsonProperty("trialRating_All_count")
    var trialRatingAllCount: String? = null

    @JsonProperty("SET-OF-trialRating_All")
    var setOfTrialRatingAll: String? = null

    @JsonProperty("problems_Some")
    var problemsSome: String? = null

    @JsonProperty("trialRating_Some_count")
    var trialRatingSomeCount: String? = null

    @JsonProperty("SET-OF-trialRating_Some")
    var setOfTrialRatingSome: String? = null

    @JsonProperty("trialQualityScoreNote")
    var trialQualityScoreNote: String? = null

    @JsonProperty("trialRatingNote1")
    var trialRatingNote1: String? = null

    @JsonProperty("trialRatingNote2")
    var trialRatingNote2: String? = null

    @JsonProperty("trialCorrectNote1")
    var trialCorrectNote1: String? = null

    @JsonProperty("trialCorrectNote2")
    var trialCorrectNote2: String? = null

    @JsonProperty("trialValidityNote1")
    var trialValidityNote1: String? = null

    @JsonProperty("trialValidityNote2")
    var trialValidityNote2: String? = null

    @JsonProperty("trialValid")
    var trialValid: String? = null

    @JsonProperty("plotLayout_count")
    var plotLayoutCount: String? = null

    @JsonProperty("SET-OF-plotLayout")
    var setOfPlotLayout: String? = null

    @JsonProperty("nrPlants")
    var nrPlants: String? = null

    @JsonProperty("maizePlantHeight_count")
    var maizePlantHeightCount: String? = null

    @JsonProperty("SET-OF-maizePlantHeight")
    var setOfMaizePlantHeight: String? = null

    @JsonProperty("leafSample_count")
    var leafSampleCount: String? = null

    @JsonProperty("SET-OF-leafSample")
    var setOfLeafSample: String? = null

    @JsonProperty("depths")
    var depths: String? = null

    @JsonProperty("soilSample_count")
    var soilSampleCount: String? = null

    @JsonProperty("SET-OF-soilSample")
    var setOfSoilSample: String? = null

    @JsonProperty("soilSampleTool")
    var soilSampleTool: String? = null

    @JsonProperty("soilSampleTool_other")
    var soilSampleToolOther: String? = null

    @JsonProperty("positionLandscape")
    var positionLandscape: String? = null

    @JsonProperty("slope")
    var slope: String? = null

    @JsonProperty("generated_table_list_label_166")
    var generatedTableListLabel166: String? = null

    @JsonProperty("reserved_name_for_field_list_labels_167")
    var reservedNameForFieldListLabels167: String? = null

    @JsonProperty("conservation")
    var conservation: String? = null

    @JsonProperty("ridges")
    var ridges: String? = null

    @JsonProperty("irrigated")
    var irrigated: String? = null

    @JsonProperty("fallow")
    var fallow: String? = null

    @JsonProperty("fertilizer")
    var fertilizer: String? = null

    @JsonProperty("organicInput")
    var organicInput: String? = null

    @JsonProperty("cassavaGrownMonocrop")
    var cassavaGrownMonocrop: String? = null

    @JsonProperty("cassavaGrownIntercrop")
    var cassavaGrownIntercrop: String? = null

    @JsonProperty("conservationMeasures")
    var conservationMeasures: String? = null

    @JsonProperty("distanceBetweenRidges")
    var distanceBetweenRidges: String? = null

    @JsonProperty("widthRidges")
    var widthRidges: String? = null

    @JsonProperty("heightRidges")
    var heightRidges: String? = null

    @JsonProperty("yearsFallow")
    var yearsFallow: String? = null

    @JsonProperty("yearsSinceCassavaMonocrop")
    var yearsSinceCassavaMonocrop: String? = null

    @JsonProperty("yearsSinceCassavaIntercrop")
    var yearsSinceCassavaIntercrop: String? = null

    @JsonProperty("predominantIntercrops")
    var predominantIntercrops: String? = null

    @JsonProperty("predominantIntercrops_other")
    var predominantIntercropsOther: String? = null

    @JsonProperty("previousCrop")
    var previousCrop: String? = null

    @JsonProperty("previousCrop_other")
    var previousCropOther: String? = null

    @JsonProperty("previousOtherCrops")
    var previousOtherCrops: String? = null

    @JsonProperty("previousOtherCrops_other")
    var previousOtherCropsOther: String? = null

    @JsonProperty("fertilizerApplied")
    var fertilizerApplied: String? = null

    @JsonProperty("fertilizerApplied_other")
    var fertilizerAppliedOther: String? = null

    @JsonProperty("localSoilName")
    var localSoilName: String? = null

    @JsonProperty("localSoilNameTranslated")
    var localSoilNameTranslated: String? = null

    @JsonProperty("distance")
    var distance: String? = null

    @JsonProperty("fertilityFarmer")
    var fertilityFarmer: String? = null

    @JsonProperty("fertilityResearcher")
    var fertilityResearcher: String? = null

    @JsonProperty("drainage")
    var drainage: String? = null

    @JsonProperty("soilDepth")
    var soilDepth: String? = null

    @JsonProperty("comment")
    var commentValue: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}