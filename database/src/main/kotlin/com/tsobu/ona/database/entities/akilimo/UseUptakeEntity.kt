package com.tsobu.ona.database.entities.akilimo

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "akilimo_use_uptake")
@Entity
class UseUptakeEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start0")
    var start0: String? = null

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

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "first_name_en")
    var firstNameEn: String? = null

    @Column(name = "sur_name_en")
    var surNameEn: String? = null

    @Column(name = "gender_en")
    var genderEn: String? = null

    @Column(name = "time1")
    var time1: String? = null

    @Column(name = "sampling_note")
    var samplingNote: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "partner")
    var partner: String? = null

    @Column(name = "month_year")
    var monthYear: String? = null

    @Column(name = "gender")
    var gender: String? = null

    @Column(name = "lookup")
    var lookup: String? = null

    @Column(name = "time2")
    var time2: String? = null

    @Column(name = "name_hh")
    var nameHh: String? = null

    @Column(name = "phone_nr_hh")
    var phoneNrHh: String? = null

    @Column(name = "event")
    var event: String? = null

    @Column(name = "event_date")
    var eventDate: LocalDateTime? = null

    @Column(name = "event_venue")
    var eventVenue: String? = null

    @Column(name = "event_city")
    var eventCity: String? = null

    @Column(name = "confirm_participant")
    var confirmParticipant: String? = null

    @Column(name = "participated")
    var participated: String? = null

    @Column(name = "accepts")
    var accepts: String? = null

    @Column(name = "time3")
    var time3: String? = null

    @Column(name = "use_value")
    var useValue: String? = null

    @Column(name = "use_case")
    var useCase: String? = null

    @Column(name = "use_cases_other")
    var useCasesOther: String? = null

    @Column(name = "akilimo_note")
    var akilimoNote: String? = null

    @Column(name = "tool_format")
    var toolFormat: String? = null

    @Column(name = "supporting_material")
    var supportingMaterial: String? = null

    @Column(name = "personal_support")
    var personalSupport: String? = null

    @Column(name = "digital_channel")
    var digitalChannel: String? = null

    @Column(name = "time4")
    var time4: String? = null

    @Column(name = "uptake")
    var uptake: String? = null

    @Column(name = "uptake_note")
    var uptakeNote: String? = null

    @Column(name = "fr1")
    var fr1: String? = null

    @Column(name = "fr2")
    var fr2: String? = null

    @Column(name = "fr3")
    var fr3: String? = null

    @Column(name = "fr4")
    var fr4: String? = null

    @Column(name = "fr5")
    var fr5: String? = null

    @Column(name = "fr6")
    var fr6: String? = null

    @Column(name = "cis1")
    var cis1: String? = null

    @Column(name = "cis2")
    var cis2: String? = null

    @Column(name = "cis3")
    var cis3: String? = null

    @Column(name = "cis4")
    var cis4: String? = null

    @Column(name = "cis5")
    var cis5: String? = null

    @Column(name = "cis6")
    var cis6: String? = null

    @Column(name = "cim1")
    var cim1: String? = null

    @Column(name = "cim2")
    var cim2: String? = null

    @Column(name = "cim3")
    var cim3: String? = null

    @Column(name = "cim4")
    var cim4: String? = null

    @Column(name = "cim5")
    var cim5: String? = null

    @Column(name = "cim6")
    var cim6: String? = null

    @Column(name = "pp_wm1")
    var ppWm1: String? = null

    @Column(name = "pp_wm2")
    var ppWm2: String? = null

    @Column(name = "pp_wm3")
    var ppWm3: String? = null

    @Column(name = "pp_wm4")
    var ppWm4: String? = null

    @Column(name = "pp_wm5")
    var ppWm5: String? = null

    @Column(name = "pp_wm6")
    var ppWm6: String? = null

    @Column(name = "sp_hs1")
    var spHs1: String? = null

    @Column(name = "sp_hs2")
    var spHs2: String? = null

    @Column(name = "sp_hs3")
    var spHs3: String? = null

    @Column(name = "sp_hs4")
    var spHs4: String? = null

    @Column(name = "sp_hs5")
    var spHs5: String? = null

    @Column(name = "sp_hs6")
    var spHs6: String? = null

    @Column(name = "time5")
    var time5: String? = null

    @Column(name = "perceptions_note")
    var perceptionsNote: String? = null

    @Column(name = "random_draw")
    var randomDraw: String? = null

    @Column(name = "scaled_draw")
    var scaledDraw: String? = null

    @Column(name = "perceptions_repeat_count")
    var perceptionsRepeatCount: String? = null

    @Column(name = "set_of_perceptions_perceptions_repeat")
    var setOfPerceptionsPerceptionsRepeat: String? = null

    @Column(name = "time6")
    var time6: String? = null

    @Column(name = "char_hh_note")
    var charHhNote: String? = null

    @Column(name = "total_area")
    var totalArea: String? = null

    @Column(name = "unit_area")
    var unitArea: String? = null

    @Column(name = "prop_area_cassava")
    var propAreaCassava: String? = null

    @Column(name = "prop_agriculture")
    var propAgriculture: String? = null

    @Column(name = "prop_cassava")
    var propCassava: String? = null

    @Column(name = "assets")
    var assets: String? = null

    @Column(name = "pos_changes")
    var posChanges: String? = null

    @Column(name = "time7")
    var time7: String? = null

    @Column(name = "note_hh")
    var noteHh: String? = null

    @Column(name = "gender_hh")
    var genderHh: String? = null

    @Column(name = "hhh")
    var hhh: String? = null

    @Column(name = "age_hh")
    var ageHh: String? = null

    @Column(name = "education_hh")
    var educationHh: String? = null

    @Column(name = "time8")
    var time8: String? = null

    @Column(name = "thank_you")
    var thankYou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}