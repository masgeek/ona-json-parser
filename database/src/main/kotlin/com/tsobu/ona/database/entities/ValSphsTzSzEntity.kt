package com.tsobu.ona.database.entities

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_tzsz")
class ValSphsTzSzEntity : BaseEntity() {
    var submissionDate: LocalDateTime? = null
    var uuid: String? = null
    var startDate: LocalDateTime? = null
    var endDate: LocalDateTime? = null
    var todayDate: LocalDate? = null
    var deviceid: String? = null
    var subscriberId: String? = null
    var email: String? = null
    var username: String? = null
    var simserial: String? = null
    var phonenumber: String? = null
    var banner: String? = null
    var instanceid: String? = null
    var controlKey: String? = null
    var geoPointLatitude: Double? = null
    var geoPointLongitude: Double? = null
    var geoPointAltitude: Double? = null
    var geoPointAccuracy: Double? = null
    var lat: Double? = null
    var lon: Double? = null


    var intro: String? = null
    var intro2: String? = null
    var valSphs: String? = null
    var eaid: String? = null
    var hhid: String? = null
    var countryselect: String? = null
    var country: String? = null
    var currency: String? = null
    var conversion: String? = null

    var plantingDate: LocalDate? = null
    var season: String? = null
    var plantingWeek0: String? = null

    var harvestDate: LocalDate? = null

    var harvestWeek0: String? = null

    var harvestWeekm1: String? = null

    var harvestWeekm2: String? = null

    var harvestWeekm3: String? = null

    var harvestWeekm4: String? = null

    var harvestWeekp1: String? = null

    var harvestWeekp2: String? = null

    var harvestWeekp3: String? = null

    var harvestWeekp4: String? = null

    var harvestAge0: String? = null
    var harvestAgem1: String? = null
    var harvestAgem2: String? = null
    var harvestAgem3: String? = null
    var harvestAgem4: String? = null
    var harvestAgep1: String? = null
    var harvestAgep2: String? = null
    var harvestAgep3: String? = null
    var harvestAgep4: String? = null

    var checkId: String? = null
    var checkValue: String? = null
    var variety: String? = null
    var plantingDensity: String? = null
    var betweenRow: String? = null
    var withinRow: String? = null
    var areaBasis: String? = null
    var plotLength: String? = null
    var plotWidth: String? = null
    var plotSize: String? = null
    var yieldLevel: String? = null
    var priceStarch: String? = null
    var starchFactory: String? = null

    var sc1: String? = null
    var sc2: String? = null
    var sc3: String? = null
    var sc4: String? = null
    var sc5: String? = null
    var sc6: String? = null
    var sc7: String? = null
    var sc8: String? = null
    var sc9: String? = null
    var sc10: String? = null
    var sc11: String? = null
    var sc12: String? = null
    var pricesc1: String? = null
    var pricesc2: String? = null
    var pricesc3: String? = null
    var pricesc4: String? = null
    var pricesc5: String? = null
    var pricesc6: String? = null
    var pricesc7: String? = null
    var pricesc8: String? = null
    var pricesc9: String? = null
    var pricesc10: String? = null
    var pricesc11: String? = null
    var pricesc12: String? = null
    var product: String? = null
    var transformRatio: String? = null
    var unit: String? = null
    var unitNameSelect: String? = null
    var unitNameOther: String? = null
    var unitWeightOther: String? = null
    var unitName: String? = null
    var unitLocalWeight: String? = null
    var unitWeight: String? = null
    var priceNote: String? = null
    var priceRm4: String? = null
    var priceRm2: String? = null

    @Column(name = "price_r0")
    var priceR0: String? = null
    var priceRp2: String? = null
    var priceRp4: String? = null

    @Column(name = "price_0")
    var price0: String? = null

    @Column(name = "price_m1")
    var priceM1: String? = null

    @Column(name = "price_m2")
    var priceM2: String? = null

    @Column(name = "price_m3")
    var priceM3: String? = null

    @Column(name = "price_m4")
    var priceM4: String? = null

    @Column(name = "price_p1")
    var priceP1: String? = null

    @Column(name = "price_p2")
    var priceP2: String? = null

    @Column(name = "price_p3")
    var priceP3: String? = null

    @Column(name = "price_p4")
    var priceP4: String? = null
    var noRecommendationNote: String? = null

    @Column(name = "lookupp0h0_id")
    var lookupp0h0Id: String? = null

    @Column(name = "lookupp0hm1_id")
    var lookupp0hm1Id: String? = null

    @Column(name = "lookupp0hm2_id")
    var lookupp0hm2Id: String? = null

    @Column(name = "lookupp0hm3_id")
    var lookupp0hm3Id: String? = null

    @Column(name = "lookupp0hm4_id")
    var lookupp0hm4Id: String? = null

    @Column(name = "lookupp0hp1_id")
    var lookupp0hp1Id: String? = null

    @Column(name = "lookupp0hp2_id")
    var lookupp0hp2Id: String? = null

    @Column(name = "lookupp0hp3_id")
    var lookupp0hp3Id: String? = null

    @Column(name = "lookupp0hp4_id")
    var lookupp0hp4Id: String? = null

    var wyp0h0: String? = null
    var wyp0hm1: String? = null
    var wyp0hm2: String? = null
    var wyp0hm3: String? = null
    var wyp0hm4: String? = null
    var wyp0hp1: String? = null
    var wyp0hp2: String? = null
    var wyp0hp3: String? = null
    var wyp0hp4: String? = null


    var cyp0h0: String? = null
    var cyp0hm1: String? = null
    var cyp0hm2: String? = null
    var cyp0hm3: String? = null
    var cyp0hm4: String? = null
    var cyp0hp1: String? = null
    var cyp0hp2: String? = null
    var cyp0hp3: String? = null
    var cyp0hp4: String? = null

    var sc0: String? = null
    var scm1: String? = null
    var scm2: String? = null
    var scm3: String? = null
    var scm4: String? = null
    var scp1: String? = null
    var scp2: String? = null
    var scp3: String? = null
    var scp4: String? = null

    var pricesc0: String? = null
    var pricescm1: String? = null
    var pricescm2: String? = null
    var pricescm3: String? = null
    var pricescm4: String? = null
    var pricescp1: String? = null
    var pricescp2: String? = null
    var pricescp3: String? = null
    var pricescp4: String? = null

    var yp0h0: String? = null
    var yp0h0ab: String? = null
    var yp0hm1: String? = null
    var yp0hm2: String? = null
    var yp0hm3: String? = null
    var yp0hm4: String? = null
    var yp0hp1: String? = null
    var yp0hp2: String? = null
    var yp0hp3: String? = null
    var yp0hp4: String? = null

    var grp0h0: String? = null

    @Column(name = "grp0h0_ab")
    var grp0h0Ab: String? = null

    @Column(name = "grp0h0_abcurr")
    var grp0h0Abcurr: String? = null
    var grp0hm1: String? = null
    var grp0hm2: String? = null
    var grp0hm3: String? = null
    var grp0hm4: String? = null
    var grp0hp1: String? = null
    var grp0hp2: String? = null
    var grp0hp3: String? = null
    var grp0hp4: String? = null


    var pp0h0: String? = null
    var pp0hm1: String? = null
    var pp0hm2: String? = null
    var pp0hm3: String? = null
    var pp0hm4: String? = null
    var pp0hp1: String? = null
    var pp0hp2: String? = null
    var pp0hp3: String? = null
    var pp0hp4: String? = null


    var gpp0h0: String? = null
    var gpp0h0Curr: String? = null
    var gpp0hm1: String? = null
    var gpp0hm2: String? = null
    var gpp0hm3: String? = null
    var gpp0hm4: String? = null
    var gpp0hp1: String? = null
    var gpp0hp2: String? = null
    var gpp0hp3: String? = null
    var gpp0hp4: String? = null

    var grmax: String? = null
    var grmaxAb: String? = null
    var grdif: String? = null
    var grdifAb: String? = null
    var grdifAbcurr: String? = null
    var gpmax: String? = null
    var gpdif: String? = null
    var gpdifcurr: String? = null
    var optHarvest: String? = null
    var optHarvestText: String? = null

    @Column(name = "yh0p0_note")
    var yh0P0Note: String? = null
    var optHarvestNote: String? = null
    var difHarvestNote: String? = null
    var grdifNote: String? = null
    var grmaxNote: String? = null
    var sensible: String? = null
    var validationNote: String? = null
    var validationNote2: String? = null
    var validationNote3: String? = null
    var callValue: String? = null
    var confirmVal: String? = null

}