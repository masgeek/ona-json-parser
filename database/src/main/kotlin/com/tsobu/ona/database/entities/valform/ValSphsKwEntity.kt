package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "val_sphs_kw")
@Entity
class ValSphsKwEntity : BaseEntity() {
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

    @Column(name = "planting_Date")
    private val plantingDate: LocalDate? = null

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "planting_Week0")
    private val plantingWeek0: String? = null

    @Column(name = "harvest_Date")
    private val harvestDate: LocalDate? = null

    @Column(name = "harvest_Week0")
    private val harvestWeek0: String? = null

    @Column(name = "harvest_Weekm1")
    private val harvestWeekm1: String? = null

    @Column(name = "harvest_Weekm2")
    private val harvestWeekm2: String? = null

    @Column(name = "harvest_Weekm3")
    private val harvestWeekm3: String? = null

    @Column(name = "harvest_Weekm4")
    private val harvestWeekm4: String? = null

    @Column(name = "harvest_Weekp1")
    private val harvestWeekp1: String? = null

    @Column(name = "harvest_Weekp2")
    private val harvestWeekp2: String? = null

    @Column(name = "harvest_Weekp3")
    private val harvestWeekp3: String? = null

    @Column(name = "harvest_Weekp4")
    private val harvestWeekp4: String? = null

    @Column(name = "harvest_Age0")
    private val harvestAge0: String? = null

    @Column(name = "harvest_Agem1")
    private val harvestAgem1: String? = null

    @Column(name = "harvest_Agem2")
    private val harvestAgem2: String? = null

    @Column(name = "harvest_Agem3")
    private val harvestAgem3: String? = null

    @Column(name = "harvest_Agem4")
    private val harvestAgem4: String? = null

    @Column(name = "harvest_Agep1")
    private val harvestAgep1: String? = null

    @Column(name = "harvest_Agep2")
    private val harvestAgep2: String? = null

    @Column(name = "harvest_Agep3")
    private val harvestAgep3: String? = null

    @Column(name = "harvest_Agep4")
    private val harvestAgep4: String? = null

    @Column(name = "check_id")
    private val checkId: String? = null

    @Column(name = "check_value")
    private val checkValue: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "planting_Density")
    private val plantingDensity: String? = null

    @Column(name = "between_Row")
    private val betweenRow: String? = null

    @Column(name = "within_Row")
    private val withinRow: String? = null

    @Column(name = "area_Basis")
    private val areaBasis: String? = null

    @Column(name = "plot_Length")
    private val plotLength: String? = null

    @Column(name = "plot_Width")
    private val plotWidth: String? = null

    @Column(name = "plot_Size")
    private val plotSize: String? = null

    @Column(name = "yield_Level")
    private val yieldLevel: String? = null

    @Column(name = "price_Starch")
    private val priceStarch: String? = null

    @Column(name = "starch_Factory")
    private val starchFactory: String? = null

    @Column(name = "SC1")
    private val SC1: String? = null

    @Column(name = "SC2")
    private val SC2: String? = null

    @Column(name = "SC3")
    private val SC3: String? = null

    @Column(name = "SC4")
    private val SC4: String? = null

    @Column(name = "SC5")
    private val SC5: String? = null

    @Column(name = "SC6")
    private val SC6: String? = null

    @Column(name = "SC7")
    private val SC7: String? = null

    @Column(name = "SC8")
    private val SC8: String? = null

    @Column(name = "SC9")
    private val SC9: String? = null

    @Column(name = "SC10")
    private val SC10: String? = null

    @Column(name = "SC11")
    private val SC11: String? = null

    @Column(name = "SC12")
    private val SC12: String? = null

    @Column(name = "price_SC1")
    private val priceSc1: String? = null

    @Column(name = "price_SC2")
    private val priceSc2: String? = null

    @Column(name = "price_SC3")
    private val priceSc3: String? = null

    @Column(name = "price_SC4")
    private val priceSc4: String? = null

    @Column(name = "price_SC5")
    private val priceSc5: String? = null

    @Column(name = "price_SC6")
    private val priceSc6: String? = null

    @Column(name = "price_SC7")
    private val priceSc7: String? = null

    @Column(name = "price_SC8")
    private val priceSc8: String? = null

    @Column(name = "price_SC9")
    private val priceSc9: String? = null

    @Column(name = "price_SC10")
    private val priceSc10: String? = null

    @Column(name = "price_SC11")
    private val priceSc11: String? = null

    @Column(name = "price_SC12")
    private val priceSc12: String? = null

    @Column(name = "product")
    private val product: String? = null

    @Column(name = "transform_Ratio")
    private val transformRatio: String? = null

    @Column(name = "unit_value")
    private val unitValue: String? = null

    @Column(name = "unit_Name_Select")
    private val unitNameSelect: String? = null

    @Column(name = "unit_Name_Other")
    private val unitNameOther: String? = null

    @Column(name = "unit_Weight_Other")
    private val unitWeightOther: String? = null

    @Column(name = "unit_Name")
    private val unitName: String? = null

    @Column(name = "unit_Local_Weight")
    private val unitLocalWeight: String? = null

    @Column(name = "unit_Weight")
    private val unitWeight: String? = null

    @Column(name = "price_Note")
    private val priceNote: String? = null

    @Column(name = "price_Rm4")
    private val priceRm4: String? = null

    @Column(name = "price_Rm2")
    private val priceRm2: String? = null

    @Column(name = "price_R0")
    private val priceR0: String? = null

    @Column(name = "price_Rp2")
    private val priceRp2: String? = null

    @Column(name = "price_Rp4")
    private val priceRp4: String? = null

    @Column(name = "price0")
    private val price0: String? = null

    @Column(name = "pricem1")
    private val pricem1: String? = null

    @Column(name = "pricem2")
    private val pricem2: String? = null

    @Column(name = "pricem3")
    private val pricem3: String? = null

    @Column(name = "pricem4")
    private val pricem4: String? = null

    @Column(name = "pricep1")
    private val pricep1: String? = null

    @Column(name = "pricep2")
    private val pricep2: String? = null

    @Column(name = "pricep3")
    private val pricep3: String? = null

    @Column(name = "pricep4")
    private val pricep4: String? = null

    @Column(name = "no_Recommendation_Note")
    private val noRecommendationNote: String? = null

    @Column(name = "lookupp0h0_id")
    private val lookupp0h0Id: String? = null

    @Column(name = "lookupp0hm1_id")
    private val lookupp0hm1Id: String? = null

    @Column(name = "lookupp0hm2_id")
    private val lookupp0hm2Id: String? = null

    @Column(name = "lookupp0hm3_id")
    private val lookupp0hm3Id: String? = null

    @Column(name = "lookupp0hm4_id")
    private val lookupp0hm4Id: String? = null

    @Column(name = "lookupp0hp1_id")
    private val lookupp0hp1Id: String? = null

    @Column(name = "lookupp0hp2_id")
    private val lookupp0hp2Id: String? = null

    @Column(name = "lookupp0hp3_id")
    private val lookupp0hp3Id: String? = null

    @Column(name = "lookupp0hp4_id")
    private val lookupp0hp4Id: String? = null

    @Column(name = "WY_p0h0")
    private val wyP0h0: String? = null

    @Column(name = "WY_p0hm1")
    private val wyP0hm1: String? = null

    @Column(name = "WY_p0hm2")
    private val wyP0hm2: String? = null

    @Column(name = "WY_p0hm3")
    private val wyP0hm3: String? = null

    @Column(name = "WY_p0hm4")
    private val wyP0hm4: String? = null

    @Column(name = "WY_p0hp1")
    private val wyP0hp1: String? = null

    @Column(name = "WY_p0hp2")
    private val wyP0hp2: String? = null

    @Column(name = "WY_p0hp3")
    private val wyP0hp3: String? = null

    @Column(name = "WY_p0hp4")
    private val wyP0hp4: String? = null

    @Column(name = "CY_p0h0")
    private val cyP0h0: String? = null

    @Column(name = "CY_p0hm1")
    private val cyP0hm1: String? = null

    @Column(name = "CY_p0hm2")
    private val cyP0hm2: String? = null

    @Column(name = "CY_p0hm3")
    private val cyP0hm3: String? = null

    @Column(name = "CY_p0hm4")
    private val cyP0hm4: String? = null

    @Column(name = "CY_p0hp1")
    private val cyP0hp1: String? = null

    @Column(name = "CY_p0hp2")
    private val cyP0hp2: String? = null

    @Column(name = "CY_p0hp3")
    private val cyP0hp3: String? = null

    @Column(name = "CY_p0hp4")
    private val cyP0hp4: String? = null

    @Column(name = "SC0")
    private val SC0: String? = null

    @Column(name = "SC_m1")
    private val scM1: String? = null

    @Column(name = "SC_m2")
    private val scM2: String? = null

    @Column(name = "SC_m3")
    private val scM3: String? = null

    @Column(name = "SC_m4")
    private val scM4: String? = null

    @Column(name = "SC_p1")
    private val scP1: String? = null

    @Column(name = "SC_p2")
    private val scP2: String? = null

    @Column(name = "SC_p3")
    private val scP3: String? = null

    @Column(name = "SC_p4")
    private val scP4: String? = null

    @Column(name = "price_SC0")
    private val priceSc0: String? = null

    @Column(name = "price_SC_m1")
    private val priceScM1: String? = null

    @Column(name = "price_SC_m2")
    private val priceScM2: String? = null

    @Column(name = "price_SC_m3")
    private val priceScM3: String? = null

    @Column(name = "price_SC_m4")
    private val priceScM4: String? = null

    @Column(name = "price_SC_p1")
    private val priceScP1: String? = null

    @Column(name = "price_SC_p2")
    private val priceScP2: String? = null

    @Column(name = "price_SC_p3")
    private val priceScP3: String? = null

    @Column(name = "price_SC_p4")
    private val priceScP4: String? = null

    @Column(name = "Yp_0h0")
    private val yp0h0: String? = null

    @Column(name = "Yp_0h0_AB")
    private val yp0h0Ab: String? = null

    @Column(name = "Yp_0hm1")
    private val yp0hm1: String? = null

    @Column(name = "Yp_0hm2")
    private val yp0hm2: String? = null

    @Column(name = "Yp_0hm3")
    private val yp0hm3: String? = null

    @Column(name = "Yp_0hm4")
    private val yp0hm4: String? = null

    @Column(name = "Yp_0hp1")
    private val yp0hp1: String? = null

    @Column(name = "Yp_0hp2")
    private val yp0hp2: String? = null

    @Column(name = "Yp_0hp3")
    private val yp0hp3: String? = null

    @Column(name = "Yp_0hp4")
    private val yp0hp4: String? = null

    @Column(name = "GR_p0h0")
    private val grP0h0: String? = null

    @Column(name = "GR_p0h0_AB")
    private val grP0h0Ab: String? = null

    @Column(name = "GR_p0h0_AB_curr")
    private val grP0h0AbCurr: String? = null

    @Column(name = "GR_p0hm1")
    private val grP0hm1: String? = null

    @Column(name = "GR_p0hm2")
    private val grP0hm2: String? = null

    @Column(name = "GR_p0hm3")
    private val grP0hm3: String? = null

    @Column(name = "GR_p0hm4")
    private val grP0hm4: String? = null

    @Column(name = "GR_p0hp1")
    private val grP0hp1: String? = null

    @Column(name = "GR_p0hp2")
    private val grP0hp2: String? = null

    @Column(name = "GR_p0hp3")
    private val grP0hp3: String? = null

    @Column(name = "GR_p0hp4")
    private val grP0hp4: String? = null

    @Column(name = "Pp_0h0")
    private val pp0h0: String? = null

    @Column(name = "Pp_0hm1")
    private val pp0hm1: String? = null

    @Column(name = "Pp_0hm2")
    private val pp0hm2: String? = null

    @Column(name = "Pp_0hm3")
    private val pp0hm3: String? = null

    @Column(name = "Pp_0hm4")
    private val pp0hm4: String? = null

    @Column(name = "Pp_0hp1")
    private val pp0hp1: String? = null

    @Column(name = "Pp_0hp2")
    private val pp0hp2: String? = null

    @Column(name = "Pp_0hp3")
    private val pp0hp3: String? = null

    @Column(name = "Pp_0hp4")
    private val pp0hp4: String? = null

    @Column(name = "GP_p0h0")
    private val gpP0h0: String? = null

    @Column(name = "GP_p0h0c_urr")
    private val gpP0h0cUrr: String? = null

    @Column(name = "GP_p0hm1")
    private val gpP0hm1: String? = null

    @Column(name = "GP_p0hm2")
    private val gpP0hm2: String? = null

    @Column(name = "GP_p0hm3")
    private val gpP0hm3: String? = null

    @Column(name = "GP_p0hm4")
    private val gpP0hm4: String? = null

    @Column(name = "GP_p0hp1")
    private val gpP0hp1: String? = null

    @Column(name = "GP_p0hp2")
    private val gpP0hp2: String? = null

    @Column(name = "GP_p0hp3")
    private val gpP0hp3: String? = null

    @Column(name = "GP_p0hp4")
    private val gpP0hp4: String? = null

    @Column(name = "GR_max")
    private val grMax: String? = null

    @Column(name = "GR_max_AB")
    private val grMaxAb: String? = null

    @Column(name = "GR_dif")
    private val grDif: String? = null

    @Column(name = "GR_dif_AB")
    private val grDifAb: String? = null

    @Column(name = "GR_dif_AB_curr")
    private val grDifAbCurr: String? = null

    @Column(name = "GP_max")
    private val gpMax: String? = null

    @Column(name = "GP_dif")
    private val gpDif: String? = null

    @Column(name = "GP_dif_curr")
    private val gpDifCurr: String? = null

    @Column(name = "opt_Harvest")
    private val optHarvest: String? = null

    @Column(name = "opt_Harvest_Text")
    private val optHarvestText: String? = null

    @Column(name = "Yh_0p0_Note")
    private val yh0p0Note: String? = null

    @Column(name = "opt_Harvest_Note")
    private val optHarvestNote: String? = null

    @Column(name = "dif_Harvest_Note")
    private val difHarvestNote: String? = null

    @Column(name = "GR_dif_Note")
    private val grDifNote: String? = null

    @Column(name = "GR_max_Note")
    private val grMaxNote: String? = null

    @Column(name = "sensible")
    private val sensible: String? = null

    @Column(name = "validation_Note")
    private val validationNote: String? = null

    @Column(name = "validation_Note2")
    private val validationNote2: String? = null

    @Column(name = "validation_Note3")
    private val validationNote3: String? = null

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