package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_fr")
class ValFrEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDate? = null

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

    @Column(name = "purpose_val")
    var purposeVal: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "countryselect")
    var countryselect: String? = null

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
    var plantingDate: LocalDate? = null

    @Column(name = "season")
    var season: String? = null

    @Column(name = "plantingweek")
    var plantingweek: String? = null

    @Column(name = "areabasis")
    var areabasis: String? = null

    @Column(name = "fcy")
    var fcy: String? = null

    @Column(name = "lookup_id")
    var lookupId: String? = null

    @Column(name = "rateurea")
    var rateUrea: String? = null

    @Column(name = "ratetsp")
    var rateTsp: String? = null

    @Column(name = "ratenafaka")
    var rateNafaka: String? = null

    @Column(name = "ratedap")
    var rateDap: String? = null

    @Column(name = "ratemop")
    var rateMop: String? = null

    @Column(name = "ratenpk")
    var rateNpk: String? = null

    @Column(name = "currenty")
    var currenty: String? = null

    @Column(name = "targety")
    var targety: String? = null

    @Column(name = "increasey")
    var increasey: String? = null

    @Column(name = "netrev")
    var netRev: String? = null

    @Column(name = "totalcost")
    var totalCost: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "plantingdensity")
    var plantingdensity: String? = null

    @Column(name = "betweenrow")
    var betweenrow: String? = null

    @Column(name = "withinrow")
    var withinrow: String? = null

    @Column(name = "plotl")
    var plotl: String? = null

    @Column(name = "plotw")
    var plotw: String? = null

    @Column(name = "plotsize")
    var plotsize: String? = null

    @Column(name = "rateurea_ab")
    var rateUreaAb: String? = null

    @Column(name = "ratetsp_ab")
    var rateTspAb: String? = null

    @Column(name = "ratenafaka_ab")
    var rateNafakaAb: String? = null

    @Column(name = "ratedap_ab")
    var rateDapAb: String? = null

    @Column(name = "ratemop_ab")
    var rateMopAb: String? = null

    @Column(name = "ratenpk_ab")
    var rateNpkAb: String? = null

    @Column(name = "increasey_ab")
    var increaseyAb: String? = null

    @Column(name = "rec")
    var rec: String? = null

    @Column(name = "quantityurea")
    var quantityUrea: String? = null

    @Column(name = "quantitytsp")
    var quantityTsp: String? = null

    @Column(name = "quantitynafaka")
    var quantityNafaka: String? = null

    @Column(name = "quantitydap")
    var quantityDap: String? = null

    @Column(name = "quantitymop")
    var quantityMop: String? = null

    @Column(name = "quantitynpk")
    var quantityNpk: String? = null

    @Column(name = "rateurea_min")
    var rateUreaMin: String? = null

    @Column(name = "ratetsp_min")
    var rateTspMin: String? = null

    @Column(name = "ratenafaka_min")
    var rateNafakaMin: String? = null

    @Column(name = "ratedap_min")
    var rateDapMin: String? = null

    @Column(name = "ratemop_min")
    var rateMopMin: String? = null

    @Column(name = "ratenpk_min")
    var rateNpkMin: String? = null

    @Column(name = "quantity1urea")
    var quantity1Urea: String? = null

    @Column(name = "quantity2urea")
    var quantity2Urea: String? = null

    @Column(name = "quantity1tsp")
    var quantity1tsp: String? = null

    @Column(name = "quantity2tsp")
    var quantity2tsp: String? = null

    @Column(name = "quantity1nafaka")
    var quantity1nafaka: String? = null

    @Column(name = "quantity2nafaka")
    var quantity2nafaka: String? = null

    @Column(name = "quantity1dap")
    var quantity1dap: String? = null

    @Column(name = "quantity2dap")
    var quantity2dap: String? = null

    @Column(name = "quantity1mop")
    var quantity1mop: String? = null

    @Column(name = "quantity2mop")
    var quantity2mop: String? = null

    @Column(name = "quantity1npk")
    var quantity1npk: String? = null

    @Column(name = "quantity2npk")
    var quantity2npk: String? = null

    @Column(name = "split1")
    var split1: String? = null

    @Column(name = "split2")
    var split2: String? = null

    @Column(name = "increasep")
    var increasep: String? = null

    @Column(name = "netrevloccur")
    var netRevLocCur: String? = null

    @Column(name = "totalcostloccur")
    var totalCostLocCur: String? = null

    @Column(name = "netrevloccur_ab")
    var netRevLocCurAb: String? = null

    @Column(name = "netrevloccur_abcurr")
    var netRevLocCurAbCurr: String? = null

    @Column(name = "totalcostloccur_ab")
    var totalCostLocCurAb: String? = null

    @Column(name = "totalcostloccur_abcurr")
    var totalCostLocCurAbCurr: String? = null

    @Column(name = "netrevloccurplot")
    var netrevloccurPlot: String? = null

    @Column(name = "netrevloccurplotcurr")
    var netRevLocCurPlotCurr: String? = null

    @Column(name = "totalcostloccurplot")
    var totalCostLocCurPlot: String? = null

    @Column(name = "totalcostloccurplotcurr")
    var totalCostLoccurPlotCurr: String? = null

    @Column(name = "norecommendationtznote")
    var noRecommendationTzNote: String? = null

    @Column(name = "norecommendationngnote")
    var noRecommendationNgNote: String? = null

    @Column(name = "nofertilizernote")
    var noFertilizerNote: String? = null

    @Column(name = "ratefertilizernote")
    var rateFertilizerNote: String? = null

    @Column(name = "rateureanote")
    var rateUreaNote: String? = null

    @Column(name = "ratetspnote")
    var rateTspNote: String? = null

    @Column(name = "ratenafakanote")
    var rateNafakaNote: String? = null

    @Column(name = "ratedapnote")
    var rateDapNote: String? = null

    @Column(name = "ratemopnote")
    var rateMopNote: String? = null

    @Column(name = "ratenpknote")
    var rateNpkNote: String? = null

    @Column(name = "yieldnote")
    var yieldNote: String? = null

    @Column(name = "validationnote")
    var validationNote: String? = null

    @Column(name = "notnote")
    var notNote: String? = null

    @Column(name = "quantityureanote")
    var quantityUreaNote: String? = null

    @Column(name = "quantitytspnote")
    var quantityTspNote: String? = null

    @Column(name = "quantitynafakanote")
    var quantityNafakaNote: String? = null

    @Column(name = "quantitydapnote")
    var quantityNapNote: String? = null

    @Column(name = "quantitymopnote")
    var quantityMopNote: String? = null

    @Column(name = "quantitynpknote")
    var quantityNpkNote: String? = null

    @Column(name = "productionnote")
    var productionNote: String? = null

    @Column(name = "production_hrnote")
    var productionHrNote: String? = null

    @Column(name = "split1note")
    var split1Note: String? = null

    @Column(name = "quantity1ureanote")
    var quantity1UreaNote: String? = null

    @Column(name = "quantity1tspnote")
    var quantity1TspNote: String? = null

    @Column(name = "quantity1nafakanote")
    var quantity1NafakaNote: String? = null

    @Column(name = "quantity1dapnote")
    var quantity1dapNote: String? = null

    @Column(name = "quantity1mopnote")
    var quantity1mopNote: String? = null

    @Column(name = "quantity1npknote")
    var quantity1npkNote: String? = null

    @Column(name = "split2note")
    var split2Note: String? = null

    @Column(name = "quantity2ureanote")
    var quantity2ureaNote: String? = null

    @Column(name = "quantity2tspnote")
    var quantity2tspNote: String? = null

    @Column(name = "quantity2dapnote")
    var quantity2dapNote: String? = null

    @Column(name = "quantity2nafakanote")
    var quantity2nafakaNote: String? = null

    @Column(name = "quantity2mopnote")
    var quantity2mopNote: String? = null

    @Column(name = "quantity2npknote")
    var quantity2npkNote: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "confirmval")
    var confirmval: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}