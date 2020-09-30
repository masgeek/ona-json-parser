package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_fr")
class ValFrEntity : BaseEntity() {
    @Column(name = "submission_date")
    private val submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    private val uuid: String? = null

    @Column(name = "start_date")
    private val startDate: LocalDateTime? = null

    @Column(name = "today_date")
    private val todayDate: LocalDate? = null

    @Column(name = "deviceid")
    private val deviceid: String? = null

    @Column(name = "subscriberid")
    private val subscriberid: String? = null

    @Column(name = "email")
    private val email: String? = null

    @Column(name = "username")
    private val username: String? = null

    @Column(name = "simserial")
    private val simserial: String? = null

    @Column(name = "phonenumber")
    private val phonenumber: String? = null

    @Column(name = "banner")
    private val banner: String? = null

    @Column(name = "intro")
    private val intro: String? = null

    @Column(name = "intro2")
    private val intro2: String? = null

    @Column(name = "purpose_val")
    private val purposeVal: String? = null

    @Column(name = "eaid")
    private val eaid: String? = null

    @Column(name = "hhid")
    private val hhid: String? = null

    @Column(name = "country_select")
    private val countrySelect: String? = null

    @Column(name = "country")
    private val country: String? = null

    @Column(name = "currency")
    private val currency: String? = null

    @Column(name = "conversion")
    private val conversion: String? = null

    @Column(name = "geo_point_latitude")
    private val geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    private val geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    private val geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "lat")
    private val lat: String? = null

    @Column(name = "lon")
    private val lon: String? = null

    @Column(name = "planting_date")
    private val plantingDate: LocalDate? = null

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "planting_week")
    private val plantingWeek: String? = null

    @Column(name = "area_basis")
    private val areaBasis: String? = null

    @Column(name = "fcy")
    private val fcy: String? = null

    @Column(name = "lookup_id")
    private val lookupId: String? = null

    @Column(name = "rate_urea")
    private val rateUrea: String? = null

    @Column(name = "rate_tsp")
    private val rateTsp: String? = null

    @Column(name = "rate_nafaka")
    private val rateNafaka: String? = null

    @Column(name = "rate_dap")
    private val rateDap: String? = null

    @Column(name = "rate_mop")
    private val rateMop: String? = null

    @Column(name = "rate_npk")
    private val rateNpk: String? = null

    @Column(name = "current_yield")
    private val currentYield: String? = null

    @Column(name = "target_yield")
    private val targetYield: String? = null

    @Column(name = "increase_yield")
    private val increaseYield: String? = null

    @Column(name = "net_rev")
    private val netRev: String? = null

    @Column(name = "total_cost")
    private val totalCost: String? = null

    @Column(name = "ridging")
    private val ridging: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "planting_density")
    private val plantingDensity: String? = null

    @Column(name = "between_row")
    private val betweenRow: String? = null

    @Column(name = "within_row")
    private val withinRow: String? = null

    @Column(name = "plot_length")
    private val plotLength: String? = null

    @Column(name = "plot_width")
    private val plotWidth: String? = null

    @Column(name = "plot_size")
    private val plotSize: String? = null

    @Column(name = "rate_urea_ab")
    private val rateUreaAb: String? = null

    @Column(name = "rate_tsp_ab")
    private val rateTspAb: String? = null

    @Column(name = "rate_nafaka_ab")
    private val rateNafakaAb: String? = null

    @Column(name = "rate_dap_ab")
    private val rateDapAb: String? = null

    @Column(name = "rate_mop_ab")
    private val rateMopAb: String? = null

    @Column(name = "rate_npk_ab")
    private val rateNpkAb: String? = null

    @Column(name = "increase_yield_ab")
    private val increaseYieldAb: String? = null

    @Column(name = "rec_value")
    private val recValue: String? = null

    @Column(name = "quantity_urea")
    private val quantityUrea: String? = null

    @Column(name = "quantity_tsp")
    private val quantityTsp: String? = null

    @Column(name = "quantity_nafaka")
    private val quantityNafaka: String? = null

    @Column(name = "quantity_dap")
    private val quantityDap: String? = null

    @Column(name = "quantity_mop")
    private val quantityMop: String? = null

    @Column(name = "quantity_npk")
    private val quantityNpk: String? = null

    @Column(name = "rate_urea_min")
    private val rateUreaMin: String? = null

    @Column(name = "rate_tsp_min")
    private val rateTspMin: String? = null

    @Column(name = "rate_nafaka_min")
    private val rateNafakaMin: String? = null

    @Column(name = "rate_dap_min")
    private val rateDapMin: String? = null

    @Column(name = "rate_mop_min")
    private val rateMopMin: String? = null

    @Column(name = "rate_npk_min")
    private val rateNpkMin: String? = null

    @Column(name = "quantity1_urea")
    private val quantity1Urea: String? = null

    @Column(name = "quantity2_urea")
    private val quantity2Urea: String? = null

    @Column(name = "quantity1_tsp")
    private val quantity1Tsp: String? = null

    @Column(name = "quantity2_tsp")
    private val quantity2Tsp: String? = null

    @Column(name = "quantity1_nafaka")
    private val quantity1Nafaka: String? = null

    @Column(name = "quantity2_nafaka")
    private val quantity2Nafaka: String? = null

    @Column(name = "quantity1_dap")
    private val quantity1Dap: String? = null

    @Column(name = "quantity2_dap")
    private val quantity2Dap: String? = null

    @Column(name = "quantity1_mop")
    private val quantity1Mop: String? = null

    @Column(name = "quantity2_mop")
    private val quantity2Mop: String? = null

    @Column(name = "quantity1_npk")
    private val quantity1Npk: String? = null

    @Column(name = "quantity2_npk")
    private val quantity2Npk: String? = null

    @Column(name = "split1")
    private val split1: String? = null

    @Column(name = "split2")
    private val split2: String? = null

    @Column(name = "increase_p")
    private val increaseP: String? = null

    @Column(name = "net_rev_loc_cur")
    private val netRevLocCur: String? = null

    @Column(name = "total_cost_loc_cur")
    private val totalCostLocCur: String? = null

    @Column(name = "net_rev_loc_cur_ab")
    private val netRevLocCurAb: String? = null

    @Column(name = "net_rev_loc_cur_ab_curr")
    private val netRevLocCurAbCurr: String? = null

    @Column(name = "total_cost_loc_cur_ab")
    private val totalCostLocCurAb: String? = null

    @Column(name = "total_cost_loc_cur_ab_curr")
    private val totalCostLocCurAbCurr: String? = null

    @Column(name = "net_rev_loc_cur_plot")
    private val netRevLocCurPlot: String? = null

    @Column(name = "net_rev_loc_cur_plot_curr")
    private val netRevLocCurPlotCurr: String? = null

    @Column(name = "total_cost_loc_cur_plot")
    private val totalCostLocCurPlot: String? = null

    @Column(name = "total_cost_loc_cur_plot_curr")
    private val totalCostLocCurPlotCurr: String? = null

    @Column(name = "no_recommendation_tz_note")
    private val noRecommendationTzNote: String? = null

    @Column(name = "no_recommendation_ng_note")
    private val noRecommendationNgNote: String? = null

    @Column(name = "no_fertilizer_note")
    private val noFertilizerNote: String? = null

    @Column(name = "rate_fertilizer_note")
    private val rateFertilizerNote: String? = null

    @Column(name = "rate_urea_note")
    private val rateUreaNote: String? = null

    @Column(name = "rate_tsp_note")
    private val rateTspNote: String? = null

    @Column(name = "rate_nafaka_note")
    private val rateNafakaNote: String? = null

    @Column(name = "rate_dap_note")
    private val rateDapNote: String? = null

    @Column(name = "rate_mop_note")
    private val rateMopNote: String? = null

    @Column(name = "rate_npk_note")
    private val rateNpkNote: String? = null

    @Column(name = "yield_note")
    private val yieldNote: String? = null

    @Column(name = "validation_note")
    private val validationNote: String? = null

    @Column(name = "not_note")
    private val notNote: String? = null

    @Column(name = "quantity_urea_note")
    private val quantityUreaNote: String? = null

    @Column(name = "quantity_tsp_note")
    private val quantityTspNote: String? = null

    @Column(name = "quantity_nafaka_note")
    private val quantityNafakaNote: String? = null

    @Column(name = "quantity_dap_note")
    private val quantityDapNote: String? = null

    @Column(name = "quantity_mop_note")
    private val quantityMopNote: String? = null

    @Column(name = "quantity_npk_note")
    private val quantityNpkNote: String? = null

    @Column(name = "production_note")
    private val productionNote: String? = null

    @Column(name = "production_hr_note")
    private val productionHrNote: String? = null

    @Column(name = "split1_note")
    private val split1Note: String? = null

    @Column(name = "quantity1_urea_note")
    private val quantity1UreaNote: String? = null

    @Column(name = "quantity1_tsp_note")
    private val quantity1TspNote: String? = null

    @Column(name = "quantity1_nafaka_note")
    private val quantity1NafakaNote: String? = null

    @Column(name = "quantity1_dap_note")
    private val quantity1DapNote: String? = null

    @Column(name = "quantity1_mop_note")
    private val quantity1MopNote: String? = null

    @Column(name = "quantity1_npk_note")
    private val quantity1NpkNote: String? = null

    @Column(name = "split2_note")
    private val split2Note: String? = null

    @Column(name = "quantity2_urea_note")
    private val quantity2UreaNote: String? = null

    @Column(name = "quantity2_tsp_note")
    private val quantity2TspNote: String? = null

    @Column(name = "quantity2_dap_note")
    private val quantity2DapNote: String? = null

    @Column(name = "quantity2_nafaka_note")
    private val quantity2NafakaNote: String? = null

    @Column(name = "quantity2_mop_note")
    private val quantity2MopNote: String? = null

    @Column(name = "quantity2_npk_note")
    private val quantity2NpkNote: String? = null

    @Column(name = "call_value")
    private val callValue: String? = null

    @Column(name = "confirm_val")
    private val confirmVal: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    private val instanceId: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null
}