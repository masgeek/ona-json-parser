package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_ic")
class ValIcEntity : BaseEntity() {
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

    @Column(name = "heightmaize")
    var heightmaize: String? = null

    @Column(name = "previousmaizevarietyselect")
    var previousmaizevarietyselect: String? = null

    @Column(name = "previousmaizevarietyother")
    var previousmaizevarietyother: String? = null

    @Column(name = "previousmaizevarietyduration")
    var previousmaizevarietyduration: String? = null

    @Column(name = "maizevarietyselect")
    var maizevarietyselect: String? = null

    @Column(name = "maizevarietyother")
    var maizevarietyother: String? = null

    @Column(name = "maizevarietyduration")
    var maizevarietyduration: String? = null

    @Column(name = "maizevariety")
    var maizevariety: String? = null

    @Column(name = "cassavavarietyselect")
    var cassavavarietyselect: String? = null

    @Column(name = "cassavavarietyother")
    var cassavavarietyother: String? = null

    @Column(name = "cassavavarietytype")
    var cassavavarietytype: String? = null

    @Column(name = "areabasis")
    var areabasis: String? = null

    @Column(name = "bagsizenpk")
    var bagsizenpk: String? = null

    @Column(name = "costnpk")
    var costnpk: String? = null

    @Column(name = "bagsizeurea")
    var bagsizeurea: String? = null

    @Column(name = "costurea")
    var costurea: String? = null

    @Column(name = "pricemaizecobfreshlarge")
    var pricemaizecobfreshlarge: String? = null

    @Column(name = "priceroots")
    var priceroots: String? = null

    @Column(name = "maizegrain")
    var maizegrain: String? = null

    @Column(name = "maizegrainunit")
    var maizegrainunit: String? = null

    @Column(name = "maizegrainpricekg")
    var maizegrainpricekg: String? = null

    @Column(name = "maizegrainunitname")
    var maizegrainunitname: String? = null

    @Column(name = "maizegrainunitweight")
    var maizegrainunitweight: String? = null

    @Column(name = "maizegrainunitprice")
    var maizegrainunitprice: String? = null

    @Column(name = "maizegrainprice")
    var maizegrainprice: String? = null

    @Column(name = "numberextracobslarge")
    var numberextracobslarge: String? = null

    @Column(name = "valueextracobslarge")
    var valueextracobslarge: String? = null

    @Column(name = "quantityextragrain")
    var quantityextragrain: String? = null

    @Column(name = "valueextragrain")
    var valueextragrain: String? = null

    @Column(name = "grossextravalue")
    var grossextravalue: String? = null

    @Column(name = "unitpricenpk50kg")
    var unitpricenpk50kg: String? = null

    @Column(name = "unitpriceurea50kg")
    var unitpriceurea50kg: String? = null

    @Column(name = "costfertilizer")
    var costfertilizer: String? = null

    @Column(name = "costfertilizerareabasis")
    var costfertilizerareabasis: String? = null

    @Column(name = "costfertilizerareabasis_text")
    var costfertilizerareabasisText: String? = null

    @Column(name = "riskattitude")
    var riskattitude: String? = null

    @Column(name = "profitextra")
    var profitextra: String? = null

    @Column(name = "riskratio2")
    var riskratio2: String? = null

    @Column(name = "numberextracobslarge_ab")
    var numberextracobslargeAb: String? = null

    @Column(name = "valueextracobslarge_ab")
    var valueextracobslargeAb: String? = null

    @Column(name = "quantityextragrain_ab")
    var quantityextragrainAb: String? = null

    @Column(name = "valueextragrain_ab")
    var valueextragrainAb: String? = null

    @Column(name = "unitpricenpk50kg_ab")
    var unitpricenpk50kgAb: String? = null

    @Column(name = "unitpriceurea50kg_ab")
    var unitpriceurea50kgAb: String? = null

    @Column(name = "costfertilizer_ab")
    var costfertilizerAb: String? = null

    @Column(name = "costfertilizer_abtext")
    var costfertilizerAbtext: String? = null

    @Column(name = "profitextra_ab")
    var profitextraAb: String? = null

    @Column(name = "profitextra_abtext")
    var profitextraAbtext: String? = null

    @Column(name = "riskratio2_ab")
    var riskratio2Ab: String? = null

    @Column(name = "npk_ab")
    var npkAb: String? = null

    @Column(name = "urea1_ab")
    var urea1Ab: String? = null

    @Column(name = "urea2_ab")
    var urea2Ab: String? = null

    @Column(name = "yieldloss_cassava_abtext")
    var yieldlossCassavaAbtext: String? = null

    @Column(name = "valueloss_cassava_abtext")
    var valuelossCassavaAbtext: String? = null

    @Column(name = "reasonhd")
    var reasonhd: String? = null

    @Column(name = "plotsize")
    var plotsize: String? = null

    @Column(name = "numberextracobslargeplot")
    var numberextracobslargeplot: String? = null

    @Column(name = "priceextracobslargeplot")
    var priceextracobslargeplot: String? = null

    @Column(name = "quantityextragrainplot")
    var quantityextragrainplot: String? = null

    @Column(name = "valueextragrainplot")
    var valueextragrainplot: String? = null

    @Column(name = "costfertilizerplot")
    var costfertilizerplot: String? = null

    @Column(name = "profitextraplot")
    var profitextraplot: String? = null

    @Column(name = "profitextraplottext")
    var profitextraplottext: String? = null

    @Column(name = "npkplot")
    var npkplot: String? = null

    @Column(name = "urea1plot")
    var urea1plot: String? = null

    @Column(name = "urea2plot")
    var urea2plot: String? = null

    @Column(name = "reccol")
    var reccol: String? = null

    @Column(name = "lowdensity_recommendation")
    var lowdensityRecommendation: String? = null

    @Column(name = "blanket_recommendation")
    var blanketRecommendation: String? = null

    @Column(name = "risknote1")
    var risknote1: String? = null

    @Column(name = "risknote2")
    var risknote2: String? = null

    @Column(name = "risknote3")
    var risknote3: String? = null

    @Column(name = "profitnote1")
    var profitnote1: String? = null

    @Column(name = "profitnote2")
    var profitnote2: String? = null

    @Column(name = "profitnote3")
    var profitnote3: String? = null

    @Column(name = "profitnote3_maizegrain")
    var profitnote3Maizegrain: String? = null

    @Column(name = "validationnote")
    var validationnote: String? = null

    @Column(name = "validationplot1")
    var validationplot1: String? = null

    @Column(name = "validationplot1note1")
    var validationplot1note1: String? = null

    @Column(name = "validationplot1note2")
    var validationplot1note2: String? = null

    @Column(name = "validationplot1note2_maizegrain")
    var validationplot1note2Maizegrain: String? = null

    @Column(name = "validationplot2")
    var validationplot2: String? = null

    @Column(name = "validationplot3")
    var validationplot3: String? = null

    @Column(name = "recnote")
    var recnote: String? = null

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