package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "EAID", "HHID", "_tags", "_uuid", "login", "plots", "start", "today", "_notes", "depths", "nameEA", "nameHH", "_edited", "_status", "country", "nrPlots", "useCase", "_version", "currency", "deviceid", "geopoint", "nrPlants", "username", "_duration", "_xform_id", "detailsEA", "detailsHH", "loc_field", "simserial", "surNameEA", "surNameHH", "conversion", "plotLayout", "soilSample", "firstNameEA", "firstNameHH", "phonenumber", "_attachments", "_geolocation", "_media_count", "_total_media", "correctScore", "formhub/uuid", "subscriberid", "_submitted_by", "installCorrect", "nrPlotsCorrect", "meta/instanceID", "_submission_time", "_xform_id_string", "leafSample_count", "maizePlantHeight", "plotLayout_count", "soilSample_count", "trialQualityScore", "_bamboo_dataset_id", "_media_all_received", "knowledge/knowledgeEA", "knowledge/knowledgeHH", "trialRating_All_count", "maizePlantHeight_count", "trialRating_Some_count", "cropManagement/embedded", "trialQuality/intercrops", "trialQuality_Some_count", "trialValidity/trialValid", "cropManagement/bufferRows", "cropManagement/management", "trialQuality/borderEffects", "installCorrectDetails_count", "trialQuality/heterogeneities", "problems_Some", "trialRating_Some", "trialQuality_Some", "comment", "problems_All", "trialRating_All", "enumerator/surName", "enumerator/firstName", "trialQuality_All/trialQualityScore_All", "trialQuality_All/trialQualitySeverity_All", "trialQuality_All/trialQualityIncidence_All", "siteDetails2/fallow", "siteDetails2/ridges", "siteDetails4/distance", "siteDetails4/drainage", "siteDetails2/irrigated", "siteDetails4/soilDepth", "siteDetails2/fertilizer", "siteDetails3/yearsFallow", "siteDetails2/conservation", "siteDetails2/organicInput", "siteDetails4/localSoilName", "siteDetails4/fertilityFarmer", "siteDetails1/positionLandscape", "siteDetails4/fertilityResearcher", "siteDetails2/cassavaGrownMonocrop", "siteDetails2/cassavaGrownIntercrop", "siteDetails4/localSoilNameTranslated", "siteDetails3/siteDetails3a/widthRidges", "siteDetails3/siteDetails3a/heightRidges", "siteDetails3/siteDetails3a/distanceBetweenRidges", "siteDetails3/siteDetails3b/predominantIntercrops", "siteDetails3/siteDetails3b/yearsSinceCassavaMonocrop", "siteDetails3/siteDetails3b/yearsSinceCassavaIntercrop", "siteDetails3/siteDetails3c/previousCrop", "siteDetails3/siteDetails3c/previousOtherCrops", "installCorrectDetails", "siteDetails3/siteDetails3c/fertilizerApplied", "leafSample", "siteDetails1/slope", "managementDetails", "email", "siteDetails3/conservationMeasures", "siteDetails3/siteDetails3b/predominantIntercrops_other", "siteDetails3/siteDetails3c/previousOtherCrops_other", "siteDetails3/siteDetails3c/previousCrop_other", "_last_edited", "soilSampleTool", "meta/deprecatedID", "siteDetails3/siteDetails3c/fertilizerApplied_other", "maizeVariety", "maizeVarietySelect", "zone", "zoneSelect")
class MonitorValForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("plots")
    var plots: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("depths")
    var depths: String? = null

    @JsonProperty("nameEA")
    var nameEa: String? = null

    @JsonProperty("nameHH")
    var nameHh: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("nrPlots")
    var nrPlots: String? = null

    @JsonProperty("useCase")
    var useCase: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("nrPlants")
    var nrPlants: Int? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("detailsEA")
    var detailsEa: String? = null

    @JsonProperty("detailsHH")
    var detailsHh: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("surNameEA")
    var surNameEa: String? = null

    @JsonProperty("surNameHH")
    var surNameHh: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("plotLayout")
    var plotLayout: List<PlotLayout>? = null

    @JsonProperty("soilSample")
    var soilSample: List<SoilSample>? = null

    @JsonProperty("firstNameEA")
    var firstNameEa: String? = null

    @JsonProperty("firstNameHH")
    var firstNameHh: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("correctScore")
    var correctScore: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("installCorrect")
    var installCorrect: String? = null

    @JsonProperty("nrPlotsCorrect")
    var nrPlotsCorrect: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("leafSample_count")
    var leafSampleCount: String? = null

    @JsonProperty("maizePlantHeight")
    var maizePlantHeight: List<MaizePlantHeight>? = null

    @JsonProperty("plotLayout_count")
    var plotLayoutCount: String? = null

    @JsonProperty("soilSample_count")
    var soilSampleCount: String? = null

    @JsonProperty("trialQualityScore")
    var trialQualityScore: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("knowledge/knowledgeEA")
    var knowledgeKnowledgeEa: String? = null

    @JsonProperty("knowledge/knowledgeHH")
    var knowledgeKnowledgeHh: String? = null

    @JsonProperty("trialRating_All_count")
    var trialRatingAllCount: String? = null

    @JsonProperty("maizePlantHeight_count")
    var maizePlantHeightCount: String? = null

    @JsonProperty("trialRating_Some_count")
    var trialRatingSomeCount: String? = null

    @JsonProperty("cropManagement/embedded")
    var cropManagementEmbedded: String? = null

    @JsonProperty("trialQuality/intercrops")
    var trialQualityIntercrops: String? = null

    @JsonProperty("trialQuality_Some_count")
    var trialQualitySomeCount: String? = null

    @JsonProperty("trialValidity/trialValid")
    var trialValidityTrialValid: String? = null

    @JsonProperty("cropManagement/bufferRows")
    var cropManagementBufferRows: String? = null

    @JsonProperty("cropManagement/management")
    var management: String? = null

    @JsonProperty("trialQuality/borderEffects")
    var trialQualityBorderEffects: String? = null

    @JsonProperty("installCorrectDetails_count")
    var installCorrectDetailsCount: String? = null

    @JsonProperty("trialQuality/heterogeneities")
    var trialQualityHeterogeneities: String? = null

    @JsonProperty("problems_Some")
    var problemsSome: String? = null

    @JsonProperty("trialRating_Some")
    var trialRatingSome: List<TrialRatingSome>? = null

    @JsonProperty("trialQuality_Some")
    var trialQualitySome: List<TrialQualitySome>? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("problems_All")
    var problemsAll: String? = null

    @JsonProperty("trialRating_All")
    var trialRatingAll: List<TrialRatingAll>? = null

    @JsonProperty("enumerator/surName")
    var enumeratorSurName: String? = null

    @JsonProperty("enumerator/firstName")
    var enumeratorFirstName: String? = null

    @JsonProperty("trialQuality_All/trialQualityScore_All")
    var trialQualityAllTrialQualityScoreAll: String? = null

    @JsonProperty("trialQuality_All/trialQualitySeverity_All")
    var trialQualityAllTrialQualitySeverityAll: String? = null

    @JsonProperty("trialQuality_All/trialQualityIncidence_All")
    var trialQualityAllTrialQualityIncidenceAll: String? = null

    @JsonProperty("siteDetails2/fallow")
    var siteDetails2Fallow: String? = null

    @JsonProperty("siteDetails2/ridges")
    var siteDetails2Ridges: String? = null

    @JsonProperty("siteDetails4/distance")
    var siteDetails4Distance: String? = null

    @JsonProperty("siteDetails4/drainage")
    var siteDetails4Drainage: String? = null

    @JsonProperty("siteDetails2/irrigated")
    var siteDetails2Irrigated: String? = null

    @JsonProperty("siteDetails4/soilDepth")
    var siteDetails4SoilDepth: String? = null

    @JsonProperty("siteDetails2/fertilizer")
    var siteDetails2Fertilizer: String? = null

    @JsonProperty("siteDetails3/yearsFallow")
    var siteDetails3YearsFallow: Int? = null

    @JsonProperty("siteDetails2/conservation")
    var siteDetails2Conservation: String? = null

    @JsonProperty("siteDetails2/organicInput")
    var siteDetails2OrganicInput: String? = null

    @JsonProperty("siteDetails4/localSoilName")
    var siteDetails4LocalSoilName: String? = null

    @JsonProperty("siteDetails4/fertilityFarmer")
    var siteDetails4FertilityFarmer: String? = null

    @JsonProperty("siteDetails1/positionLandscape")
    var siteDetails1PositionLandscape: String? = null

    @JsonProperty("siteDetails4/fertilityResearcher")
    var siteDetails4FertilityResearcher: String? = null

    @JsonProperty("siteDetails2/cassavaGrownMonocrop")
    var siteDetails2CassavaGrownMonocrop: String? = null

    @JsonProperty("siteDetails2/cassavaGrownIntercrop")
    var siteDetails2CassavaGrownIntercrop: String? = null

    @JsonProperty("siteDetails4/localSoilNameTranslated")
    var siteDetails4LocalSoilNameTranslated: String? = null

    @JsonProperty("siteDetails3/siteDetails3a/widthRidges")
    var siteDetails3SiteDetails3aWidthRidges: Int? = null

    @JsonProperty("siteDetails3/siteDetails3a/heightRidges")
    var siteDetails3SiteDetails3aHeightRidges: Int? = null

    @JsonProperty("siteDetails3/siteDetails3a/distanceBetweenRidges")
    var siteDetails3SiteDetails3aDistanceBetweenRidges: Int? = null

    @JsonProperty("siteDetails3/siteDetails3b/predominantIntercrops")
    var siteDetails3SiteDetails3bPredominantIntercrops: String? = null

    @JsonProperty("siteDetails3/siteDetails3b/yearsSinceCassavaMonocrop")
    var siteDetails3SiteDetails3bYearsSinceCassavaMonocrop: Int? = null

    @JsonProperty("siteDetails3/siteDetails3b/yearsSinceCassavaIntercrop")
    var siteDetails3SiteDetails3bYearsSinceCassavaIntercrop: Int? = null

    @JsonProperty("siteDetails3/siteDetails3c/previousCrop")
    var siteDetails3SiteDetails3cPreviousCrop: String? = null

    @JsonProperty("siteDetails3/siteDetails3c/previousOtherCrops")
    var siteDetails3SiteDetails3cPreviousOtherCrops: String? = null

    @JsonProperty("installCorrectDetails")
    var installCorrectDetails: List<InstallCorrectDetail>? = null

    @JsonProperty("siteDetails3/siteDetails3c/fertilizerApplied")
    var siteDetails3SiteDetails3cFertilizerApplied: String? = null

    @JsonProperty("leafSample")
    var leafSample: List<LeafSample>? = null

    @JsonProperty("siteDetails1/slope")
    var siteDetails1Slope: Double? = null

    @JsonProperty("managementDetails")
    var managementDetails: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("siteDetails3/conservationMeasures")
    var siteDetails3ConservationMeasures: String? = null

    @JsonProperty("siteDetails3/siteDetails3b/predominantIntercrops_other")
    var siteDetails3SiteDetails3bPredominantIntercropsOther: String? = null

    @JsonProperty("siteDetails3/siteDetails3c/previousOtherCrops_other")
    var siteDetails3SiteDetails3cPreviousOtherCropsOther: String? = null

    @JsonProperty("siteDetails3/siteDetails3c/previousCrop_other")
    var siteDetails3SiteDetails3cPreviousCropOther: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("soilSampleTool")
    var soilSampleTool: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedID: String? = null

    @JsonProperty("siteDetails3/siteDetails3c/fertilizerApplied_other")
    var siteDetails3SiteDetails3cFertilizerAppliedOther: String? = null

    @JsonProperty("maizeVariety")
    var maizeVariety: String? = null

    @JsonProperty("maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("zoneSelect")
    var zoneSelect: String? = null
}