package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz")
class PpTzEntity : BaseEntity() {
    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "clearing")
    var clearing: String? = null

    @Column(name = "comment")
    var comment: String? = null

    @Column(name = "confirm_p1")
    var confirmP1: String? = null

    @Column(name = "confirm_p2")
    var confirmP2: String? = null

    @Column(name = "confirm_p3")
    var confirmP3: String? = null

    @Column(name = "confirm_p4")
    var confirmP4: String? = null

    @Column(name = "confirm_p5")
    var confirmP5: String? = null

    @Column(name = "confirm_p6")
    var confirmP6: String? = null

    @Column(name = "control_treatment")
    var controlTreatment: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "cost_score")
    var costScore: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "date_weeding_1")
    var dateWeeding1: LocalDateTime? = null

    @Column(name = "date_weeding_10")
    var dateWeeding10: LocalDateTime? = null

    @Column(name = "date_weeding_2")
    var dateWeeding2: LocalDateTime? = null

    @Column(name = "date_weeding_3")
    var dateWeeding3: LocalDateTime? = null

    @Column(name = "date_weeding_4")
    var dateWeeding4: LocalDateTime? = null

    @Column(name = "date_weeding_5")
    var dateWeeding5: LocalDateTime? = null

    @Column(name = "date_weeding_6")
    var dateWeeding6: LocalDateTime? = null

    @Column(name = "date_weeding_7")
    var dateWeeding7: LocalDateTime? = null

    @Column(name = "date_weeding_8")
    var dateWeeding8: LocalDateTime? = null

    @Column(name = "date_weeding_9")
    var dateWeeding9: LocalDateTime? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "event")
    var event: String? = null

    @Column(name = "fertilizer_1")
    var fertilizer1: String? = null

    @Column(name = "fertilizer_2")
    var fertilizer2: String? = null

    @Column(name = "fertilizer_3")
    var fertilizer3: String? = null

    @Column(name = "fertilizer_4")
    var fertilizer4: String? = null

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

    @Column(name = "harvest_date")
    var harvestDate: LocalDateTime? = null

    @Column(name = "herbicide_actor")
    var herbicideActor: String? = null

    @Column(name = "herbicide_actor_trained")
    var herbicideActorTrained: String? = null

    @Column(name = "herbicide_other")
    var herbicideOther: String? = null

    @Column(name = "herbicides")
    var herbicides: String? = null

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

    @Column(name = "nr_plants_p1")
    var nrPlantsP1: String? = null

    @Column(name = "nr_plants_p2")
    var nrPlantsP2: String? = null

    @Column(name = "nr_plants_p3")
    var nrPlantsP3: String? = null

    @Column(name = "nr_plants_p4")
    var nrPlantsP4: String? = null

    @Column(name = "nr_plants_p5")
    var nrPlantsP5: String? = null

    @Column(name = "nr_plants_p6")
    var nrPlantsP6: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: String? = null

    @Column(name = "org_inputs_1")
    var orgInputs1: String? = null

    @Column(name = "org_inputs_2")
    var orgInputs2: String? = null

    @Column(name = "org_inputs_3")
    var orgInputs3: String? = null

    @Column(name = "org_inputs_4")
    var orgInputs4: String? = null

    @Column(name = "overall_score")
    var overallScore: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "plot_dim_p1")
    var plotDimP1: String? = null

    @Column(name = "plot_dim_p2")
    var plotDimP2: String? = null

    @Column(name = "plot_dim_p3")
    var plotDimP3: String? = null

    @Column(name = "plot_dim_p4")
    var plotDimP4: String? = null

    @Column(name = "plot_dim_p5")
    var plotDimP5: String? = null

    @Column(name = "plot_dim_p6")
    var plotDimP6: String? = null

    @Column(name = "plot_l1_p1")
    var plotL1P1: String? = null

    @Column(name = "plot_l1_p2")
    var plotL1P2: String? = null

    @Column(name = "plot_l1_p3")
    var plotL1P3: String? = null

    @Column(name = "plot_l1_p4")
    var plotL1P4: String? = null

    @Column(name = "plot_l1_p5")
    var plotL1P5: String? = null

    @Column(name = "plot_l1_p6")
    var plotL1P6: String? = null

    @Column(name = "plot_l2_p1")
    var plotL2P1: String? = null

    @Column(name = "plot_l2_p2")
    var plotL2P2: String? = null

    @Column(name = "plot_l2_p3")
    var plotL2P3: String? = null

    @Column(name = "plot_l2_p4")
    var plotL2P4: String? = null

    @Column(name = "plot_l2_p5")
    var plotL2P5: String? = null

    @Column(name = "plot_l2_p6")
    var plotL2P6: String? = null

    @Column(name = "plot_w1_p1")
    var plotW1P1: String? = null

    @Column(name = "plot_w1_p2")
    var plotW1P2: String? = null

    @Column(name = "plot_w1_p3")
    var plotW1P3: String? = null

    @Column(name = "plot_w1_p4")
    var plotW1P4: String? = null

    @Column(name = "plot_w1_p5")
    var plotW1P5: String? = null

    @Column(name = "plot_w1_p6")
    var plotW1P6: String? = null

    @Column(name = "plot_w2_p1")
    var plotW2P1: String? = null

    @Column(name = "plot_w2_p2")
    var plotW2P2: String? = null

    @Column(name = "plot_w2_p3")
    var plotW2P3: String? = null

    @Column(name = "plot_w2_p4")
    var plotW2P4: String? = null

    @Column(name = "plot_w2_p5")
    var plotW2P5: String? = null

    @Column(name = "plot_w2_p6")
    var plotW2P6: String? = null

    @Column(name = "preferred_treatment")
    var preferredTreatment: String? = null

    @Column(name = "price_roots")
    var priceRoots: String? = null

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

    @Column(name = "ridging_method")
    var ridgingMethod: String? = null

    @Column(name = "score_note")
    var scoreNote: String? = null

    @Column(name = "set_of_weed_assessment_p1")
    var setOfWeedAssessmentP1: String? = null

    @Column(name = "set_of_weed_assessment_p2")
    var setOfWeedAssessmentP2: String? = null

    @Column(name = "set_of_weed_assessment_p3")
    var setOfWeedAssessmentP3: String? = null

    @Column(name = "set_of_weed_assessment_p4")
    var setOfWeedAssessmentP4: String? = null

    @Column(name = "set_of_weed_assessment_p5")
    var setOfWeedAssessmentP5: String? = null

    @Column(name = "set_of_weed_assessment_p6")
    var setOfWeedAssessmentP6: String? = null

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

    @Column(name = "tillage_method")
    var tillageMethod: String? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "tuberized_marketable_roots_fw_p1")
    var tuberizedMarketableRootsFwP1: String? = null

    @Column(name = "tuberized_marketable_roots_fw_p2")
    var tuberizedMarketableRootsFwP2: String? = null

    @Column(name = "tuberized_marketable_roots_fw_p3")
    var tuberizedMarketableRootsFwP3: String? = null

    @Column(name = "tuberized_marketable_roots_fw_p4")
    var tuberizedMarketableRootsFwP4: String? = null

    @Column(name = "tuberized_marketable_roots_fw_p5")
    var tuberizedMarketableRootsFwP5: String? = null

    @Column(name = "tuberized_marketable_roots_fw_p6")
    var tuberizedMarketableRootsFwP6: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p1")
    var tuberizedMarketableRootsNrP1: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p2")
    var tuberizedMarketableRootsNrP2: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p3")
    var tuberizedMarketableRootsNrP3: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p4")
    var tuberizedMarketableRootsNrP4: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p5")
    var tuberizedMarketableRootsNrP5: String? = null

    @Column(name = "tuberized_marketable_roots_nr_p6")
    var tuberizedMarketableRootsNrP6: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "vegetation")
    var vegetation: String? = null

    @Column(name = "weed_assessment_p1_count")
    var weedAssessmentP1Count: String? = null

    @Column(name = "weed_assessment_p2_count")
    var weedAssessmentP2Count: String? = null

    @Column(name = "weed_assessment_p3_count")
    var weedAssessmentP3Count: String? = null

    @Column(name = "weed_assessment_p4_count")
    var weedAssessmentP4Count: String? = null

    @Column(name = "weed_assessment_p5_count")
    var weedAssessmentP5Count: String? = null

    @Column(name = "weed_assessment_p6_count")
    var weedAssessmentP6Count: String? = null

    @Column(name = "weeding_method_1")
    var weedingMethod1: String? = null

    @Column(name = "weeding_method_10")
    var weedingMethod10: String? = null

    @Column(name = "weeding_method_2")
    var weedingMethod2: String? = null

    @Column(name = "weeding_method_3")
    var weedingMethod3: String? = null

    @Column(name = "weeding_method_4")
    var weedingMethod4: String? = null

    @Column(name = "weeding_method_5")
    var weedingMethod5: String? = null

    @Column(name = "weeding_method_6")
    var weedingMethod6: String? = null

    @Column(name = "weeding_method_7")
    var weedingMethod7: String? = null

    @Column(name = "weeding_method_8")
    var weedingMethod8: String? = null

    @Column(name = "weeding_method_9")
    var weedingMethod9: String? = null

    @Column(name = "yield_score")
    var yieldScore: String? = null

    @Column(name = "zone_value")
    var zoneValue: String? = null
}