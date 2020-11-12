package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_fr")
class FrEntity : BaseEntity() {
    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "clearing")
    var clearing: String? = null

    @Column(name = "comment_value", columnDefinition = "TEXT")
    var commentValue: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "cost_score")
    var costScore: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "dap1")
    var dap1: String? = null

    @Column(name = "dap2")
    var dap2: String? = null

    @Column(name = "date_fertilizer1")
    var dateFertilizer1: LocalDateTime? = null

    @Column(name = "date_fertilizer2")
    var dateFertilizer2: LocalDateTime? = null

    @Column(name = "date_weeding1")
    var dateWeeding1: LocalDateTime? = null

    @Column(name = "date_weeding10")
    var dateWeeding10: LocalDateTime? = null

    @Column(name = "date_weeding2")
    var dateWeeding2: LocalDateTime? = null

    @Column(name = "date_weeding3")
    var dateWeeding3: LocalDateTime? = null

    @Column(name = "date_weeding4")
    var dateWeeding4: LocalDateTime? = null

    @Column(name = "date_weeding5")
    var dateWeeding5: LocalDateTime? = null

    @Column(name = "date_weeding6")
    var dateWeeding6: LocalDateTime? = null

    @Column(name = "date_weeding7")
    var dateWeeding7: LocalDateTime? = null

    @Column(name = "date_weeding8")
    var dateWeeding8: LocalDateTime? = null

    @Column(name = "date_weeding9")
    var dateWeeding9: LocalDateTime? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "fertilizers1")
    var fertilizers1: String? = null

    @Column(name = "fertilizers2")
    var fertilizers2: String? = null

    @Column(name = "gapping")
    var gapping: String? = null

    @Column(name = "gapping_date")
    var gappingDate: LocalDateTime? = null

    @Column(name = "gapping_type")
    var gappingType: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "harrow_method1")
    var harrowMethod1: String? = null

    @Column(name = "harrow_method2")
    var harrowMethod2: String? = null

    @Column(name = "harrow_method3")
    var harrowMethod3: String? = null

    @Column(name = "harvest_date")
    var harvestDate: LocalDateTime? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "labour_score")
    var labourScore: String? = null

    @Column(name = "loc_field")
    var locField: String? = null

    @Column(name = "mop1")
    var mop1: String? = null

    @Column(name = "mop2")
    var mop2: String? = null

    @Column(name = "npk1")
    var npk1: String? = null

    @Column(name = "npk2")
    var npk2: String? = null

    @Column(name = "nr_harrow")
    var nrHarrow: String? = null

    @Column(name = "nr_plants_con")
    var nrPlantsCon: String? = null

    @Column(name = "nr_plants_ssr")
    var nrPlantsSsr: String? = null

    @Column(name = "nr_tillage")
    var nrTillage: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: String? = null

    @Column(name = "overall_score")
    var overallScore: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "plot_dim_con")
    var plotDimCon: String? = null

    @Column(name = "plot_dim_ssr")
    var plotDimSsr: String? = null

    @Column(name = "plot_l1_con")
    var plotL1Con: String? = null

    @Column(name = "plot_l1_ssr")
    var plotL1Ssr: String? = null

    @Column(name = "plot_l2_con")
    var plotL2Con: String? = null

    @Column(name = "plot_l2_ssr")
    var plotL2Ssr: String? = null

    @Column(name = "plot_length")
    var plotLength: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "plot_w1_con")
    var plotW1Con: String? = null

    @Column(name = "plot_w1_ssr")
    var plotW1Ssr: String? = null

    @Column(name = "plot_w2_con")
    var plotW2Con: String? = null

    @Column(name = "plot_w2_ssr")
    var plotW2Ssr: String? = null

    @Column(name = "plot_width")
    var plotWidth: String? = null

    @Column(name = "price_roots")
    var priceRoots: String? = null

    @Column(name = "purpose_event")
    var purposeEvent: String? = null

    @Column(name = "quality_score")
    var qualityScore: String? = null

    @Column(name = "rate_cbsd")
    var rateCbsd: String? = null

    @Column(name = "rate_cmd")
    var rateCmd: String? = null

    @Column(name = "rate_drought")
    var rateDrought: String? = null

    @Column(name = "rate_fire")
    var rateFire: String? = null

    @Column(name = "rate_grazing")
    var rateGrazing: String? = null

    @Column(name = "rate_lodging")
    var rateLodging: String? = null

    @Column(name = "rate_note")
    var rateNote: String? = null

    @Column(name = "rate_other_disease")
    var rateOtherDisease: String? = null

    @Column(name = "rate_pests")
    var ratePests: String? = null

    @Column(name = "rate_theft_missing")
    var rateTheftMissing: String? = null

    @Column(name = "rate_water_logging")
    var rateWaterLogging: String? = null

    @Column(name = "rate_weeds")
    var rateWeeds: String? = null

    @Column(name = "revenue_score")
    var revenueScore: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "score_note")
    var scoreNote: String? = null

    @Column(name = "sim_serial")
    var simSerial: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "subscriber_id")
    var subscriberId: String? = null

    @Column(name = "thankyou")
    var thankyou: String? = null

    @Column(name = "tillage_method1")
    var tillageMethod1: String? = null

    @Column(name = "tillage_method2")
    var tillageMethod2: String? = null

    @Column(name = "tillage_method3")
    var tillageMethod3: String? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "trial_type")
    var trialType: String? = null

    @Column(name = "tsp1")
    var tsp1: String? = null

    @Column(name = "tsp2")
    var tsp2: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con")
    var tuberizedMarketableRootsFwCon: String? = null

    @Column(name = "tuberized_marketable_roots_fw_ssr")
    var tuberizedMarketableRootsFwSsr: String? = null

    @Column(name = "tuberized_marketable_roots_nr_con")
    var tuberizedMarketableRootsNrCon: String? = null

    @Column(name = "tuberized_marketable_roots_nr_ssr")
    var tuberizedMarketableRootsNrSsr: String? = null

    @Column(name = "urea1")
    var urea1: String? = null

    @Column(name = "urea2")
    var urea2: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "vegetation")
    var vegetation: String? = null

    @Column(name = "weeding_method1")
    var weedingMethod1: String? = null

    @Column(name = "weeding_method10")
    var weedingMethod10: String? = null

    @Column(name = "weeding_method2")
    var weedingMethod2: String? = null

    @Column(name = "weeding_method3")
    var weedingMethod3: String? = null

    @Column(name = "weeding_method4")
    var weedingMethod4: String? = null

    @Column(name = "weeding_method5")
    var weedingMethod5: String? = null

    @Column(name = "weeding_method6")
    var weedingMethod6: String? = null

    @Column(name = "weeding_method7")
    var weedingMethod7: String? = null

    @Column(name = "weeding_method8")
    var weedingMethod8: String? = null

    @Column(name = "weeding_method9")
    var weedingMethod9: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "yield_score")
    var yieldScore: String? = null
}