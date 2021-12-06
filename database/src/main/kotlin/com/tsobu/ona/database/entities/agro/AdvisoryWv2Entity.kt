package com.tsobu.ona.database.entities.agro

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "agro_advisory_wv2")
@Entity
class AdvisoryWv2Entity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "subscriberid")
    var subscriberid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "generated_note_name_11")
    var generatedNoteName11: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "generated_note_name_16")
    var generatedNoteName16: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "eaidscan")
    var eaidscan: String? = null

    @Column(name = "eaidtext")
    var eaidtext: String? = null

    @Column(name = "generated_note_name_22")
    var generatedNoteName22: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "hhidscan")
    var hhidscan: String? = null

    @Column(name = "hhidtext")
    var hhidtext: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "generated_note_name_29")
    var generatedNoteName29: String? = null

    @Column(name = "hasc1")
    var hasc1: String? = null

    @Column(name = "hasc2")
    var hasc2: String? = null

    @Column(name = "hasc3")
    var hasc3: String? = null

    @Column(name = "hasc4")
    var hasc4: String? = null

    @Column(name = "hasc5")
    var hasc5: String? = null

    @Column(name = "geopoint_latitude")
    var geopointLatitude: String? = null

    @Column(name = "geopoint_longitude")
    var geopointLongitude: String? = null

    @Column(name = "geopoint_altitude")
    var geopointAltitude: String? = null

    @Column(name = "geopoint_accuracy")
    var geopointAccuracy: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "rate_urea")
    var rateUrea: String? = null

    @Column(name = "rate_nps")
    var rateNps: String? = null

    @Column(name = "quantity_urea_k")
    var quantityUreaK: String? = null

    @Column(name = "quantity_npsk")
    var quantityNpsk: String? = null

    @Column(name = "quantity_urea")
    var quantityUrea: String? = null

    @Column(name = "quantity_nps")
    var quantityNps: String? = null

    @Column(name = "rate_urea_stand")
    var rateUreaStand: String? = null

    @Column(name = "rate_nps_stand")
    var rateNpsStand: String? = null

    @Column(name = "rate_urea_local")
    var rateUreaLocal: String? = null

    @Column(name = "rate_nps_local")
    var rateNpsLocal: String? = null

    @Column(name = "no_recommendation_note")
    var noRecommendationNote: String? = null

    @Column(name = "no_fertilizer_note")
    var noFertilizerNote: String? = null

    @Column(name = "generated_note_name_53")
    var generatedNoteName53: String? = null

    @Column(name = "validation_note2")
    var validationNote2: String? = null

    @Column(name = "rate_urea1stapp")
    var rateUrea1stapp: String? = null

    @Column(name = "rate_urea2ndapp")
    var rateUrea2ndapp: String? = null

    @Column(name = "rate_urea1stapp_stand")
    var rateUrea1stappStand: String? = null

    @Column(name = "rate_urea2ndapp_stand")
    var rateUrea2ndappStand: String? = null

    @Column(name = "rate_urea1stapp_local")
    var rateUrea1stappLocal: String? = null

    @Column(name = "rate_urea2ndapp_local")
    var rateUrea2ndappLocal: String? = null

    @Column(name = "rate_nps_note_val")
    var rateNpsNoteVal: String? = null

    @Column(name = "rate_urea_val1")
    var rateUreaVal1: String? = null

    @Column(name = "rate_urea_val2")
    var rateUreaVal2: String? = null

    @Column(name = "generated_note_name_66")
    var generatedNoteName66: String? = null

    @Column(name = "validation_note21")
    var validationNote21: String? = null

    @Column(name = "rate_nps_note_stand")
    var rateNpsNoteStand: String? = null

    @Column(name = "rate_urea_stand1")
    var rateUreaStand1: String? = null

    @Column(name = "rate_urea_stand2")
    var rateUreaStand2: String? = null

    @Column(name = "generated_note_name_73")
    var generatedNoteName73: String? = null

    @Column(name = "validation_note22")
    var validationNote22: String? = null

    @Column(name = "rate_nps_note_local")
    var rateNpsNoteLocal: String? = null

    @Column(name = "rate_urea_local1")
    var rateUreaLocal1: String? = null

    @Column(name = "rate_urea_local2")
    var rateUreaLocal2: String? = null

    @Column(name = "pldatenote")
    var pldatenote: String? = null

    @Column(name = "earlyplm")
    var earlyplm: String? = null

    @Column(name = "optimalplm")
    var optimalplm: String? = null

    @Column(name = "lateplm")
    var lateplm: String? = null

    @Column(name = "earlypld")
    var earlypld: String? = null

    @Column(name = "optimalpld")
    var optimalpld: String? = null

    @Column(name = "latepld")
    var latepld: String? = null

    @Column(name = "optimal_date")
    var optimalDate: LocalDateTime? = null

    @Column(name = "early_date")
    var earlyDate: LocalDateTime? = null

    @Column(name = "late_date")
    var lateDate: LocalDateTime? = null

    @Column(name = "generated_note_name_90")
    var generatedNoteName90: String? = null

    @Column(name = "rate_fertilizer_note_val")
    var rateFertilizerNoteVal: String? = null

    @Column(name = "rate_urea_np_sha")
    var rateUreaNpSha: String? = null

    @Column(name = "rate_fertilizer_noteha")
    var rateFertilizerNoteha: String? = null

    @Column(name = "rate_urea_nps_kert")
    var rateUreaNpsKert: String? = null

    @Column(name = "spliadvice")
    var spliadvice: String? = null

    @Column(name = "thankyou")
    var thankyou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instanceid")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}