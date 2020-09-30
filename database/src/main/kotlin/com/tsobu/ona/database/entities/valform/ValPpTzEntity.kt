package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp_tz")
class ValPpTzEntity : BaseEntity() {
    @Column(name = "Submission_Date")
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

    @Column(name = "purpose_VAL")
    private val purposeVal: String? = null

    @Column(name = "EAID")
    private val EAID: String? = null

    @Column(name = "HHID")
    private val HHID: String? = null

    @Column(name = "country_Select")
    private val countrySelect: String? = null

    @Column(name = "country")
    private val country: String? = null

    @Column(name = "currency")
    private val currency: String? = null

    @Column(name = "conversion")
    private val conversion: String? = null

    @Column(name = "geo_point_Latitude")
    private val geoPointLatitude: String? = null

    @Column(name = "geo_point_Longitude")
    private val geoPointLongitude: String? = null

    @Column(name = "geo_point_Altitude")
    private val geoPointAltitude: String? = null

    @Column(name = "geo_point_Accuracy")
    private val geoPointAccuracy: String? = null

    @Column(name = "lat")
    private val lat: String? = null

    @Column(name = "lon")
    private val lon: String? = null

    @Column(name = "zone_value")
    private val zoneValue: String? = null

    @Column(name = "planting_Date")
    private val plantingDate: LocalDate? = null

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "fallow_Type")
    private val fallowType: String? = null

    @Column(name = "fallow_Height")
    private val fallowHeight: String? = null

    @Column(name = "fallow_Age")
    private val fallowAge: String? = null

    @Column(name = "fallow_Green")
    private val fallowGreen: String? = null

    @Column(name = "problem_Weeds")
    private val problemWeeds: String? = null

    @Column(name = "PW_count")
    private val pwCount: String? = null

    @Column(name = "SET_OF_PW")
    private val setOfPw: String? = null

    @Column(name = "slash")
    private val slash: String? = null

    @Column(name = "spray")
    private val spray: String? = null

    @Column(name = "slash1_spray1_Note")
    private val slash1Spray1Note: String? = null

    @Column(name = "slash1_spray0_Note")
    private val slash1Spray0Note: String? = null

    @Column(name = "slash0_spray1_Note")
    private val slash0Spray1Note: String? = null

    @Column(name = "slash0_spray0_Note")
    private val slash0Spray0Note: String? = null

    @Column(name = "tractor_Access")
    private val tractorAccess: String? = null

    @Column(name = "implement_value")
    private val implementValue: String? = null

    @Column(name = "herbicide_Access")
    private val herbicideAccess: String? = null

    @Column(name = "basic_Till")
    private val basicTill: String? = null

    @Column(name = "harrow_Select")
    private val harrowSelect: String? = null

    @Column(name = "ridging")
    private val ridging: String? = null

    @Column(name = "weeding_Method_Select")
    private val weedingMethodSelect: String? = null

    @Column(name = "basic_Till_Method_Select1")
    private val basicTillMethodSelect1: String? = null

    @Column(name = "basic_Till_Method1")
    private val basicTillMethod1: String? = null

    @Column(name = "basic_Till_Method_Select2")
    private val basicTillMethodSelect2: String? = null

    @Column(name = "basic_Till_Method2")
    private val basicTillMethod2: String? = null

    @Column(name = "harrow")
    private val harrow: String? = null

    @Column(name = "ridging_Method_Select")
    private val ridgingMethodSelect: String? = null

    @Column(name = "ridging_Method")
    private val ridgingMethod: String? = null

    @Column(name = "weeding_Method")
    private val weedingMethod: String? = null

    @Column(name = "current_Yield")
    private val currentYield: String? = null

    @Column(name = "current_Yield_Level")
    private val currentYieldLevel: String? = null

    @Column(name = "CP")
    private val CP: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "planting_Density")
    private val plantingDensity: String? = null

    @Column(name = "between_Row")
    private val betweenRow: String? = null

    @Column(name = "within_Row")
    private val withinRow: String? = null

    @Column(name = "plot_Length")
    private val plotLength: String? = null

    @Column(name = "plot_Width")
    private val plotWidth: String? = null

    @Column(name = "plot_Size")
    private val plotSize: String? = null

    @Column(name = "cost_Note")
    private val costNote: String? = null

    @Column(name = "basic_Till1_Manual_Cost")
    private val basicTill1ManualCost: String? = null

    @Column(name = "basic_Till1_Tractor_Cost")
    private val basicTill1TractorCost: String? = null

    @Column(name = "basic_Till2_Manual_Cost")
    private val basicTill2ManualCost: String? = null

    @Column(name = "basic_Till2_Tractor_Cost")
    private val basicTill2TractorCost: String? = null

    @Column(name = "harrow_Tractor_Cost")
    private val harrowTractorCost: String? = null

    @Column(name = "ridging_Manual_Cost")
    private val ridgingManualCost: String? = null

    @Column(name = "ridging_Tractor_Cost")
    private val ridgingTractorCost: String? = null

    @Column(name = "weeding_Manual_Cost")
    private val weedingManualCost: String? = null

    @Column(name = "weeding_Herbicide_Cost")
    private val weedingHerbicideCost: String? = null

    @Column(name = "price_Roots")
    private val priceRoots: String? = null

    @Column(name = "basic_Till1_Cost")
    private val basicTill1Cost: String? = null

    @Column(name = "basic_Till2_Cost")
    private val basicTill2Cost: String? = null

    @Column(name = "harrow_Cost")
    private val harrowCost: String? = null

    @Column(name = "ridging_Cost")
    private val ridgingCost: String? = null

    @Column(name = "weeding_Cost")
    private val weedingCost: String? = null

    @Column(name = "cost_T0RG")
    private val costT0rg: String? = null

    @Column(name = "cost_T0FL")
    private val costT0fl: String? = null

    @Column(name = "cost_T1RG")
    private val costT1rg: String? = null

    @Column(name = "cost_T1FL")
    private val costT1fl: String? = null

    @Column(name = "cost_T2RG")
    private val costT2rg: String? = null

    @Column(name = "cost_T2FL")
    private val costT2fl: String? = null

    @Column(name = "cost_CP")
    private val costCp: String? = null

    @Column(name = "cost_CP_curr")
    private val costCpCurr: String? = null

    @Column(name = "gross_Value_T0RG")
    private val grossValueT0rg: String? = null

    @Column(name = "gross_Value_T0FL")
    private val grossValueT0fl: String? = null

    @Column(name = "gross_Value_T1RG")
    private val grossValueT1rg: String? = null

    @Column(name = "gross_Value_T1FL")
    private val grossValueT1fl: String? = null

    @Column(name = "grossValueT2RG")
    private val grossValueT2RG: String? = null

    @Column(name = "gross_Value_T2FL")
    private val grossValueT2fl: String? = null

    @Column(name = "gross_Value_CP")
    private val grossValueCp: String? = null

    @Column(name = "net_Value_T0RG")
    private val netValueT0rg: String? = null

    @Column(name = "net_Value_T0FL")
    private val netValueT0fl: String? = null

    @Column(name = "net_Value_T1RG")
    private val netValueT1rg: String? = null

    @Column(name = "net_Value_T1FL")
    private val netValueT1fl: String? = null

    @Column(name = "net_Value_T2RG")
    private val netValueT2rg: String? = null

    @Column(name = "net_Value_T2FL")
    private val netValueT2fl: String? = null

    @Column(name = "net_Value_CP")
    private val netValueCp: String? = null

    @Column(name = "net_Value_Dif_T0RG")
    private val netValueDifT0rg: String? = null

    @Column(name = "net_Value_Dif_T0FL")
    private val netValueDifT0fl: String? = null

    @Column(name = "net_Value_Dif_T1RG")
    private val netValueDifT1rg: String? = null

    @Column(name = "net_Value_Dif_T1FL")
    private val netValueDifT1fl: String? = null

    @Column(name = "net_Value_Dif_T2RG")
    private val netValueDifT2rg: String? = null

    @Column(name = "net_Value_Dif_T2FL")
    private val netValueDifT2fl: String? = null

    @Column(name = "net_Value_Dif_Max")
    private val netValueDifMax: String? = null

    @Column(name = "net_Value_Dif_Max_Round")
    private val netValueDifMaxRound: String? = null

    @Column(name = "CP_text")
    private val cpText: String? = null

    @Column(name = "basic_Till_Rec")
    private val basicTillRec: String? = null

    @Column(name = "ridging_Rec")
    private val ridgingRec: String? = null

    @Column(name = "rec_Text")
    private val recText: String? = null

    @Column(name = "harrow_Text")
    private val harrowText: String? = null

    @Column(name = "harrow_Text2")
    private val harrowText2: String? = null

    @Column(name = "cost_Dif")
    private val costDif: String? = null

    @Column(name = "cost_Dif_Change")
    private val costDifChange: String? = null

    @Column(name = "cost_Dif_Abs")
    private val costDifAbs: String? = null

    @Column(name = "net_Value_Dif_curr")
    private val netValueDifCurr: String? = null

    @Column(name = "cost_Dif_curr")
    private val costDifCurr: String? = null

    @Column(name = "opt_PP_Note")
    private val optPpNote: String? = null

    @Column(name = "rec_Note")
    private val recNote: String? = null

    @Column(name = "net_Value_Note")
    private val netValueNote: String? = null

    @Column(name = "cost_Note1")
    private val costNote1: String? = null

    @Column(name = "cost_Note2")
    private val costNote2: String? = null

    @Column(name = "ridging_Note")
    private val ridgingNote: String? = null

    @Column(name = "tractor_Note")
    private val tractorNote: String? = null

    @Column(name = "harrow_Note")
    private val harrowNote: String? = null

    @Column(name = "validation_Note_EZ")
    private val validationNoteEz: String? = null

    @Column(name = "validation_Note_LZ")
    private val validationNoteLz: String? = null

    @Column(name = "planting_Note")
    private val plantingNote: String? = null

    @Column(name = "call_value")
    private val callValue: String? = null

    @Column(name = "confirm_VAL")
    private val confirmVal: String? = null

    @Column(name = "end_date")
    private val endDate: LocalDateTime? = null

    @Column(name = "instance_ID")
    private val instanceId: String? = null

    @Column(name = "control_KEY")
    private val controlKey: String? = null
}