package com.tsobu.ona.database.entities.datavalsphs

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "dataval_sphs")
class SphsEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

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

    @Column(name = "country_select")
    var countrySelect: String? = null

    @Column(name = "season_select")
    var seasonSelect: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "monitored")
    var monitored: String? = null

    @Column(name = "rapid_yield")
    var rapidYield: String? = null

    @Column(name = "event_value")
    var eventValue: String? = null

    @Column(name = "name_value")
    var nameValue: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "field_id")
    var fieldId: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "loc_field")
    var locField: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: Double? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: Double? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: Double? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: Double? = null

    @Column(name = "plotdim_con")
    var plotdimCon: String? = null

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

    @Column(name = "rate_note")
    var rateNote: String? = null

    @Column(name = "rate_drought")
    var rateDrought: String? = null

    @Column(name = "rate_water_logging")
    var rateWaterLogging: String? = null

    @Column(name = "rate_lodging")
    var rateLodging: String? = null

    @Column(name = "rate_grazing")
    var rateGrazing: String? = null

    @Column(name = "rate_fire")
    var rateFire: String? = null

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

    @Column(name = "reject")
    var reject: String? = null

    @Column(name = "reject_true_note")
    var rejectTrueNote: String? = null

    @Column(name = "reject_false_note")
    var rejectFalseNote: String? = null

    @Column(name = "clearing")
    var clearing: String? = null

    @Column(name = "vegetation")
    var vegetation: String? = null

    @Column(name = "nr_tillage")
    var nrTillage: String? = null

    @Column(name = "nr_harrow")
    var nrHarrow: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "tillage_method1")
    var tillageMethod1: String? = null

    @Column(name = "tillage_method2")
    var tillageMethod2: String? = null

    @Column(name = "tillage_method3")
    var tillageMethod3: String? = null

    @Column(name = "harrow_method1")
    var harrowMethod1: String? = null

    @Column(name = "harrow_method2")
    var harrowMethod2: String? = null

    @Column(name = "harrow_method3")
    var harrowMethod3: String? = null

    @Column(name = "orginputs1")
    var orginputs1: String? = null

    @Column(name = "fertilizer1")
    var fertilizer1: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDate? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "harvest_date_question_con")
    var harvestDateQuestionCon: String? = null

    @Column(name = "harvest_date_question_rec")
    var harvestDateQuestionRec: String? = null

    @Column(name = "int_harvest_date_con")
    var intHarvestDateCon: String? = null

    @Column(name = "int_harvest_date_rec")
    var intHarvestDateRec: String? = null

    @Column(name = "nr_plants_con")
    var nrPlantsCon: Int? = null

    @Column(name = "nr_plants_rec")
    var nrPlantsRec: Int? = null

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

    @Column(name = "orginputs5")
    var orginputs5: String? = null

    @Column(name = "fertilizer5")
    var fertilizer5: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: Int? = null

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

    @Column(name = "effharvestdate_con")
    var effharvestdateCon: String? = null

    @Column(name = "tuberized_marketable_roots_nr_con")
    var tuberizedMarketableRootsNrCon: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con")
    var tuberizedMarketableRootsFwCon: String? = null

    @Column(name = "price_roots_con")
    var priceRootsCon: String? = null

    @Column(name = "eff_harvest_date_rec")
    var effHarvestDateRec: String? = null

    @Column(name = "tuberized_marketable_roots_nr_rec")
    var tuberizedMarketableRootsNrRec: String? = null

    @Column(name = "tuberized_marketable_roots_fw_rec")
    var tuberizedMarketableRootsFwRec: String? = null

    @Column(name = "price_roots_rec")
    var priceRootsRec: String? = null

    @Column(name = "eff_harvest_date_con_tri")
    var effHarvestDateConTri: String? = null

    @Column(name = "harvest_con_tri_count")
    var harvestConTriCount: String? = null

    @Column(name = "set_of_harvest_con_tri")
    var setOfHarvestConTri: String? = null

    @Column(name = "harvest_con_tri_detail_count")
    var harvestConTriDetailCount: String? = null

    @Column(name = "set_of_harvest_con_tri_detail")
    var setOfHarvestConTriDetail: String? = null

    @Column(name = "eff_harvestdate_rec_tri")
    var effHarvestdateRecTri: String? = null

    @Column(name = "harvest_rec_tri_count")
    var harvestRecTriCount: String? = null

    @Column(name = "set_of_harvest_rec_tri")
    var setOfHarvestRecTri: String? = null

    @Column(name = "harvest_rec_tri_detail_count")
    var harvestRecTriDetailCount: String? = null

    @Column(name = "set_of_harvest_rec_tri_detail")
    var setOfHarvestRecTriDetail: String? = null

    @Column(name = "last_plot")
    var lastPlot: String? = null

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

    @Column(name = "comment", columnDefinition = "TEXT")
    var comment: String? = null

    @Column(name = "thank_you")
    var thankYou: String? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}