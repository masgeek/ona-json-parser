package com.tsobu.ona.database.entities.valsphstz

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_tz_ez")
class EzEntity : BaseEntity() {
    @Column(name = "Submission_Date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

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

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "intro2")
    var intro2: String? = null

    @Column(name = "VAL")
    var VAL: String? = null

    @Column(name = "EAID")
    var EAID: String? = null

    @Column(name = "HHID")
    var HHID: String? = null

    @Column(name = "countrySelect")
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

    @Column(name = "plantingDate")
    var plantingDate: String? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "plantingWeek0")
    var plantingWeek0: String? = null

    @Column(name = "harvestDate")
    var harvestDate: String? = null

    @Column(name = "harvestWeek0")
    var harvestWeek0: String? = null

    @Column(name = "harvestWeekm1")
    var harvestWeekm1: String? = null

    @Column(name = "harvestWeekm2")
    var harvestWeekm2: String? = null

    @Column(name = "harvestWeekm3")
    var harvestWeekm3: String? = null

    @Column(name = "harvestWeekm4")
    var harvestWeekm4: String? = null

    @Column(name = "harvestWeekp1")
    var harvestWeekp1: String? = null

    @Column(name = "harvestWeekp2")
    var harvestWeekp2: String? = null

    @Column(name = "harvestWeekp3")
    var harvestWeekp3: String? = null

    @Column(name = "harvestWeekp4")
    var harvestWeekp4: String? = null

    @Column(name = "harvestAge0")
    var harvestAge0: String? = null

    @Column(name = "harvestAgem1")
    var harvestAgem1: String? = null

    @Column(name = "harvestAgem2")
    var harvestAgem2: String? = null

    @Column(name = "harvestAgem3")
    var harvestAgem3: String? = null

    @Column(name = "harvestAgem4")
    var harvestAgem4: String? = null

    @Column(name = "harvestAgep1")
    var harvestAgep1: String? = null

    @Column(name = "harvestAgep2")
    var harvestAgep2: String? = null

    @Column(name = "harvestAgep3")
    var harvestAgep3: String? = null

    @Column(name = "harvestAgep4")
    var harvestAgep4: String? = null

    @Column(name = "check_id")
    var checkId: String? = null

    @Column(name = "check")
    var check: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "plantingDensity")
    var plantingDensity: String? = null

    @Column(name = "betweenRow")
    var betweenRow: String? = null

    @Column(name = "withinRow")
    var withinRow: String? = null

    @Column(name = "areaBasis")
    var areaBasis: String? = null

    @Column(name = "plotL")
    var plotL: String? = null

    @Column(name = "plotW")
    var plotW: String? = null

    @Column(name = "plotSize")
    var plotSize: String? = null

    @Column(name = "yieldLevel")
    var yieldLevel: String? = null

    @Column(name = "priceStarch")
    var priceStarch: String? = null

    @Column(name = "starchFactory")
    var starchFactory: String? = null

    @Column(name = "SC1")
    var SC1: String? = null

    @Column(name = "SC2")
    var SC2: String? = null

    @Column(name = "SC3")
    var SC3: String? = null

    @Column(name = "SC4")
    var SC4: String? = null

    @Column(name = "SC5")
    var SC5: String? = null

    @Column(name = "SC6")
    var SC6: String? = null

    @Column(name = "SC7")
    var SC7: String? = null

    @Column(name = "SC8")
    var SC8: String? = null

    @Column(name = "SC9")
    var SC9: String? = null

    @Column(name = "SC10")
    var SC10: String? = null

    @Column(name = "SC11")
    var SC11: String? = null

    @Column(name = "SC12")
    var SC12: String? = null

    @Column(name = "priceSC1")
    var priceSC1: String? = null

    @Column(name = "priceSC2")
    var priceSC2: String? = null

    @Column(name = "priceSC3")
    var priceSC3: String? = null

    @Column(name = "priceSC4")
    var priceSC4: String? = null

    @Column(name = "priceSC5")
    var priceSC5: String? = null

    @Column(name = "priceSC6")
    var priceSC6: String? = null

    @Column(name = "priceSC7")
    var priceSC7: String? = null

    @Column(name = "priceSC8")
    var priceSC8: String? = null

    @Column(name = "priceSC9")
    var priceSC9: String? = null

    @Column(name = "priceSC10")
    var priceSC10: String? = null

    @Column(name = "priceSC11")
    var priceSC11: String? = null

    @Column(name = "priceSC12")
    var priceSC12: String? = null

    @Column(name = "product")
    var product: String? = null

    @Column(name = "transformRatio")
    var transformRatio: String? = null

    @Column(name = "unit")
    var unit: String? = null

    @Column(name = "unitNameSelect")
    var unitNameSelect: String? = null

    @Column(name = "unitNameOther")
    var unitNameOther: String? = null

    @Column(name = "unitWeightOther")
    var unitWeightOther: String? = null

    @Column(name = "unitName")
    var unitName: String? = null

    @Column(name = "unitLocalWeight")
    var unitLocalWeight: String? = null

    @Column(name = "unitWeight")
    var unitWeight: String? = null

    @Column(name = "priceNote")
    var priceNote: String? = null

    @Column(name = "priceRm4")
    var priceRm4: String? = null

    @Column(name = "priceRm2")
    var priceRm2: String? = null

    @Column(name = "priceR0")
    var priceR0: String? = null

    @Column(name = "priceRp2")
    var priceRp2: String? = null

    @Column(name = "priceRp4")
    var priceRp4: String? = null

    @Column(name = "price0")
    var price0: String? = null

    @Column(name = "pricem1")
    var pricem1: String? = null

    @Column(name = "pricem2")
    var pricem2: String? = null

    @Column(name = "pricem3")
    var pricem3: String? = null

    @Column(name = "pricem4")
    var pricem4: String? = null

    @Column(name = "pricep1")
    var pricep1: String? = null

    @Column(name = "pricep2")
    var pricep2: String? = null

    @Column(name = "pricep3")
    var pricep3: String? = null

    @Column(name = "pricep4")
    var pricep4: String? = null

    @Column(name = "noRecommendationNote")
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

    @Column(name = "WYp0h0")
    var WYp0h0: String? = null

    @Column(name = "WYp0hm1")
    var WYp0hm1: String? = null

    @Column(name = "WYp0hm2")
    var WYp0hm2: String? = null

    @Column(name = "WYp0hm3")
    var WYp0hm3: String? = null

    @Column(name = "WYp0hm4")
    var WYp0hm4: String? = null

    @Column(name = "WYp0hp1")
    var WYp0hp1: String? = null

    @Column(name = "WYp0hp2")
    var WYp0hp2: String? = null

    @Column(name = "WYp0hp3")
    var WYp0hp3: String? = null

    @Column(name = "WYp0hp4")
    var WYp0hp4: String? = null

    @Column(name = "CYp0h0")
    var CYp0h0: String? = null

    @Column(name = "CYp0hm1")
    var CYp0hm1: String? = null

    @Column(name = "CYp0hm2")
    var CYp0hm2: String? = null

    @Column(name = "CYp0hm3")
    var CYp0hm3: String? = null

    @Column(name = "CYp0hm4")
    var CYp0hm4: String? = null

    @Column(name = "CYp0hp1")
    var CYp0hp1: String? = null

    @Column(name = "CYp0hp2")
    var CYp0hp2: String? = null

    @Column(name = "CYp0hp3")
    var CYp0hp3: String? = null

    @Column(name = "CYp0hp4")
    var CYp0hp4: String? = null

    @Column(name = "SC0")
    var SC0: String? = null

    @Column(name = "SCm1")
    var SCm1: String? = null

    @Column(name = "SCm2")
    var SCm2: String? = null

    @Column(name = "SCm3")
    var SCm3: String? = null

    @Column(name = "SCm4")
    var SCm4: String? = null

    @Column(name = "SCp1")
    var SCp1: String? = null

    @Column(name = "SCp2")
    var SCp2: String? = null

    @Column(name = "SCp3")
    var SCp3: String? = null

    @Column(name = "SCp4")
    var SCp4: String? = null

    @Column(name = "priceSC0")
    var priceSC0: String? = null

    @Column(name = "priceSCm1")
    var priceSCm1: String? = null

    @Column(name = "priceSCm2")
    var priceSCm2: String? = null

    @Column(name = "priceSCm3")
    var priceSCm3: String? = null

    @Column(name = "priceSCm4")
    var priceSCm4: String? = null

    @Column(name = "priceSCp1")
    var priceSCp1: String? = null

    @Column(name = "priceSCp2")
    var priceSCp2: String? = null

    @Column(name = "priceSCp3")
    var priceSCp3: String? = null

    @Column(name = "priceSCp4")
    var priceSCp4: String? = null

    @Column(name = "Yp0h0")
    var yp0h0: String? = null

    @Column(name = "Yp0h0_AB")
    var yp0h0Ab: String? = null

    @Column(name = "Yp0hm1")
    var yp0hm1: String? = null

    @Column(name = "Yp0hm2")
    var yp0hm2: String? = null

    @Column(name = "Yp0hm3")
    var yp0hm3: String? = null

    @Column(name = "Yp0hm4")
    var yp0hm4: String? = null

    @Column(name = "Yp0hp1")
    var yp0hp1: String? = null

    @Column(name = "Yp0hp2")
    var yp0hp2: String? = null

    @Column(name = "Yp0hp3")
    var yp0hp3: String? = null

    @Column(name = "Yp0hp4")
    var yp0hp4: String? = null

    @Column(name = "GRp0h0")
    var GRp0h0: String? = null

    @Column(name = "GRp0h0_AB")
    var grp0h0Ab: String? = null

    @Column(name = "GRp0h0_ABcurr")
    var grp0h0Abcurr: String? = null

    @Column(name = "GRp0hm1")
    var GRp0hm1: String? = null

    @Column(name = "GRp0hm2")
    var GRp0hm2: String? = null

    @Column(name = "GRp0hm3")
    var GRp0hm3: String? = null

    @Column(name = "GRp0hm4")
    var GRp0hm4: String? = null

    @Column(name = "GRp0hp1")
    var GRp0hp1: String? = null

    @Column(name = "GRp0hp2")
    var GRp0hp2: String? = null

    @Column(name = "GRp0hp3")
    var GRp0hp3: String? = null

    @Column(name = "GRp0hp4")
    var GRp0hp4: String? = null

    @Column(name = "Pp0h0")
    var pp0h0: String? = null

    @Column(name = "Pp0hm1")
    var pp0hm1: String? = null

    @Column(name = "Pp0hm2")
    var pp0hm2: String? = null

    @Column(name = "Pp0hm3")
    var pp0hm3: String? = null

    @Column(name = "Pp0hm4")
    var pp0hm4: String? = null

    @Column(name = "Pp0hp1")
    var pp0hp1: String? = null

    @Column(name = "Pp0hp2")
    var pp0hp2: String? = null

    @Column(name = "Pp0hp3")
    var pp0hp3: String? = null

    @Column(name = "Pp0hp4")
    var pp0hp4: String? = null

    @Column(name = "GPp0h0")
    var GPp0h0: String? = null

    @Column(name = "GPp0h0curr")
    var GPp0h0curr: String? = null

    @Column(name = "GPp0hm1")
    var GPp0hm1: String? = null

    @Column(name = "GPp0hm2")
    var GPp0hm2: String? = null

    @Column(name = "GPp0hm3")
    var GPp0hm3: String? = null

    @Column(name = "GPp0hm4")
    var GPp0hm4: String? = null

    @Column(name = "GPp0hp1")
    var GPp0hp1: String? = null

    @Column(name = "GPp0hp2")
    var GPp0hp2: String? = null

    @Column(name = "GPp0hp3")
    var GPp0hp3: String? = null

    @Column(name = "GPp0hp4")
    var GPp0hp4: String? = null

    @Column(name = "GRmax")
    var GRmax: String? = null

    @Column(name = "GRmax_AB")
    var grmaxAb: String? = null

    @Column(name = "GRdif")
    var GRdif: String? = null

    @Column(name = "GRdif_AB")
    var grdifAb: String? = null

    @Column(name = "GRdif_ABcurr")
    var grdifAbcurr: String? = null

    @Column(name = "GPmax")
    var GPmax: String? = null

    @Column(name = "GPdif")
    var GPdif: String? = null

    @Column(name = "GPdifcurr")
    var GPdifcurr: String? = null

    @Column(name = "optHarvest")
    var optHarvest: String? = null

    @Column(name = "optHarvestText")
    var optHarvestText: String? = null

    @Column(name = "Yh0p0Note")
    var yh0p0Note: String? = null

    @Column(name = "optHarvestNote")
    var optHarvestNote: String? = null

    @Column(name = "difHarvestNote")
    var difHarvestNote: String? = null

    @Column(name = "GRdifNote")
    var GRdifNote: String? = null

    @Column(name = "GRmaxNote")
    var GRmaxNote: String? = null

    @Column(name = "sensible")
    var sensible: String? = null

    @Column(name = "validationNote")
    var validationNote: String? = null

    @Column(name = "validationNote2")
    var validationNote2: String? = null

    @Column(name = "validationNote3")
    var validationNote3: String? = null

    @Column(name = "call")
    var call: String? = null

    @Column(name = "confirmVAL")
    var confirmVAL: String? = null

    @Column(name = "instanceID")
    var instanceID: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}