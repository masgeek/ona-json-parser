package com.tsobu.ona.database.entities.`val`

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_fr")
class ValFrEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "subscriber_id")
    var subscriberId: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "intro2")
    var intro2: String? = null

    @Column(name = "purpose_val")
    var purposeVal: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "country_select")
    var countrySelect: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "lat")
    var lat: String? = null

    @Column(name = "lon")
    var lon: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "plantingweek")
    var plantingweek: String? = null

    @Column(name = "area_basis")
    var areaBasis: String? = null

    @Column(name = "fcy")
    var fcy: String? = null

    @Column(name = "lookup_id")
    var lookupId: String? = null

    @Column(name = "rate_urea")
    var rateUrea: String? = null

    @Column(name = "rate_tsp")
    var rateTsp: String? = null

    @Column(name = "rate_nafaka")
    var rateNafaka: String? = null

    @Column(name = "rate_dap")
    var rateDap: String? = null

    @Column(name = "rate_mop")
    var rateMop: String? = null

    @Column(name = "rate_npk")
    var rateNpk: String? = null

    @Column(name = "current_y")
    var currentY: String? = null

    @Column(name = "target_y")
    var targetY: String? = null

    @Column(name = "increase_y")
    var increaseY: String? = null

    @Column(name = "net_rev")
    var netRev: String? = null

    @Column(name = "total_cost")
    var totalCost: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "plotl")
    var plotl: String? = null

    @Column(name = "plotw")
    var plotw: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "rate_urea_ab")
    var rateUreaAb: String? = null

    @Column(name = "rate_tsp_ab")
    var rateTspAb: String? = null

    @Column(name = "rate_nafaka_ab")
    var rateNafakaAb: String? = null

    @Column(name = "rate_dap_ab")
    var rateDapAb: String? = null

    @Column(name = "rate_mop_ab")
    var rateMopAb: String? = null

    @Column(name = "rate_npk_ab")
    var rateNpkAb: String? = null

    @Column(name = "increase_y_ab")
    var increaseYAb: String? = null

    @Column(name = "rec")
    var rec: String? = null

    @Column(name = "quantity_urea")
    var quantityUrea: String? = null

    @Column(name = "quantity_tsp")
    var quantityTsp: String? = null

    @Column(name = "quantity_nafaka")
    var quantityNafaka: String? = null

    @Column(name = "quantity_dap")
    var quantityDap: String? = null

    @Column(name = "quantity_mop")
    var quantityMop: String? = null

    @Column(name = "quantity_npk")
    var quantityNpk: String? = null

    @Column(name = "rate_urea_min")
    var rateUreaMin: String? = null

    @Column(name = "rate_tsp_min")
    var rateTspMin: String? = null

    @Column(name = "rate_nafaka_min")
    var rateNafakaMin: String? = null

    @Column(name = "rate_dap_min")
    var rateDapMin: String? = null

    @Column(name = "rate_mop_min")
    var rateMopMin: String? = null

    @Column(name = "rate_npk_min")
    var rateNpkMin: String? = null

    @Column(name = "quantity1_urea")
    var quantity1Urea: String? = null

    @Column(name = "quantity2_urea")
    var quantity2Urea: String? = null

    @Column(name = "quantity1_tsp")
    var quantity1Tsp: String? = null

    @Column(name = "quantity2_tsp")
    var quantity2Tsp: String? = null

    @Column(name = "quantity1_nafaka")
    var quantity1Nafaka: String? = null

    @Column(name = "quantity2_nafaka")
    var quantity2Nafaka: String? = null

    @Column(name = "quantity1_dap")
    var quantity1Dap: String? = null

    @Column(name = "quantity2_dap")
    var quantity2Dap: String? = null

    @Column(name = "quantity1_mop")
    var quantity1Mop: String? = null

    @Column(name = "quantity2_mop")
    var quantity2Mop: String? = null

    @Column(name = "quantity1_npk")
    var quantity1Npk: String? = null

    @Column(name = "quantity2_npk")
    var quantity2Npk: String? = null

    @Column(name = "split1")
    var split1: String? = null

    @Column(name = "split2")
    var split2: String? = null

    @Column(name = "increase_p")
    var increaseP: String? = null

    @Column(name = "net_rev_loc_cur")
    var netRevLocCur: String? = null

    @Column(name = "total_cost_loc_cur")
    var totalCostLocCur: String? = null

    @Column(name = "net_rev_loc_cur_ab")
    var netRevLocCurAb: String? = null

    @Column(name = "net_rev_loc_cur_ab_curr")
    var netRevLocCurAbCurr: String? = null

    @Column(name = "total_cost_loc_cur_ab")
    var totalCostLocCurAb: String? = null

    @Column(name = "total_cost_loc_cur_ab_curr")
    var totalCostLocCurAbCurr: String? = null

    @Column(name = "net_rev_loc_cur_plot")
    var netRevLocCurPlot: String? = null

    @Column(name = "net_rev_loc_curplotcurr")
    var netRevLocCurplotcurr: String? = null

    @Column(name = "total_cost_loc_cur_plot")
    var totalCostLocCurPlot: String? = null

    @Column(name = "total_cost_loc_curplotcurr")
    var totalCostLocCurplotcurr: String? = null

    @Column(name = "no_recommendation_tz_note")
    var noRecommendationTzNote: String? = null

    @Column(name = "no_recommendation_ng_note")
    var noRecommendationNgNote: String? = null

    @Column(name = "no_fertilizer_note")
    var noFertilizerNote: String? = null

    @Column(name = "rate_fertilizer_note")
    var rateFertilizerNote: String? = null

    @Column(name = "rate_urea_note")
    var rateUreaNote: String? = null

    @Column(name = "rate_tsp_note")
    var rateTspNote: String? = null

    @Column(name = "rate_nafaka_note")
    var rateNafakaNote: String? = null

    @Column(name = "rate_dap_note")
    var rateDapNote: String? = null

    @Column(name = "rate_mop_note")
    var rateMopNote: String? = null

    @Column(name = "rate_npk_note")
    var rateNpkNote: String? = null

    @Column(name = "yield_note")
    var yieldNote: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "not_note")
    var notNote: String? = null

    @Column(name = "quantity_urea_note")
    var quantityUreaNote: String? = null

    @Column(name = "quantity_tsp_note")
    var quantityTspNote: String? = null

    @Column(name = "quantity_nafaka_note")
    var quantityNafakaNote: String? = null

    @Column(name = "quantity_dap_note")
    var quantityDapNote: String? = null

    @Column(name = "quantity_mop_note")
    var quantityMopNote: String? = null

    @Column(name = "quantity_npk_note")
    var quantityNpkNote: String? = null

    @Column(name = "production_note")
    var productionNote: String? = null

    @Column(name = "production_hr_note")
    var productionHrNote: String? = null

    @Column(name = "split1_note")
    var split1Note: String? = null

    @Column(name = "quantity1_urea_note")
    var quantity1UreaNote: String? = null

    @Column(name = "quantity1_tsp_note")
    var quantity1TspNote: String? = null

    @Column(name = "quantity1_nafaka_note")
    var quantity1NafakaNote: String? = null

    @Column(name = "quantity1_dap_note")
    var quantity1DapNote: String? = null

    @Column(name = "quantity1_mop_note")
    var quantity1MopNote: String? = null

    @Column(name = "quantity1_npk_note")
    var quantity1NpkNote: String? = null

    @Column(name = "split2_note")
    var split2Note: String? = null

    @Column(name = "quantity2_urea_note")
    var quantity2UreaNote: String? = null

    @Column(name = "quantity2_tsp_note")
    var quantity2TspNote: String? = null

    @Column(name = "quantity2_dap_note")
    var quantity2DapNote: String? = null

    @Column(name = "quantity2_nafaka_note")
    var quantity2NafakaNote: String? = null

    @Column(name = "quantity2_mop_note")
    var quantity2MopNote: String? = null

    @Column(name = "quantity2_npk_note")
    var quantity2NpkNote: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "confirm_val")
    var confirmVal: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}