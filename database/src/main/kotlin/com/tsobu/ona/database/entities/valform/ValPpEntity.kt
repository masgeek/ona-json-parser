package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp")
class ValPpEntity : BaseEntity() {
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

    @Column(name = "fallowtype")
    var fallowtype: String? = null

    @Column(name = "fallowheight")
    var fallowheight: String? = null

    @Column(name = "fallowage")
    var fallowage: String? = null

    @Column(name = "fallowgreen")
    var fallowgreen: String? = null

    @Column(name = "problemweeds")
    var problemweeds: String? = null

    @Column(name = "pw_count")
    var pwCount: String? = null

    @Column(name = "set_of_pw")
    var setOfPw: String? = null

    @Column(name = "slash")
    var slash: String? = null

    @Column(name = "spray")
    var spray: String? = null

    @Column(name = "slash1spray1note")
    var slash1spray1note: String? = null

    @Column(name = "slash1spray0note")
    var slash1spray0note: String? = null

    @Column(name = "slash0spray1note")
    var slash0spray1note: String? = null

    @Column(name = "slash0spray0note")
    var slash0spray0note: String? = null

    @Column(name = "tractoraccess")
    var tractoraccess: String? = null

    @Column(name = "implement")
    var implement: String? = null

    @Column(name = "herbicideaccess")
    var herbicideaccess: String? = null

    @Column(name = "basictill")
    var basictill: String? = null

    @Column(name = "harrowselect")
    var harrowselect: String? = null

    @Column(name = "ridging")
    var ridging: String? = null

    @Column(name = "weedingmethodselect")
    var weedingmethodselect: String? = null

    @Column(name = "basictillmethodselect1")
    var basictillmethodselect1: String? = null

    @Column(name = "basictillmethod1")
    var basictillmethod1: String? = null

    @Column(name = "basictillmethodselect2")
    var basictillmethodselect2: String? = null

    @Column(name = "basictillmethod2")
    var basictillmethod2: String? = null

    @Column(name = "harrow")
    var harrow: String? = null

    @Column(name = "ridgingmethodselect")
    var ridgingmethodselect: String? = null

    @Column(name = "ridgingmethod")
    var ridgingmethod: String? = null

    @Column(name = "weedingmethod")
    var weedingmethod: String? = null

    @Column(name = "currenty")
    var currenty: String? = null

    @Column(name = "currentyieldlevel")
    var currentyieldlevel: String? = null

    @Column(name = "cp")
    var cp: String? = null

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

    @Column(name = "costnote")
    var costnote: String? = null

    @Column(name = "basictill1manualcost")
    var basictill1manualcost: String? = null

    @Column(name = "basictill1tractorcost")
    var basictill1tractorcost: String? = null

    @Column(name = "basictill2manualcost")
    var basictill2manualcost: String? = null

    @Column(name = "basictill2tractorcost")
    var basictill2tractorcost: String? = null

    @Column(name = "harrowtractorcost")
    var harrowtractorcost: String? = null

    @Column(name = "ridgingmanualcost")
    var ridgingmanualcost: String? = null

    @Column(name = "ridgingtractorcost")
    var ridgingtractorcost: String? = null

    @Column(name = "weedingmanualcost")
    var weedingmanualcost: String? = null

    @Column(name = "weedingherbicidecost")
    var weedingherbicidecost: String? = null

    @Column(name = "priceroots")
    var priceroots: String? = null

    @Column(name = "basictill1cost")
    var basictill1cost: String? = null

    @Column(name = "basictill2cost")
    var basictill2cost: String? = null

    @Column(name = "harrowcost")
    var harrowcost: String? = null

    @Column(name = "ridgingcost")
    var ridgingcost: String? = null

    @Column(name = "weedingcost")
    var weedingcost: String? = null

    @Column(name = "costt0rg")
    var costt0rg: String? = null

    @Column(name = "costt0fl")
    var costt0fl: String? = null

    @Column(name = "costt1rg")
    var costt1rg: String? = null

    @Column(name = "costt1fl")
    var costt1fl: String? = null

    @Column(name = "costt2rg")
    var costt2rg: String? = null

    @Column(name = "costt2fl")
    var costt2fl: String? = null

    @Column(name = "costcp")
    var costcp: String? = null

    @Column(name = "costcpcurr")
    var costcpcurr: String? = null

    @Column(name = "grossvaluet0rg")
    var grossvaluet0rg: String? = null

    @Column(name = "grossvaluet0fl")
    var grossvaluet0fl: String? = null

    @Column(name = "grossvaluet1rg")
    var grossvaluet1rg: String? = null

    @Column(name = "grossvaluet1fl")
    var grossvaluet1fl: String? = null

    @Column(name = "grossvaluet2rg")
    var grossvaluet2rg: String? = null

    @Column(name = "grossvaluet2fl")
    var grossvaluet2fl: String? = null

    @Column(name = "grossvaluecp")
    var grossvaluecp: String? = null

    @Column(name = "netvaluet0rg")
    var netvaluet0rg: String? = null

    @Column(name = "netvaluet0fl")
    var netvaluet0fl: String? = null

    @Column(name = "netvaluet1rg")
    var netvaluet1rg: String? = null

    @Column(name = "netvaluet1fl")
    var netvaluet1fl: String? = null

    @Column(name = "netvaluet2rg")
    var netvaluet2rg: String? = null

    @Column(name = "netvaluet2fl")
    var netvaluet2fl: String? = null

    @Column(name = "netvaluecp")
    var netvaluecp: String? = null

    @Column(name = "netvaluedift0rg")
    var netvaluedift0rg: String? = null

    @Column(name = "netvaluedift0fl")
    var netvaluedift0fl: String? = null

    @Column(name = "netvaluedift1rg")
    var netvaluedift1rg: String? = null

    @Column(name = "netvaluedift1fl")
    var netvaluedift1fl: String? = null

    @Column(name = "netvaluedift2rg")
    var netvaluedift2rg: String? = null

    @Column(name = "netvaluedift2fl")
    var netvaluedift2fl: String? = null

    @Column(name = "netvaluedifmax")
    var netvaluedifmax: String? = null

    @Column(name = "netvaluedifmaxround")
    var netvaluedifmaxround: String? = null

    @Column(name = "cptext")
    var cptext: String? = null

    @Column(name = "basictillrec")
    var basictillrec: String? = null

    @Column(name = "ridgingrec")
    var ridgingrec: String? = null

    @Column(name = "rectext")
    var rectext: String? = null

    @Column(name = "harrowtext")
    var harrowtext: String? = null

    @Column(name = "harrowtext2")
    var harrowtext2: String? = null

    @Column(name = "costdif")
    var costdif: String? = null

    @Column(name = "costdifchange")
    var costdifchange: String? = null

    @Column(name = "costdifabs")
    var costdifabs: String? = null

    @Column(name = "netvaluedifcurr")
    var netvaluedifcurr: String? = null

    @Column(name = "costdifcurr")
    var costdifcurr: String? = null

    @Column(name = "optppnote")
    var optppnote: String? = null

    @Column(name = "recnote")
    var recnote: String? = null

    @Column(name = "netvaluenote")
    var netvaluenote: String? = null

    @Column(name = "costnote1")
    var costnote1: String? = null

    @Column(name = "costnote2")
    var costnote2: String? = null

    @Column(name = "ridgingnote")
    var ridgingnote: String? = null

    @Column(name = "tractornote")
    var tractornote: String? = null

    @Column(name = "harrownote")
    var harrownote: String? = null

    @Column(name = "validationnote")
    var validationnote: String? = null

    @Column(name = "validationnote2")
    var validationnote2: String? = null

    @Column(name = "validationnote3")
    var validationnote3: String? = null

    @Column(name = "validationnote4")
    var validationnote4: String? = null

    @Column(name = "validationnote5")
    var validationnote5: String? = null

    @Column(name = "validationnote6")
    var validationnote6: String? = null

    @Column(name = "plot3")
    var plot3: String? = null

    @Column(name = "validationnote7")
    var validationnote7: String? = null

    @Column(name = "basictill_plot3")
    var basictillPlot3: String? = null

    @Column(name = "harrow_plot3")
    var harrowPlot3: String? = null

    @Column(name = "ridging_plot3")
    var ridgingPlot3: String? = null

    @Column(name = "basictillmethodselect1_plot3")
    var basictillmethodselect1Plot3: String? = null

    @Column(name = "basictillmethod1_plot3")
    var basictillmethod1Plot3: String? = null

    @Column(name = "basictillmethodselect2_plot3")
    var basictillmethodselect2Plot3: String? = null

    @Column(name = "basictillmethod2_plot3")
    var basictillmethod2Plot3: String? = null

    @Column(name = "harrowselect_plot3")
    var harrowselectPlot3: String? = null

    @Column(name = "harrow_plot31")
    var harrowPlot31: String? = null

    @Column(name = "ridgingmethodselect_plot3")
    var ridgingmethodselectPlot3: String? = null

    @Column(name = "ridgingmethod_plot3")
    var ridgingmethodPlot3: String? = null

    @Column(name = "plantingnote")
    var plantingnote: String? = null

    @Column(name = "weedingnote")
    var weedingnote: String? = null

    @Column(name = "call_value")
    var callValue: String? = null

    @Column(name = "confirmval")
    var confirmval: String? = null

    @Column(name = "hostbpp3")
    var hostbpp3: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}