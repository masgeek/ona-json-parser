package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_cis")
class ValCisEntity : BaseEntity() {
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

    @Column(name = "yieldlevel")
    var yieldlevel: String? = null

    @Column(name = "sweetpotatovarietyselect")
    var sweetpotatovarietyselect: String? = null

    @Column(name = "sweetpotatovarietyother")
    var sweetpotatovarietyother: String? = null

    @Column(name = "cassavavariety_select")
    var cassavavarietyselect: String? = null

    @Column(name = "cassavavariety_other")
    var cassavavarietyother: String? = null

    @Column(name = "cassavavariety_type")
    var cassavavarietytype: String? = null

    @Column(name = "areabasis")
    var areabasis: String? = null

    @Column(name = "bagsize_npk")
    var bagsizenpk: String? = null

    @Column(name = "costnpk")
    var costnpk: String? = null

    @Column(name = "rootsunit")
    var rootsUnit: String? = null

    @Column(name = "rootspricesi")
    var rootspricesi: String? = null

    @Column(name = "rootsunitname")
    var rootsunitname: String? = null

    @Column(name = "rootsunitweight")
    var rootsunitweight: String? = null

    @Column(name = "rootsunitprice")
    var rootsunitprice: String? = null

    @Column(name = "rootsprice")
    var rootsprice: String? = null

    @Column(name = "tuberunit")
    var tuberunit: String? = null

    @Column(name = "tuberpricesi")
    var tuberpricesi: String? = null

    @Column(name = "tuberunitname")
    var tuberunitname: String? = null

    @Column(name = "tuberunitweight")
    var tuberunitweight: String? = null

    @Column(name = "tuberunitprice")
    var tuberunitprice: String? = null

    @Column(name = "tuberprice")
    var tuberprice: String? = null

    @Column(name = "rootyieldmc")
    var rootyieldmc: String? = null

    @Column(name = "tuberyieldmc")
    var tuberyieldmc: String? = null

    @Column(name = "rootyieldredic")
    var rootyieldredic: String? = null

    @Column(name = "tuberyieldredic")
    var tuberyieldredic: String? = null

    @Column(name = "extrarootyieldmcf")
    var extrarootyieldmcf: String? = null

    @Column(name = "extratuberyieldmcf")
    var extratuberyieldmcf: String? = null

    @Column(name = "rootgrmc")
    var rootgrmc: String? = null

    @Column(name = "rootgric")
    var rootgric: String? = null

    @Column(name = "tubergric")
    var tubergric: String? = null

    @Column(name = "totalgric")
    var totalgric: String? = null

    @Column(name = "extragric")
    var extragric: String? = null

    @Column(name = "importanceic")
    var importanceic: String? = null

    @Column(name = "unitpricenpk50kg")
    var unitpricenpk50kg: String? = null

    @Column(name = "costfertilizer")
    var costfertilizer: String? = null

    @Column(name = "ratefertilizerab_text")
    var ratefertilizerabText: String? = null

    @Column(name = "costfertilizerab")
    var costfertilizerab: String? = null

    @Column(name = "costfertilizerab_text")
    var costfertilizerabText: String? = null

    @Column(name = "riskattitude")
    var riskattitude: String? = null

    @Column(name = "rootgrmcf")
    var rootgrmcf: String? = null

    @Column(name = "rootgricf")
    var rootgricf: String? = null

    @Column(name = "tubergricf")
    var tubergricf: String? = null

    @Column(name = "totalgricf")
    var totalgricf: String? = null

    @Column(name = "extragrmcf")
    var extragrmcf: String? = null

    @Column(name = "extragricf")
    var extragricf: String? = null

    @Column(name = "rec")
    var rec: String? = null

    @Column(name = "extraprofit")
    var extraProfit: String? = null

    @Column(name = "extraprofitperc")
    var extraProfitPerc: String? = null

    @Column(name = "rec_mc")
    var recMc: String? = null

    @Column(name = "rec_ic")
    var recIc: String? = null

    @Column(name = "rec_icf")
    var recIcf: String? = null

    @Column(name = "validationnote")
    var validationnote: String? = null

    @Column(name = "validationplot1")
    var validationplot1: String? = null

    @Column(name = "validationplot2")
    var validationplot2: String? = null

    @Column(name = "validationplot3")
    var validationplot3: String? = null

    @Column(name = "validationplot4")
    var validationplot4: String? = null

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