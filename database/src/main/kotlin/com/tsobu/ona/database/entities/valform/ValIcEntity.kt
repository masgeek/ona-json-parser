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

    @Column(name = "season")
    var season: String? = null

    @Column(name = "heightmaize")
    var heightmaize: String? = null

    @Column(name = "previous_maize_variety_select")
    var previousMaizeVarietySelect: String? = null

    @Column(name = "previous_maize_variety_other")
    var previousMaizeVarietyOther: String? = null

    @Column(name = "previous_maize_variety_duration")
    var previousMaizeVarietyDuration: String? = null

    @Column(name = "maize_variety_select")
    var maizeVarietySelect: String? = null

    @Column(name = "maize_variety_other")
    var maizeVarietyOther: String? = null

    @Column(name = "maize_variety_duration")
    var maizeVarietyDuration: String? = null

    @Column(name = "maize_variety")
    var maizeVariety: String? = null

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

    @Column(name = "bag_size_urea")
    var bagSizeUrea: String? = null

    @Column(name = "cost_urea")
    var costUrea: String? = null

    @Column(name = "price_maize_cob_fresh_large")
    var priceMaizeCobFreshLarge: String? = null

    @Column(name = "price_roots")
    var priceRoots: String? = null

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

    @Column(name = "number_extra_cobs_large")
    var numberExtraCobsLarge: String? = null

    @Column(name = "value_extra_cobs_large")
    var valueExtraCobsLarge: String? = null

    @Column(name = "quantity_extra_grain")
    var quantityExtraGrain: String? = null

    @Column(name = "value_extra_grain")
    var valueExtraGrain: String? = null

    @Column(name = "grossextra_value")
    var grossextraValue: String? = null

    @Column(name = "unit_price_npk_50kg")
    var unitPriceNpk50kg: String? = null

    @Column(name = "unit_price_urea_50kg")
    var unitPriceUrea50kg: String? = null

    @Column(name = "cost_fertilizer")
    var costFertilizer: String? = null

    @Column(name = "cost_fertilizer_area_basis")
    var costFertilizerAreaBasis: String? = null

    @Column(name = "cost_fertilizer_area_basis_text")
    var costFertilizerAreaBasisText: String? = null

    @Column(name = "risk_attitude")
    var riskAttitude: String? = null

    @Column(name = "profit_extra")
    var profitExtra: String? = null

    @Column(name = "risk_ratio2")
    var riskRatio2: String? = null

    @Column(name = "number_extra_cobs_large_ab")
    var numberExtraCobsLargeAb: String? = null

    @Column(name = "value_extra_cobs_large_ab")
    var valueExtraCobsLargeAb: String? = null

    @Column(name = "quantity_extra_grain_ab")
    var quantityExtraGrainAb: String? = null

    @Column(name = "value_extra_grain_ab")
    var valueExtraGrainAb: String? = null

    @Column(name = "unit_price_npk_50kg_ab")
    var unitPriceNpk50kgAb: String? = null

    @Column(name = "unit_price_urea_50kg_ab")
    var unitPriceUrea50kgAb: String? = null

    @Column(name = "cost_fertilizer_ab")
    var costFertilizerAb: String? = null

    @Column(name = "cost_fertilizer_ab_text")
    var costFertilizerAbText: String? = null

    @Column(name = "profit_extra_ab")
    var profitExtraAb: String? = null

    @Column(name = "profit_extra_ab_text")
    var profitExtraAbText: String? = null

    @Column(name = "risk_ratio2_ab")
    var riskRatio2Ab: String? = null

    @Column(name = "npk_ab")
    var npkAb: String? = null

    @Column(name = "urea1_ab")
    var urea1Ab: String? = null

    @Column(name = "urea2_ab")
    var urea2Ab: String? = null

    @Column(name = "yieldloss_cassava_ab_text")
    var yieldlossCassavaAbText: String? = null

    @Column(name = "valueloss_cassava_ab_text")
    var valuelossCassavaAbText: String? = null

    @Column(name = "reasonhd")
    var reasonhd: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "number_extra_cobs_large_plot")
    var numberExtraCobsLargePlot: String? = null

    @Column(name = "price_extra_cobs_large_plot")
    var priceExtraCobsLargePlot: String? = null

    @Column(name = "quantity_extra_grain_plot")
    var quantityExtraGrainPlot: String? = null

    @Column(name = "value_extra_grain_plot")
    var valueExtraGrainPlot: String? = null

    @Column(name = "cost_fertilizer_plot")
    var costFertilizerPlot: String? = null

    @Column(name = "profit_extra_plot")
    var profitExtraPlot: String? = null

    @Column(name = "profit_extra_plot_text")
    var profitExtraPlotText: String? = null

    @Column(name = "npk_plot")
    var npkPlot: String? = null

    @Column(name = "urea1_plot")
    var urea1Plot: String? = null

    @Column(name = "urea2_plot")
    var urea2Plot: String? = null

    @Column(name = "reccol")
    var reccol: String? = null

    @Column(name = "low_density_recommendation")
    var lowDensityRecommendation: String? = null

    @Column(name = "blanket_recommendation")
    var blanketRecommendation: String? = null

    @Column(name = "risk_note1")
    var riskNote1: String? = null

    @Column(name = "risk_note2")
    var riskNote2: String? = null

    @Column(name = "risk_note3")
    var riskNote3: String? = null

    @Column(name = "profit_note1")
    var profitNote1: String? = null

    @Column(name = "profit_note2")
    var profitNote2: String? = null

    @Column(name = "profit_note3")
    var profitNote3: String? = null

    @Column(name = "profit_note3_maize_grain")
    var profitNote3MaizeGrain: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "validation_plot1")
    var validationPlot1: String? = null

    @Column(name = "validation_plot1_note1")
    var validationPlot1Note1: String? = null

    @Column(name = "validation_plot1_note2")
    var validationPlot1Note2: String? = null

    @Column(name = "validation_plot1_note2_maize_grain")
    var validationPlot1Note2MaizeGrain: String? = null

    @Column(name = "validation_plot2")
    var validationPlot2: String? = null

    @Column(name = "validation_plot3")
    var validationPlot3: String? = null

    @Column(name = "rec_note")
    var recNote: String? = null

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