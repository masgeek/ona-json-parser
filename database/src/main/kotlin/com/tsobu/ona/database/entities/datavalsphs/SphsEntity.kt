package com.tsobu.ona.database.entities.datavalsphs

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "dataval_sphs")
class SphsEntity : BaseEntity() {
    var submissionDate: LocalDateTime? = null
    var uuid: String? = null
    var startDate: LocalDateTime? = null
    var endDate: LocalDateTime? = null
    var todayDate: LocalDate? = null
    var deviceid: String? = null
    var subscriberid: String? = null
    var email: String? = null
    var username: String? = null
    var simserial: String? = null
    var phonenumber: String? = null
    var countrySelect: String? = null
    var seasonSelect: String? = null
    var banner: String? = null
    var intro: String? = null
    var monitored: String? = null
    var rapidYield: String? = null
    var eventValue: String? = null
    var nameValue: String? = null
    var eaid: String? = null
    var hhid: String? = null
    var fieldId: String? = null
    var country: String? = null
    var currency: String? = null
    var conversion: String? = null
    var locField: String? = null
    var geoPointLatitude: Double? = null
    var geoPointLongitude: Double? = null
    var geoPointAltitude: Double? = null
    var geoPointAccuracy: Double? = null
    var plotdimCon: String? = null

    @Column(name = "plotl1_con")
    var plotl1Con: String? = null

    @Column(name = "plotw1_con")
    var plotw1Con: String? = null

    @Column(name = "plotl2_con")
    var plotl2Con: String? = null

    @Column(name = "plotw2_con")
    var plotw2Con: String? = null

    var plotdimRec: String? = null

    @Column(name = "plotl1_rec")
    var plotl1Rec: String? = null

    @Column(name = "plotw1_rec")
    var plotw1Rec: String? = null

    @Column(name = "plotl2_rec")
    var plotl2Rec: String? = null

    @Column(name = "plotw2_rec")
    var plotw2Rec: String? = null
    var ratenote: String? = null
    var ratedrought: String? = null
    var ratewaterlogging: String? = null
    var ratelodging: String? = null
    var rategrazing: String? = null
    var ratefire: String? = null
    var ratepests: String? = null
    var rateweeds: String? = null
    var ratecmd: String? = null
    var ratecbsd: String? = null
    var rateotherdisease: String? = null
    var ratetheftmissing: String? = null
    var reject: String? = null
    var rejecttrueNote: String? = null
    var rejectfalseNote: String? = null
    var clearing: String? = null
    var vegetation: String? = null
    var nrTillage: String? = null
    var nrHarrow: String? = null
    var ridging: String? = null
    var tillageMethod1: String? = null
    var tillageMethod2: String? = null
    var tillageMethod3: String? = null
    var harrowMethod1: String? = null
    var harrowMethod2: String? = null
    var harrowMethod3: String? = null
    var orginputs1: String? = null
    var fertilizer1: String? = null
    var plantingDate: LocalDate? = null
    var variety: String? = null
    var harvestDateQuestionCon: String? = null
    var harvestDateQuestionRec: String? = null
    var intHarvestDateCon: String? = null
    var intHarvestDateRec: String? = null
    var nrPlantsCon: Int? = null
    var nrPlantsRec: Int? = null
    var gapping: String? = null
    var gappingDate: String? = null
    var gappingType: String? = null
    var orginputs2: String? = null
    var fertilizer2: String? = null
    var orginputs3: String? = null
    var fertilizer3: String? = null
    var orginputs4: String? = null
    var fertilizer4: String? = null
    var orginputs5: String? = null
    var fertilizer5: String? = null
    var nrWeeding: Int? = null
    var dateWeeding1: String? = null
    var weedingMethod1: String? = null
    var dateWeeding2: String? = null
    var weedingMethod2: String? = null
    var dateWeeding3: String? = null
    var weedingMethod3: String? = null
    var dateWeeding4: String? = null
    var weedingMethod4: String? = null
    var dateWeeding5: String? = null
    var weedingMethod5: String? = null
    var dateWeeding6: String? = null
    var weedingMethod6: String? = null
    var dateWeeding7: String? = null
    var weedingMethod7: String? = null
    var dateWeeding8: String? = null
    var weedingMethod8: String? = null
    var dateWeeding9: String? = null
    var weedingMethod9: String? = null
    var dateWeeding10: String? = null
    var weedingMethod10: String? = null
    var effharvestdateCon: String? = null
    var tuberizedmarketablerootsnrCon: String? = null
    var tuberizedmarketablerootsfwCon: String? = null
    var pricerootsCon: String? = null
    var effharvestdateRec: String? = null
    var tuberizedmarketablerootsnrRec: String? = null
    var tuberizedmarketablerootsfwRec: String? = null
    var pricerootsRec: String? = null
    var effharvestdateConTri: String? = null
    var harvestConTriCount: String? = null
    var setOfHarvestConTri: String? = null
    var harvestConTriDetailCount: String? = null
    var setOfHarvestConTriDetail: String? = null
    var effharvestdateRecTri: String? = null

    //TODO Linked to nested values
    var harvestRecTriCount: String? = null
    var setOfHarvestRecTri: String? = null
    var harvestRecTriDetailCount: String? = null
    var setOfHarvestRecTriDetail: String? = null
    var lastplot: String? = null
    var scorenote: String? = null
    var costscore: String? = null
    var labourscore: String? = null
    var yieldscore: String? = null
    var qualityscore: String? = null
    var revenuescore: String? = null
    var overallscore: String? = null
    var comment: String? = null
    var thankYou: String? = null
    var instanceid: String? = null
    var controlKey: String? = null
}