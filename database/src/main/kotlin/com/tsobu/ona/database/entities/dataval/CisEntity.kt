package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_cis")
class CisEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDate? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "subscriberid")
    var subscriberid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "event_value")
    var eventValue: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "loc_field")
    var locField: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "clearing")
    var clearing: String? = null

    @Column(name = "vegetation")
    var vegetation: String? = null

    @Column(name = "nr_tillage")
    var nrTillage: String? = null

    @Column(name = "nr_harrow")
    var nrHarrow: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "tillage_method1")
    var tillageMethod1: String? = null

    @Column(name = "tillage_method2")
    var tillageMethod2: String? = null

    @Column(name = "tillagemethod3")
    var tillagemethod3: String? = null

    @Column(name = "harrow_method1")
    var harrowMethod1: String? = null

    @Column(name = "harrow_method2")
    var harrowMethod2: String? = null

    @Column(name = "harrow_method3")
    var harrowMethod3: String? = null

    @Column(name = "same_day_planting")
    var sameDayPlanting: String? = null

    @Column(name = "planting_date")
    var plantingDate: String? = null

    @Column(name = "planting_date_cs")
    var plantingDateCs: String? = null

    @Column(name = "planting_date_sp")
    var plantingDateSp: String? = null

    @Column(name = "cassava_variety")
    var cassavaVariety: String? = null

    @Column(name = "sweet_potato_variety")
    var sweetPotatoVariety: String? = null

    @Column(name = "planting_density_csmc")
    var plantingDensityCsmc: String? = null

    @Column(name = "planting_density_csic")
    var plantingDensityCsic: String? = null

    @Column(name = "planting_density_spmc")
    var plantingDensitySpmc: String? = null

    @Column(name = "planting_density_spic")
    var plantingDensitySpic: String? = null

    @Column(name = "between_row_csmc")
    var betweenRowCsmc: String? = null

    @Column(name = "within_row_csmc")
    var withinRowCsmc: String? = null

    @Column(name = "between_row_csic")
    var betweenRowCsic: String? = null

    @Column(name = "within_row_csic")
    var withinRowCsic: String? = null

    @Column(name = "between_row_spmc")
    var betweenRowSpmc: String? = null

    @Column(name = "within_row_spmc")
    var withinRowSpmc: String? = null

    @Column(name = "between_row_spic")
    var betweenRowSpic: String? = null

    @Column(name = "within_row_spic")
    var withinRowSpic: String? = null

    @Column(name = "plot_w")
    var plotW: String? = null

    @Column(name = "plot_l")
    var plotL: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "fertilizer0")
    var fertilizer0: String? = null

    @Column(name = "date_fertilizer0")
    var dateFertilizer0: String? = null

    @Column(name = "sweet_potato_replanting")
    var sweetPotatoReplanting: String? = null

    @Column(name = "sweet_potato_replanting_date")
    var sweetPotatoReplantingDate: String? = null

    @Column(name = "sweet_potato_replantingtype")
    var sweetPotatoReplantingtype: String? = null

    @Column(name = "fertilizer1")
    var fertilizer1: String? = null

    @Column(name = "date_fertilizer1")
    var dateFertilizer1: String? = null

    @Column(name = "nr_rows")
    var nrRows: String? = null

    @Column(name = "sweet_potato_plant_stand_note_sp")
    var sweetPotatoPlantStandNoteSp: String? = null

    @Column(name = "nr_sweet_potato_plants1_sp")
    var nrSweetPotatoPlants1Sp: String? = null

    @Column(name = "nr_sweet_potato_plants2_sp")
    var nrSweetPotatoPlants2Sp: String? = null

    @Column(name = "nr_sweet_potato_plants3_sp")
    var nrSweetPotatoPlants3Sp: String? = null

    @Column(name = "nr_sweet_potato_plants4_sp")
    var nrSweetPotatoPlants4Sp: String? = null

    @Column(name = "nr_sweet_potato_plants5_sp")
    var nrSweetPotatoPlants5Sp: String? = null

    @Column(name = "nr_sweet_potato_plants6_sp")
    var nrSweetPotatoPlants6Sp: String? = null

    @Column(name = "nr_sweet_potato_plants7_sp")
    var nrSweetPotatoPlants7Sp: String? = null

    @Column(name = "nr_sweet_potato_plants8_sp")
    var nrSweetPotatoPlants8Sp: String? = null

    @Column(name = "nr_sweet_potato_plants9_sp")
    var nrSweetPotatoPlants9Sp: String? = null

    @Column(name = "nr_sweet_potato_plants10_sp")
    var nrSweetPotatoPlants10Sp: String? = null

    @Column(name = "sweet_potato_plant_stand_note_cssp")
    var sweetPotatoPlantStandNoteCssp: String? = null

    @Column(name = "nr_sweet_potato_plants1_cssp")
    var nrSweetPotatoPlants1Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants2_cssp")
    var nrSweetPotatoPlants2Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants3_cssp")
    var nrSweetPotatoPlants3Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants4_cssp")
    var nrSweetPotatoPlants4Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants5_cssp")
    var nrSweetPotatoPlants5Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants6_cssp")
    var nrSweetPotatoPlants6Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants7_cssp")
    var nrSweetPotatoPlants7Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants8_cssp")
    var nrSweetPotatoPlants8Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants9_cssp")
    var nrSweetPotatoPlants9Cssp: String? = null

    @Column(name = "nr_sweet_potato_plants10_cssp")
    var nrSweetPotatoPlants10Cssp: String? = null

    @Column(name = "sweet_potato_plant_stand_note_csspf")
    var sweetPotatoPlantStandNoteCsspf: String? = null

    @Column(name = "nr_sweet_potato_plants1_csspf")
    var nrSweetPotatoPlants1Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants2_csspf")
    var nrSweetPotatoPlants2Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants3_csspf")
    var nrSweetPotatoPlants3Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants4_csspf")
    var nrSweetPotatoPlants4Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants5_csspf")
    var nrSweetPotatoPlants5Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants6_csspf")
    var nrSweetPotatoPlants6Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants7_csspf")
    var nrSweetPotatoPlants7Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants8_csspf")
    var nrSweetPotatoPlants8Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants9_csspf")
    var nrSweetPotatoPlants9Csspf: String? = null

    @Column(name = "nr_sweet_potato_plants10_csspf")
    var nrSweetPotatoPlants10Csspf: String? = null

    @Column(name = "nr_cassava_plants_cs")
    var nrCassavaPlantsCs: String? = null

    @Column(name = "nr_cassava_plants_cssp")
    var nrCassavaPlantsCssp: String? = null

    @Column(name = "nr_cassava_plants_csspf")
    var nrCassavaPlantsCsspf: String? = null

    @Column(name = "cassava_gapping")
    var cassavaGapping: String? = null

    @Column(name = "cassava_gapping_date")
    var cassavaGappingDate: String? = null

    @Column(name = "cassava_gapping_type")
    var cassavaGappingType: String? = null

    @Column(name = "note_vigour_sp")
    var noteVigourSp: String? = null

    @Column(name = "score_vigour_sp")
    var scoreVigourSp: String? = null

    @Column(name = "score_cover_sp")
    var scoreCoverSp: String? = null

    @Column(name = "note_vigour_cssp")
    var noteVigourCssp: String? = null

    @Column(name = "score_vigour_cssp")
    var scoreVigourCssp: String? = null

    @Column(name = "score_cover_cssp")
    var scoreCoverCssp: String? = null

    @Column(name = "note_vigour_csspf")
    var noteVigourCsspf: String? = null

    @Column(name = "score_vigour_csspf")
    var scoreVigourCsspf: String? = null

    @Column(name = "score_cover_csspf")
    var scoreCoverCsspf: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: String? = null

    @Column(name = "date_weeding1")
    var dateWeeding1: String? = null

    @Column(name = "weeding_method1")
    var weedingMethod1: String? = null

    @Column(name = "date_weeding2")
    var dateWeeding2: String? = null

    @Column(name = "weeding_method2")
    var weedingMethod2: String? = null

    @Column(name = "date_weeding3")
    var dateWeeding3: String? = null

    @Column(name = "weeding_method3")
    var weedingMethod3: String? = null

    @Column(name = "date_weeding4")
    var dateWeeding4: String? = null

    @Column(name = "weeding_method4")
    var weedingMethod4: String? = null

    @Column(name = "date_weeding5")
    var dateWeeding5: String? = null

    @Column(name = "weeding_method5")
    var weedingMethod5: String? = null

    @Column(name = "date_weeding6")
    var dateWeeding6: String? = null

    @Column(name = "weeding_method6")
    var weedingMethod6: String? = null

    @Column(name = "date_weeding7")
    var dateWeeding7: String? = null

    @Column(name = "weeding_method7")
    var weedingMethod7: String? = null

    @Column(name = "date_weeding8")
    var dateWeeding8: String? = null

    @Column(name = "weeding_method8")
    var weedingMethod8: String? = null

    @Column(name = "date_weeding9")
    var dateWeeding9: String? = null

    @Column(name = "weeding_method9")
    var weedingMethod9: String? = null

    @Column(name = "date_weeding10")
    var dateWeeding10: String? = null

    @Column(name = "weeding_method10")
    var weedingMethod10: String? = null

    @Column(name = "rate_note")
    var rateNote: String? = null

    @Column(name = "rate_drought")
    var rateDrought: String? = null

    @Column(name = "rate_water_logging")
    var rateWaterLogging: String? = null

    @Column(name = "rate_lodging")
    var rateLodging: String? = null

    @Column(name = "rate_grazing")
    var rateGrazing: String? = null

    @Column(name = "rate_fire")
    var rateFire: String? = null

    @Column(name = "rate_pests_cassava")
    var ratePestsCassava: String? = null

    @Column(name = "rate_pests_sweet_potato")
    var ratePestsSweetPotato: String? = null

    @Column(name = "rate_weeds")
    var rateWeeds: String? = null

    @Column(name = "rate_cmd")
    var rateCmd: String? = null

    @Column(name = "rate_cbsd")
    var rateCbsd: String? = null

    @Column(name = "rate_other_disease")
    var rateOtherDisease: String? = null

    @Column(name = "rate_disease_sweet_potato")
    var rateDiseaseSweetPotato: String? = null

    @Column(name = "rate_theft_missing_sweet_potato")
    var rateTheftMissingSweetPotato: String? = null

    @Column(name = "rate_theft_missing_cassava")
    var rateTheftMissingCassava: String? = null

    @Column(name = "datesweet_potato_harvest")
    var datesweetPotatoHarvest: String? = null

    @Column(name = "tuber_nr_note_sp")
    var tuberNrNoteSp: String? = null

    @Column(name = "small_tubers_nr_sp")
    var smallTubersNrSp: String? = null

    @Column(name = "large_tubers_nr_sp")
    var largeTubersNrSp: String? = null

    @Column(name = "tuberfwnote_sp")
    var tuberfwnoteSp: String? = null

    @Column(name = "small_tubers_fw_sp")
    var smallTubersFwSp: String? = null

    @Column(name = "large_tubers_fw_sp")
    var largeTubersFwSp: String? = null

    @Column(name = "tuber_nr_note_cssp")
    var tuberNrNoteCssp: String? = null

    @Column(name = "small_tubers_nr_cssp")
    var smallTubersNrCssp: String? = null

    @Column(name = "large_tubers_nr_cssp")
    var largeTubersNrCssp: String? = null

    @Column(name = "tuber_fw_note_cssp")
    var tuberFwNoteCssp: String? = null

    @Column(name = "small_tubers_fw_cssp")
    var smallTubersFwCssp: String? = null

    @Column(name = "large_tubers_fw_cssp")
    var largeTubersFwCssp: String? = null

    @Column(name = "tuber_nr_note_csspf")
    var tuberNrNoteCsspf: String? = null

    @Column(name = "small_tubers_nr_csspf")
    var smallTubersNrCsspf: String? = null

    @Column(name = "large_tubers_nr_csspf")
    var largeTubersNrCsspf: String? = null

    @Column(name = "tuber_fw_note_csspf")
    var tuberFwNoteCsspf: String? = null

    @Column(name = "small_tubers_fw_csspf")
    var smallTubersFwCsspf: String? = null

    @Column(name = "large_tubers_fw_csspf")
    var largeTubersFwCsspf: String? = null

    @Column(name = "pref_plot_sp")
    var prefPlotSp: String? = null

    @Column(name = "score_note_sp")
    var scoreNoteSp: String? = null

    @Column(name = "cost_score_sp")
    var costScoreSp: String? = null

    @Column(name = "labour_score_sp")
    var labourScoreSp: String? = null

    @Column(name = "yield_score_sp")
    var yieldScoreSp: String? = null

    @Column(name = "quality_score_sp")
    var qualityScoreSp: String? = null

    @Column(name = "revenue_score_sp")
    var revenueScoreSp: String? = null

    @Column(name = "overall_score_sp")
    var overallScoreSp: String? = null

    @Column(name = "tuber_unit")
    var tuberUnit: String? = null

    @Column(name = "tuber_price_si")
    var tuberPriceSi: String? = null

    @Column(name = "tuber_unit_name")
    var tuberUnitName: String? = null

    @Column(name = "tuber_unit_weight")
    var tuberUnitWeight: String? = null

    @Column(name = "tuber_unit_price")
    var tuberUnitPrice: String? = null

    @Column(name = "tuber_price")
    var tuberPrice: String? = null

    @Column(name = "date_cassava_harvest")
    var dateCassavaHarvest: String? = null

    @Column(name = "tuberized_marketable_roots_nr_cs")
    var tuberizedMarketableRootsNrCs: String? = null

    @Column(name = "tuberized_marketable_roots_fw_cs")
    var tuberizedMarketableRootsFwCs: String? = null

    @Column(name = "tuberized_marketable_roots_nr_cssp")
    var tuberizedMarketableRootsNrCssp: String? = null

    @Column(name = "tuberized_marketable_roots_fw_cssp")
    var tuberizedMarketableRootsFwCssp: String? = null

    @Column(name = "tuberized_marketable_roots_nr_csspf")
    var tuberizedMarketableRootsNrCsspf: String? = null

    @Column(name = "tuberized_marketable_roots_fw_csspf")
    var tuberizedMarketableRootsFwCsspf: String? = null

    @Column(name = "pref_plot")
    var prefPlot: String? = null

    @Column(name = "score_note")
    var scoreNote: String? = null

    @Column(name = "cost_score")
    var costScore: String? = null

    @Column(name = "labour_score")
    var labourScore: String? = null

    @Column(name = "yield_score")
    var yieldScore: String? = null

    @Column(name = "quality_score")
    var qualityScore: String? = null

    @Column(name = "revenue_score")
    var revenueScore: String? = null

    @Column(name = "overall_score")
    var overallScore: String? = null

    @Column(name = "roots_unit")
    var rootsUnit: String? = null

    @Column(name = "roots_price_si")
    var rootsPriceSi: String? = null

    @Column(name = "roots_unit_name")
    var rootsUnitName: String? = null

    @Column(name = "roots_unit_weight")
    var rootsUnitWeight: String? = null

    @Column(name = "roots_unit_price")
    var rootsUnitPrice: String? = null

    @Column(name = "roots_price")
    var rootsPrice: String? = null

    @Column(name = "comment_value",columnDefinition = "TEXT")
    var commentValue: String? = null

    @Column(name = "thankyou")
    var thankyou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceID: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}