package com.tsobu.ona.forms.akilimo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class UseUptakeForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("start0")
    var start0: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formHubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: Any? = null

    @JsonProperty("intro/genderEN")
    var genderEn: String? = null

    @JsonProperty("intro/surNameEN")
    var surNameEn: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("sampling/gender")
    var gender: String? = null

    @JsonProperty("sampling/lookup")
    var lookup: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("sampling/country")
    var country: String? = null

    @JsonProperty("sampling/partner")
    var partner: String? = null

    @JsonProperty("intro/firstNameEN")
    var firstNameEn: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("sampling/monthYear")
    var monthYear: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("participantDetails/event")
    var event: String? = null

    @JsonProperty("participantDetails/nameHH")
    var nameHH: String? = null

    @JsonProperty("participantDetails/start1")
    var start1: String? = null

    @JsonProperty("participantDetails/eventCity")
    var eventCity: String? = null

    @JsonProperty("participantDetails/eventDate")
    var eventDate: String? = null

    @JsonProperty("participantDetails/phoneNrHH")
    var phoneNrHH: String? = null

    @JsonProperty("participantDetails/eventVenue")
    var eventVenue: String? = null

    @JsonProperty("participantDetails/confirmParticipant")
    var confirmParticipant: String? = null

    @JsonProperty("HH/HHH")
    var hhh: String? = null

    @JsonProperty("HH/ageHH")
    var ageHH: String? = null

    @JsonProperty("HH/start6")
    var start6: String? = null

    @JsonProperty("HH/genderHH")
    var genderHH: String? = null

    @JsonProperty("charHH/assets")
    var assets: String? = null

    @JsonProperty("charHH/start5")
    var start5: String? = null

    @JsonProperty("HH/educationHH")
    var educationHH: String? = null

    @JsonProperty("AKILIMO_use/use")
    var useValue: String? = null

    @JsonProperty("charHH/unitArea")
    var unitArea: String? = null

    @JsonProperty("charHH/totalArea")
    var totalArea: Int? = null

    @JsonProperty("charHH/poschanges")
    var posChanges: String? = null

    @JsonProperty("AKILIMO_use/start2")
    var start2: String? = null

    @JsonProperty("charHH/propCassava")
    var propCassava: String? = null

    @JsonProperty("perceptions/start4")
    var start4: String? = null

    @JsonProperty("AKILIMO_use/useCase")
    var useCase: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM1")
    var ppWm1: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM2")
    var ppWm2: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM3")
    var ppWm3: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM4")
    var ppWm4: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM5")
    var ppWm5: String? = null

    @JsonProperty("AKILIMO_uptake/PP_WM6")
    var ppWm6: String? = null

    @JsonProperty("AKILIMO_uptake/start3")
    var start3: String? = null

    @JsonProperty("AKILIMO_uptake/uptake")
    var uptake: String? = null

    @JsonProperty("charHH/propAgriculture")
    var propAgriculture: String? = null

    @JsonProperty("AKILIMO_use/tool_format")
    var toolFormat: String? = null

    @JsonProperty("charHH/propArea_cassava")
    var propAreaCassava: String? = null

    @JsonProperty("perceptions/random_draw")
    var randomDraw: String? = null

    @JsonProperty("perceptions/scaled_draw")
    var scaledDraw: String? = null

    @JsonProperty("participantDetails/accepts")
    var accepts: String? = null

    @JsonProperty("AKILIMO_use/personal_support")
    var personalSupport: String? = null

    @JsonProperty("perceptions/perceptions_repeat")
    var perceptionsRepeatList: List<PerceptionsRepeatForm> = ArrayList()

    @JsonProperty("AKILIMO_use/supporting_material")
    var supportingMaterial: String? = null

    @JsonProperty("participantDetails/participated")
    var participated: String? = null

    @JsonProperty("perceptions/perceptions_repeat_count")
    var perceptionsRepeatCount: String? = null

    @JsonProperty("AKILIMO_uptake/CIM1")
    var ciM1: String? = null

    @JsonProperty("AKILIMO_uptake/CIM2")
    var ciM2: String? = null

    @JsonProperty("AKILIMO_uptake/CIM3")
    var ciM3: String? = null

    @JsonProperty("AKILIMO_uptake/CIM4")
    var ciM4: String? = null

    @JsonProperty("AKILIMO_uptake/CIM5")
    var ciM5: String? = null

    @JsonProperty("AKILIMO_uptake/CIM6")
    var ciM6: String? = null

    @JsonProperty("AKILIMO_use/useCasesOther")
    var useCasesOther: String? = null

    @JsonProperty("AKILIMO_use/digital_channel")
    var digitalChannel: String? = null

    @JsonProperty("AKILIMO_uptake/FR1")
    var fr1: String? = null

    @JsonProperty("AKILIMO_uptake/FR2")
    var fr2: String? = null

    @JsonProperty("AKILIMO_uptake/FR3")
    var fr3: String? = null

    @JsonProperty("AKILIMO_uptake/FR4")
    var fr4: String? = null

    @JsonProperty("AKILIMO_uptake/FR5")
    var fr5: String? = null

    @JsonProperty("AKILIMO_uptake/FR6")
    var fr6: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS1")
    var spHs1: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS2")
    var spHs2: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS3")
    var spHs3: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS4")
    var spHs4: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS5")
    var spHs5: String? = null

    @JsonProperty("AKILIMO_uptake/SP_HS6")
    var spHs6: String? = null

    @JsonProperty("AKILIMO_uptake/CIS1")
    var ciS1: String? = null

    @JsonProperty("AKILIMO_uptake/CIS2")
    var ciS2: String? = null

    @JsonProperty("AKILIMO_uptake/CIS3")
    var ciS3: String? = null

    @JsonProperty("AKILIMO_uptake/CIS4")
    var ciS4: String? = null

    @JsonProperty("AKILIMO_uptake/CIS5")
    var ciS5: String? = null

    @JsonProperty("AKILIMO_uptake/CIS6")
    var ciS6: String? = null

    @JsonProperty("HH/time8")
    var time8: String? = null

    @JsonProperty("intro/time1")
    var time1: String? = null

    @JsonProperty("charHH/time7")
    var time7: String? = null

    @JsonProperty("sampling/time2")
    var time2: String? = null

    @JsonProperty("AKILIMO_use/time4")
    var time4: String? = null

    @JsonProperty("perceptions/time6")
    var time6: String? = null

    @JsonProperty("AKILIMO_uptake/time5")
    var time5: String? = null

    @JsonProperty("participantDetails/time3")
    var time3: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null
}