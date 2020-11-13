package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "event", "maizeVarietySelect", "EAID", "HHID", "country", "currency", "conversion", "loc_field", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "clearing", "vegetation", "nrTillage", "nrHarrow", "ridging", "tillageMethod1", "tillageMethod2", "tillageMethod3", "harrowMethod1", "harrowMethod2", "harrowMethod3", "plantingDate", "cassavaVariety", "maizeVariety", "plantingDensity", "betweenRow", "withinRow", "plotW", "plotL", "plotSize", "plotDim_F1", "plotL1_F1", "plotW1_F1", "plotL2_F1", "plotW2_F1", "plotDim_LM", "plotL1_LM", "plotW1_LM", "plotL2_LM", "plotW2_LM", "plotDim_D", "plotL1_D", "plotW1_D", "plotL2_D", "plotW2_D", "fertilizer0", "dateFertilizer0", "maizeReseeding", "maizeReseedingDate", "maizeThinning", "maizeThinningDate", "fertilizer1", "dateFertilizer1", "nrRows", "maizePlantStandNote_F1", "nrMaizePlants1_F1", "nrMaizePlants2_F1", "nrMaizePlants3_F1", "nrMaizePlants4_F1", "nrMaizePlants5_F1", "nrMaizePlants6_F1", "nrMaizePlants7_F1", "nrMaizePlants8_F1", "nrMaizePlants9_F1", "nrMaizePlants10_F1", "maizePlantStandNote_LM", "nrMaizePlants1_LM", "nrMaizePlants2_LM", "nrMaizePlants3_LM", "nrMaizePlants4_LM", "nrMaizePlants5_LM", "nrMaizePlants6_LM", "nrMaizePlants7_LM", "nrMaizePlants8_LM", "nrMaizePlants9_LM", "nrMaizePlants10_LM", "maizePlantStandNote_D", "nrMaizePlants1_D", "nrMaizePlants2_D", "nrMaizePlants3_D", "nrMaizePlants4_D", "nrMaizePlants5_D", "nrMaizePlants6_D", "nrMaizePlants7_D", "nrMaizePlants8_D", "nrMaizePlants9_D", "nrMaizePlants10_D", "nrCassavaPlants_F1", "nrCassavaPlants_LM", "nrCassavaPlants_D", "cassavaGapping", "cassavaGappingDate", "cassavaGappingType", "fertilizer2", "dateFertilizer2", "nrWeeding", "dateWeeding1", "weedingMethod1", "dateWeeding2", "weedingMethod2", "dateWeeding3", "weedingMethod3", "dateWeeding4", "weedingMethod4", "dateWeeding5", "weedingMethod5", "dateWeeding6", "weedingMethod6", "dateWeeding7", "weedingMethod7", "dateWeeding8", "weedingMethod8", "dateWeeding9", "weedingMethod9", "dateWeeding10", "weedingMethod10", "rateNote", "rateDrought", "rateWaterLogging", "rateLodging", "rateGrazing", "rateFire", "ratePestsCassava", "ratePestsMaize", "rateWeeds", "rateCMD", "rateCBSD", "rateOtherDisease", "rateDiseaseMaize", "rateTheftMissingMaize", "rateTheftMissingCassava", "dateMaizeHarvest", "cobsDried", "cobNrNote_F1", "smallFreshCobsNr_F1", "mediumFreshCobsNr_F1", "largeFreshCobsNr_F1", "missingFreshCobsNr_F1", "unfitSaleFreshCobsNr_F1", "cobFWNote_F1", "smallFreshCobsFW_F1", "mediumFreshCobsFW_F1", "largeFreshCobsFW_F1", "cobNrNote_LM", "smallFreshCobsNr_LM", "mediumFreshCobsNr_LM", "largeFreshCobsNr_LM", "missingFreshCobsNr_LM", "unfitSaleFreshCobsNr_LM", "cobFWNote_LM", "smallFreshCobsFW_LM", "mediumFreshCobsFW_LM", "largeFreshCobsFW_LM", "cobNrNote_D", "smallFreshCobsNr_D", "mediumFreshCobsNr_D", "largeFreshCobsNr_D", "missingFreshCobsNr_D", "unfitSaleFreshCobsNr_D", "cobFWNote_D", "smallFreshCobsFW_D", "mediumFreshCobsFW_D", "largeFreshCobsFW_D", "prefPlot_maize", "scoreNote_maize", "costScore_maize", "labourScore_maize", "yieldScore_maize", "qualityScore_maize", "revenueScore_maize", "overallScore_maize", "priceMaizeCobFreshLarge", "maizeGrain", "maizeGrainUnit", "maizeGrainPriceKg", "maizeGrainUnitName", "maizeGrainUnitWeight", "maizeGrainUnitPrice", "maizeGrainPrice", "dateCassavaHarvest", "tuberizedMarketableRootsNr_F1", "tuberizedMarketableRootsFW_F1", "tuberizedMarketableRootsNr_LM", "tuberizedMarketableRootsFW_LM", "tuberizedMarketableRootsNr_D", "tuberizedMarketableRootsFW_D", "prefPlot", "scoreNote", "costScore", "labourScore", "yieldScore", "qualityScore", "revenueScore", "overallScore", "priceRoots", "comment", "thankyou", "end", "instanceID", "KEY")
class IcDto {
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
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("event")
    var event: String? = null

    @JsonProperty("maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

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

    @JsonProperty("clearing")
    var clearing: String? = null

    @JsonProperty("vegetation")
    var vegetation: String? = null

    @JsonProperty("nrTillage")
    var nrTillage: String? = null

    @JsonProperty("nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("ridging")
    var ridging: String? = null

    @JsonProperty("tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("harrowMethod3")
    var harrowMethod3: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("cassavaVariety")
    var cassavaVariety: String? = null

    @JsonProperty("maizeVariety")
    var maizeVariety: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: String? = null

    @JsonProperty("withinRow")
    var withinRow: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("plotDim_F1")
    var plotDimF1: String? = null

    @JsonProperty("plotL1_F1")
    var plotL1F1: String? = null

    @JsonProperty("plotW1_F1")
    var plotW1F1: String? = null

    @JsonProperty("plotL2_F1")
    var plotL2F1: String? = null

    @JsonProperty("plotW2_F1")
    var plotW2F1: String? = null

    @JsonProperty("plotDim_LM")
    var plotDimLM: String? = null

    @JsonProperty("plotL1_LM")
    var plotL1LM: String? = null

    @JsonProperty("plotW1_LM")
    var plotW1LM: String? = null

    @JsonProperty("plotL2_LM")
    var plotL2LM: String? = null

    @JsonProperty("plotW2_LM")
    var plotW2LM: String? = null

    @JsonProperty("plotDim_D")
    var plotDimD: String? = null

    @JsonProperty("plotL1_D")
    var plotL1D: String? = null

    @JsonProperty("plotW1_D")
    var plotW1D: String? = null

    @JsonProperty("plotL2_D")
    var plotL2D: String? = null

    @JsonProperty("plotW2_D")
    var plotW2D: String? = null

    @JsonProperty("fertilizer0")
    var fertilizer0: String? = null

    @JsonProperty("dateFertilizer0")
    var dateFertilizer0: String? = null

    @JsonProperty("maizeReseeding")
    var maizeReseeding: String? = null

    @JsonProperty("maizeReseedingDate")
    var maizeReseedingDate: String? = null

    @JsonProperty("maizeThinning")
    var maizeThinning: String? = null

    @JsonProperty("maizeThinningDate")
    var maizeThinningDate: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("nrRows")
    var nrRows: String? = null

    @JsonProperty("maizePlantStandNote_F1")
    var maizePlantStandNoteF1: String? = null

    @JsonProperty("nrMaizePlants1_F1")
    var nrMaizePlants1F1: String? = null

    @JsonProperty("nrMaizePlants2_F1")
    var nrMaizePlants2F1: String? = null

    @JsonProperty("nrMaizePlants3_F1")
    var nrMaizePlants3F1: String? = null

    @JsonProperty("nrMaizePlants4_F1")
    var nrMaizePlants4F1: String? = null

    @JsonProperty("nrMaizePlants5_F1")
    var nrMaizePlants5F1: String? = null

    @JsonProperty("nrMaizePlants6_F1")
    var nrMaizePlants6F1: String? = null

    @JsonProperty("nrMaizePlants7_F1")
    var nrMaizePlants7F1: String? = null

    @JsonProperty("nrMaizePlants8_F1")
    var nrMaizePlants8F1: String? = null

    @JsonProperty("nrMaizePlants9_F1")
    var nrMaizePlants9F1: String? = null

    @JsonProperty("nrMaizePlants10_F1")
    var nrMaizePlants10F1: String? = null

    @JsonProperty("maizePlantStandNote_LM")
    var maizePlantStandNoteLM: String? = null

    @JsonProperty("nrMaizePlants1_LM")
    var nrMaizePlants1LM: String? = null

    @JsonProperty("nrMaizePlants2_LM")
    var nrMaizePlants2LM: String? = null

    @JsonProperty("nrMaizePlants3_LM")
    var nrMaizePlants3LM: String? = null

    @JsonProperty("nrMaizePlants4_LM")
    var nrMaizePlants4LM: String? = null

    @JsonProperty("nrMaizePlants5_LM")
    var nrMaizePlants5LM: String? = null

    @JsonProperty("nrMaizePlants6_LM")
    var nrMaizePlants6LM: String? = null

    @JsonProperty("nrMaizePlants7_LM")
    var nrMaizePlants7LM: String? = null

    @JsonProperty("nrMaizePlants8_LM")
    var nrMaizePlants8LM: String? = null

    @JsonProperty("nrMaizePlants9_LM")
    var nrMaizePlants9LM: String? = null

    @JsonProperty("nrMaizePlants10_LM")
    var nrMaizePlants10LM: String? = null

    @JsonProperty("maizePlantStandNote_D")
    var maizePlantStandNoteD: String? = null

    @JsonProperty("nrMaizePlants1_D")
    var nrMaizePlants1D: String? = null

    @JsonProperty("nrMaizePlants2_D")
    var nrMaizePlants2D: String? = null

    @JsonProperty("nrMaizePlants3_D")
    var nrMaizePlants3D: String? = null

    @JsonProperty("nrMaizePlants4_D")
    var nrMaizePlants4D: String? = null

    @JsonProperty("nrMaizePlants5_D")
    var nrMaizePlants5D: String? = null

    @JsonProperty("nrMaizePlants6_D")
    var nrMaizePlants6D: String? = null

    @JsonProperty("nrMaizePlants7_D")
    var nrMaizePlants7D: String? = null

    @JsonProperty("nrMaizePlants8_D")
    var nrMaizePlants8D: String? = null

    @JsonProperty("nrMaizePlants9_D")
    var nrMaizePlants9D: String? = null

    @JsonProperty("nrMaizePlants10_D")
    var nrMaizePlants10D: String? = null

    @JsonProperty("nrCassavaPlants_F1")
    var nrCassavaPlantsF1: String? = null

    @JsonProperty("nrCassavaPlants_LM")
    var nrCassavaPlantsLM: String? = null

    @JsonProperty("nrCassavaPlants_D")
    var nrCassavaPlantsD: String? = null

    @JsonProperty("cassavaGapping")
    var cassavaGapping: String? = null

    @JsonProperty("cassavaGappingDate")
    var cassavaGappingDate: String? = null

    @JsonProperty("cassavaGappingType")
    var cassavaGappingType: String? = null

    @JsonProperty("fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("dateWeeding7")
    var dateWeeding7: String? = null

    @JsonProperty("weedingMethod7")
    var weedingMethod7: String? = null

    @JsonProperty("dateWeeding8")
    var dateWeeding8: String? = null

    @JsonProperty("weedingMethod8")
    var weedingMethod8: String? = null

    @JsonProperty("dateWeeding9")
    var dateWeeding9: String? = null

    @JsonProperty("weedingMethod9")
    var weedingMethod9: String? = null

    @JsonProperty("dateWeeding10")
    var dateWeeding10: String? = null

    @JsonProperty("weedingMethod10")
    var weedingMethod10: String? = null

    @JsonProperty("rateNote")
    var rateNote: String? = null

    @JsonProperty("rateDrought")
    var rateDrought: String? = null

    @JsonProperty("rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("rateLodging")
    var rateLodging: String? = null

    @JsonProperty("rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("rateFire")
    var rateFire: String? = null

    @JsonProperty("ratePestsCassava")
    var ratePestsCassava: String? = null

    @JsonProperty("ratePestsMaize")
    var ratePestsMaize: String? = null

    @JsonProperty("rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("rateCMD")
    var rateCMD: String? = null

    @JsonProperty("rateCBSD")
    var rateCBSD: String? = null

    @JsonProperty("rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("rateDiseaseMaize")
    var rateDiseaseMaize: String? = null

    @JsonProperty("rateTheftMissingMaize")
    var rateTheftMissingMaize: String? = null

    @JsonProperty("rateTheftMissingCassava")
    var rateTheftMissingCassava: String? = null

    @JsonProperty("dateMaizeHarvest")
    var dateMaizeHarvest: String? = null

    @JsonProperty("cobsDried")
    var cobsDried: String? = null

    @JsonProperty("cobNrNote_F1")
    var cobNrNoteF1: String? = null

    @JsonProperty("smallFreshCobsNr_F1")
    var smallFreshCobsNrF1: String? = null

    @JsonProperty("mediumFreshCobsNr_F1")
    var mediumFreshCobsNrF1: String? = null

    @JsonProperty("largeFreshCobsNr_F1")
    var largeFreshCobsNrF1: String? = null

    @JsonProperty("missingFreshCobsNr_F1")
    var missingFreshCobsNrF1: String? = null

    @JsonProperty("unfitSaleFreshCobsNr_F1")
    var unfitSaleFreshCobsNrF1: String? = null

    @JsonProperty("cobFWNote_F1")
    var cobFWNoteF1: String? = null

    @JsonProperty("smallFreshCobsFW_F1")
    var smallFreshCobsFWF1: String? = null

    @JsonProperty("mediumFreshCobsFW_F1")
    var mediumFreshCobsFWF1: String? = null

    @JsonProperty("largeFreshCobsFW_F1")
    var largeFreshCobsFWF1: String? = null

    @JsonProperty("cobNrNote_LM")
    var cobNrNoteLM: String? = null

    @JsonProperty("smallFreshCobsNr_LM")
    var smallFreshCobsNrLM: String? = null

    @JsonProperty("mediumFreshCobsNr_LM")
    var mediumFreshCobsNrLM: String? = null

    @JsonProperty("largeFreshCobsNr_LM")
    var largeFreshCobsNrLM: String? = null

    @JsonProperty("missingFreshCobsNr_LM")
    var missingFreshCobsNrLM: String? = null

    @JsonProperty("unfitSaleFreshCobsNr_LM")
    var unfitSaleFreshCobsNrLM: String? = null

    @JsonProperty("cobFWNote_LM")
    var cobFWNoteLM: String? = null

    @JsonProperty("smallFreshCobsFW_LM")
    var smallFreshCobsFWLM: String? = null

    @JsonProperty("mediumFreshCobsFW_LM")
    var mediumFreshCobsFWLM: String? = null

    @JsonProperty("largeFreshCobsFW_LM")
    var largeFreshCobsFWLM: String? = null

    @JsonProperty("cobNrNote_D")
    var cobNrNoteD: String? = null

    @JsonProperty("smallFreshCobsNr_D")
    var smallFreshCobsNrD: String? = null

    @JsonProperty("mediumFreshCobsNr_D")
    var mediumFreshCobsNrD: String? = null

    @JsonProperty("largeFreshCobsNr_D")
    var largeFreshCobsNrD: String? = null

    @JsonProperty("missingFreshCobsNr_D")
    var missingFreshCobsNrD: String? = null

    @JsonProperty("unfitSaleFreshCobsNr_D")
    var unfitSaleFreshCobsNrD: String? = null

    @JsonProperty("cobFWNote_D")
    var cobFWNoteD: String? = null

    @JsonProperty("smallFreshCobsFW_D")
    var smallFreshCobsFWD: String? = null

    @JsonProperty("mediumFreshCobsFW_D")
    var mediumFreshCobsFWD: String? = null

    @JsonProperty("largeFreshCobsFW_D")
    var largeFreshCobsFWD: String? = null

    @JsonProperty("prefPlot_maize")
    var prefPlotMaize: String? = null

    @JsonProperty("scoreNote_maize")
    var scoreNoteMaize: String? = null

    @JsonProperty("costScore_maize")
    var costScoreMaize: String? = null

    @JsonProperty("labourScore_maize")
    var labourScoreMaize: String? = null

    @JsonProperty("yieldScore_maize")
    var yieldScoreMaize: String? = null

    @JsonProperty("qualityScore_maize")
    var qualityScoreMaize: String? = null

    @JsonProperty("revenueScore_maize")
    var revenueScoreMaize: String? = null

    @JsonProperty("overallScore_maize")
    var overallScoreMaize: String? = null

    @JsonProperty("priceMaizeCobFreshLarge")
    var priceMaizeCobFreshLarge: String? = null

    @JsonProperty("maizeGrain")
    var maizeGrain: String? = null

    @JsonProperty("maizeGrainUnit")
    var maizeGrainUnit: String? = null

    @JsonProperty("maizeGrainPriceKg")
    var maizeGrainPriceKg: String? = null

    @JsonProperty("maizeGrainUnitName")
    var maizeGrainUnitName: String? = null

    @JsonProperty("maizeGrainUnitWeight")
    var maizeGrainUnitWeight: String? = null

    @JsonProperty("maizeGrainUnitPrice")
    var maizeGrainUnitPrice: String? = null

    @JsonProperty("maizeGrainPrice")
    var maizeGrainPrice: String? = null

    @JsonProperty("dateCassavaHarvest")
    var dateCassavaHarvest: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_F1")
    var tuberizedMarketableRootsNrF1: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_F1")
    var tuberizedMarketableRootsFWF1: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_LM")
    var tuberizedMarketableRootsNrLM: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_LM")
    var tuberizedMarketableRootsFWLM: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_D")
    var tuberizedMarketableRootsNrD: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_D")
    var tuberizedMarketableRootsFWD: String? = null

    @JsonProperty("prefPlot")
    var prefPlot: String? = null

    @JsonProperty("scoreNote")
    var scoreNote: String? = null

    @JsonProperty("costScore")
    var costScore: String? = null

    @JsonProperty("labourScore")
    var labourScore: String? = null

    @JsonProperty("yieldScore")
    var yieldScore: String? = null

    @JsonProperty("qualityScore")
    var qualityScore: String? = null

    @JsonProperty("revenueScore")
    var revenueScore: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("comment")
    var commentValue: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}