package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp")
class ValPpEntity : BaseEntity() {
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

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "fallow_type")
    private val fallowType: String? = null

    @Column(name = "fallow_height")
    private val fallowHeight: String? = null

    @Column(name = "fallow_age")
    private val fallowAge: String? = null

    @Column(name = "fallow_green")
    private val fallowGreen: String? = null

    @Column(name = "problem_weeds")
    private val problemWeeds: String? = null

    @Column(name = "pw_count")
    private val pwCount: String? = null

    @Column(name = "set_of_pw")
    private val setOfPw: String? = null

    @Column(name = "slash")
    private val slash: String? = null

    @Column(name = "spray")
    private val spray: String? = null

    @Column(name = "slash1_spray1_note")
    private val slash1Spray1Note: String? = null

    @Column(name = "slash1_spray0_note")
    private val slash1Spray0Note: String? = null

    @Column(name = "slash0_spray1_note")
    private val slash0Spray1Note: String? = null

    @Column(name = "slash0_spray0_note")
    private val slash0Spray0Note: String? = null

    @Column(name = "tractor_access")
    private val tractorAccess: String? = null

    @Column(name = "implement")
    private val implement: String? = null

    @Column(name = "herbicide_access")
    private val herbicideAccess: String? = null

    @Column(name = "basic_till")
    private val basicTill: String? = null

    @Column(name = "harrow_select")
    private val harrowSelect: String? = null

    @Column(name = "ridging")
    private val ridging: String? = null

    @Column(name = "weeding_method_select")
    private val weedingMethodSelect: String? = null

    @Column(name = "basic_till_method_select1")
    private val basicTillMethodSelect1: String? = null

    @Column(name = "basic_till_method1")
    private val basicTillMethod1: String? = null

    @Column(name = "basic_till_method_select2")
    private val basicTillMethodSelect2: String? = null

    @Column(name = "basic_till_method2")
    private val basicTillMethod2: String? = null

    @Column(name = "harrow")
    private val harrow: String? = null

    @Column(name = "ridging_method_select")
    private val ridgingMethodSelect: String? = null

    @Column(name = "ridging_method")
    private val ridgingMethod: String? = null

    @Column(name = "weeding_method")
    private val weedingMethod: String? = null

    @Column(name = "current_yield")
    private val currentYield: String? = null

    @Column(name = "current_yield_level")
    private val currentYieldLevel: String? = null

    @Column(name = "cp")
    private val cp: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "planting_density")
    private val plantingDensity: String? = null

    @Column(name = "between_row")
    private val betweenRow: String? = null

    @Column(name = "within_row")
    private val withinRow: String? = null

    @Column(name = "plot_length")
    private val plotLength: String? = null

    @Column(name = "plot_width")
    private val plotWidth: String? = null

    @Column(name = "plot_size")
    private val plotSize: String? = null

    @Column(name = "cost_note")
    private val costNote: String? = null

    @Column(name = "basic_till1_manual_cost")
    private val basicTill1ManualCost: String? = null

    @Column(name = "basic_till1_tractor_cost")
    private val basicTill1TractorCost: String? = null

    @Column(name = "basic_till2_manual_cost")
    private val basicTill2ManualCost: String? = null

    @Column(name = "basic_till2_tractor_cost")
    private val basicTill2TractorCost: String? = null

    @Column(name = "harrow_tractor_cost")
    private val harrowTractorCost: String? = null

    @Column(name = "ridging_manual_cost")
    private val ridgingManualCost: String? = null

    @Column(name = "ridging_tractor_cost")
    private val ridgingTractorCost: String? = null

    @Column(name = "weeding_manual_cost")
    private val weedingManualCost: String? = null

    @Column(name = "weeding_herbicide_cost")
    private val weedingHerbicideCost: String? = null

    @Column(name = "price_roots")
    private val priceRoots: String? = null

    @Column(name = "basic_till1_cost")
    private val basicTill1Cost: String? = null

    @Column(name = "basic_till2_cost")
    private val basicTill2Cost: String? = null

    @Column(name = "harrow_cost")
    private val harrowCost: String? = null

    @Column(name = "ridging_cost")
    private val ridgingCost: String? = null

    @Column(name = "weeding_cost")
    private val weedingCost: String? = null

    @Column(name = "cost_t0rg")
    private val costT0rg: String? = null

    @Column(name = "cost_t0fl")
    private val costT0fl: String? = null

    @Column(name = "cost_t1rg")
    private val costT1rg: String? = null

    @Column(name = "cost_t1fl")
    private val costT1fl: String? = null

    @Column(name = "cost_t2rg")
    private val costT2rg: String? = null

    @Column(name = "cost_t2fl")
    private val costT2fl: String? = null

    @Column(name = "cost_cp")
    private val costCp: String? = null

    @Column(name = "cost_cp_curr")
    private val costCpCurr: String? = null

    @Column(name = "gross_value_t0rg")
    private val grossValueT0rg: String? = null

    @Column(name = "gross_value_t0fl")
    private val grossValueT0fl: String? = null

    @Column(name = "gross_value_t1rg")
    private val grossValueT1rg: String? = null

    @Column(name = "gross_value_t1fl")
    private val grossValueT1fl: String? = null

    @Column(name = "gross_value_t2rg")
    private val grossValueT2rg: String? = null

    @Column(name = "gross_value_t2fl")
    private val grossValueT2fl: String? = null

    @Column(name = "gross_value_cp")
    private val grossValueCp: String? = null

    @Column(name = "net_value_t0rg")
    private val netValueT0rg: String? = null

    @Column(name = "net_value_t0fl")
    private val netValueT0fl: String? = null

    @Column(name = "net_value_t1rg")
    private val netValueT1rg: String? = null

    @Column(name = "net_value_t1fl")
    private val netValueT1fl: String? = null

    @Column(name = "net_value_t2rg")
    private val netValueT2rg: String? = null

    @Column(name = "net_value_t2fl")
    private val netValueT2fl: String? = null

    @Column(name = "net_value_cp")
    private val netValueCp: String? = null

    @Column(name = "net_value_dif_t0rg")
    private val netValueDifT0rg: String? = null

    @Column(name = "net_value_dif_t0fl")
    private val netValueDifT0fl: String? = null

    @Column(name = "net_value_dif_t1rg")
    private val netValueDifT1rg: String? = null

    @Column(name = "net_value_dif_t1fl")
    private val netValueDifT1fl: String? = null

    @Column(name = "net_value_dif_t2rg")
    private val netValueDifT2rg: String? = null

    @Column(name = "net_value_dif_t2fl")
    private val netValueDifT2fl: String? = null

    @Column(name = "net_value_dif_max")
    private val netValueDifMax: String? = null

    @Column(name = "net_value_dif_max_round")
    private val netValueDifMaxRound: String? = null

    @Column(name = "cp_text")
    private val cpText: String? = null

    @Column(name = "basic_till_rec")
    private val basicTillRec: String? = null

    @Column(name = "ridging_rec")
    private val ridgingRec: String? = null

    @Column(name = "rec_text")
    private val recText: String? = null

    @Column(name = "harrow_text")
    private val harrowText: String? = null

    @Column(name = "harrow_text2")
    private val harrowText2: String? = null

    @Column(name = "cost_dif")
    private val costDif: String? = null

    @Column(name = "cost_dif_change")
    private val costDifChange: String? = null

    @Column(name = "cost_dif_abs")
    private val costDifAbs: String? = null

    @Column(name = "net_value_dif_curr")
    private val netValueDifCurr: String? = null

    @Column(name = "cost_dif_curr")
    private val costDifCurr: String? = null

    @Column(name = "opt_pp_note")
    private val optPpNote: String? = null

    @Column(name = "rec_note")
    private val recNote: String? = null

    @Column(name = "net_value_note")
    private val netValueNote: String? = null

    @Column(name = "cost_note1")
    private val costNote1: String? = null

    @Column(name = "cost_note2")
    private val costNote2: String? = null

    @Column(name = "ridging_note")
    private val ridgingNote: String? = null

    @Column(name = "tractor_note")
    private val tractorNote: String? = null

    @Column(name = "harrow_note")
    private val harrowNote: String? = null

    @Column(name = "validation_note")
    private val validationNote: String? = null

    @Column(name = "validation_note2")
    private val validationNote2: String? = null

    @Column(name = "validation_note3")
    private val validationNote3: String? = null

    @Column(name = "validation_note4")
    private val validationNote4: String? = null

    @Column(name = "validation_note5")
    private val validationNote5: String? = null

    @Column(name = "validation_note6")
    private val validationNote6: String? = null

    @Column(name = "plot3")
    private val plot3: String? = null

    @Column(name = "validation_note7")
    private val validationNote7: String? = null

    @Column(name = "basic_till_plot3")
    private val basicTillPlot3: String? = null

    @Column(name = "harrow_plot3")
    private val harrowPlot3: String? = null

    @Column(name = "ridging_plot3")
    private val ridgingPlot3: String? = null

    @Column(name = "basic_till_method_select1_plot3")
    private val basicTillMethodSelect1Plot3: String? = null

    @Column(name = "basic_till_method1_plot3")
    private val basicTillMethod1Plot3: String? = null

    @Column(name = "basic_till_method_select2_plot3")
    private val basicTillMethodSelect2Plot3: String? = null

    @Column(name = "basic_till_method2_plot3")
    private val basicTillMethod2Plot3: String? = null

    @Column(name = "harrow_select_plot3")
    private val harrowSelectPlot3: String? = null

    @Column(name = "harrow_plot31")
    private val harrowPlot31: String? = null

    @Column(name = "ridging_method_select_plot3")
    private val ridgingMethodSelectPlot3: String? = null

    @Column(name = "ridging_method_plot3")
    private val ridgingMethodPlot3: String? = null

    @Column(name = "planting_note")
    private val plantingNote: String? = null

    @Column(name = "weeding_note")
    private val weedingNote: String? = null

    @Column(name = "call_value")
    private val callValue: String? = null

    @Column(name = "confirm_val")
    private val confirmVal: String? = null

    @Column(name = "host_bpp3")
    private val hostBpp3: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    private val instanceId: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null
}