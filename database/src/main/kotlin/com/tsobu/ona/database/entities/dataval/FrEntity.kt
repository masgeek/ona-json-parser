package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_fr")
class FrEntity : BaseEntity() {
    @Column(name = "submission_date")
    private val submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    private val uuid: String? = null

    @Column(name = "start_date")
    private val startDate: LocalDateTime? = null

    @Column(name = "today_date")
    private val todayDate: LocalDate? = null

    @Column(name = "device_id")
    private val deviceId: String? = null

    @Column(name = "subscriber_id")
    private val subscriberId: String? = null

    @Column(name = "email")
    private val email: String? = null

    @Column(name = "username")
    private val username: String? = null

    @Column(name = "sim_serial")
    private val simSerial: String? = null

    @Column(name = "phone_number")
    private val phoneNumber: String? = null

    @Column(name = "banner")
    private val banner: String? = null

    @Column(name = "intro")
    private val intro: String? = null

    @Column(name = "event_value")
    private val eventValue: String? = null

    @Column(name = "eaid")
    private val eaid: String? = null

    @Column(name = "hhid")
    private val hhid: String? = null

    @Column(name = "country")
    private val country: String? = null

    @Column(name = "currency")
    private val currency: String? = null

    @Column(name = "conversion")
    private val conversion: String? = null

    @Column(name = "loc_field")
    private val locField: String? = null

    @Column(name = "geo_point_latitude")
    private val geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    private val geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    private val geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "clearing")
    private val clearing: String? = null

    @Column(name = "vegetation")
    private val vegetation: String? = null

    @Column(name = "nr_tillage")
    private val nrTillage: String? = null

    @Column(name = "nr_harrow")
    private val nrHarrow: String? = null

    @Column(name = "ridging")
    private val ridging: String? = null

    @Column(name = "tillage_method1")
    private val tillageMethod1: String? = null

    @Column(name = "tillage_method2")
    private val tillageMethod2: String? = null

    @Column(name = "tillage_method3")
    private val tillageMethod3: String? = null

    @Column(name = "harrow_method1")
    private val harrowMethod1: String? = null

    @Column(name = "harrow_method2")
    private val harrowMethod2: String? = null

    @Column(name = "harrow_method3")
    private val harrowMethod3: String? = null

    @Column(name = "planting_date")
    private val plantingDate: String? = null

    @Column(name = "trial_type")
    private val trialType: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "planting_density")
    private val plantingDensity: String? = null

    @Column(name = "between_row")
    private val betweenRow: String? = null

    @Column(name = "within_row")
    private val withinRow: String? = null

    @Column(name = "plot_width")
    private val plotWidth: String? = null

    @Column(name = "plot_length")
    private val plotLength: String? = null

    @Column(name = "plot_size")
    private val plotSize: String? = null

    @Column(name = "nr_plants_con")
    private val nrPlantsCon: String? = null

    @Column(name = "nr_plants_ssr")
    private val nrPlantsSsr: String? = null

    @Column(name = "plot_dim_con")
    private val plotDimCon: String? = null

    @Column(name = "plot_l1_con")
    private val plotL1Con: String? = null

    @Column(name = "plot_w1_con")
    private val plotW1Con: String? = null

    @Column(name = "plot_l2_con")
    private val plotL2Con: String? = null

    @Column(name = "plot_w2_con")
    private val plotW2Con: String? = null

    @Column(name = "plot_dim_ssr")
    private val plotDimSsr: String? = null

    @Column(name = "plot_l1_ssr")
    private val plotL1Ssr: String? = null

    @Column(name = "plot_w1_ssr")
    private val plotW1Ssr: String? = null

    @Column(name = "plot_l2_ssr")
    private val plotL2Ssr: String? = null

    @Column(name = "plot_w2_ssr")
    private val plotW2Ssr: String? = null

    @Column(name = "gapping")
    private val gapping: String? = null

    @Column(name = "gapping_date")
    private val gappingDate: String? = null

    @Column(name = "gapping_type")
    private val gappingType: String? = null

    @Column(name = "fertilizers1")
    private val fertilizers1: String? = null

    @Column(name = "date_fertilizer1")
    private val dateFertilizer1: String? = null

    @Column(name = "urea1")
    private val urea1: String? = null

    @Column(name = "tsp1")
    private val tsp1: String? = null

    @Column(name = "dap1")
    private val dap1: String? = null

    @Column(name = "mop1")
    private val mop1: String? = null

    @Column(name = "npk1")
    private val npk1: String? = null

    @Column(name = "fertilizers2")
    private val fertilizers2: String? = null

    @Column(name = "date_fertilizer2")
    private val dateFertilizer2: String? = null

    @Column(name = "urea2")
    private val urea2: String? = null

    @Column(name = "tsp2")
    private val tsp2: String? = null

    @Column(name = "dap2")
    private val dap2: String? = null

    @Column(name = "mop2")
    private val mop2: String? = null

    @Column(name = "npk2")
    private val npk2: String? = null

    @Column(name = "nr_weeding")
    private val nrWeeding: String? = null

    @Column(name = "date_weeding1")
    private val dateWeeding1: String? = null

    @Column(name = "weeding_method1")
    private val weedingMethod1: String? = null

    @Column(name = "date_weeding2")
    private val dateWeeding2: String? = null

    @Column(name = "weeding_method2")
    private val weedingMethod2: String? = null

    @Column(name = "date_weeding3")
    private val dateWeeding3: String? = null

    @Column(name = "weeding_method3")
    private val weedingMethod3: String? = null

    @Column(name = "date_weeding4")
    private val dateWeeding4: String? = null

    @Column(name = "weeding_method4")
    private val weedingMethod4: String? = null

    @Column(name = "date_weeding5")
    private val dateWeeding5: String? = null

    @Column(name = "weeding_method5")
    private val weedingMethod5: String? = null

    @Column(name = "date_weeding6")
    private val dateWeeding6: String? = null

    @Column(name = "weeding_method6")
    private val weedingMethod6: String? = null

    @Column(name = "date_weeding7")
    private val dateWeeding7: String? = null

    @Column(name = "weeding_method7")
    private val weedingMethod7: String? = null

    @Column(name = "date_weeding8")
    private val dateWeeding8: String? = null

    @Column(name = "weeding_method8")
    private val weedingMethod8: String? = null

    @Column(name = "date_weeding9")
    private val dateWeeding9: String? = null

    @Column(name = "weeding_method9")
    private val weedingMethod9: String? = null

    @Column(name = "date_weeding10")
    private val dateWeeding10: String? = null

    @Column(name = "weeding_method10")
    private val weedingMethod10: String? = null

    @Column(name = "rate_note")
    private val rateNote: String? = null

    @Column(name = "rate_drought")
    private val rateDrought: String? = null

    @Column(name = "rate_water_logging")
    private val rateWaterLogging: String? = null

    @Column(name = "rate_lodging")
    private val rateLodging: String? = null

    @Column(name = "rate_grazing")
    private val rateGrazing: String? = null

    @Column(name = "rate_fire")
    private val rateFire: String? = null

    @Column(name = "rate_pests")
    private val ratePests: String? = null

    @Column(name = "rate_weeds")
    private val rateWeeds: String? = null

    @Column(name = "rate_cmd")
    private val rateCmd: String? = null

    @Column(name = "rate_cbsd")
    private val rateCbsd: String? = null

    @Column(name = "rate_other_disease")
    private val rateOtherDisease: String? = null

    @Column(name = "rate_theft_missing")
    private val rateTheftMissing: String? = null

    @Column(name = "harvest_date")
    private val harvestDate: String? = null

    @Column(name = "tuberized_marketable_roots_nr_con")
    private val tuberizedMarketableRootsNrCon: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con")
    private val tuberizedMarketableRootsFwCon: String? = null

    @Column(name = "tuberized_marketable_roots_nr_ssr")
    private val tuberizedMarketableRootsNrSsr: String? = null

    @Column(name = "tuberized_marketable_roots_fw_ssr")
    private val tuberizedMarketableRootsFwSsr: String? = null

    @Column(name = "score_note")
    private val scoreNote: String? = null

    @Column(name = "cost_score")
    private val costScore: String? = null

    @Column(name = "labour_score")
    private val labourScore: String? = null

    @Column(name = "yield_score")
    private val yieldScore: String? = null

    @Column(name = "quality_score")
    private val qualityScore: String? = null

    @Column(name = "revenue_score")
    private val revenueScore: String? = null

    @Column(name = "overall_score")
    private val overallScore: String? = null

    @Column(name = "price_roots")
    private val priceRoots: String? = null

    @Column(name = "comment")
    private val comment: String? = null

    @Column(name = "thankyou")
    private val thankyou: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    private val instanceId: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null
}