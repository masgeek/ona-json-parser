package com.tsobu.ona.core.dto.json.akilimo

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "uuid",
    "start0",
    "today",
    "deviceid",
    "subscriberid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "intro",
    "firstNameEN",
    "surNameEN",
    "genderEN",
    "time1",
    "sampling_note",
    "country",
    "partner",
    "monthYear",
    "gender",
    "lookup",
    "time2",
    "nameHH",
    "phoneNrHH",
    "event",
    "eventDate",
    "eventVenue",
    "eventCity",
    "confirmParticipant",
    "participated",
    "accepts",
    "time3",
    "use",
    "useCase",
    "useCasesOther",
    "AKILIMO_note",
    "tool_format",
    "supporting_material",
    "personal_support",
    "digital_channel",
    "time4",
    "uptake",
    "uptake_note",
    "FR1",
    "FR2",
    "FR3",
    "FR4",
    "FR5",
    "FR6",
    "CIS1",
    "CIS2",
    "CIS3",
    "CIS4",
    "CIS5",
    "CIS6",
    "CIM1",
    "CIM2",
    "CIM3",
    "CIM4",
    "CIM5",
    "CIM6",
    "PP_WM1",
    "PP_WM2",
    "PP_WM3",
    "PP_WM4",
    "PP_WM5",
    "PP_WM6",
    "SP_HS1",
    "SP_HS2",
    "SP_HS3",
    "SP_HS4",
    "SP_HS5",
    "SP_HS6",
    "time5",
    "perceptions_note",
    "random_draw",
    "scaled_draw",
    "perceptions_repeat_count",
    "SET-OF-perceptions-perceptions_repeat",
    "time6",
    "charHH_note",
    "totalArea",
    "unitArea",
    "propArea_cassava",
    "propAgriculture",
    "propCassava",
    "assets",
    "poschanges",
    "time7",
    "noteHH",
    "genderHH",
    "HHH",
    "ageHH",
    "educationHH",
    "time8",
    "thankyou",
    "end",
    "instanceID",
    "KEY"
)

class UseUptakeDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start0")
    var start0: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("firstNameEN")
    var firstNameEn: String? = null

    @JsonProperty("surNameEN")
    var surNameEn: String? = null

    @JsonProperty("genderEN")
    var genderEn: String? = null

    @JsonProperty("time1")
    var time1: String? = null

    @JsonProperty("sampling_note")
    var samplingNote: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("partner")
    var partner: String? = null

    @JsonProperty("monthYear")
    var monthYear: String? = null

    @JsonProperty("gender")
    var gender: String? = null

    @JsonProperty("lookup")
    var lookup: String? = null

    @JsonProperty("time2")
    var time2: String? = null

    @JsonProperty("nameHH")
    var nameHH: String? = null

    @JsonProperty("phoneNrHH")
    var phoneNrHH: String? = null

    @JsonProperty("event")
    var event: String? = null

    @JsonProperty("eventDate")
    var eventDate: String? = null

    @JsonProperty("eventVenue")
    var eventVenue: String? = null

    @JsonProperty("eventCity")
    var eventCity: String? = null

    @JsonProperty("confirmParticipant")
    var confirmParticipant: String? = null

    @JsonProperty("participated")
    var participated: String? = null

    @JsonProperty("accepts")
    var accepts: String? = null

    @JsonProperty("time3")
    var time3: String? = null

    @JsonProperty("use")
    var useValue: String? = null

    @JsonProperty("useCase")
    var useCase: String? = null

    @JsonProperty("useCasesOther")
    var useCasesOther: String? = null

    @JsonProperty("AKILIMO_note")
    var aKILIMONote: String? = null

    @JsonProperty("tool_format")
    var toolFormat: String? = null

    @JsonProperty("supporting_material")
    var supportingMaterial: String? = null

    @JsonProperty("personal_support")
    var personalSupport: String? = null

    @JsonProperty("digital_channel")
    var digitalChannel: String? = null

    @JsonProperty("time4")
    var time4: String? = null

    @JsonProperty("uptake")
    var uptake: String? = null

    @JsonProperty("uptake_note")
    var uptakeNote: String? = null

    @JsonProperty("FR1")
    var fr1: String? = null

    @JsonProperty("FR2")
    var fr2: String? = null

    @JsonProperty("FR3")
    var fr3: String? = null

    @JsonProperty("FR4")
    var fr4: String? = null

    @JsonProperty("FR5")
    var fr5: String? = null

    @JsonProperty("FR6")
    var fr6: String? = null

    @JsonProperty("CIS1")
    var cis1: String? = null

    @JsonProperty("CIS2")
    var cis2: String? = null

    @JsonProperty("CIS3")
    var cis3: String? = null

    @JsonProperty("CIS4")
    var cis4: String? = null

    @JsonProperty("CIS5")
    var cis5: String? = null

    @JsonProperty("CIS6")
    var cis6: String? = null

    @JsonProperty("CIM1")
    var cim1: String? = null

    @JsonProperty("CIM2")
    var cim2: String? = null

    @JsonProperty("CIM3")
    var cim3: String? = null

    @JsonProperty("CIM4")
    var cim4: String? = null

    @JsonProperty("CIM5")
    var cim5: String? = null

    @JsonProperty("CIM6")
    var cim6: String? = null

    @JsonProperty("PP_WM1")
    var ppWm1: String? = null

    @JsonProperty("PP_WM2")
    var ppWm2: String? = null

    @JsonProperty("PP_WM3")
    var ppWm3: String? = null

    @JsonProperty("PP_WM4")
    var ppWm4: String? = null

    @JsonProperty("PP_WM5")
    var ppWm5: String? = null

    @JsonProperty("PP_WM6")
    var ppWm6: String? = null

    @JsonProperty("SP_HS1")
    var spHs1: String? = null

    @JsonProperty("SP_HS2")
    var spHs2: String? = null

    @JsonProperty("SP_HS3")
    var spHs3: String? = null

    @JsonProperty("SP_HS4")
    var spHs4: String? = null

    @JsonProperty("SP_HS5")
    var spHs5: String? = null

    @JsonProperty("SP_HS6")
    var spHs6: String? = null

    @JsonProperty("time5")
    var time5: String? = null

    @JsonProperty("perceptions_note")
    var perceptionsNote: String? = null

    @JsonProperty("random_draw")
    var randomDraw: String? = null

    @JsonProperty("scaled_draw")
    var scaledDraw: String? = null

    @JsonProperty("perceptions_repeat_count")
    var perceptionsRepeatCount: String? = null

    @JsonProperty("SET-OF-perceptions-perceptions_repeat")
    var setOfPerceptionsPerceptionsRepeat: String? = null

    @JsonProperty("time6")
    var time6: String? = null

    @JsonProperty("charHH_note")
    var charHHNote: String? = null

    @JsonProperty("totalArea")
    var totalArea: String? = null

    @JsonProperty("unitArea")
    var unitArea: String? = null

    @JsonProperty("propArea_cassava")
    var propAreaCassava: String? = null

    @JsonProperty("propAgriculture")
    var propAgriculture: String? = null

    @JsonProperty("propCassava")
    var propCassava: String? = null

    @JsonProperty("assets")
    var assets: String? = null

    @JsonProperty("poschanges")
    var poschanges: String? = null

    @JsonProperty("time7")
    var time7: String? = null

    @JsonProperty("noteHH")
    var noteHH: String? = null

    @JsonProperty("genderHH")
    var genderHH: String? = null

    @JsonProperty("HHH")
    var hhh: String? = null

    @JsonProperty("ageHH")
    var ageHH: String? = null

    @JsonProperty("educationHH")
    var educationHH: String? = null

    @JsonProperty("time8")
    var time8: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}