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

    @Column(name = "yield_level")
    private val yieldLevel: String? = null

    @Column(name = "sweetpotato_variety_select")
    private val sweetpotatoVarietySelect: String? = null

    @Column(name = "sweetpotato_variety_other")
    private val sweetpotatoVarietyOther: String? = null

    @Column(name = "cassava_variety_select")
    private val cassavaVarietySelect: String? = null

    @Column(name = "cassava_variety_other")
    private val cassavaVarietyOther: String? = null

    @Column(name = "cassava_variety_type")
    private val cassavaVarietyType: String? = null

    @Column(name = "area_basis")
    private val areaBasis: String? = null

    @Column(name = "bag_size_npk")
    private val bagSizeNpk: String? = null

    @Column(name = "cost_npk")
    private val costNpk: String? = null

    @Column(name = "roots_unit")
    private val rootsUnit: String? = null

    @Column(name = "roots_price_si")
    private val rootsPriceSi: String? = null

    @Column(name = "roots_unit_name")
    private val rootsUnitName: String? = null

    @Column(name = "roots_unit_weight")
    private val rootsUnitWeight: String? = null

    @Column(name = "roots_unit_price")
    private val rootsUnitPrice: String? = null

    @Column(name = "roots_price")
    private val rootsPrice: String? = null

    @Column(name = "tuber_unit")
    private val tuberUnit: String? = null

    @Column(name = "tuber_price_si")
    private val tuberPriceSi: String? = null

    @Column(name = "tuber_unit_name")
    private val tuberUnitName: String? = null

    @Column(name = "tuber_unit_weight")
    private val tuberUnitWeight: String? = null

    @Column(name = "tuber_unit_price")
    private val tuberUnitPrice: String? = null

    @Column(name = "tuber_price")
    private val tuberPrice: String? = null

    @Column(name = "root_yield_mc")
    private val rootYieldMc: String? = null

    @Column(name = "tuber_yield_mc")
    private val tuberYieldMc: String? = null

    @Column(name = "root_yield_red_ic")
    private val rootYieldRedIc: String? = null

    @Column(name = "tuber_yield_red_ic")
    private val tuberYieldRedIc: String? = null

    @Column(name = "extra_root_yield_mcf")
    private val extraRootYieldMcf: String? = null

    @Column(name = "extra_tuber_yield_mcf")
    private val extraTuberYieldMcf: String? = null

    @Column(name = "root_grmc")
    private val rootGrmc: String? = null

    @Column(name = "root_gric")
    private val rootGric: String? = null

    @Column(name = "tuber_gric")
    private val tuberGric: String? = null

    @Column(name = "total_gric")
    private val totalGric: String? = null

    @Column(name = "extra_gric")
    private val extraGric: String? = null

    @Column(name = "importance_ic")
    private val importanceIc: String? = null

    @Column(name = "unit_price_npk_50kg")
    private val unitPriceNpk50kg: String? = null

    @Column(name = "cost_fertilizer")
    private val costFertilizer: String? = null

    @Column(name = "rate_fertilizer_ab_text")
    private val rateFertilizerAbText: String? = null

    @Column(name = "cost_fertilizer_ab")
    private val costFertilizerAb: String? = null

    @Column(name = "cost_fertilizer_ab_text")
    private val costFertilizerAbText: String? = null

    @Column(name = "risk_attitude")
    private val riskAttitude: String? = null

    @Column(name = "root_grmcf")
    private val rootGrmcf: String? = null

    @Column(name = "root_gricf")
    private val rootGricf: String? = null

    @Column(name = "tuber_gricf")
    private val tuberGricf: String? = null

    @Column(name = "total_gricf")
    private val totalGricf: String? = null

    @Column(name = "extra_grmcf")
    private val extraGrmcf: String? = null

    @Column(name = "extra_gricf")
    private val extraGricf: String? = null

    @Column(name = "rec_value")
    private val recValue: String? = null

    @Column(name = "extra_profit")
    private val extraProfit: String? = null

    @Column(name = "extra_profit_perc")
    private val extraProfitPerc: String? = null

    @Column(name = "rec_mc")
    private val recMc: String? = null

    @Column(name = "rec_ic")
    private val recIc: String? = null

    @Column(name = "rec_icf")
    private val recIcf: String? = null

    @Column(name = "validation_note")
    private val validationNote: String? = null

    @Column(name = "validation_plot1")
    private val validationPlot1: String? = null

    @Column(name = "validation_plot2")
    private val validationPlot2: String? = null

    @Column(name = "validation_plot3")
    private val validationPlot3: String? = null

    @Column(name = "validation_plot4")
    private val validationPlot4: String? = null

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