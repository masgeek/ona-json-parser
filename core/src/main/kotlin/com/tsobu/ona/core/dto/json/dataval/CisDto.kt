package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "event", "EAID", "HHID", "country", "currency", "conversion", "loc_field", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "clearing", "vegetation", "nrTillage", "nrHarrow", "ridging", "tillageMethod1", "tillageMethod2", "tillageMethod3", "harrowMethod1", "harrowMethod2", "harrowMethod3", "sameDayPlanting", "plantingDate", "plantingDateCS", "plantingDateSP", "cassavaVariety", "sweetPotatoVariety", "plantingDensityCSMC", "plantingDensityCSIC", "plantingDensitySPMC", "plantingDensitySPIC", "betweenRowCSMC", "withinRowCSMC", "betweenRowCSIC", "withinRowCSIC", "betweenRowSPMC", "withinRowSPMC", "betweenRowSPIC", "withinRowSPIC", "plotW", "plotL", "plotSize", "fertilizer0", "dateFertilizer0", "sweetPotatoReplanting", "sweetPotatoReplantingDate", "sweetPotatoReplantingType", "fertilizer1", "dateFertilizer1", "nrRows", "sweetPotatoPlantStandNote_SP", "nrSweetPotatoPlants1_SP", "nrSweetPotatoPlants2_SP", "nrSweetPotatoPlants3_SP", "nrSweetPotatoPlants4_SP", "nrSweetPotatoPlants5_SP", "nrSweetPotatoPlants6_SP", "nrSweetPotatoPlants7_SP", "nrSweetPotatoPlants8_SP", "nrSweetPotatoPlants9_SP", "nrSweetPotatoPlants10_SP", "sweetPotatoPlantStandNote_CSSP", "nrSweetPotatoPlants1_CSSP", "nrSweetPotatoPlants2_CSSP", "nrSweetPotatoPlants3_CSSP", "nrSweetPotatoPlants4_CSSP", "nrSweetPotatoPlants5_CSSP", "nrSweetPotatoPlants6_CSSP", "nrSweetPotatoPlants7_CSSP", "nrSweetPotatoPlants8_CSSP", "nrSweetPotatoPlants9_CSSP", "nrSweetPotatoPlants10_CSSP", "sweetPotatoPlantStandNote_CSSPF", "nrSweetPotatoPlants1_CSSPF", "nrSweetPotatoPlants2_CSSPF", "nrSweetPotatoPlants3_CSSPF", "nrSweetPotatoPlants4_CSSPF", "nrSweetPotatoPlants5_CSSPF", "nrSweetPotatoPlants6_CSSPF", "nrSweetPotatoPlants7_CSSPF", "nrSweetPotatoPlants8_CSSPF", "nrSweetPotatoPlants9_CSSPF", "nrSweetPotatoPlants10_CSSPF", "nrCassavaPlants_CS", "nrCassavaPlants_CSSP", "nrCassavaPlants_CSSPF", "cassavaGapping", "cassavaGappingDate", "cassavaGappingType", "noteVigour_SP", "scoreVigour_SP", "scoreCover_SP", "noteVigour_CSSP", "scoreVigour_CSSP", "scoreCover_CSSP", "noteVigour_CSSPF", "scoreVigour_CSSPF", "scoreCover_CSSPF", "nrWeeding", "dateWeeding1", "weedingMethod1", "dateWeeding2", "weedingMethod2", "dateWeeding3", "weedingMethod3", "dateWeeding4", "weedingMethod4", "dateWeeding5", "weedingMethod5", "dateWeeding6", "weedingMethod6", "dateWeeding7", "weedingMethod7", "dateWeeding8", "weedingMethod8", "dateWeeding9", "weedingMethod9", "dateWeeding10", "weedingMethod10", "rateNote", "rateDrought", "rateWaterLogging", "rateLodging", "rateGrazing", "rateFire", "ratePestsCassava", "ratePestsSweetPotato", "rateWeeds", "rateCMD", "rateCBSD", "rateOtherDisease", "rateDiseaseSweetPotato", "rateTheftMissingSweetPotato", "rateTheftMissingCassava", "dateSweetPotatoHarvest", "tuberNrNote_SP", "smallTubersNr_SP", "largeTubersNr_SP", "tuberFWNote_SP", "smallTubersFW_SP", "largeTubersFW_SP", "tuberNrNote_CSSP", "smallTubersNr_CSSP", "largeTubersNr_CSSP", "tuberFWNote_CSSP", "smallTubersFW_CSSP", "largeTubersFW_CSSP", "tuberNrNote_CSSPF", "smallTubersNr_CSSPF", "largeTubersNr_CSSPF", "tuberFWNote_CSSPF", "smallTubersFW_CSSPF", "largeTubersFW_CSSPF", "prefPlot_SP", "scoreNote_SP", "costScore_SP", "labourScore_SP", "yieldScore_SP", "qualityScore_SP", "revenueScore_SP", "overallScore_SP", "tuberUnit", "tuberPriceSI", "tuberUnitName", "tuberUnitWeight", "tuberUnitPrice", "tuberPrice", "dateCassavaHarvest", "tuberizedMarketableRootsNr_CS", "tuberizedMarketableRootsFW_CS", "tuberizedMarketableRootsNr_CSSP", "tuberizedMarketableRootsFW_CSSP", "tuberizedMarketableRootsNr_CSSPF", "tuberizedMarketableRootsFW_CSSPF", "prefPlot", "scoreNote", "costScore", "labourScore", "yieldScore", "qualityScore", "revenueScore", "overallScore", "rootsUnit", "rootsPriceSI", "rootsUnitName", "rootsUnitWeight", "rootsUnitPrice", "rootsPrice", "comment", "thankyou", "end", "instanceID", "KEY")
class CisDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

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

    @JsonProperty("sameDayPlanting")
    var sameDayPlanting: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingDateCS")
    var plantingDateCS: String? = null

    @JsonProperty("plantingDateSP")
    var plantingDateSp: String? = null

    @JsonProperty("cassavaVariety")
    var cassavaVariety: String? = null

    @JsonProperty("sweetPotatoVariety")
    var sweetPotatoVariety: String? = null

    @JsonProperty("plantingDensityCSMC")
    var plantingDensityCsMc: String? = null

    @JsonProperty("plantingDensityCSIC")
    var plantingDensityCsIc: String? = null

    @JsonProperty("plantingDensitySPMC")
    var plantingDensitySpMc: String? = null

    @JsonProperty("plantingDensitySPIC")
    var plantingDensitySpIc: String? = null

    @JsonProperty("betweenRowCSMC")
    var betweenRowCsMc: String? = null

    @JsonProperty("withinRowCSMC")
    var withinRowCsMc: String? = null

    @JsonProperty("betweenRowCSIC")
    var betweenRowCsIc: String? = null

    @JsonProperty("withinRowCSIC")
    var withinRowCsIc: String? = null

    @JsonProperty("betweenRowSPMC")
    var betweenRowSpMc: String? = null

    @JsonProperty("withinRowSPMC")
    var withinRowSpMc: String? = null

    @JsonProperty("betweenRowSPIC")
    var betweenRowSpIc: String? = null

    @JsonProperty("withinRowSPIC")
    var withinRowSpIc: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("fertilizer0")
    var fertilizer0: String? = null

    @JsonProperty("dateFertilizer0")
    var dateFertilizer0: String? = null

    @JsonProperty("sweetPotatoReplanting")
    var sweetPotatoReplanting: String? = null

    @JsonProperty("sweetPotatoReplantingDate")
    var sweetPotatoReplantingDate: String? = null

    @JsonProperty("sweetPotatoReplantingType")
    var sweetPotatoReplantingType: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("nrRows")
    var nrRows: String? = null

    @JsonProperty("sweetPotatoPlantStandNote_SP")
    var sweetPotatoPlantStandNoteSp: String? = null

    @JsonProperty("nrSweetPotatoPlants1_SP")
    var nrSweetPotatoPlants1Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants2_SP")
    var nrSweetPotatoPlants2Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants3_SP")
    var nrSweetPotatoPlants3Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants4_SP")
    var nrSweetPotatoPlants4Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants5_SP")
    var nrSweetPotatoPlants5Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants6_SP")
    var nrSweetPotatoPlants6Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants7_SP")
    var nrSweetPotatoPlants7Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants8_SP")
    var nrSweetPotatoPlants8Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants9_SP")
    var nrSweetPotatoPlants9Sp: String? = null

    @JsonProperty("nrSweetPotatoPlants10_SP")
    var nrSweetPotatoPlants10Sp: String? = null

    @JsonProperty("sweetPotatoPlantStandNote_CSSP")
    var sweetPotatoPlantStandNoteCsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants1_CSSP")
    var nrSweetPotatoPlants1CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants2_CSSP")
    var nrSweetPotatoPlants2CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants3_CSSP")
    var nrSweetPotatoPlants3CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants4_CSSP")
    var nrSweetPotatoPlants4CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants5_CSSP")
    var nrSweetPotatoPlants5CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants6_CSSP")
    var nrSweetPotatoPlants6CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants7_CSSP")
    var nrSweetPotatoPlants7CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants8_CSSP")
    var nrSweetPotatoPlants8CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants9_CSSP")
    var nrSweetPotatoPlants9CsSp: String? = null

    @JsonProperty("nrSweetPotatoPlants10_CSSP")
    var nrSweetPotatoPlants10CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStandNote_CSSPF")
    var sweetPotatoPlantStandNoteCsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants1_CSSPF")
    var nrSweetPotatoPlants1CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants2_CSSPF")
    var nrSweetPotatoPlants2CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants3_CSSPF")
    var nrSweetPotatoPlants3CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants4_CSSPF")
    var nrSweetPotatoPlants4CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants5_CSSPF")
    var nrSweetPotatoPlants5CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants6_CSSPF")
    var nrSweetPotatoPlants6CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants7_CSSPF")
    var nrSweetPotatoPlants7CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants8_CSSPF")
    var nrSweetPotatoPlants8CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants9_CSSPF")
    var nrSweetPotatoPlants9CsSpf: String? = null

    @JsonProperty("nrSweetPotatoPlants10_CSSPF")
    var nrSweetPotatoPlants10CsSpf: String? = null

    @JsonProperty("nrCassavaPlants_CS")
    var nrCassavaPlantsCS: String? = null

    @JsonProperty("nrCassavaPlants_CSSP")
    var nrCassavaPlantsCsSp: String? = null

    @JsonProperty("nrCassavaPlants_CSSPF")
    var nrCassavaPlantsCsSpf: String? = null

    @JsonProperty("cassavaGapping")
    var cassavaGapping: String? = null

    @JsonProperty("cassavaGappingDate")
    var cassavaGappingDate: String? = null

    @JsonProperty("cassavaGappingType")
    var cassavaGappingType: String? = null

    @JsonProperty("noteVigour_SP")
    var noteVigourSp: String? = null

    @JsonProperty("scoreVigour_SP")
    var scoreVigourSp: String? = null

    @JsonProperty("scoreCover_SP")
    var scoreCoverSp: String? = null

    @JsonProperty("noteVigour_CSSP")
    var noteVigourCsSp: String? = null

    @JsonProperty("scoreVigour_CSSP")
    var scoreVigourCsSp: String? = null

    @JsonProperty("scoreCover_CSSP")
    var scoreCoverCsSp: String? = null

    @JsonProperty("noteVigour_CSSPF")
    var noteVigourCsSpf: String? = null

    @JsonProperty("scoreVigour_CSSPF")
    var scoreVigourCsSpf: String? = null

    @JsonProperty("scoreCover_CSSPF")
    var scoreCoverCsSpf: String? = null

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

    @JsonProperty("ratePestsSweetPotato")
    var ratePestsSweetPotato: String? = null

    @JsonProperty("rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("rateCMD")
    var rateCmd: String? = null

    @JsonProperty("rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("rateDiseaseSweetPotato")
    var rateDiseaseSweetPotato: String? = null

    @JsonProperty("rateTheftMissingSweetPotato")
    var rateTheftMissingSweetPotato: String? = null

    @JsonProperty("rateTheftMissingCassava")
    var rateTheftMissingCassava: String? = null

    @JsonProperty("dateSweetPotatoHarvest")
    var dateSweetPotatoHarvest: String? = null

    @JsonProperty("tuberNrNote_SP")
    var tuberNrNoteSp: String? = null

    @JsonProperty("smallTubersNr_SP")
    var smallTubersNrSp: String? = null

    @JsonProperty("largeTubersNr_SP")
    var largeTubersNrSp: String? = null

    @JsonProperty("tuberFWNote_SP")
    var tuberFWNoteSp: String? = null

    @JsonProperty("smallTubersFW_SP")
    var smallTubersFWSp: String? = null

    @JsonProperty("largeTubersFW_SP")
    var largeTubersFWSp: String? = null

    @JsonProperty("tuberNrNote_CSSP")
    var tuberNrNoteCsSp: String? = null

    @JsonProperty("smallTubersNr_CSSP")
    var smallTubersNrCsSp: String? = null

    @JsonProperty("largeTubersNr_CSSP")
    var largeTubersNrCsSp: String? = null

    @JsonProperty("tuberFWNote_CSSP")
    var tuberFWNoteCsSp: String? = null

    @JsonProperty("smallTubersFW_CSSP")
    var smallTubersFwCsSp: String? = null

    @JsonProperty("largeTubersFW_CSSP")
    var largeTubersFwCsSp: String? = null

    @JsonProperty("tuberNrNote_CSSPF")
    var tuberNrNoteCsSpf: String? = null

    @JsonProperty("smallTubersNr_CSSPF")
    var smallTubersNrCsSpf: String? = null

    @JsonProperty("largeTubersNr_CSSPF")
    var largeTubersNrCsSpf: String? = null

    @JsonProperty("tuberFWNote_CSSPF")
    var tuberFWNoteCsSpf: String? = null

    @JsonProperty("smallTubersFW_CSSPF")
    var smallTubersFwCsSpf: String? = null

    @JsonProperty("largeTubersFW_CSSPF")
    var largeTubersFwCsSpf: String? = null

    @JsonProperty("prefPlot_SP")
    var prefPlotSp: String? = null

    @JsonProperty("scoreNote_SP")
    var scoreNoteSp: String? = null

    @JsonProperty("costScore_SP")
    var costScoreSp: String? = null

    @JsonProperty("labourScore_SP")
    var labourScoreSp: String? = null

    @JsonProperty("yieldScore_SP")
    var yieldScoreSp: String? = null

    @JsonProperty("qualityScore_SP")
    var qualityScoreSp: String? = null

    @JsonProperty("revenueScore_SP")
    var revenueScoreSp: String? = null

    @JsonProperty("overallScore_SP")
    var overallScoreSp: String? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSi: String? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("tuberUnitWeight")
    var tuberUnitWeight: String? = null

    @JsonProperty("tuberUnitPrice")
    var tuberUnitPrice: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("dateCassavaHarvest")
    var dateCassavaHarvest: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CS")
    var tuberizedMarketableRootsNrCS: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CS")
    var tuberizedMarketableRootsFwCs: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CSSP")
    var tuberizedMarketableRootsNrCsSp: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CSSP")
    var tuberizedMarketableRootsFwCsSp: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CSSPF")
    var tuberizedMarketableRootsNrCsSpf: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CSSPF")
    var tuberizedMarketableRootsFwCsSpf: String? = null

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

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSi: String? = null

    @JsonProperty("rootsUnitName")
    var rootsUnitName: String? = null

    @JsonProperty("rootsUnitWeight")
    var rootsUnitWeight: String? = null

    @JsonProperty("rootsUnitPrice")
    var rootsUnitPrice: String? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: String? = null

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