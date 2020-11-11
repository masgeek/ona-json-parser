package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_ic")
class IcEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

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

    @Column(name = "event")
    var purposeEvent: String? = null

    @Column(name = "maize_variety_select")
    var maizeVarietySelect: String? = null

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

    @Column(name = "tillage_method3")
    var tillageMethod3: String? = null

    @Column(name = "harrow_method1")
    var harrowMethod1: String? = null

    @Column(name = "harrow_method2")
    var harrowMethod2: String? = null

    @Column(name = "harrow_method3")
    var harrowMethod3: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "cassava_variety")
    var cassavaVariety: String? = null

    @Column(name = "maize_variety")
    var maizeVariety: String? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "plot_w")
    var plotW: String? = null

    @Column(name = "plot_l")
    var plotL: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "plot_dim_f1")
    var plotDimF1: String? = null

    @Column(name = "plot_l1_f1")
    var plotL1F1: String? = null

    @Column(name = "plot_w1_f1")
    var plotW1F1: String? = null

    @Column(name = "plot_l2_f1")
    var plotL2F1: String? = null

    @Column(name = "plot_w2_f1")
    var plotW2F1: String? = null

    @Column(name = "plot_dim_lm")
    var plotDimLm: String? = null

    @Column(name = "plot_l1_lm")
    var plotL1Lm: String? = null

    @Column(name = "plot_w1_lm")
    var plotW1Lm: String? = null

    @Column(name = "plot_l2_lm")
    var plotL2Lm: String? = null

    @Column(name = "plot_w2_lm")
    var plotW2Lm: String? = null

    @Column(name = "plot_dim_d")
    var plotDimD: String? = null

    @Column(name = "plot_l1_d")
    var plotL1D: String? = null

    @Column(name = "plot_w1_d")
    var plotW1D: String? = null

    @Column(name = "plot_l2_d")
    var plotL2D: String? = null

    @Column(name = "plot_w2_d")
    var plotW2D: String? = null

    @Column(name = "fertilizer0")
    var fertilizer0: String? = null

    @Column(name = "date_fertilizer0")
    var dateFertilizer0: String? = null

    @Column(name = "maize_reseeding")
    var maizeReseeding: String? = null

    @Column(name = "maize_reseeding_date")
    var maizeReseedingDate: String? = null

    @Column(name = "maize_thinning")
    var maizeThinning: String? = null

    @Column(name = "maize_thinning_date")
    var maizeThinningDate: String? = null

    @Column(name = "fertilizer1")
    var fertilizer1: String? = null

    @Column(name = "date_fertilizer1")
    var dateFertilizer1: String? = null

    @Column(name = "nr_rows")
    var nrRows: String? = null

    @Column(name = "maize_plant_stand_note_f1")
    var maizePlantStandNoteF1: String? = null

    @Column(name = "nr_maize_plants1_f1")
    var nrMaizePlants1F1: String? = null

    @Column(name = "nr_maize_plants2_f1")
    var nrMaizePlants2F1: String? = null

    @Column(name = "nr_maize_plants3_f1")
    var nrMaizePlants3F1: String? = null

    @Column(name = "nr_maize_plants4_f1")
    var nrMaizePlants4F1: String? = null

    @Column(name = "nr_maize_plants5_f1")
    var nrMaizePlants5F1: String? = null

    @Column(name = "nr_maize_plants6_f1")
    var nrMaizePlants6F1: String? = null

    @Column(name = "nr_maize_plants7_f1")
    var nrMaizePlants7F1: String? = null

    @Column(name = "nr_maize_plants8_f1")
    var nrMaizePlants8F1: String? = null

    @Column(name = "nr_maize_plants9_f1")
    var nrMaizePlants9F1: String? = null

    @Column(name = "nr_maize_plants10_f1")
    var nrMaizePlants10F1: String? = null

    @Column(name = "maize_plant_stand_note_lm")
    var maizePlantStandNoteLm: String? = null

    @Column(name = "nr_maize_plants1_lm")
    var nrMaizePlants1Lm: String? = null

    @Column(name = "nr_maize_plants2_lm")
    var nrMaizePlants2Lm: String? = null

    @Column(name = "nr_maize_plants3_lm")
    var nrMaizePlants3Lm: String? = null

    @Column(name = "nr_maize_plants4_lm")
    var nrMaizePlants4Lm: String? = null

    @Column(name = "nr_maize_plants5_lm")
    var nrMaizePlants5Lm: String? = null

    @Column(name = "nr_maize_plants6_lm")
    var nrMaizePlants6Lm: String? = null

    @Column(name = "nr_maize_plants7_lm")
    var nrMaizePlants7Lm: String? = null

    @Column(name = "nr_maize_plants8_lm")
    var nrMaizePlants8Lm: String? = null

    @Column(name = "nr_maize_plants9_lm")
    var nrMaizePlants9Lm: String? = null

    @Column(name = "nr_maize_plants10_lm")
    var nrMaizePlants10Lm: String? = null

    @Column(name = "maize_plant_stand_note_d")
    var maizePlantStandNoteD: String? = null

    @Column(name = "nr_maize_plants1_d")
    var nrMaizePlants1D: String? = null

    @Column(name = "nr_maize_plants2_d")
    var nrMaizePlants2D: String? = null

    @Column(name = "nr_maize_plants3_d")
    var nrMaizePlants3D: String? = null

    @Column(name = "nr_maize_plants4_d")
    var nrMaizePlants4D: String? = null

    @Column(name = "nr_maize_plants5_d")
    var nrMaizePlants5D: String? = null

    @Column(name = "nr_maize_plants6_d")
    var nrMaizePlants6D: String? = null

    @Column(name = "nr_maize_plants7_d")
    var nrMaizePlants7D: String? = null

    @Column(name = "nr_maize_plants8_d")
    var nrMaizePlants8D: String? = null

    @Column(name = "nr_maize_plants9_d")
    var nrMaizePlants9D: String? = null

    @Column(name = "nr_maize_plants10_d")
    var nrMaizePlants10D: String? = null

    @Column(name = "nr_cassava_plants_f1")
    var nrCassavaPlantsF1: String? = null

    @Column(name = "nr_cassava_plants_lm")
    var nrCassavaPlantsLm: String? = null

    @Column(name = "nr_cassava_plants_d")
    var nrCassavaPlantsD: String? = null

    @Column(name = "cassava_gapping")
    var cassavaGapping: String? = null

    @Column(name = "cassava_gapping_date")
    var cassavaGappingDate: String? = null

    @Column(name = "cassava_gapping_type")
    var cassavaGappingType: String? = null

    @Column(name = "fertilizer2")
    var fertilizer2: String? = null

    @Column(name = "date_fertilizer2")
    var dateFertilizer2: String? = null

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

    @Column(name = "rate_pests_maize")
    var ratePestsMaize: String? = null

    @Column(name = "rate_weeds")
    var rateWeeds: String? = null

    @Column(name = "rate_cmd")
    var rateCmd: String? = null

    @Column(name = "rate_cbsd")
    var rateCbsd: String? = null

    @Column(name = "rate_other_disease")
    var rateOtherDisease: String? = null

    @Column(name = "rate_disease_maize")
    var rateDiseaseMaize: String? = null

    @Column(name = "rate_theft_missing_maize")
    var rateTheftMissingMaize: String? = null

    @Column(name = "rate_theft_missing_cassava")
    var rateTheftMissingCassava: String? = null

    @Column(name = "date_maize_harvest")
    var dateMaizeHarvest: String? = null

    @Column(name = "cobs_dried")
    var cobsDried: String? = null

    @Column(name = "cob_nr_note_f1")
    var cobNrNoteF1: String? = null

    @Column(name = "small_fresh_cobs_nr_f1")
    var smallFreshCobsNrF1: String? = null

    @Column(name = "medium_fresh_cobs_nr_f1")
    var mediumFreshCobsNrF1: String? = null

    @Column(name = "large_fresh_cobs_nr_f1")
    var largeFreshCobsNrF1: String? = null

    @Column(name = "missing_fresh_cobs_nr_f1")
    var missingFreshCobsNrF1: String? = null

    @Column(name = "unfit_sale_fresh_cobs_nr_f1")
    var unfitSaleFreshCobsNrF1: String? = null

    @Column(name = "cob_fw_note_f1")
    var cobFwNoteF1: String? = null

    @Column(name = "small_fresh_cobs_fw_f1")
    var smallFreshCobsFwF1: String? = null

    @Column(name = "medium_fresh_cobs_fw_f1")
    var mediumFreshCobsFwF1: String? = null

    @Column(name = "large_fresh_cobs_fw_f1")
    var largeFreshCobsFwF1: String? = null

    @Column(name = "cob_nr_note_lm")
    var cobNrNoteLm: String? = null

    @Column(name = "small_fresh_cobs_nr_lm")
    var smallFreshCobsNrLm: String? = null

    @Column(name = "medium_fresh_cobs_nr_lm")
    var mediumFreshCobsNrLm: String? = null

    @Column(name = "large_fresh_cobs_nr_lm")
    var largeFreshCobsNrLm: String? = null

    @Column(name = "missing_fresh_cobs_nr_lm")
    var missingFreshCobsNrLm: String? = null

    @Column(name = "unfit_sale_fresh_cobs_nr_lm")
    var unfitSaleFreshCobsNrLm: String? = null

    @Column(name = "cob_fw_note_lm")
    var cobFwNoteLm: String? = null

    @Column(name = "small_fresh_cobs_fw_lm")
    var smallFreshCobsFwLm: String? = null

    @Column(name = "medium_fresh_cobs_fw_lm")
    var mediumFreshCobsFwLm: String? = null

    @Column(name = "large_fresh_cobs_fw_lm")
    var largeFreshCobsFwLm: String? = null

    @Column(name = "cob_nr_note_d")
    var cobNrNoteD: String? = null

    @Column(name = "small_fresh_cobs_nr_d")
    var smallFreshCobsNrD: String? = null

    @Column(name = "medium_fresh_cobs_nr_d")
    var mediumFreshCobsNrD: String? = null

    @Column(name = "large_fresh_cobs_nr_d")
    var largeFreshCobsNrD: String? = null

    @Column(name = "missing_fresh_cobs_nr_d")
    var missingFreshCobsNrD: String? = null

    @Column(name = "unfit_sale_fresh_cobs_nr_d")
    var unfitSaleFreshCobsNrD: String? = null

    @Column(name = "cob_fw_note_d")
    var cobFwNoteD: String? = null

    @Column(name = "small_fresh_cobs_fw_d")
    var smallFreshCobsFwD: String? = null

    @Column(name = "medium_fresh_cobs_fw_d")
    var mediumFreshCobsFwD: String? = null

    @Column(name = "large_fresh_cobs_fw_d")
    var largeFreshCobsFwD: String? = null

    @Column(name = "pref_plot_maize")
    var prefPlotMaize: String? = null

    @Column(name = "score_note_maize")
    var scoreNoteMaize: String? = null

    @Column(name = "cost_score_maize")
    var costScoreMaize: String? = null

    @Column(name = "labour_score_maize")
    var labourScoreMaize: String? = null

    @Column(name = "yield_score_maize")
    var yieldScoreMaize: String? = null

    @Column(name = "quality_score_maize")
    var qualityScoreMaize: String? = null

    @Column(name = "revenue_score_maize")
    var revenueScoreMaize: String? = null

    @Column(name = "overall_score_maize")
    var overallScoreMaize: String? = null

    @Column(name = "price_maize_cob_fresh_large")
    var priceMaizeCobFreshLarge: String? = null

    @Column(name = "maize_grain")
    var maizeGrain: String? = null

    @Column(name = "maize_grain_unit")
    var maizeGrainUnit: String? = null

    @Column(name = "maize_grain_price_kg")
    var maizeGrainPriceKg: String? = null

    @Column(name = "maize_grain_unit_name")
    var maizeGrainUnitName: String? = null

    @Column(name = "maize_grain_unit_weight")
    var maizeGrainUnitWeight: String? = null

    @Column(name = "maize_grain_unit_price")
    var maizeGrainUnitPrice: String? = null

    @Column(name = "maize_grain_price")
    var maizeGrainPrice: String? = null

    @Column(name = "date_cassava_harvest")
    var dateCassavaHarvest: String? = null

    @Column(name = "tuberized_marketable_roots_nr_f1")
    var tuberizedMarketableRootsNrF1: String? = null

    @Column(name = "tuberized_marketable_roots_fw_f1")
    var tuberizedMarketableRootsFwF1: String? = null

    @Column(name = "tuberized_marketable_roots_nr_lm")
    var tuberizedMarketableRootsNrLm: String? = null

    @Column(name = "tuberized_marketable_roots_fw_lm")
    var tuberizedMarketableRootsFwLm: String? = null

    @Column(name = "tuberized_marketable_roots_nr_d")
    var tuberizedMarketableRootsNrD: String? = null

    @Column(name = "tuberized_marketable_roots_fw_d")
    var tuberizedMarketableRootsFwD: String? = null

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

    @Column(name = "price_roots")
    var priceRoots: String? = null

    @Column(name = "comment_value", columnDefinition = "TEXT")
    var commentValue: String? = null

    @Column(name = "thank_you")
    var thankYou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instanceid")
    var instanceiD: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}