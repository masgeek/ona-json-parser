package com.tsobu.ona.core.dto.json.fielddata

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "uuid",
    "start",
    "today",
    "deviceid",
    "subscriberid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "generated_note_name_11",
    "banner",
    "intro",
    "event",
    "generated_note_name_19",
    "EAID",
    "EAIDscan",
    "EAIDtext",
    "generated_note_name_25",
    "HHID",
    "HHIDscan",
    "HHIDtext",
    "country",
    "generated_note_name_32",
    "loc_field",
    "geopoint-Latitude",
    "geopoint-Longitude",
    "geopoint-Altitude",
    "geopoint-Accuracy",
    "generated_note_name_37",
    "previousFertilizerUse",
    "Fallow",
    "lastSeasonCrop",
    "cropResidue",
    "cropResiduePurpose",
    "drainage",
    "weedTypes",
    "weedControlMethods",
    "soilType",
    "commonDiseases",
    "generated_note_name_50",
    "plotW_CON",
    "plotL_CON",
    "plotW_SSR",
    "plotL_SSR",
    "plotW_Local",
    "plotL_Local",
    "plotSize_CON",
    "plotSize_SSR",
    "plotSize_Local",
    "generated_note_name_62",
    "nrTillage",
    "tillageForce",
    "typeTillage",
    "generated_note_name_68",
    "organicInputs",
    "organicInputTypes",
    "dateOrganicInputs",
    "organicInoutAmount",
    "generated_note_name_75",
    "plantingDate",
    "variety",
    "varietyName",
    "betweenRow",
    "withinRow",
    "generated_note_name_83",
    "dateFertilizer1",
    "fertilizer1_CON",
    "fertilizer1_SSR",
    "fertilizer1_Local",
    "generated_note_name_90",
    "generated_note_name_91",
    "nrPlants_Emerg_CON",
    "nrPlants_Emerg_SSR",
    "nrPlants_Emerg_Local",
    "nrPlants_Physio_CON",
    "nrPlants_Physio_SSR",
    "nrPlants_Physio_Local",
    "generated_note_name_100",
    "dateFertilizer2",
    "fertilizer2_CON",
    "fertilizer2_SSR",
    "fertilizer2_Local",
    "physiologicalMaturity_CON_count",
    "generated_note_name_107",
    "nrProductiveTillers_CON",
    "nrNotPriductiveTillers_CON",
    "plantheight_CON",
    "nrSpikletperSpike_CON",
    "physiologicalMaturity_SSR_count",
    "generated_note_name_114",
    "nrProductiveTillers_SSR",
    "nrNotPriductiveTillers_SSR",
    "plantheight_SSR",
    "nrSpikletperSpike_SSR",
    "physiologicalMaturity_Local_count",
    "generated_note_name_121",
    "nrProductiveTillers_Local",
    "nrNotPriductiveTillers_Local",
    "plantheight_Local",
    "nrSpikletperSpike_Local",
    "period",
    "nrWeeding",
    "generated_note_name_130",
    "dateWeeding1",
    "dateWeeding2",
    "dateWeeding3",
    "dateWeeding4",
    "nrSpraying",
    "generated_note_name_138",
    "dateSpraying1",
    "dateSpraying2",
    "dateSpraying3",
    "dateSpraying4",
    "generated_note_name_145",
    "rateNote",
    "rateDrought_CON",
    "rateWaterLogging_CON",
    "rateErosion_CON",
    "rateLodging_CON",
    "nutrientDeff_CON",
    "rateGrazing_CON",
    "rateFire_CON",
    "ratePests_CON",
    "rateWeeds_CON",
    "ratePLB_CON",
    "rateOtherDisease_CON",
    "rateTheftMissing_CON",
    "rateDrought_SSR",
    "rateWaterLogging_SSR",
    "rateErosion_SSR",
    "rateLodging_SSR",
    "nutrientDeff_SSR",
    "rateGrazing_SSR",
    "rateFire_SSR",
    "ratePests_SSR",
    "rateWeeds_SSR",
    "ratePLB_SSR",
    "rateOtherDisease_SSR",
    "rateTheftMissing_SSR",
    "rateDrought_Local",
    "rateWaterLogging_SSR_Local",
    "rateErosion_SSR_Local",
    "rateLodging_Local",
    "nutrientDeff_Local",
    "rateGrazing_Local",
    "rateFire_Local",
    "ratePests_Local",
    "rateWeeds_Local",
    "ratePLB_Local",
    "rateOtherDisease_Local",
    "rateTheftMissing_Local",
    "generated_note_name_189",
    "vigorNote",
    "vigor_CON",
    "vigor_SSR",
    "vigor_Local",
    "generated_note_name_196",
    "harvestDate_CON",
    "aboveGrBiomass_CON",
    "rateGrazing_CON1",
    "rateLodging_CON1",
    "rateTheftMissing_CON1",
    "rateOtherDisease_CON1",
    "ratePests_CON1",
    "aboveGrBiomass_SSR",
    "rateGrazing_SSR1",
    "rateLodging_SSR1",
    "rateTheftMissing_SSR1",
    "rateOtherDisease_SSR1",
    "ratePests_SSR1",
    "aboveGrBiomass_Local",
    "rateGrazing_Local1",
    "rateLodging_Local1",
    "rateTheftMissing_Local1",
    "rateOtherDisease_Local1",
    "ratePests_Local1",
    "generated_note_name_221",
    "grainFW_CON",
    "grainFW_SSR",
    "grainFW_Local",
    "moisture_CON",
    "moisture_SSR",
    "moisture_Local",
    "TSW_CON",
    "TSW_SSR",
    "TSW_Local",
    "harvestIndex_CON",
    "harvestIndex_SSR",
    "harvestIndex_Local",
    "thankyou",
    "end",
    "instanceID",
    "KEY"
)
class WheatDgDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

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

    @JsonProperty("generated_note_name_11")
    var generatedNoteName11: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("event")
    var event: String? = null

    @JsonProperty("generated_note_name_19")
    var generatedNoteName19: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("generated_note_name_25")
    var generatedNoteName25: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("HHIDscan")
    var hhidscan: String? = null

    @JsonProperty("HHIDtext")
    var hhidtext: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("generated_note_name_32")
    var generatedNoteName32: String? = null

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

    @JsonProperty("generated_note_name_37")
    var generatedNoteName37: String? = null

    @JsonProperty("previousFertilizerUse")
    var previousFertilizerUse: String? = null

    @JsonProperty("Fallow")
    var fallow: String? = null

    @JsonProperty("lastSeasonCrop")
    var lastSeasonCrop: String? = null

    @JsonProperty("cropResidue")
    var cropResidue: String? = null

    @JsonProperty("cropResiduePurpose")
    var cropResiduePurpose: String? = null

    @JsonProperty("drainage")
    var drainage: String? = null

    @JsonProperty("weedTypes")
    var weedTypes: String? = null

    @JsonProperty("weedControlMethods")
    var weedControlMethods: String? = null

    @JsonProperty("soilType")
    var soilType: String? = null

    @JsonProperty("commonDiseases")
    var commonDiseases: String? = null

    @JsonProperty("generated_note_name_50")
    var generatedNoteName50: String? = null

    @JsonProperty("plotW_CON")
    var plotWCon: String? = null

    @JsonProperty("plotL_CON")
    var plotLCon: String? = null

    @JsonProperty("plotW_SSR")
    var plotWSsr: String? = null

    @JsonProperty("plotL_SSR")
    var plotLSsr: String? = null

    @JsonProperty("plotW_Local")
    var plotWLocal: String? = null

    @JsonProperty("plotL_Local")
    var plotLLocal: String? = null

    @JsonProperty("plotSize_CON")
    var plotSizeCon: String? = null

    @JsonProperty("plotSize_SSR")
    var plotSizeSsr: String? = null

    @JsonProperty("plotSize_Local")
    var plotSizeLocal: String? = null

    @JsonProperty("generated_note_name_62")
    var generatedNoteName62: String? = null

    @JsonProperty("nrTillage")
    var nrTillage: String? = null

    @JsonProperty("tillageForce")
    var tillageForce: String? = null

    @JsonProperty("typeTillage")
    var typeTillage: String? = null

    @JsonProperty("generated_note_name_68")
    var generatedNoteName68: String? = null

    @JsonProperty("organicInputs")
    var organicInputs: String? = null

    @JsonProperty("organicInputTypes")
    var organicInputTypes: String? = null

    @JsonProperty("dateOrganicInputs")
    var dateOrganicInputs: String? = null

    @JsonProperty("organicInoutAmount")
    var organicInoutAmount: String? = null

    @JsonProperty("generated_note_name_75")
    var generatedNoteName75: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("varietyName")
    var varietyName: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: String? = null

    @JsonProperty("withinRow")
    var withinRow: String? = null

    @JsonProperty("generated_note_name_83")
    var generatedNoteName83: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("fertilizer1_CON")
    var fertilizer1Con: String? = null

    @JsonProperty("fertilizer1_SSR")
    var fertilizer1Ssr: String? = null

    @JsonProperty("fertilizer1_Local")
    var fertilizer1Local: String? = null

    @JsonProperty("generated_note_name_90")
    var generatedNoteName90: String? = null

    @JsonProperty("generated_note_name_91")
    var generatedNoteName91: String? = null

    @JsonProperty("nrPlants_Emerg_CON")
    var nrPlantsEmergCon: String? = null

    @JsonProperty("nrPlants_Emerg_SSR")
    var nrPlantsEmergSsr: String? = null

    @JsonProperty("nrPlants_Emerg_Local")
    var nrPlantsEmergLocal: String? = null

    @JsonProperty("nrPlants_Physio_CON")
    var nrPlantsPhysioCon: String? = null

    @JsonProperty("nrPlants_Physio_SSR")
    var nrPlantsPhysioSsr: String? = null

    @JsonProperty("nrPlants_Physio_Local")
    var nrPlantsPhysioLocal: String? = null

    @JsonProperty("generated_note_name_100")
    var generatedNoteName100: String? = null

    @JsonProperty("dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("fertilizer2_CON")
    var fertilizer2Con: String? = null

    @JsonProperty("fertilizer2_SSR")
    var fertilizer2Ssr: String? = null

    @JsonProperty("fertilizer2_Local")
    var fertilizer2Local: String? = null

    @JsonProperty("physiologicalMaturity_CON_count")
    var physiologicalMaturityCONCount: String? = null

    @JsonProperty("generated_note_name_107")
    var generatedNoteName107: String? = null

    @JsonProperty("nrProductiveTillers_CON")
    var nrProductiveTillersCon: String? = null

    @JsonProperty("nrNotPriductiveTillers_CON")
    var nrNotPriductiveTillersCon: String? = null

    @JsonProperty("plantheight_CON")
    var plantheightCon: String? = null

    @JsonProperty("nrSpikletperSpike_CON")
    var nrSpikletperSpikeCon: String? = null

    @JsonProperty("physiologicalMaturity_SSR_count")
    var physiologicalMaturitySSRCount: String? = null

    @JsonProperty("generated_note_name_114")
    var generatedNoteName114: String? = null

    @JsonProperty("nrProductiveTillers_SSR")
    var nrProductiveTillersSsr: String? = null

    @JsonProperty("nrNotPriductiveTillers_SSR")
    var nrNotPriductiveTillersSsr: String? = null

    @JsonProperty("plantheight_SSR")
    var plantheightSsr: String? = null

    @JsonProperty("nrSpikletperSpike_SSR")
    var nrSpikletperSpikeSsr: String? = null

    @JsonProperty("physiologicalMaturity_Local_count")
    var physiologicalMaturityLocalCount: String? = null

    @JsonProperty("generated_note_name_121")
    var generatedNoteName121: String? = null

    @JsonProperty("nrProductiveTillers_Local")
    var nrProductiveTillersLocal: String? = null

    @JsonProperty("nrNotPriductiveTillers_Local")
    var nrNotPriductiveTillersLocal: String? = null

    @JsonProperty("plantheight_Local")
    var plantheightLocal: String? = null

    @JsonProperty("nrSpikletperSpike_Local")
    var nrSpikletperSpikeLocal: String? = null

    @JsonProperty("period")
    var period: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("generated_note_name_130")
    var generatedNoteName130: String? = null

    @JsonProperty("dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("nrSpraying")
    var nrSpraying: String? = null

    @JsonProperty("generated_note_name_138")
    var generatedNoteName138: String? = null

    @JsonProperty("dateSpraying1")
    var dateSpraying1: String? = null

    @JsonProperty("dateSpraying2")
    var dateSpraying2: String? = null

    @JsonProperty("dateSpraying3")
    var dateSpraying3: String? = null

    @JsonProperty("dateSpraying4")
    var dateSpraying4: String? = null

    @JsonProperty("generated_note_name_145")
    var generatedNoteName145: String? = null

    @JsonProperty("rateNote")
    var rateNote: String? = null

    @JsonProperty("rateDrought_CON")
    var rateDroughtCon: String? = null

    @JsonProperty("rateWaterLogging_CON")
    var rateWaterLoggingCon: String? = null

    @JsonProperty("rateErosion_CON")
    var rateErosionCon: String? = null

    @JsonProperty("rateLodging_CON")
    var rateLodgingCon: String? = null

    @JsonProperty("nutrientDeff_CON")
    var nutrientDeffCon: String? = null

    @JsonProperty("rateGrazing_CON")
    var rateGrazingCon: String? = null

    @JsonProperty("rateFire_CON")
    var rateFireCon: String? = null

    @JsonProperty("ratePests_CON")
    var ratePestsCon: String? = null

    @JsonProperty("rateWeeds_CON")
    var rateWeedsCon: String? = null

    @JsonProperty("ratePLB_CON")
    var ratePlbCon: String? = null

    @JsonProperty("rateOtherDisease_CON")
    var rateOtherDiseaseCon: String? = null

    @JsonProperty("rateTheftMissing_CON")
    var rateTheftMissingCon: String? = null

    @JsonProperty("rateDrought_SSR")
    var rateDroughtSsr: String? = null

    @JsonProperty("rateWaterLogging_SSR")
    var rateWaterLoggingSsr: String? = null

    @JsonProperty("rateErosion_SSR")
    var rateErosionSsr: String? = null

    @JsonProperty("rateLodging_SSR")
    var rateLodgingSsr: String? = null

    @JsonProperty("nutrientDeff_SSR")
    var nutrientDeffSsr: String? = null

    @JsonProperty("rateGrazing_SSR")
    var rateGrazingSsr: String? = null

    @JsonProperty("rateFire_SSR")
    var rateFireSsr: String? = null

    @JsonProperty("ratePests_SSR")
    var ratePestsSsr: String? = null

    @JsonProperty("rateWeeds_SSR")
    var rateWeedsSsr: String? = null

    @JsonProperty("ratePLB_SSR")
    var ratePLBSsr: String? = null

    @JsonProperty("rateOtherDisease_SSR")
    var rateOtherDiseaseSsr: String? = null

    @JsonProperty("rateTheftMissing_SSR")
    var rateTheftMissingSsr: String? = null

    @JsonProperty("rateDrought_Local")
    var rateDroughtLocal: String? = null

    @JsonProperty("rateWaterLogging_SSR_Local")
    var rateWaterLoggingSSRLocal: String? = null

    @JsonProperty("rateErosion_SSR_Local")
    var rateErosionSSRLocal: String? = null

    @JsonProperty("rateLodging_Local")
    var rateLodgingLocal: String? = null

    @JsonProperty("nutrientDeff_Local")
    var nutrientDeffLocal: String? = null

    @JsonProperty("rateGrazing_Local")
    var rateGrazingLocal: String? = null

    @JsonProperty("rateFire_Local")
    var rateFireLocal: String? = null

    @JsonProperty("ratePests_Local")
    var ratePestsLocal: String? = null

    @JsonProperty("rateWeeds_Local")
    var rateWeedsLocal: String? = null

    @JsonProperty("ratePLB_Local")
    var ratePLBLocal: String? = null

    @JsonProperty("rateOtherDisease_Local")
    var rateOtherDiseaseLocal: String? = null

    @JsonProperty("rateTheftMissing_Local")
    var rateTheftMissingLocal: String? = null

    @JsonProperty("generated_note_name_189")
    var generatedNoteName189: String? = null

    @JsonProperty("vigorNote")
    var vigorNote: String? = null

    @JsonProperty("vigor_CON")
    var vigorCon: String? = null

    @JsonProperty("vigor_SSR")
    var vigorSsr: String? = null

    @JsonProperty("vigor_Local")
    var vigorLocal: String? = null

    @JsonProperty("generated_note_name_196")
    var generatedNoteName196: String? = null

    @JsonProperty("harvestDate_CON")
    var harvestDateCon: String? = null

    @JsonProperty("aboveGrBiomass_CON")
    var aboveGrBiomassCon: String? = null

    @JsonProperty("rateGrazing_CON1")
    var rateGrazingCon1: String? = null

    @JsonProperty("rateLodging_CON1")
    var rateLodgingCon1: String? = null

    @JsonProperty("rateTheftMissing_CON1")
    var rateTheftMissingCon1: String? = null

    @JsonProperty("rateOtherDisease_CON1")
    var rateOtherDiseaseCon1: String? = null

    @JsonProperty("ratePests_CON1")
    var ratePestsCon1: String? = null

    @JsonProperty("aboveGrBiomass_SSR")
    var aboveGrBiomassSsr: String? = null

    @JsonProperty("rateGrazing_SSR1")
    var rateGrazingSsr1: String? = null

    @JsonProperty("rateLodging_SSR1")
    var rateLodgingSsr1: String? = null

    @JsonProperty("rateTheftMissing_SSR1")
    var rateTheftMissingSsr1: String? = null

    @JsonProperty("rateOtherDisease_SSR1")
    var rateOtherDiseaseSsr1: String? = null

    @JsonProperty("ratePests_SSR1")
    var ratePestsSsr1: String? = null

    @JsonProperty("aboveGrBiomass_Local")
    var aboveGrBiomassLocal: String? = null

    @JsonProperty("rateGrazing_Local1")
    var rateGrazingLocal1: String? = null

    @JsonProperty("rateLodging_Local1")
    var rateLodgingLocal1: String? = null

    @JsonProperty("rateTheftMissing_Local1")
    var rateTheftMissingLocal1: String? = null

    @JsonProperty("rateOtherDisease_Local1")
    var rateOtherDiseaseLocal1: String? = null

    @JsonProperty("ratePests_Local1")
    var ratePestsLocal1: String? = null

    @JsonProperty("generated_note_name_221")
    var generatedNoteName221: String? = null

    @JsonProperty("grainFW_CON")
    var grainFwCon: String? = null

    @JsonProperty("grainFW_SSR")
    var grainFwSsr: String? = null

    @JsonProperty("grainFW_Local")
    var grainFwLocal: String? = null

    @JsonProperty("moisture_CON")
    var moistureCon: String? = null

    @JsonProperty("moisture_SSR")
    var moistureSsr: String? = null

    @JsonProperty("moisture_Local")
    var moistureLocal: String? = null

    @JsonProperty("TSW_CON")
    var tswCon: String? = null

    @JsonProperty("TSW_SSR")
    var tswSsr: String? = null

    @JsonProperty("TSW_Local")
    var tswLocal: String? = null

    @JsonProperty("harvestIndex_CON")
    var harvestIndexCon: String? = null

    @JsonProperty("harvestIndex_SSR")
    var harvestIndexSsr: String? = null

    @JsonProperty("harvestIndex_Local")
    var harvestIndexLocal: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}