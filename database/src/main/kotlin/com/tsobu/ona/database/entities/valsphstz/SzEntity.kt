package com.tsobu.ona.database.entities.valsphstz

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_tz_sz")
class SzEntity : BaseEntity() {
    @Column(name = "area_basis")
    var areaBasis: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "check_id")
    var checkId: String? = null

    @Column(name = "check_value")
    var checkValue: String? = null

    @Column(name = "confirm_val")
    var confirmVal: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "countryselect")
    var countryselect: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "cyp0h0")
    var cyp0h0: String? = null

    @Column(name = "cyp0hm1")
    var cyp0hm1: String? = null

    @Column(name = "cyp0hm2")
    var cyp0hm2: String? = null

    @Column(name = "cyp0hm3")
    var cyp0hm3: String? = null

    @Column(name = "cyp0hm4")
    var cyp0hm4: String? = null

    @Column(name = "cyp0hp1")
    var cyp0hp1: String? = null

    @Column(name = "cyp0hp2")
    var cyp0hp2: String? = null

    @Column(name = "cyp0hp3")
    var cyp0hp3: String? = null

    @Column(name = "cyp0hp4")
    var cyp0hp4: String? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "dif_harvest_note")
    var difHarvestNote: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "gpdif")
    var gpdif: String? = null

    @Column(name = "gpdifcurr")
    var gpdifcurr: String? = null

    @Column(name = "gpmax")
    var gpmax: String? = null

    @Column(name = "gpp0h0")
    var gpp0h0: String? = null

    @Column(name = "gpp0h0curr")
    var gpp0h0curr: String? = null

    @Column(name = "gpp0hm1")
    var gpp0hm1: String? = null

    @Column(name = "gpp0hm2")
    var gpp0hm2: String? = null

    @Column(name = "gpp0hm3")
    var gpp0hm3: String? = null

    @Column(name = "gpp0hm4")
    var gpp0hm4: String? = null

    @Column(name = "gpp0hp1")
    var gpp0hp1: String? = null

    @Column(name = "gpp0hp2")
    var gpp0hp2: String? = null

    @Column(name = "gpp0hp3")
    var gpp0hp3: String? = null

    @Column(name = "gpp0hp4")
    var gpp0hp4: String? = null

    @Column(name = "grdif")
    var grdif: String? = null

    @Column(name = "grdif_ab")
    var grdifAb: String? = null

    @Column(name = "grdif_abcurr")
    var grdifAbcurr: String? = null

    @Column(name = "grdif_note")
    var grdifNote: String? = null

    @Column(name = "grmax")
    var grmax: String? = null

    @Column(name = "grmax_ab")
    var grmaxAb: String? = null

    @Column(name = "grmax_note")
    var grmaxNote: String? = null

    @Column(name = "grp0h0")
    var grp0h0: String? = null

    @Column(name = "grp0h0_ab")
    var grp0h0Ab: String? = null

    @Column(name = "grp0h0_abcurr")
    var grp0h0Abcurr: String? = null

    @Column(name = "grp0hm1")
    var grp0hm1: String? = null

    @Column(name = "grp0hm2")
    var grp0hm2: String? = null

    @Column(name = "grp0hm3")
    var grp0hm3: String? = null

    @Column(name = "grp0hm4")
    var grp0hm4: String? = null

    @Column(name = "grp0hp1")
    var grp0hp1: String? = null

    @Column(name = "grp0hp2")
    var grp0hp2: String? = null

    @Column(name = "grp0hp3")
    var grp0hp3: String? = null

    @Column(name = "grp0hp4")
    var grp0hp4: String? = null

    @Column(name = "harvest_age0")
    var harvestAge0: String? = null

    @Column(name = "harvest_agem1")
    var harvestAgem1: String? = null

    @Column(name = "harvest_agem2")
    var harvestAgem2: String? = null

    @Column(name = "harvest_agem3")
    var harvestAgem3: String? = null

    @Column(name = "harvest_agem4")
    var harvestAgem4: String? = null

    @Column(name = "harvest_agep1")
    var harvestAgep1: String? = null

    @Column(name = "harvest_agep2")
    var harvestAgep2: String? = null

    @Column(name = "harvest_agep3")
    var harvestAgep3: String? = null

    @Column(name = "harvest_agep4")
    var harvestAgep4: String? = null

    @Column(name = "harvest_date")
    var harvestDate: LocalDateTime? = null

    @Column(name = "harvest_week0")
    var harvestWeek0: String? = null

    @Column(name = "harvest_weekm1")
    var harvestWeekm1: String? = null

    @Column(name = "harvest_weekm2")
    var harvestWeekm2: String? = null

    @Column(name = "harvest_weekm3")
    var harvestWeekm3: String? = null

    @Column(name = "harvest_weekm4")
    var harvestWeekm4: String? = null

    @Column(name = "harvest_weekp1")
    var harvestWeekp1: String? = null

    @Column(name = "harvest_weekp2")
    var harvestWeekp2: String? = null

    @Column(name = "harvest_weekp3")
    var harvestWeekp3: String? = null

    @Column(name = "harvest_weekp4")
    var harvestWeekp4: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "intro2")
    var intro2: String? = null

    @Column(name = "lat")
    var lat: String? = null

    @Column(name = "lon")
    var lon: String? = null

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

    @Column(name = "no_recommendation_note")
    var noRecommendationNote: String? = null

    @Column(name = "opt_harvest")
    var optHarvest: String? = null

    @Column(name = "opt_harvest_note")
    var optHarvestNote: String? = null

    @Column(name = "opt_harvest_text")
    var optHarvestText: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "planting_week0")
    var plantingWeek0: String? = null

    @Column(name = "plot_length")
    var plotLength: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "plot_width")
    var plotWidth: String? = null

    @Column(name = "pp0h0")
    var pp0h0: String? = null

    @Column(name = "pp0hm1")
    var pp0hm1: String? = null

    @Column(name = "pp0hm2")
    var pp0hm2: String? = null

    @Column(name = "pp0hm3")
    var pp0hm3: String? = null

    @Column(name = "pp0hm4")
    var pp0hm4: String? = null

    @Column(name = "pp0hp1")
    var pp0hp1: String? = null

    @Column(name = "pp0hp2")
    var pp0hp2: String? = null

    @Column(name = "pp0hp3")
    var pp0hp3: String? = null

    @Column(name = "pp0hp4")
    var pp0hp4: String? = null

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

    @Column(name = "price_note")
    var priceNote: String? = null

    @Column(name = "price_p1")
    var priceP1: String? = null

    @Column(name = "price_p2")
    var priceP2: String? = null

    @Column(name = "price_p3")
    var priceP3: String? = null

    @Column(name = "price_p4")
    var priceP4: String? = null

    @Column(name = "price_r0")
    var priceR0: String? = null

    @Column(name = "price_rm2")
    var priceRm2: String? = null

    @Column(name = "price_rm4")
    var priceRm4: String? = null

    @Column(name = "price_rp2")
    var priceRp2: String? = null

    @Column(name = "price_rp4")
    var priceRp4: String? = null

    @Column(name = "price_starch")
    var priceStarch: String? = null

    @Column(name = "pricesc0")
    var pricesc0: String? = null

    @Column(name = "pricesc1")
    var pricesc1: String? = null

    @Column(name = "pricesc10")
    var pricesc10: String? = null

    @Column(name = "pricesc11")
    var pricesc11: String? = null

    @Column(name = "pricesc12")
    var pricesc12: String? = null

    @Column(name = "pricesc2")
    var pricesc2: String? = null

    @Column(name = "pricesc3")
    var pricesc3: String? = null

    @Column(name = "pricesc4")
    var pricesc4: String? = null

    @Column(name = "pricesc5")
    var pricesc5: String? = null

    @Column(name = "pricesc6")
    var pricesc6: String? = null

    @Column(name = "pricesc7")
    var pricesc7: String? = null

    @Column(name = "pricesc8")
    var pricesc8: String? = null

    @Column(name = "pricesc9")
    var pricesc9: String? = null

    @Column(name = "pricescm1")
    var pricescm1: String? = null

    @Column(name = "pricescm2")
    var pricescm2: String? = null

    @Column(name = "pricescm3")
    var pricescm3: String? = null

    @Column(name = "pricescm4")
    var pricescm4: String? = null

    @Column(name = "pricescp1")
    var pricescp1: String? = null

    @Column(name = "pricescp2")
    var pricescp2: String? = null

    @Column(name = "pricescp3")
    var pricescp3: String? = null

    @Column(name = "pricescp4")
    var pricescp4: String? = null

    @Column(name = "product")
    var product: String? = null

    @Column(name = "sc0")
    var sc0: String? = null

    @Column(name = "sc1")
    var sc1: String? = null

    @Column(name = "sc10")
    var sc10: String? = null

    @Column(name = "sc11")
    var sc11: String? = null

    @Column(name = "sc12")
    var sc12: String? = null

    @Column(name = "sc2")
    var sc2: String? = null

    @Column(name = "sc3")
    var sc3: String? = null

    @Column(name = "sc4")
    var sc4: String? = null

    @Column(name = "sc5")
    var sc5: String? = null

    @Column(name = "sc6")
    var sc6: String? = null

    @Column(name = "sc7")
    var sc7: String? = null

    @Column(name = "sc8")
    var sc8: String? = null

    @Column(name = "sc9")
    var sc9: String? = null

    @Column(name = "scm1")
    var scm1: String? = null

    @Column(name = "scm2")
    var scm2: String? = null

    @Column(name = "scm3")
    var scm3: String? = null

    @Column(name = "scm4")
    var scm4: String? = null

    @Column(name = "scp1")
    var scp1: String? = null

    @Column(name = "scp2")
    var scp2: String? = null

    @Column(name = "scp3")
    var scp3: String? = null

    @Column(name = "scp4")
    var scp4: String? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "sensible")
    var sensible: String? = null

    @Column(name = "simserial")
    var simserial: String? = null

    @Column(name = "starch_factory")
    var starchFactory: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "subscriber_id")
    var subscriberId: String? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "transform_ratio")
    var transformRatio: String? = null

    @Column(name = "unit")
    var unit: String? = null

    @Column(name = "unit_local_weight")
    var unitLocalWeight: String? = null

    @Column(name = "unit_name")
    var unitName: String? = null

    @Column(name = "unit_name_other")
    var unitNameOther: String? = null

    @Column(name = "unit_name_select")
    var unitNameSelect: String? = null

    @Column(name = "unit_weight")
    var unitWeight: String? = null

    @Column(name = "unit_weight_other")
    var unitWeightOther: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

    @Column(name = "val_sphs")
    var valSphs: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "validation_note2")
    var validationNote2: String? = null

    @Column(name = "validation_note3")
    var validationNote3: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "wyp0h0")
    var wyp0h0: String? = null

    @Column(name = "wyp0hm1")
    var wyp0hm1: String? = null

    @Column(name = "wyp0hm2")
    var wyp0hm2: String? = null

    @Column(name = "wyp0hm3")
    var wyp0hm3: String? = null

    @Column(name = "wyp0hm4")
    var wyp0hm4: String? = null

    @Column(name = "wyp0hp1")
    var wyp0hp1: String? = null

    @Column(name = "wyp0hp2")
    var wyp0hp2: String? = null

    @Column(name = "wyp0hp3")
    var wyp0hp3: String? = null

    @Column(name = "wyp0hp4")
    var wyp0hp4: String? = null

    @Column(name = "yh0p0_note")
    var yh0p0Note: String? = null

    @Column(name = "yield_level")
    var yieldLevel: String? = null

    @Column(name = "yp0h0")
    var yp0h0: String? = null

    @Column(name = "yp0h0ab")
    var yp0h0ab: String? = null

    @Column(name = "yp0hm1")
    var yp0hm1: String? = null

    @Column(name = "yp0hm2")
    var yp0hm2: String? = null

    @Column(name = "yp0hm3")
    var yp0hm3: String? = null

    @Column(name = "yp0hm4")
    var yp0hm4: String? = null

    @Column(name = "yp0hp1")
    var yp0hp1: String? = null

    @Column(name = "yp0hp2")
    var yp0hp2: String? = null

    @Column(name = "yp0hp3")
    var yp0hp3: String? = null

    @Column(name = "yp0hp4")
    var yp0hp4: String? = null
}