package com.tsobu.ona.database.entities.valsphstz

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_sphs_tz_lzw")
class LzwEntity : BaseEntity() {
    @Column(name = "areabasis")
    var areabasis: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "betweenrow")
    var betweenrow: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "check_id")
    var checkId: String? = null

    @Column(name = "check_value")
    var checkValue: String? = null

    @Column(name = "confirmval")
    var confirmval: String? = null

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

    @Column(name = "difharvestnote")
    var difharvestnote: String? = null

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

    @Column(name = "grdifnote")
    var grdifnote: String? = null

    @Column(name = "grmax")
    var grmax: String? = null

    @Column(name = "grmax_ab")
    var grmaxAb: String? = null

    @Column(name = "grmaxnote")
    var grmaxnote: String? = null

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

    @Column(name = "harvest_date")
    var harvestDate: LocalDateTime? = null

    @Column(name = "harvestage0")
    var harvestage0: String? = null

    @Column(name = "harvestagem1")
    var harvestagem1: String? = null

    @Column(name = "harvestagem2")
    var harvestagem2: String? = null

    @Column(name = "harvestagem3")
    var harvestagem3: String? = null

    @Column(name = "harvestagem4")
    var harvestagem4: String? = null

    @Column(name = "harvestagep1")
    var harvestagep1: String? = null

    @Column(name = "harvestagep2")
    var harvestagep2: String? = null

    @Column(name = "harvestagep3")
    var harvestagep3: String? = null

    @Column(name = "harvestagep4")
    var harvestagep4: String? = null

    @Column(name = "harvestweek0")
    var harvestweek0: String? = null

    @Column(name = "harvestweekm1")
    var harvestweekm1: String? = null

    @Column(name = "harvestweekm2")
    var harvestweekm2: String? = null

    @Column(name = "harvestweekm3")
    var harvestweekm3: String? = null

    @Column(name = "harvestweekm4")
    var harvestweekm4: String? = null

    @Column(name = "harvestweekp1")
    var harvestweekp1: String? = null

    @Column(name = "harvestweekp2")
    var harvestweekp2: String? = null

    @Column(name = "harvestweekp3")
    var harvestweekp3: String? = null

    @Column(name = "harvestweekp4")
    var harvestweekp4: String? = null

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

    @Column(name = "norecommendationnote")
    var norecommendationnote: String? = null

    @Column(name = "optharvesttext")
    var optharvesttext: String? = null

    @Column(name = "optharvest")
    var optharvest: String? = null

    @Column(name = "optharvestnote")
    var optharvestnote: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "plantingdensity")
    var plantingdensity: String? = null

    @Column(name = "plantingweek0")
    var plantingweek0: String? = null

    @Column(name = "plotl")
    var plotl: String? = null

    @Column(name = "plotsize")
    var plotsize: String? = null

    @Column(name = "plotw")
    var plotw: String? = null

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

    @Column(name = "pricenote")
    var pricenote: String? = null

    @Column(name = "pricep1")
    var pricep1: String? = null

    @Column(name = "pricep2")
    var pricep2: String? = null

    @Column(name = "pricep3")
    var pricep3: String? = null

    @Column(name = "pricep4")
    var pricep4: String? = null

    @Column(name = "pricer0")
    var pricer0: String? = null

    @Column(name = "pricerm2")
    var pricerm2: String? = null

    @Column(name = "pricerm4")
    var pricerm4: String? = null

    @Column(name = "pricerp2")
    var pricerp2: String? = null

    @Column(name = "pricerp4")
    var pricerp4: String? = null

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

    @Column(name = "pricestarch")
    var pricestarch: String? = null

    @Column(name = "product")
    var product: String? = null

    @Column(name = "purpose_val")
    var purposeVal: String? = null

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

    @Column(name = "starchfactory")
    var starchfactory: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "subscriberid")
    var subscriberid: String? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "transformratio")
    var transformratio: String? = null

    @Column(name = "unit")
    var unit: String? = null

    @Column(name = "unitlocalweight")
    var unitlocalweight: String? = null

    @Column(name = "unitname")
    var unitname: String? = null

    @Column(name = "unitnameother")
    var unitnameother: String? = null

    @Column(name = "unitnameselect")
    var unitnameselect: String? = null

    @Column(name = "unitweight")
    var unitweight: String? = null

    @Column(name = "unitweightother")
    var unitweightother: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "uuid")
    var formHubUuId: String? = null

    @Column(name = "validationnote")
    var validationnote: String? = null

    @Column(name = "validationnote2")
    var validationnote2: String? = null

    @Column(name = "validationnote3")
    var validationnote3: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "withinrow")
    var withinrow: String? = null

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

    @Column(name = "yh0p0note")
    var yh0p0note: String? = null

    @Column(name = "yieldlevel")
    var yieldlevel: String? = null

    @Column(name = "yp0h0")
    var yp0h0: String? = null

    @Column(name = "yp0h0_ab")
    var yp0h0Ab: String? = null

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