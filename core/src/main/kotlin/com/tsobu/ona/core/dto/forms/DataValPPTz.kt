package com.tsobu.parser.core.dto.forms

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.core.dto.BaseFormData
import com.tsobu.ona.core.dto.ProblemWeed


@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class DataValPPTz : BaseFormData() {
    @JsonProperty("CP")
    var cP: String? = null

    @JsonProperty("PW")
    var problemWeed: List<ProblemWeed>? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null


    @JsonProperty("plotL")
    var plotL: String? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("slash")
    var slash: String? = null

    @JsonProperty("spray")
    var spray: String? = null


    @JsonProperty("CPtext")
    var cPtext: String? = null

    @JsonProperty("costCP")
    var costCP: String? = null

    @JsonProperty("season")
    var season: String? = null


    @JsonProperty("costDif")
    var costDif: String? = null

    @JsonProperty("recText")
    var recText: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("PW_count")
    var pWCount: String? = null


    @JsonProperty("costT0FL")
    var costT0FL: String? = null

    @JsonProperty("costT0RG")
    var costT0RG: String? = null

    @JsonProperty("costT1FL")
    var costT1FL: String? = null

    @JsonProperty("costT1RG")
    var costT1RG: String? = null

    @JsonProperty("costT2FL")
    var costT2FL: String? = null

    @JsonProperty("costT2RG")
    var costT2RG: String? = null

    @JsonProperty("currentY")
    var currentY: String? = null


    @JsonProperty("plotSize")
    var plotSize: String? = null


    @JsonProperty("implement")
    var implement: String? = null

    @JsonProperty("costCPcurr")
    var costCPcurr: String? = null

    @JsonProperty("costDifAbs")
    var costDifAbs: String? = null

    @JsonProperty("fallowType")
    var fallowType: String? = null

    @JsonProperty("harrowCost")
    var harrowCost: String? = null

    @JsonProperty("harrowText")
    var harrowText: String? = null

    @JsonProperty("netValueCP")
    var netValueCP: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: Int? = null

    @JsonProperty("ridgingRec")
    var ridgingRec: String? = null

    @JsonProperty("costDifcurr")
    var costDifcurr: String? = null

    @JsonProperty("harrowText2")
    var harrowText2: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

    @JsonProperty("ridgingCost")
    var ridgingCost: String? = null

    @JsonProperty("weedingCost")
    var weedingCost: String? = null

    @JsonProperty("basicTillRec")
    var basicTillRec: String? = null


    @JsonProperty("grossValueCP")
    var grossValueCP: String? = null

    @JsonProperty("netValueT0FL")
    var netValueT0FL: String? = null

    @JsonProperty("netValueT0RG")
    var netValueT0RG: String? = null

    @JsonProperty("netValueT1FL")
    var netValueT1FL: String? = null

    @JsonProperty("netValueT1RG")
    var netValueT1RG: String? = null

    @JsonProperty("netValueT2FL")
    var netValueT2FL: String? = null

    @JsonProperty("netValueT2RG")
    var netValueT2RG: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("problemWeeds")
    var problemWeeds: String? = null

    @JsonProperty("costDifChange")
    var costDifChange: String? = null

    @JsonProperty("thankyou/call")
    var thankyouCall: String? = null

    @JsonProperty("tractorAccess")
    var tractorAccess: String? = null

    @JsonProperty("basicTill1Cost")
    var basicTill1Cost: String? = null

    @JsonProperty("basicTill2Cost")
    var basicTill2Cost: String? = null

    @JsonProperty("grossValueT0FL")
    var grossValueT0FL: String? = null

    @JsonProperty("grossValueT0RG")
    var grossValueT0RG: String? = null

    @JsonProperty("grossValueT1FL")
    var grossValueT1FL: String? = null

    @JsonProperty("grossValueT1RG")
    var grossValueT1RG: String? = null

    @JsonProperty("grossValueT2FL")
    var grossValueT2FL: String? = null

    @JsonProperty("grossValueT2RG")
    var grossValueT2RG: String? = null

    @JsonProperty("netValueDifMax")
    var netValueDifMax: String? = null

    @JsonProperty("herbicideAccess")
    var herbicideAccess: String? = null


    @JsonProperty("netValueDifT0FL")
    var netValueDifT0FL: String? = null

    @JsonProperty("netValueDifT0RG")
    var netValueDifT0RG: String? = null

    @JsonProperty("netValueDifT1FL")
    var netValueDifT1FL: String? = null

    @JsonProperty("netValueDifT1RG")
    var netValueDifT1RG: String? = null

    @JsonProperty("netValueDifT2FL")
    var netValueDifT2FL: String? = null

    @JsonProperty("netValueDifT2RG")
    var netValueDifT2RG: String? = null

    @JsonProperty("netValueDifcurr")
    var netValueDifcurr: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("currentYieldLevel")
    var currentYieldLevel: String? = null


    @JsonProperty("netValueDifMaxRound")
    var netValueDifMaxRound: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var thankyouConfirmVAL: String? = null

    @JsonProperty("cost/harrowTractorCost")
    var costHarrowTractorCost: Int? = null

    @JsonProperty("cost/ridgingManualCost")
    var costRidgingManualCost: Int? = null

    @JsonProperty("cost/weedingManualCost")
    var costWeedingManualCost: Int? = null

    @JsonProperty("cost/ridgingTractorCost")
    var costRidgingTractorCost: Int? = null

    @JsonProperty("currentPractice/ridging")
    var currentPracticeRidging: String? = null

    @JsonProperty("densityDetails/withinRow")
    var densityDetailsWithinRow: Double? = null

    @JsonProperty("cost/basicTill1ManualCost")
    var costBasicTill1ManualCost: Int? = null

    @JsonProperty("cost/basicTill2ManualCost")
    var costBasicTill2ManualCost: Int? = null

    @JsonProperty("cost/weedingHerbicideCost")
    var costWeedingHerbicideCost: Int? = null

    @JsonProperty("currentPractice/basicTill")
    var currentPracticeBasicTill: String? = null

    @JsonProperty("densityDetails/betweenRow")
    var densityDetailsBetweenRow: Int? = null

    @JsonProperty("cost/basicTill1TractorCost")
    var costBasicTill1TractorCost: Int? = null

    @JsonProperty("cost/basicTill2TractorCost")
    var costBasicTill2TractorCost: Int? = null

    @JsonProperty("currentPractice/harrowSelect")
    var currentPracticeHarrowSelect: String? = null

    @JsonProperty("currentPracticeDetails/harrow")
    var currentPracticeDetailsHarrow: String? = null

    @JsonProperty("currentPractice/weedingMethodSelect")
    var currentPracticeWeedingMethodSelect: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethod")
    var currentPracticeDetailsRidgingMethod: String? = null

    @JsonProperty("currentPracticeDetails/weedingMethod")
    var currentPracticeDetailsWeedingMethod: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethod1")
    var currentPracticeDetailsBasicTillMethod1: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethodSelect")
    var currentPracticeDetailsRidgingMethodSelect: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethodSelect1")
    var currentPracticeDetailsBasicTillMethodSelect1: String? = null
}