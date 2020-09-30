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
    var rateurea: String? = null

    @Column(name = "ratetsp")
    var ratetsp: String? = null

    @Column(name = "ratenafaka")
    var ratenafaka: String? = null

    @Column(name = "ratedap")
    var ratedap: String? = null

    @Column(name = "ratemop")
    var ratemop: String? = null

    @Column(name = "ratenpk")
    var ratenpk: String? = null

    @Column(name = "currenty")
    var currenty: String? = null

    @Column(name = "targety")
    var targety: String? = null

    @Column(name = "increasey")
    var increasey: String? = null

    @Column(name = "netrev")
    var netrev: String? = null

    @Column(name = "totalcost")
    var totalcost: String? = null

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
    var rateureaAb: String? = null

    @Column(name = "ratetsp_ab")
    var ratetspAb: String? = null

    @Column(name = "ratenafaka_ab")
    var ratenafakaAb: String? = null

    @Column(name = "ratedap_ab")
    var ratedapAb: String? = null

    @Column(name = "ratemop_ab")
    var ratemopAb: String? = null

    @Column(name = "ratenpk_ab")
    var ratenpkAb: String? = null

    @Column(name = "increasey_ab")
    var increaseyAb: String? = null

    @Column(name = "rec")
    var rec: String? = null

    @Column(name = "quantityurea")
    var quantityurea: String? = null

    @Column(name = "quantitytsp")
    var quantitytsp: String? = null

    @Column(name = "quantitynafaka")
    var quantitynafaka: String? = null

    @Column(name = "quantitydap")
    var quantitydap: String? = null

    @Column(name = "quantitymop")
    var quantitymop: String? = null

    @Column(name = "quantitynpk")
    var quantitynpk: String? = null

    @Column(name = "rateurea_min")
    var rateureaMin: String? = null

    @Column(name = "ratetsp_min")
    var ratetspMin: String? = null

    @Column(name = "ratenafaka_min")
    var ratenafakaMin: String? = null

    @Column(name = "ratedap_min")
    var ratedapMin: String? = null

    @Column(name = "ratemop_min")
    var ratemopMin: String? = null

    @Column(name = "ratenpk_min")
    var ratenpkMin: String? = null

    @Column(name = "quantity1urea")
    var quantity1urea: String? = null

    @Column(name = "quantity2urea")
    var quantity2urea: String? = null

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
    var netrevloccur: String? = null

    @Column(name = "totalcostloccur")
    var totalcostloccur: String? = null

    @Column(name = "netrevloccur_ab")
    var netrevloccurAb: String? = null

    @Column(name = "netrevloccur_abcurr")
    var netrevloccurAbcurr: String? = null

    @Column(name = "totalcostloccur_ab")
    var totalcostloccurAb: String? = null

    @Column(name = "totalcostloccur_abcurr")
    var totalcostloccurAbcurr: String? = null

    @Column(name = "netrevloccurplot")
    var netrevloccurplot: String? = null

    @Column(name = "netrevloccurplotcurr")
    var netrevloccurplotcurr: String? = null

    @Column(name = "totalcostloccurplot")
    var totalcostloccurplot: String? = null

    @Column(name = "totalcostloccurplotcurr")
    var totalcostloccurplotcurr: String? = null

    @Column(name = "norecommendationtznote")
    var norecommendationtznote: String? = null

    @Column(name = "norecommendationngnote")
    var norecommendationngnote: String? = null

    @Column(name = "nofertilizernote")
    var nofertilizernote: String? = null

    @Column(name = "ratefertilizernote")
    var ratefertilizernote: String? = null

    @Column(name = "rateureanote")
    var rateureanote: String? = null

    @Column(name = "ratetspnote")
    var ratetspnote: String? = null

    @Column(name = "ratenafakanote")
    var ratenafakanote: String? = null

    @Column(name = "ratedapnote")
    var ratedapnote: String? = null

    @Column(name = "ratemopnote")
    var ratemopnote: String? = null

    @Column(name = "ratenpknote")
    var ratenpknote: String? = null

    @Column(name = "yieldnote")
    var yieldnote: String? = null

    @Column(name = "validationnote")
    var validationnote: String? = null

    @Column(name = "notnote")
    var notnote: String? = null

    @Column(name = "quantityureanote")
    var quantityureanote: String? = null

    @Column(name = "quantitytspnote")
    var quantitytspnote: String? = null

    @Column(name = "quantitynafakanote")
    var quantitynafakanote: String? = null

    @Column(name = "quantitydapnote")
    var quantitydapnote: String? = null

    @Column(name = "quantitymopnote")
    var quantitymopnote: String? = null

    @Column(name = "quantitynpknote")
    var quantitynpknote: String? = null

    @Column(name = "productionnote")
    var productionnote: String? = null

    @Column(name = "production_hrnote")
    var productionHrnote: String? = null

    @Column(name = "split1note")
    var split1note: String? = null

    @Column(name = "quantity1ureanote")
    var quantity1ureanote: String? = null

    @Column(name = "quantity1tspnote")
    var quantity1tspnote: String? = null

    @Column(name = "quantity1nafakanote")
    var quantity1nafakanote: String? = null

    @Column(name = "quantity1dapnote")
    var quantity1dapnote: String? = null

    @Column(name = "quantity1mopnote")
    var quantity1mopnote: String? = null

    @Column(name = "quantity1npknote")
    var quantity1npknote: String? = null

    @Column(name = "split2note")
    var split2note: String? = null

    @Column(name = "quantity2ureanote")
    var quantity2ureanote: String? = null

    @Column(name = "quantity2tspnote")
    var quantity2tspnote: String? = null

    @Column(name = "quantity2dapnote")
    var quantity2dapnote: String? = null

    @Column(name = "quantity2nafakanote")
    var quantity2nafakanote: String? = null

    @Column(name = "quantity2mopnote")
    var quantity2mopnote: String? = null

    @Column(name = "quantity2npknote")
    var quantity2npknote: String? = null

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