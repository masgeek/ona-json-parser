package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_cis")
class ValCisEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDate? = null

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
    var plantingDate: LocalDate? = null

    @Column(name = "yield_level")
    var yieldLevel: String? = null

    @Column(name = "sweetpotato_variety_select")
    var sweetpotatoVarietySelect: String? = null

    @Column(name = "sweetpotato_variety_other")
    var sweetpotatoVarietyOther: String? = null

    @Column(name = "cassava_variety_select")
    var cassavaVarietySelect: String? = null

    @Column(name = "cassava_variety_other")
    var cassavaVarietyOther: String? = null

    @Column(name = "cassava_variety_type")
    var cassavaVarietyType: String? = null

    @Column(name = "area_basis")
    var areaBasis: String? = null

    @Column(name = "bag_size_npk")
    var bagSizeNpk: String? = null

    @Column(name = "cost_npk")
    var costNpk: String? = null

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

    @Column(name = "root_yield_mc")
    var rootYieldMc: String? = null

    @Column(name = "tuber_yield_mc")
    var tuberYieldMc: String? = null

    @Column(name = "root_yield_red_ic")
    var rootYieldRedIc: String? = null

    @Column(name = "tuber_yield_red_ic")
    var tuberYieldRedIc: String? = null

    @Column(name = "extra_root_yield_mcf")
    var extraRootYieldMcf: String? = null

    @Column(name = "extra_tuber_yield_mcf")
    var extraTuberYieldMcf: String? = null

    @Column(name = "root_grmc")
    var rootGrmc: String? = null

    @Column(name = "root_gric")
    var rootGric: String? = null

    @Column(name = "tuber_gric")
    var tuberGric: String? = null

    @Column(name = "total_gric")
    var totalGric: String? = null

    @Column(name = "extra_gric")
    var extraGric: String? = null

    @Column(name = "importance_ic")
    var importanceIc: String? = null

    @Column(name = "unit_price_npk_50kg")
    var unitPriceNpk50kg: String? = null

    @Column(name = "cost_fertilizer")
    var costFertilizer: String? = null

    @Column(name = "rate_fertilizer_ab_text")
    var rateFertilizerAbText: String? = null

    @Column(name = "cost_fertilizer_ab")
    var costFertilizerAb: String? = null

    @Column(name = "cost_fertilizer_ab_text")
    var costFertilizerAbText: String? = null

    @Column(name = "risk_attitude")
    var riskAttitude: String? = null

    @Column(name = "root_grmcf")
    var rootGrmcf: String? = null

    @Column(name = "root_gricf")
    var rootGricf: String? = null

    @Column(name = "tuber_gricf")
    var tuberGricf: String? = null

    @Column(name = "total_gricf")
    var totalGricf: String? = null

    @Column(name = "extra_grmcf")
    var extraGrmcf: String? = null

    @Column(name = "extra_gricf")
    var extraGricf: String? = null

    @Column(name = "rec")
    var rec: String? = null

    @Column(name = "extra_profit")
    var extraProfit: String? = null

    @Column(name = "extra_profit_perc")
    var extraProfitPerc: String? = null

    @Column(name = "rec_mc")
    var recMc: String? = null

    @Column(name = "rec_ic")
    var recIc: String? = null

    @Column(name = "rec_icf")
    var recIcf: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "validation_plot1")
    var validationPlot1: String? = null

    @Column(name = "validation_plot2")
    var validationPlot2: String? = null

    @Column(name = "validation_plot3")
    var validationPlot3: String? = null

    @Column(name = "validation_plot4")
    var validationPlot4: String? = null

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