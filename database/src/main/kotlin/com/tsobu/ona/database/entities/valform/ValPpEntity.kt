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
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

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
    var plantingDate: LocalDateTime? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "fallow_type")
    var fallowType: String? = null

    @Column(name = "fallow_height")
    var fallowHeight: String? = null

    @Column(name = "fallow_age")
    var fallowAge: String? = null

    @Column(name = "fallow_green")
    var fallowGreen: String? = null

    @Column(name = "problem_weeds")
    var problemWeeds: String? = null

    @Column(name = "pw_count")
    var pwCount: String? = null

    @Column(name = "set_of_pw")
    var setOfPw: String? = null

    @Column(name = "slash")
    var slash: String? = null

    @Column(name = "spray")
    var spray: String? = null

    /*
    @Column(name = "slash1_spray1_note")
    var slash1Spray1Note: String? = null

    @Column(name = "slash1_spray0_note")
    var slash1Spray0Note: String? = null

    @Column(name = "slash0_spray1_note")
    var slash0Spray1Note: String? = null

    @Column(name = "slash0_spray0_note")
    var slash0Spray0Note: String? = null
*/
    @Column(name = "tractor_access")
    var tractorAccess: String? = null

    @Column(name = "implement")
    var implement: String? = null

    @Column(name = "herbicide_access")
    var herbicideAccess: String? = null

    @Column(name = "basic_till")
    var basicTill: String? = null

    @Column(name = "harrow_select")
    var harrowSelect: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "weeding_method_select")
    var weedingMethodSelect: String? = null

    @Column(name = "basic_till_method_select1")
    var basicTillMethodSelect1: String? = null

    @Column(name = "basic_till_method_1")
    var basicTillMethod1: String? = null

    @Column(name = "basic_till_method_select2")
    var basicTillMethodSelect2: String? = null

    @Column(name = "basic_till_method_2")
    var basicTillMethod2: String? = null

    @Column(name = "harrow")
    var harrow: String? = null

    @Column(name = "ridging_method_select")
    var ridgingMethodSelect: String? = null

    @Column(name = "ridging_method")
    var ridgingMethod: String? = null

    @Column(name = "weeding_method")
    var weedingMethod: String? = null

    @Column(name = "current_y")
    var currentY: String? = null

    @Column(name = "current_yield_level")
    var currentYieldLevel: String? = null

    @Column(name = "cp")
    var cp: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "plotl")
    var plotl: String? = null

    @Column(name = "plotw")
    var plotw: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "cost_note")
    var costNote: String? = null

    @Column(name = "basic_till1_manual_cost")
    var basicTill1ManualCost: String? = null

    @Column(name = "basic_till1_tractor_cost")
    var basicTill1TractorCost: String? = null

    @Column(name = "basic_till2_manual_cost")
    var basicTill2ManualCost: String? = null

    @Column(name = "basic_till2_tractor_cost")
    var basicTill2TractorCost: String? = null

    @Column(name = "harrow_tractor_cost")
    var harrowTractorCost: String? = null

    @Column(name = "ridging_manual_cost")
    var ridgingManualCost: String? = null

    @Column(name = "ridging_tractor_cost")
    var ridgingTractorCost: String? = null

    @Column(name = "weeding_manual_cost")
    var weedingManualCost: String? = null

    @Column(name = "weeding_herbicide_cost")
    var weedingHerbicideCost: String? = null

    @Column(name = "price_roots")
    var priceRoots: String? = null

    @Column(name = "basic_till1_cost")
    var basicTill1Cost: String? = null

    @Column(name = "basic_till2_cost")
    var basicTill2Cost: String? = null

    @Column(name = "harrow_cost")
    var harrowCost: String? = null

    @Column(name = "ridging_cost")
    var ridgingCost: String? = null

    @Column(name = "weeding_cost")
    var weedingCost: String? = null

    @Column(name = "costt0rg")
    var costt0rg: String? = null

    @Column(name = "costt0fl")
    var costt0fl: String? = null

    @Column(name = "costt1rg")
    var costt1rg: String? = null

    @Column(name = "costt1fl")
    var costt1fl: String? = null

    @Column(name = "costt2rg")
    var costt2rg: String? = null

    @Column(name = "costt2fl")
    var costt2fl: String? = null

    @Column(name = "cost_cp")
    var costCp: String? = null

    @Column(name = "costcpcurr")
    var costcpcurr: String? = null

    @Column(name = "gross_value_t0rg")
    var grossValueT0rg: String? = null

    @Column(name = "gross_value_t0fl")
    var grossValueT0fl: String? = null

    @Column(name = "gross_value_t1rg")
    var grossValueT1rg: String? = null

    @Column(name = "gross_value_t1fl")
    var grossValueT1fl: String? = null

    @Column(name = "gross_value_t2rg")
    var grossValueT2rg: String? = null

    @Column(name = "gross_value_t2fl")
    var grossValueT2fl: String? = null

    @Column(name = "gross_value_cp")
    var grossValueCp: String? = null

    @Column(name = "net_value_t0rg")
    var netValueT0rg: String? = null

    @Column(name = "net_value_t0fl")
    var netValueT0fl: String? = null

    @Column(name = "net_value_t1rg")
    var netValueT1rg: String? = null

    @Column(name = "net_value_t1fl")
    var netValueT1fl: String? = null

    @Column(name = "net_value_t2rg")
    var netValueT2rg: String? = null

    @Column(name = "net_value_t2fl")
    var netValueT2fl: String? = null

    @Column(name = "net_value_cp")
    var netValueCp: String? = null

    @Column(name = "net_value_dift0rg")
    var netValueDift0rg: String? = null

    @Column(name = "net_value_dift0fl")
    var netValueDift0fl: String? = null

    @Column(name = "net_value_dift1rg")
    var netValueDift1rg: String? = null

    @Column(name = "net_value_dift1fl")
    var netValueDift1fl: String? = null

    @Column(name = "net_value_dift2rg")
    var netValueDift2rg: String? = null

    @Column(name = "net_value_dift2fl")
    var netValueDift2fl: String? = null

    @Column(name = "net_value_difmax")
    var netValueDifmax: String? = null

    @Column(name = "net_value_dif_max_round")
    var netValueDifMaxRound: String? = null

    @Column(name = "cp_text")
    var cpText: String? = null

    @Column(name = "basic_till_rec")
    var basicTillRec: String? = null

    @Column(name = "ridging_rec")
    var ridgingRec: String? = null

    @Column(name = "rec_text")
    var recText: String? = null

    @Column(name = "harrow_text")
    var harrowText: String? = null

    @Column(name = "harrow_text2")
    var harrowText2: String? = null

    @Column(name = "cost_dif")
    var costDif: String? = null

    @Column(name = "cost_dif_change")
    var costDifChange: String? = null

    @Column(name = "cost_dif_abs")
    var costDifAbs: String? = null

    @Column(name = "net_value_dif_curr")
    var netValueDifCurr: String? = null

    @Column(name = "cost_dif_curr")
    var costDifCurr: String? = null

    @Column(name = "opt_pp_note")
    var optPpNote: String? = null

    @Column(name = "rec_note")
    var recNote: String? = null

    @Column(name = "net_value_note")
    var netValueNote: String? = null

    @Column(name = "cost_note1")
    var costNote1: String? = null

    @Column(name = "cost_note2")
    var costNote2: String? = null

    @Column(name = "ridging_note")
    var ridgingNote: String? = null

    @Column(name = "tractor_note")
    var tractorNote: String? = null

    @Column(name = "harrow_note")
    var harrowNote: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "validation_note2")
    var validationNote2: String? = null

    @Column(name = "validation_note3")
    var validationNote3: String? = null

    @Column(name = "validation_note4")
    var validationNote4: String? = null

    @Column(name = "validation_note5")
    var validationNote5: String? = null

    @Column(name = "validation_note6")
    var validationNote6: String? = null

    @Column(name = "plot3")
    var plot3: String? = null

    @Column(name = "validation_note7")
    var validationNote7: String? = null

    @Column(name = "basic_till_plot3")
    var basicTillPlot3: String? = null

    @Column(name = "harrow_plot3")
    var harrowPlot3: String? = null

    @Column(name = "ridging_plot3")
    var ridgingPlot3: String? = null

    @Column(name = "basic_till_method_select1_plot3")
    var basicTillMethodSelect1Plot3: String? = null

    @Column(name = "basic_till_method_1_plot3")
    var basicTillMethod1Plot3: String? = null

    @Column(name = "basic_till_method_select2_plot3")
    var basicTillMethodSelect2Plot3: String? = null

    @Column(name = "basic_till_method_2_plot3")
    var basicTillMethod2Plot3: String? = null

    @Column(name = "harrow_select_plot3")
    var harrowSelectPlot3: String? = null

    @Column(name = "harrow_plot31")
    var harrowPlot31: String? = null

    @Column(name = "ridging_method_select_plot3")
    var ridgingMethodSelectPlot3: String? = null

    @Column(name = "ridging_method_plot3")
    var ridgingMethodPlot3: String? = null

    @Column(name = "planting_note")
    var plantingNote: String? = null

    @Column(name = "weeding_note")
    var weedingNote: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "confirm_val")
    var confirmVal: String? = null

    @Column(name = "hostbpp3")
    var hostbpp3: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}