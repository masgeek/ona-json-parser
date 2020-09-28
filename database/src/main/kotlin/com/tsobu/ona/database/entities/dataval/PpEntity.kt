package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp")
class PpEntity : BaseEntity() {
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

    @Column(name = "sim_serial")
    var simSerial: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "event_value")
    var eventValue: String? = null

    @Column(name = "red_plot")
    var redPlot: String? = null

    @Column(name = "bpp3")
    var bpp3: String? = null

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

    @Column(name = "plot_dim_con")
    var plotDimCon: String? = null

    @Column(name = "plot_l1_con")
    var plotL1Con: String? = null

    @Column(name = "plot_w1_con")
    var plotW1Con: String? = null

    @Column(name = "plot_l2_con")
    var plotL2Con: String? = null

    @Column(name = "plot_w2_con")
    var plotW2Con: String? = null

    @Column(name = "plot_dim_rec")
    var plotDimRec: String? = null

    @Column(name = "plot_l1_rec")
    var plotL1Rec: String? = null

    @Column(name = "plot_w1_rec")
    var plotW1Rec: String? = null

    @Column(name = "plot_l2_rec")
    var plotL2Rec: String? = null

    @Column(name = "plot_w2_rec")
    var plotW2Rec: String? = null

    @Column(name = "plot_dim_alt")
    var plotDimAlt: String? = null

    @Column(name = "plot_l1_alt")
    var plotL1Alt: String? = null

    @Column(name = "plot_w1_alt")
    var plotW1Alt: String? = null

    @Column(name = "plot_l2_alt")
    var plotL2Alt: String? = null

    @Column(name = "plot_w2_alt")
    var plotW2Alt: String? = null

    @Column(name = "plot_dim_con_bpp3")
    var plotDimConBpp3: String? = null

    @Column(name = "plot_l1_con_bpp3")
    var plotL1ConBpp3: String? = null

    @Column(name = "plot_w1_con_bpp3")
    var plotW1ConBpp3: String? = null

    @Column(name = "plot_l2_con_bpp3")
    var plotL2ConBpp3: String? = null

    @Column(name = "plot_w2_con_bpp3")
    var plotW2ConBpp3: String? = null

    @Column(name = "plot_dim_rec_bpp3")
    var plotDimRecBpp3: String? = null

    @Column(name = "plot_l1_rec_bpp3")
    var plotL1RecBpp3: String? = null

    @Column(name = "plot_w1_rec_bpp3")
    var plotW1RecBpp3: String? = null

    @Column(name = "plot_l2_rec_bpp3")
    var plotL2RecBpp3: String? = null

    @Column(name = "plot_w2_rec_bpp3")
    var plotW2RecBpp3: String? = null

    @Column(name = "plot_dim_alt_bpp3")
    var plotDimAltBpp3: String? = null

    @Column(name = "plot_l1_alt_bpp3")
    var plotL1AltBpp3: String? = null

    @Column(name = "plot_w1_alt_bpp3")
    var plotW1AltBpp3: String? = null

    @Column(name = "plot_l2_alt_bpp3")
    var plotL2AltBpp3: String? = null

    @Column(name = "plot_w2_alt_bpp3")
    var plotW2AltBpp3: String? = null

    @Column(name = "clearing")
    var clearing: String? = null

    @Column(name = "vegetation")
    var vegetation: String? = null

    @Column(name = "nr_tillage_con")
    var nrTillageCon: String? = null

    @Column(name = "nr_harrow_con")
    var nrHarrowCon: String? = null

    @Column(name = "ridging_con")
    var ridgingCon: String? = null

    @Column(name = "tillage_method1_con")
    var tillageMethod1Con: String? = null

    @Column(name = "tillage_method2_con")
    var tillageMethod2Con: String? = null

    @Column(name = "tillage_method3_con")
    var tillageMethod3Con: String? = null

    @Column(name = "harrow_method1_con")
    var harrowMethod1Con: String? = null

    @Column(name = "harrow_method2_con")
    var harrowMethod2Con: String? = null

    @Column(name = "harrow_method3_con")
    var harrowMethod3Con: String? = null

    @Column(name = "ridging_method_con")
    var ridgingMethodCon: String? = null

    @Column(name = "nr_tillage_rec")
    var nrTillageRec: String? = null

    @Column(name = "nr_harrow_rec")
    var nrHarrowRec: String? = null

    @Column(name = "ridging_rec")
    var ridgingRec: String? = null

    @Column(name = "tillage_method1_rec")
    var tillageMethod1Rec: String? = null

    @Column(name = "tillage_method2_rec")
    var tillageMethod2Rec: String? = null

    @Column(name = "tillage_method3_rec")
    var tillageMethod3Rec: String? = null

    @Column(name = "harrow_method1_rec")
    var harrowMethod1Rec: String? = null

    @Column(name = "harrow_method2_rec")
    var harrowMethod2Rec: String? = null

    @Column(name = "harrow_method3_rec")
    var harrowMethod3Rec: String? = null

    @Column(name = "ridging_method_rec")
    var ridgingMethodRec: String? = null

    @Column(name = "nr_tillage_alt")
    var nrTillageAlt: String? = null

    @Column(name = "nr_harrow_alt")
    var nrHarrowAlt: String? = null

    @Column(name = "ridging_alt")
    var ridgingAlt: String? = null

    @Column(name = "tillage_method1_alt")
    var tillageMethod1Alt: String? = null

    @Column(name = "tillage_method2_alt")
    var tillageMethod2Alt: String? = null

    @Column(name = "tillage_method3_alt")
    var tillageMethod3Alt: String? = null

    @Column(name = "harrow_method1_alt")
    var harrowMethod1Alt: String? = null

    @Column(name = "harrow_method2_alt")
    var harrowMethod2Alt: String? = null

    @Column(name = "harrow_method3_alt")
    var harrowMethod3Alt: String? = null

    @Column(name = "ridging_method_alt")
    var ridgingMethodAlt: String? = null

    @Column(name = "nr_tillage_con_bpp3")
    var nrTillageConBpp3: String? = null

    @Column(name = "nr_harrow_con_bpp3")
    var nrHarrowConBpp3: String? = null

    @Column(name = "ridging_con_bpp3")
    var ridgingConBpp3: String? = null

    @Column(name = "tillage_method1_con_bpp3")
    var tillageMethod1ConBpp3: String? = null

    @Column(name = "tillage_method2_con_bpp3")
    var tillageMethod2ConBpp3: String? = null

    @Column(name = "tillage_method3_con_bpp3")
    var tillageMethod3ConBpp3: String? = null

    @Column(name = "harrow_method1_con_bpp3")
    var harrowMethod1ConBpp3: String? = null

    @Column(name = "harrow_method2_con_bpp3")
    var harrowMethod2ConBpp3: String? = null

    @Column(name = "harrow_method3_con_bpp3")
    var harrowMethod3ConBpp3: String? = null

    @Column(name = "ridging_method_con_bpp3")
    var ridgingMethodConBpp3: String? = null

    @Column(name = "nr_tillage_rec_bpp3")
    var nrTillageRecBpp3: String? = null

    @Column(name = "nr_harrow_rec_bpp3")
    var nrHarrowRecBpp3: String? = null

    @Column(name = "ridging_rec_bpp3")
    var ridgingRecBpp3: String? = null

    @Column(name = "tillage_method1_rec_bpp3")
    var tillageMethod1RecBpp3: String? = null

    @Column(name = "tillage_method2_rec_bpp3")
    var tillageMethod2RecBpp3: String? = null

    @Column(name = "tillage_method3_rec_bpp3")
    var tillageMethod3RecBpp3: String? = null

    @Column(name = "harrow_method1_rec_bpp3")
    var harrowMethod1RecBpp3: String? = null

    @Column(name = "harrow_method2_rec_bpp3")
    var harrowMethod2RecBpp3: String? = null

    @Column(name = "harrow_method3_rec_bpp3")
    var harrowMethod3RecBpp3: String? = null

    @Column(name = "ridging_method_rec_bpp3")
    var ridgingMethodRecBpp3: String? = null

    @Column(name = "nr_tillage_alt_bpp3")
    var nrTillageAltBpp3: String? = null

    @Column(name = "nr_harrow_alt_bpp3")
    var nrHarrowAltBpp3: String? = null

    @Column(name = "ridging_alt_bpp3")
    var ridgingAltBpp3: String? = null

    @Column(name = "tillage_method1_alt_bpp3")
    var tillageMethod1AltBpp3: String? = null

    @Column(name = "tillage_method2_alt_bpp3")
    var tillageMethod2AltBpp3: String? = null

    @Column(name = "tillage_method3_alt_bpp3")
    var tillageMethod3AltBpp3: String? = null

    @Column(name = "harrow_method1_alt_bpp3")
    var harrowMethod1AltBpp3: String? = null

    @Column(name = "harrow_method2_alt_bpp3")
    var harrowMethod2AltBpp3: String? = null

    @Column(name = "harrow_method3_alt_bpp3")
    var harrowMethod3AltBpp3: String? = null

    @Column(name = "ridging_method_alt_bpp3")
    var ridgingMethodAltBpp3: String? = null

    @Column(name = "orginputs1")
    var orginputs1: String? = null

    @Column(name = "fertilizer1")
    var fertilizer1: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDate? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "nr_plants_con")
    var nrPlantsCon: String? = null

    @Column(name = "nr_plants_rec")
    var nrPlantsRec: String? = null

    @Column(name = "nr_plants_alt")
    var nrPlantsAlt: String? = null

    @Column(name = "nr_plants_con_bpp3")
    var nrPlantsConBpp3: String? = null

    @Column(name = "nr_plants_rec_bpp3")
    var nrPlantsRecBpp3: String? = null

    @Column(name = "nr_plants_alt_bpp3")
    var nrPlantsAltBpp3: String? = null

    @Column(name = "gapping")
    var gapping: String? = null

    @Column(name = "gapping_date")
    var gappingDate: String? = null

    @Column(name = "gapping_type")
    var gappingType: String? = null

    @Column(name = "orginputs2")
    var orginputs2: String? = null

    @Column(name = "fertilizer2")
    var fertilizer2: String? = null

    @Column(name = "orginputs3")
    var orginputs3: String? = null

    @Column(name = "fertilizer3")
    var fertilizer3: String? = null

    @Column(name = "orginputs4")
    var orginputs4: String? = null

    @Column(name = "fertilizer4")
    var fertilizer4: String? = null

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

    @Column(name = "herbicides", columnDefinition = "TEXT")
    var herbicides: String? = null

    @Column(name = "herbicide_actor")
    var herbicideActor: String? = null

    @Column(name = "herbicide_actor_trained")
    var herbicideActorTrained: String? = null

    @Column(name = "herbicide_other")
    var herbicideOther: String? = null

    @Column(name = "rate_note")
    var rateNote: String? = null

    @Column(name = "rate_drought")
    var rateDrought: String? = null

    @Column(name = "rate_water_logging")
    var rateWaterLogging: String? = null

    @Column(name = "rate_lodging")
    var rateLodging: String? = null

    @Column(name = "rate_fire")
    var rateFire: String? = null

    @Column(name = "rate_grazing")
    var rateGrazing: String? = null

    @Column(name = "rate_pests")
    var ratePests: String? = null

    @Column(name = "rate_weeds")
    var rateWeeds: String? = null

    @Column(name = "rate_cmd")
    var rateCmd: String? = null

    @Column(name = "rate_cbsd")
    var rateCbsd: String? = null

    @Column(name = "rate_other_disease")
    var rateOtherDisease: String? = null

    @Column(name = "rate_theft_missing")
    var rateTheftMissing: String? = null

    @Column(name = "weed_assessment_con_count")
    var weedAssessmentConCount: String? = null

    @Column(name = "set_of_weed_assessment_con")
    var setOfWeedAssessmentCon: String? = null

    @Column(name = "weed_assessment_rec_count")
    var weedAssessmentRecCount: String? = null

    @Column(name = "set_of_weedassessment_rec")
    var setOfWeedassessmentRec: String? = null

    @Column(name = "weed_assessment_alt_count")
    var weedAssessmentAltCount: String? = null

    @Column(name = "set_of_weed_assessment_alt")
    var setOfWeedAssessmentAlt: String? = null

    @Column(name = "weed_assessment_con_bpp3_count")
    var weedAssessmentConBpp3Count: String? = null

    @Column(name = "set_of_weedassessment_con_bpp3")
    var setOfWeedassessmentConBpp3: String? = null

    @Column(name = "weed_assessment_rec_bpp3_count")
    var weedAssessmentRecBpp3Count: String? = null

    @Column(name = "set_of_weedassessment_rec_bpp3")
    var setOfWeedassessmentRecBpp3: String? = null

    @Column(name = "weed_assessment_alt_bpp3_count")
    var weedAssessmentAltBpp3Count: String? = null

    @Column(name = "set_of_weedassessment_alt_bpp3")
    var setOfWeedassessmentAltBpp3: String? = null

    @Column(name = "harvest_date")
    var harvestDate: LocalDate? = null

    @Column(name = "tuberized_marketable_roots_nr_con")
    var tuberizedMarketableRootsNrCon: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con")
    var tuberizedMarketableRootsFwCon: String? = null

    @Column(name = "tuberized_marketable_roots_nr_rec")
    var tuberizedMarketableRootsNrRec: String? = null

    @Column(name = "tuberized_marketable_roots_fw_rec")
    var tuberizedMarketableRootsFwRec: String? = null

    @Column(name = "tuberized_marketable_roots_nr_alt")
    var tuberizedMarketableRootsNrAlt: String? = null

    @Column(name = "tuberized_marketable_roots_fw_alt")
    var tuberizedMarketableRootsFwAlt: String? = null

    @Column(name = "tuberized_marketable_roots_nr_con_bpp3")
    var tuberizedMarketableRootsNrConBpp3: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con_bpp3")
    var tuberizedMarketableRootsFwConBpp3: String? = null

    @Column(name = "tuberized_marketable_roots_nr_rec_bpp3")
    var tuberizedMarketableRootsNrRecBpp3: String? = null

    @Column(name = "tuberized_marketable_roots_fw_rec_bpp3")
    var tuberizedMarketableRootsFwRecBpp3: String? = null

    @Column(name = "tuberized_marketable_roots_nr_alt_bpp3")
    var tuberizedMarketableRootsNrAltBpp3: String? = null

    @Column(name = "tuberized_marketable_roots_fw_alt_bpp3")
    var tuberizedMarketableRootsFwAltBpp3: String? = null

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

    @Column(name = "comment", columnDefinition = "TEXT")
    var comment: String? = null

    @Column(name = "thank_you")
    var thankYou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}