package com.tsobu.ona.database.entities.`val`

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_og")
class ValSphsOgEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

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

    @Column(name = "plantingweek0")
    var plantingWeek0: String? = null

    @Column(name = "harvest_date")
    var harvestDate: LocalDateTime? = null

    @Column(name = "harvest_week0")
    var harvestWeek0: String? = null

    @Column(name = "harvest_weekm1")
    var harvestWeekM1: String? = null

    @Column(name = "harvest_weekm2")
    var harvestWeekM2: String? = null

    @Column(name = "harvest_weekm3")
    var harvestWeekM3: String? = null

    @Column(name = "harvest_weekm4")
    var harvestWeekM4: String? = null

    @Column(name = "harvest_weekp1")
    var harvestWeekP1: String? = null

    @Column(name = "harvest_weekp2")
    var harvestWeekP2: String? = null

    @Column(name = "harvest_weekp3")
    var harvestWeekP3: String? = null

    @Column(name = "harvest_weekp4")
    var harvestWeekP4: String? = null

    @Column(name = "harvest_age0")
    var harvestAge0: String? = null

    @Column(name = "harvest_agem1")
    var harvestAgeM1: String? = null

    @Column(name = "harvest_agem2")
    var harvestAgeM2: String? = null

    @Column(name = "harvest_agem3")
    var harvestAgeM3: String? = null

    @Column(name = "harvest_agem4")
    var harvestAgeM4: String? = null

    @Column(name = "harvest_agep1")
    var harvestAgeP1: String? = null

    @Column(name = "harvest_agep2")
    var harvestAgeP2: String? = null

    @Column(name = "harvest_agep3")
    var harvestAgeP3: String? = null

    @Column(name = "harvest_agep4")
    var harvestAgeP4: String? = null

    @Column(name = "check_id")
    var checkId: String? = null

    @Column(name = "check_value")
    var checkValue: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "planting_density")
    var plantingDensity: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "area_basis")
    var areaBasis: String? = null

    @Column(name = "plotl")
    var plotLength: String? = null

    @Column(name = "plotw")
    var plotWidth: String? = null

    @Column(name = "plot_size")
    var plotSize: String? = null

    @Column(name = "yield_level")
    var yieldLevel: String? = null

    @Column(name = "price_starch")
    var priceStarch: String? = null

    @Column(name = "starch_factory")
    var starchFactory: String? = null

    @Column(name = "sc1")
    var sc1: String? = null

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

    @Column(name = "sc10")
    var sc10: String? = null

    @Column(name = "sc11")
    var sc11: String? = null

    @Column(name = "sc12")
    var sc12: String? = null

    @Column(name = "price_sc1")
    var priceSc1: String? = null

    @Column(name = "price_sc2")
    var priceSc2: String? = null

    @Column(name = "price_sc3")
    var priceSc3: String? = null

    @Column(name = "price_sc4")
    var priceSc4: String? = null

    @Column(name = "price_sc5")
    var priceSc5: String? = null

    @Column(name = "price_sc6")
    var priceSc6: String? = null

    @Column(name = "price_sc7")
    var priceSc7: String? = null

    @Column(name = "price_sc8")
    var priceSc8: String? = null

    @Column(name = "price_sc9")
    var priceSc9: String? = null

    @Column(name = "price_sc10")
    var priceSc10: String? = null

    @Column(name = "price_sc11")
    var priceSc11: String? = null

    @Column(name = "price_sc12")
    var priceSc12: String? = null

    @Column(name = "product")
    var product: String? = null

    @Column(name = "transform_ratio")
    var transformRatio: String? = null

    @Column(name = "unit")
    var unit: String? = null

    @Column(name = "unit_name_select")
    var unitNameSelect: String? = null

    @Column(name = "unit_name_other")
    var unitNameOther: String? = null

    @Column(name = "unit_weight_other")
    var unitWeightOther: String? = null

    @Column(name = "unit_name")
    var unitName: String? = null

    @Column(name = "unitlocal_weight")
    var unitlocalWeight: String? = null

    @Column(name = "unit_weight")
    var unitWeight: String? = null

    @Column(name = "price_note")
    var priceNote: String? = null

    @Column(name = "price_rm4")
    var priceRm4: String? = null

    @Column(name = "price_rm2")
    var priceRm2: String? = null

    @Column(name = "price_r0")
    var priceR0: String? = null

    @Column(name = "price_rp2")
    var priceRp2: String? = null

    @Column(name = "price_rp4")
    var priceRp4: String? = null

    @Column(name = "price0")
    var price0: String? = null

    @Column(name = "pricem1")
    var priceM1: String? = null

    @Column(name = "pricem2")
    var priceM2: String? = null

    @Column(name = "pricem3")
    var priceM3: String? = null

    @Column(name = "pricem4")
    var priceM4: String? = null

    @Column(name = "pricep1")
    var priceP1: String? = null

    @Column(name = "pricep2")
    var priceP2: String? = null

    @Column(name = "pricep3")
    var priceP3: String? = null

    @Column(name = "pricep4")
    var priceP4: String? = null

    @Column(name = "no_recommendation_note")
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

    @Column(name = "wyp_0h0")
    var wyp0h0: String? = null

    @Column(name = "wyp_0hm1")
    var wyp0hm1: String? = null

    @Column(name = "wyp_0hm2")
    var wyp0hm2: String? = null

    @Column(name = "wyp_0hm3")
    var wyp0hm3: String? = null

    @Column(name = "wyp_0hm4")
    var wyp0hm4: String? = null

    @Column(name = "wyp_0hp1")
    var wyp0hp1: String? = null

    @Column(name = "wyp_0hp2")
    var wyp0hp2: String? = null

    @Column(name = "wyp_0hp3")
    var wyp0hp3: String? = null

    @Column(name = "wyp_0hp4")
    var wyp0hp4: String? = null

    @Column(name = "cyp_0h0")
    var cyp0h0: String? = null

    @Column(name = "cyp_0hm1")
    var cyp0hm1: String? = null

    @Column(name = "cyp_0hm2")
    var cyp0hm2: String? = null

    @Column(name = "cyp_0hm3")
    var cyp0hm3: String? = null

    @Column(name = "cyp_0hm4")
    var cyp0hm4: String? = null

    @Column(name = "cyp_0hp1")
    var cyp0hp1: String? = null

    @Column(name = "cyp_0hp2")
    var cyp0hp2: String? = null

    @Column(name = "cyp_0hp3")
    var cyp0hp3: String? = null

    @Column(name = "cyp_0hp4")
    var cyp0hp4: String? = null

    @Column(name = "sc0")
    var sc0: String? = null

    @Column(name = "scm1")
    var scM1: String? = null

    @Column(name = "scm2")
    var scM2: String? = null

    @Column(name = "scm3")
    var scM3: String? = null

    @Column(name = "scm4")
    var scM4: String? = null

    @Column(name = "scp1")
    var scP1: String? = null

    @Column(name = "scp2")
    var scP2: String? = null

    @Column(name = "scp3")
    var scP3: String? = null

    @Column(name = "scp4")
    var scP4: String? = null

    @Column(name = "price_sc0")
    var priceSc0: String? = null

    @Column(name = "price_scm1")
    var priceScM1: String? = null

    @Column(name = "price_scm2")
    var priceScM2: String? = null

    @Column(name = "price_scm3")
    var priceScM3: String? = null

    @Column(name = "price_scm4")
    var priceScM4: String? = null

    @Column(name = "price_scp1")
    var priceScP1: String? = null

    @Column(name = "price_scp2")
    var priceScP2: String? = null

    @Column(name = "price_scp3")
    var priceScP3: String? = null

    @Column(name = "price_scp4")
    var priceScP4: String? = null

    @Column(name = "yp_0h0")
    var yp0h0: String? = null

    @Column(name = "yp_0h0_ab")
    var yp0h0Ab: String? = null

    @Column(name = "yp_0hm1")
    var yp0hm1: String? = null

    @Column(name = "yp_0hm2")
    var yp0hm2: String? = null

    @Column(name = "yp_0hm3")
    var yp0hm3: String? = null

    @Column(name = "yp_0hm4")
    var yp0hm4: String? = null

    @Column(name = "yp_0hp1")
    var yp0hp1: String? = null

    @Column(name = "yp_0hp2")
    var yp0hp2: String? = null

    @Column(name = "yp_0hp3")
    var yp0hp3: String? = null

    @Column(name = "yp_0hp4")
    var yp0hp4: String? = null

    @Column(name = "grp_0h0")
    var grP0h0: String? = null

    @Column(name = "grp_0h0_ab")
    var grP0h0Ab: String? = null

    @Column(name = "grp_0h0_ab_curr")
    var grP0h0AbCurr: String? = null

    @Column(name = "grp_0hm1")
    var grP0hm1: String? = null

    @Column(name = "grp_0hm2")
    var grP0hm2: String? = null

    @Column(name = "grp_0hm3")
    var grP0hm3: String? = null

    @Column(name = "grp_0hm4")
    var grP0hm4: String? = null

    @Column(name = "grp_0hp1")
    var grP0hp1: String? = null

    @Column(name = "grp_0hp2")
    var grP0hp2: String? = null

    @Column(name = "grp_0hp3")
    var grP0hp3: String? = null

    @Column(name = "grp_0hp4")
    var grP0hp4: String? = null

    @Column(name = "pp_0h0")
    var pp0h0: String? = null

    @Column(name = "pp_0hm1")
    var pp0hm1: String? = null

    @Column(name = "pp_0hm2")
    var pp0hm2: String? = null

    @Column(name = "pp_0hm3")
    var pp0hm3: String? = null

    @Column(name = "pp_0hm4")
    var pp0hm4: String? = null

    @Column(name = "pp_0hp1")
    var pp0hp1: String? = null

    @Column(name = "pp_0hp2")
    var pp0hp2: String? = null

    @Column(name = "pp_0hp3")
    var pp0hp3: String? = null

    @Column(name = "pp_0hp4")
    var pp0hp4: String? = null

    @Column(name = "gpp_0h0")
    var gpP0h0: String? = null

    @Column(name = "gpp_0h0curr")
    var gpP0h0Curr: String? = null

    @Column(name = "gpp_0hm1")
    var gpP0hm1: String? = null

    @Column(name = "gpp_0hm2")
    var gpP0hm2: String? = null

    @Column(name = "gpp_0hm3")
    var gpP0hm3: String? = null

    @Column(name = "gpp_0hm4")
    var gpP0hm4: String? = null

    @Column(name = "gpp_0hp1")
    var gpP0hp1: String? = null

    @Column(name = "gpp_0hp2")
    var gpP0hp2: String? = null

    @Column(name = "gpp_0hp3")
    var gpP0hp3: String? = null

    @Column(name = "gpp_0hp4")
    var gpP0hp4: String? = null

    @Column(name = "gr_max")
    var grMax: String? = null

    @Column(name = "gr_max_ab")
    var grMaxAb: String? = null

    @Column(name = "gr_dif")
    var grDif: String? = null

    @Column(name = "gr_dif_ab")
    var grDifAb: String? = null

    @Column(name = "gr_dif_ab_curr")
    var grDifAbCurr: String? = null

    @Column(name = "gp_max")
    var gpMax: String? = null

    @Column(name = "gp_dif")
    var gpDif: String? = null

    @Column(name = "gp_diff_curr")
    var gpDiffCurr: String? = null

    @Column(name = "opt_harvest")
    var optHarvest: String? = null

    @Column(name = "opt_harvest_text")
    var optHarvestText: String? = null

    @Column(name = "yh0p0_note")
    var yh0p0Note: String? = null

    @Column(name = "opt_harvest_note")
    var optHarvestNote: String? = null

    @Column(name = "dif_harvest_note")
    var difHarvestNote: String? = null

    @Column(name = "gr_dif_note")
    var grDifNote: String? = null

    @Column(name = "gr_max_note")
    var grMaxNote: String? = null

    @Column(name = "sensible")
    var sensible: String? = null

    @Column(name = "validation_note")
    var validationNote: String? = null

    @Column(name = "validation_note2")
    var validationNote2: String? = null

    @Column(name = "validation_note3")
    var validationNote3: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "confirm_val")
    var confirmVal: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}