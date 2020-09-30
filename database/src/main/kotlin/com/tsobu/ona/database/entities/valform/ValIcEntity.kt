package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_ic")
class ValIcEntity : BaseEntity() {
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

    @Column(name = "countryselect")
    private val countryselect: String? = null

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

    @Column(name = "geo_pointaltitude")
    private val geoPointaltitude: String? = null

    @Column(name = "geo_point_accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "lat")
    private val lat: String? = null

    @Column(name = "lon")
    private val lon: String? = null

    @Column(name = "planting_date")
    private val plantingDate: String? = null

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "height_maize")
    private val heightMaize: String? = null

    @Column(name = "previous_maize_variety_select")
    private val previousMaizeVarietySelect: String? = null

    @Column(name = "previous_maize_variety_other")
    private val previousMaizeVarietyOther: String? = null

    @Column(name = "previous_maize_variety_duration")
    private val previousMaizeVarietyDuration: String? = null

    @Column(name = "maize_variety_select")
    private val maizeVarietySelect: String? = null

    @Column(name = "maize_variety_other")
    private val maizeVarietyOther: String? = null

    @Column(name = "maize_variety_duration")
    private val maizeVarietyDuration: String? = null

    @Column(name = "maize_variety")
    private val maizeVariety: String? = null

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

    @Column(name = "bag_size_urea")
    private val bagSizeUrea: String? = null

    @Column(name = "cost_urea")
    private val costUrea: String? = null

    @Column(name = "price_maize_cob_fresh_large")
    private val priceMaizeCobFreshLarge: String? = null

    @Column(name = "price_roots")
    private val priceRoots: String? = null

    @Column(name = "maize_grain")
    private val maizeGrain: String? = null

    @Column(name = "maize_grain_unit")
    private val maizeGrainUnit: String? = null

    @Column(name = "maize_grain_price_kg")
    private val maizeGrainPriceKg: String? = null

    @Column(name = "maize_grain_unit_name")
    private val maizeGrainUnitName: String? = null

    @Column(name = "maize_grain_unit_weight")
    private val maizeGrainUnitWeight: String? = null

    @Column(name = "maize_grain_unit_price")
    private val maizeGrainUnitPrice: String? = null

    @Column(name = "maize_grain_price")
    private val maizeGrainPrice: String? = null

    @Column(name = "number_extra_cobs_large")
    private val numberExtraCobsLarge: String? = null

    @Column(name = "value_extra_cobs_large")
    private val valueExtraCobsLarge: String? = null

    @Column(name = "quantity_extra_grain")
    private val quantityExtraGrain: String? = null

    @Column(name = "value_extra_grain")
    private val valueExtraGrain: String? = null

    @Column(name = "gross_extra_value")
    private val grossExtraValue: String? = null

    @Column(name = "unit_price_npk_50kg")
    private val unitPriceNpk50kg: String? = null

    @Column(name = "unit_price_urea_50kg")
    private val unitPriceUrea50kg: String? = null

    @Column(name = "cost_fertilizer")
    private val costFertilizer: String? = null

    @Column(name = "cost_fertilizer_area_basis")
    private val costFertilizerAreaBasis: String? = null

    @Column(name = "cost_fertilizer_area_basis_text")
    private val costFertilizerAreaBasisText: String? = null

    @Column(name = "risk_attitude")
    private val riskAttitude: String? = null

    @Column(name = "profit_extra")
    private val profitExtra: String? = null

    @Column(name = "risk_ratio2")
    private val riskRatio2: String? = null

    @Column(name = "number_extra_cobs_large_ab")
    private val numberExtraCobsLargeAb: String? = null

    @Column(name = "value_extra_cobs_large_ab")
    private val valueExtraCobsLargeAb: String? = null

    @Column(name = "quantity_extra_grain_ab")
    private val quantityExtraGrainAb: String? = null

    @Column(name = "value_extra_grain_ab")
    private val valueExtraGrainAb: String? = null

    @Column(name = "unit_price_npk_50kg_ab")
    private val unitPriceNpk50kgAb: String? = null

    @Column(name = "unit_price_urea_50kg_ab")
    private val unitPriceUrea50kgAb: String? = null

    @Column(name = "cost_fertilizer_ab")
    private val costFertilizerAb: String? = null

    @Column(name = "cost_fertilizer_ab_text")
    private val costFertilizerAbText: String? = null

    @Column(name = "profit_extra_ab")
    private val profitExtraAb: String? = null

    @Column(name = "profit_extra_ab_text")
    private val profitExtraAbText: String? = null

    @Column(name = "risk_ratio2_ab")
    private val riskRatio2Ab: String? = null

    @Column(name = "npk_ab")
    private val npkAb: String? = null

    @Column(name = "urea1_ab")
    private val urea1Ab: String? = null

    @Column(name = "urea2_ab")
    private val urea2Ab: String? = null

    @Column(name = "yield_loss_cassava_ab_text")
    private val yieldLossCassavaAbText: String? = null

    @Column(name = "value_loss_cassava_ab_text")
    private val valueLossCassavaAbText: String? = null

    @Column(name = "reason_hd")
    private val reasonHd: String? = null

    @Column(name = "plot_size")
    private val plotSize: String? = null

    @Column(name = "number_extra_cobs_large_plot")
    private val numberExtraCobsLargePlot: String? = null

    @Column(name = "price_extra_cobs_large_plot")
    private val priceExtraCobsLargePlot: String? = null

    @Column(name = "quantity_extra_grain_plot")
    private val quantityExtraGrainPlot: String? = null

    @Column(name = "value_extra_grain_plot")
    private val valueExtraGrainPlot: String? = null

    @Column(name = "cost_fertilizer_plot")
    private val costFertilizerPlot: String? = null

    @Column(name = "profit_extra_plot")
    private val profitExtraPlot: String? = null

    @Column(name = "profit_extra_plot_text")
    private val profitExtraPlotText: String? = null

    @Column(name = "npk_plot")
    private val npkPlot: String? = null

    @Column(name = "urea1_plot")
    private val urea1Plot: String? = null

    @Column(name = "urea2_plot")
    private val urea2Plot: String? = null

    @Column(name = "rec_col")
    private val recCol: String? = null

    @Column(name = "low_density_recommendation")
    private val lowDensityRecommendation: String? = null

    @Column(name = "blanket_recommendation")
    private val blanketRecommendation: String? = null

    @Column(name = "risk_note1")
    private val riskNote1: String? = null

    @Column(name = "risk_note2")
    private val riskNote2: String? = null

    @Column(name = "risk_note3")
    private val riskNote3: String? = null

    @Column(name = "profit_note1")
    private val profitNote1: String? = null

    @Column(name = "profit_note2")
    private val profitNote2: String? = null

    @Column(name = "profit_note3")
    private val profitNote3: String? = null

    @Column(name = "profit_note3_maize_grain")
    private val profitNote3MaizeGrain: String? = null

    @Column(name = "validation_note")
    private val validationNote: String? = null

    @Column(name = "validation_plot1")
    private val validationPlot1: String? = null

    @Column(name = "validation_plot1_note1")
    private val validationPlot1Note1: String? = null

    @Column(name = "validation_plot1_note2")
    private val validationPlot1Note2: String? = null

    @Column(name = "validation_plot1_note2_maize_grain")
    private val validationPlot1Note2MaizeGrain: String? = null

    @Column(name = "validation_plot2")
    private val validationPlot2: String? = null

    @Column(name = "validation_plot3")
    private val validationPlot3: String? = null

    @Column(name = "rec_note")
    private val recNote: String? = null

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