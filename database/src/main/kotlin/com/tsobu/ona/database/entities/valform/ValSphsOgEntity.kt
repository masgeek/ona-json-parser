package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_og")
class ValSphsOgEntity : BaseEntity() {
    @Column(name = "SubmissionDate")
    private val submissionDate: String? = null

    @Column(name = "uuid")
    private val uuid: String? = null

    @Column(name = "start")
    private val start: String? = null

    @Column(name = "today")
    private val today: String? = null

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

    @Column(name = "VAL")
    private val VAL: String? = null

    @Column(name = "EAID")
    private val EAID: String? = null

    @Column(name = "HHID")
    private val HHID: String? = null

    @Column(name = "countrySelect")
    private val countrySelect: String? = null

    @Column(name = "country")
    private val country: String? = null

    @Column(name = "currency")
    private val currency: String? = null

    @Column(name = "conversion")
    private val conversion: String? = null
    private val geopoint: String? = null
    private val geopoint: String? = null
    private val geopoint: String? = null
    private val geopoint: String? = null

    @Column(name = "lat")
    private val lat: String? = null

    @Column(name = "lon")
    private val lon: String? = null

    @Column(name = "plantingDate")
    private val plantingDate: String? = null

    @Column(name = "season")
    private val season: String? = null

    @Column(name = "plantingWeek0")
    private val plantingWeek0: String? = null

    @Column(name = "harvestDate")
    private val harvestDate: String? = null

    @Column(name = "harvestWeek0")
    private val harvestWeek0: String? = null

    @Column(name = "harvestWeekm1")
    private val harvestWeekm1: String? = null

    @Column(name = "harvestWeekm2")
    private val harvestWeekm2: String? = null

    @Column(name = "harvestWeekm3")
    private val harvestWeekm3: String? = null

    @Column(name = "harvestWeekm4")
    private val harvestWeekm4: String? = null

    @Column(name = "harvestWeekp1")
    private val harvestWeekp1: String? = null

    @Column(name = "harvestWeekp2")
    private val harvestWeekp2: String? = null

    @Column(name = "harvestWeekp3")
    private val harvestWeekp3: String? = null

    @Column(name = "harvestWeekp4")
    private val harvestWeekp4: String? = null

    @Column(name = "harvestAge0")
    private val harvestAge0: String? = null

    @Column(name = "harvestAgem1")
    private val harvestAgem1: String? = null

    @Column(name = "harvestAgem2")
    private val harvestAgem2: String? = null

    @Column(name = "harvestAgem3")
    private val harvestAgem3: String? = null

    @Column(name = "harvestAgem4")
    private val harvestAgem4: String? = null

    @Column(name = "harvestAgep1")
    private val harvestAgep1: String? = null

    @Column(name = "harvestAgep2")
    private val harvestAgep2: String? = null

    @Column(name = "harvestAgep3")
    private val harvestAgep3: String? = null

    @Column(name = "harvestAgep4")
    private val harvestAgep4: String? = null

    @Column(name = "check_id")
    private val checkId: String? = null

    @Column(name = "check")
    private val check: String? = null

    @Column(name = "variety")
    private val variety: String? = null

    @Column(name = "plantingDensity")
    private val plantingDensity: String? = null

    @Column(name = "betweenRow")
    private val betweenRow: String? = null

    @Column(name = "withinRow")
    private val withinRow: String? = null

    @Column(name = "areaBasis")
    private val areaBasis: String? = null

    @Column(name = "plotL")
    private val plotL: String? = null

    @Column(name = "plotW")
    private val plotW: String? = null

    @Column(name = "plotSize")
    private val plotSize: String? = null

    @Column(name = "yieldLevel")
    private val yieldLevel: String? = null

    @Column(name = "priceStarch")
    private val priceStarch: String? = null

    @Column(name = "starchFactory")
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

    @Column(name = "priceSC1")
    private val priceSC1: String? = null

    @Column(name = "priceSC2")
    private val priceSC2: String? = null

    @Column(name = "priceSC3")
    private val priceSC3: String? = null

    @Column(name = "priceSC4")
    private val priceSC4: String? = null

    @Column(name = "priceSC5")
    private val priceSC5: String? = null

    @Column(name = "priceSC6")
    private val priceSC6: String? = null

    @Column(name = "priceSC7")
    private val priceSC7: String? = null

    @Column(name = "priceSC8")
    private val priceSC8: String? = null

    @Column(name = "priceSC9")
    private val priceSC9: String? = null

    @Column(name = "priceSC10")
    private val priceSC10: String? = null

    @Column(name = "priceSC11")
    private val priceSC11: String? = null

    @Column(name = "priceSC12")
    private val priceSC12: String? = null

    @Column(name = "product")
    private val product: String? = null

    @Column(name = "transformRatio")
    private val transformRatio: String? = null

    @Column(name = "unit")
    private val unit: String? = null

    @Column(name = "unitNameSelect")
    private val unitNameSelect: String? = null

    @Column(name = "unitNameOther")
    private val unitNameOther: String? = null

    @Column(name = "unitWeightOther")
    private val unitWeightOther: String? = null

    @Column(name = "unitName")
    private val unitName: String? = null

    @Column(name = "unitLocalWeight")
    private val unitLocalWeight: String? = null

    @Column(name = "unitWeight")
    private val unitWeight: String? = null

    @Column(name = "priceNote")
    private val priceNote: String? = null

    @Column(name = "priceRm4")
    private val priceRm4: String? = null

    @Column(name = "priceRm2")
    private val priceRm2: String? = null

    @Column(name = "priceR0")
    private val priceR0: String? = null

    @Column(name = "priceRp2")
    private val priceRp2: String? = null

    @Column(name = "priceRp4")
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

    @Column(name = "noRecommendationNote")
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

    @Column(name = "WYp0h0")
    private val WYp0h0: String? = null

    @Column(name = "WYp0hm1")
    private val WYp0hm1: String? = null

    @Column(name = "WYp0hm2")
    private val WYp0hm2: String? = null

    @Column(name = "WYp0hm3")
    private val WYp0hm3: String? = null

    @Column(name = "WYp0hm4")
    private val WYp0hm4: String? = null

    @Column(name = "WYp0hp1")
    private val WYp0hp1: String? = null

    @Column(name = "WYp0hp2")
    private val WYp0hp2: String? = null

    @Column(name = "WYp0hp3")
    private val WYp0hp3: String? = null

    @Column(name = "WYp0hp4")
    private val WYp0hp4: String? = null

    @Column(name = "CYp0h0")
    private val CYp0h0: String? = null

    @Column(name = "CYp0hm1")
    private val CYp0hm1: String? = null

    @Column(name = "CYp0hm2")
    private val CYp0hm2: String? = null

    @Column(name = "CYp0hm3")
    private val CYp0hm3: String? = null

    @Column(name = "CYp0hm4")
    private val CYp0hm4: String? = null

    @Column(name = "CYp0hp1")
    private val CYp0hp1: String? = null

    @Column(name = "CYp0hp2")
    private val CYp0hp2: String? = null

    @Column(name = "CYp0hp3")
    private val CYp0hp3: String? = null

    @Column(name = "CYp0hp4")
    private val CYp0hp4: String? = null

    @Column(name = "SC0")
    private val SC0: String? = null

    @Column(name = "SCm1")
    private val SCm1: String? = null

    @Column(name = "SCm2")
    private val SCm2: String? = null

    @Column(name = "SCm3")
    private val SCm3: String? = null

    @Column(name = "SCm4")
    private val SCm4: String? = null

    @Column(name = "SCp1")
    private val SCp1: String? = null

    @Column(name = "SCp2")
    private val SCp2: String? = null

    @Column(name = "SCp3")
    private val SCp3: String? = null

    @Column(name = "SCp4")
    private val SCp4: String? = null

    @Column(name = "priceSC0")
    private val priceSC0: String? = null

    @Column(name = "priceSCm1")
    private val priceSCm1: String? = null

    @Column(name = "priceSCm2")
    private val priceSCm2: String? = null

    @Column(name = "priceSCm3")
    private val priceSCm3: String? = null

    @Column(name = "priceSCm4")
    private val priceSCm4: String? = null

    @Column(name = "priceSCp1")
    private val priceSCp1: String? = null

    @Column(name = "priceSCp2")
    private val priceSCp2: String? = null

    @Column(name = "priceSCp3")
    private val priceSCp3: String? = null

    @Column(name = "priceSCp4")
    private val priceSCp4: String? = null

    @Column(name = "Yp0h0")
    private val yp0h0: String? = null

    @Column(name = "Yp0h0_AB")
    private val yp0h0Ab: String? = null

    @Column(name = "Yp0hm1")
    private val yp0hm1: String? = null

    @Column(name = "Yp0hm2")
    private val yp0hm2: String? = null

    @Column(name = "Yp0hm3")
    private val yp0hm3: String? = null

    @Column(name = "Yp0hm4")
    private val yp0hm4: String? = null

    @Column(name = "Yp0hp1")
    private val yp0hp1: String? = null

    @Column(name = "Yp0hp2")
    private val yp0hp2: String? = null

    @Column(name = "Yp0hp3")
    private val yp0hp3: String? = null

    @Column(name = "Yp0hp4")
    private val yp0hp4: String? = null

    @Column(name = "GRp0h0")
    private val GRp0h0: String? = null

    @Column(name = "GRp0h0_AB")
    private val grp0h0Ab: String? = null

    @Column(name = "GRp0h0_ABcurr")
    private val grp0h0Abcurr: String? = null

    @Column(name = "GRp0hm1")
    private val GRp0hm1: String? = null

    @Column(name = "GRp0hm2")
    private val GRp0hm2: String? = null

    @Column(name = "GRp0hm3")
    private val GRp0hm3: String? = null

    @Column(name = "GRp0hm4")
    private val GRp0hm4: String? = null

    @Column(name = "GRp0hp1")
    private val GRp0hp1: String? = null

    @Column(name = "GRp0hp2")
    private val GRp0hp2: String? = null

    @Column(name = "GRp0hp3")
    private val GRp0hp3: String? = null

    @Column(name = "GRp0hp4")
    private val GRp0hp4: String? = null

    @Column(name = "Pp0h0")
    private val pp0h0: String? = null

    @Column(name = "Pp0hm1")
    private val pp0hm1: String? = null

    @Column(name = "Pp0hm2")
    private val pp0hm2: String? = null

    @Column(name = "Pp0hm3")
    private val pp0hm3: String? = null

    @Column(name = "Pp0hm4")
    private val pp0hm4: String? = null

    @Column(name = "Pp0hp1")
    private val pp0hp1: String? = null

    @Column(name = "Pp0hp2")
    private val pp0hp2: String? = null

    @Column(name = "Pp0hp3")
    private val pp0hp3: String? = null

    @Column(name = "Pp0hp4")
    private val pp0hp4: String? = null

    @Column(name = "GPp0h0")
    private val GPp0h0: String? = null

    @Column(name = "GPp0h0curr")
    private val GPp0h0curr: String? = null

    @Column(name = "GPp0hm1")
    private val GPp0hm1: String? = null

    @Column(name = "GPp0hm2")
    private val GPp0hm2: String? = null

    @Column(name = "GPp0hm3")
    private val GPp0hm3: String? = null

    @Column(name = "GPp0hm4")
    private val GPp0hm4: String? = null

    @Column(name = "GPp0hp1")
    private val GPp0hp1: String? = null

    @Column(name = "GPp0hp2")
    private val GPp0hp2: String? = null

    @Column(name = "GPp0hp3")
    private val GPp0hp3: String? = null

    @Column(name = "GPp0hp4")
    private val GPp0hp4: String? = null

    @Column(name = "GRmax")
    private val GRmax: String? = null

    @Column(name = "GRmax_AB")
    private val grmaxAb: String? = null

    @Column(name = "GRdif")
    private val GRdif: String? = null

    @Column(name = "GRdif_AB")
    private val grdifAb: String? = null

    @Column(name = "GRdif_ABcurr")
    private val grdifAbcurr: String? = null

    @Column(name = "GPmax")
    private val GPmax: String? = null

    @Column(name = "GPdif")
    private val GPdif: String? = null

    @Column(name = "GPdifcurr")
    private val GPdifcurr: String? = null

    @Column(name = "optHarvest")
    private val optHarvest: String? = null

    @Column(name = "optHarvestText")
    private val optHarvestText: String? = null

    @Column(name = "Yh0p0Note")
    private val yh0p0Note: String? = null

    @Column(name = "optHarvestNote")
    private val optHarvestNote: String? = null

    @Column(name = "difHarvestNote")
    private val difHarvestNote: String? = null

    @Column(name = "GRdifNote")
    private val GRdifNote: String? = null

    @Column(name = "GRmaxNote")
    private val GRmaxNote: String? = null

    @Column(name = "sensible")
    private val sensible: String? = null

    @Column(name = "validationNote")
    private val validationNote: String? = null

    @Column(name = "validationNote2")
    private val validationNote2: String? = null

    @Column(name = "validationNote3")
    private val validationNote3: String? = null

    @Column(name = "call")
    private val call: String? = null

    @Column(name = "confirmVAL")
    private val confirmVAL: String? = null

    @Column(name = "end")
    private val end: String? = null

    @Column(name = "instanceID")
    private val instanceID: String? = null

    @Column(name = "KEY")
    private val KEY: String? = null
}