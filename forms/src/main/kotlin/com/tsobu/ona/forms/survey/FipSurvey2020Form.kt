package com.tsobu.ona.forms.survey

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class FipSurvey2020Form {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("cropspair/crops")
    var cropspairCrops: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("farmeradress/lga")
    var farmeradressLga: String? = null

    @JsonProperty("cropspair/riskAtt")
    var cropspairRiskAtt: String? = null

    @JsonProperty("farmeradress/EAID")
    var farmeradressEAID: String? = null

    @JsonProperty("farmeradress/HHID")
    var farmeradressHHID: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("farmeradress/state")
    var farmeradressState: String? = null

    @JsonProperty("ricefertinfo/fertR")
    var ricefertinfoFertR: String? = null

    @JsonProperty("ricefertinfo/ureaR")
    var ricefertinfoUreaR: Double? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("maizefertinfo/fertM")
    var maizefertinfoFertM: String? = null

    @JsonProperty("ricefertinfo/NPK15R")
    var ricefertinfoNPK15R: Double? = null

    @JsonProperty("ricefertinfo/ureaRP")
    var ricefertinfoUreaRP: Double? = null

    @JsonProperty("cropspair/croplookup")
    var cropspairCroplookup: String? = null

    @JsonProperty("maizeYieldPrices/FYM")
    var maizeYieldPricesFYM: String? = null

    @JsonProperty("maizefertinfo/NPK15M")
    var maizefertinfoNPK15M: Double? = null

    @JsonProperty("maizefertinfo/NPk20M")
    var maizefertinfoNPk20M: Double? = null

    @JsonProperty("ricefertinfo/NPK15RP")
    var ricefertinfoNPK15RP: Double? = null

    @JsonProperty("cassavafertinfo/fertC")
    var cassavafertinfoFertC: String? = null

    @JsonProperty("maizefertinfo/NPK15MP")
    var maizefertinfoNPK15MP: Double? = null

    @JsonProperty("maizefertinfo/NPk20MP")
    var maizefertinfoNPk20MP: Double? = null

    @JsonProperty("riceHHinfo/ricepurpose")
    var riceHHinfoRicepurpose: String? = null

    @JsonProperty("ricefertinfo/fertnameR")
    var ricefertinfoFertnameR: String? = null

    @JsonProperty("maizefertinfo/fertnameM")
    var maizefertinfoFertnameM: String? = null

    @JsonProperty("riceHHinfo/farmareaRice")
    var riceHHinfoFarmareaRice: Double? = null

    @JsonProperty("riceHHinfo/ricedecision")
    var riceHHinfoRicedecision: String? = null

    @JsonProperty("cassavafertinfo/ureacass")
    var cassavafertinfoUreacass: Double? = null

    @JsonProperty("maizeHHinfo/maizepurpose")
    var maizeHHinfoMaizepurpose: String? = null

    @JsonProperty("riceYieldPrices/cropesta")
    var riceYieldPricesCropesta: String? = null

    @JsonProperty("cassavafertinfo/NPK20cass")
    var cassavafertinfoNPK20cass: Double? = null

    @JsonProperty("cassavafertinfo/fertnameC")
    var cassavafertinfoFertnameC: String? = null

    @JsonProperty("cassavafertinfo/ureacassP")
    var cassavafertinfoUreacassP: Double? = null

    @JsonProperty("maizeHHinfo/farmareaMaize")
    var maizeHHinfoFarmareaMaize: Double? = null

    @JsonProperty("maizeHHinfo/maizedecision")
    var maizeHHinfoMaizedecision: String? = null

    @JsonProperty("meausurearea/fieldAreaApp")
    var meausureareaFieldAreaApp: String? = null

    @JsonProperty("ricefertinfo/RDAPlastyear")
    var ricefertinfoRDAPlastyear: String? = null

    @JsonProperty("cassavafertinfo/NPK20cassP")
    var cassavafertinfoNPK20cassP: Double? = null

    @JsonProperty("maizefertinfo/MDAPlastyear")
    var maizefertinfoMDAPlastyear: String? = null

    @JsonProperty("riceYieldPrices/ricegrowth")
    var riceYieldPricesRicegrowth: String? = null

    @JsonProperty("ricefertinfo/Rurealastyear")
    var ricefertinfoRurealastyear: String? = null

    @JsonProperty("cassvaHHinfo/cassavaplmonth")
    var cassvaHHinfoCassavaplmonth: String? = null

    @JsonProperty("cassvaHHinfo/cassavapurpose")
    var cassvaHHinfoCassavapurpose: String? = null

    @JsonProperty("maizefertinfo/Murealastyear")
    var maizefertinfoMurealastyear: String? = null

    @JsonProperty("riceYieldPrices/riceYieldkg")
    var riceYieldPricesRiceYieldkg: Double? = null

    @JsonProperty("riceYieldPrices/ricepricekg")
    var riceYieldPricesRicepricekg: Double? = null

    @JsonProperty("riceYieldPrices/unitweightR")
    var riceYieldPricesUnitweightR: String? = null

    @JsonProperty("ricefertinfo/RNPK15lastyear")
    var ricefertinfoRNPK15lastyear: String? = null

    @JsonProperty("ricefertinfo/RNPK20lastyear")
    var ricefertinfoRNPK20lastyear: String? = null

    @JsonProperty("cassavafertinfo/CDAPlastyear")
    var cassavafertinfoCDAPlastyear: String? = null

    @JsonProperty("cassvaHHinfo/cassavadecision")
    var cassvaHHinfoCassavadecision: String? = null

    @JsonProperty("cassvaHHinfo/farmareaCassava")
    var cassvaHHinfoFarmareaCassava: Double? = null

    @JsonProperty("maizeYieldPrices/unitweightM")
    var maizeYieldPricesUnitweightM: String? = null

    @JsonProperty("maizefertinfo/MNPK15lastyear")
    var maizefertinfoMNPK15lastyear: String? = null

    @JsonProperty("maizefertinfo/MNPK20lastyear")
    var maizefertinfoMNPK20lastyear: String? = null

    @JsonProperty("cassavafertinfo/Curealastyear")
    var cassavafertinfoCurealastyear: String? = null

    @JsonProperty("maizeYieldPrices/maizeYieldkg")
    var maizeYieldPricesMaizeYieldkg: Double? = null

    @JsonProperty("maizeYieldPrices/maizepricekg")
    var maizeYieldPricesMaizepricekg: Double? = null

    @JsonProperty("riceHHinfo/lastyearInvestRice")
    var riceHHinfoLastyearInvestRice: Double? = null

    @JsonProperty("cassavaYieldPrices/cassYieldkg")
    var cassavaYieldPricesCassYieldkg: Double? = null

    @JsonProperty("cassavaYieldPrices/unitweightC")
    var cassavaYieldPricesUnitweightC: String? = null

    @JsonProperty("cassavafertinfo/CNPK15lastyear")
    var cassavafertinfoCNPK15lastyear: String? = null

    @JsonProperty("cassavafertinfo/CNPK20lastyear")
    var cassavafertinfoCNPK20lastyear: String? = null

    @JsonProperty("maizeYieldPrices/poultrymanure")
    var maizeYieldPricesPoultrymanure: String? = null

    @JsonProperty("maizeHHinfo/lastyearInvestMaize")
    var maizeHHinfoLastyearInvestMaize: Double? = null

    @JsonProperty("cassavaYieldPrices/cassavapricekg")
    var cassavaYieldPricesCassavapricekg: Double? = null

    @JsonProperty("cassvaHHinfo/lastyearInvestCassava")
    var cassvaHHinfoLastyearInvestCassava: Double? = null

    @JsonProperty("cassavaYieldPrices/CassavaHarvested")
    var cassavaYieldPricesCassavaHarvested: String? = null

    @JsonProperty("maizefertinfo/ureaM")
    var maizefertinfoUreaM: Double? = null

    @JsonProperty("maizefertinfo/ureaMP")
    var maizefertinfoUreaMP: Double? = null

    @JsonProperty("riceHHinfo/genderrice")
    var riceHHinfoGenderrice: String? = null

    @JsonProperty("cassavafertinfo/NPK15cass")
    var cassavafertinfoNPK15cass: Double? = null

    @JsonProperty("cassavafertinfo/NPK15cassP")
    var cassavafertinfoNPK15cassP: Double? = null

    @JsonProperty("cassvaHHinfo/genderCassava")
    var cassvaHHinfoGenderCassava: String? = null

    @JsonProperty("ricefertinfo/NPk20R")
    var ricefertinfoNPk20R: Double? = null

    @JsonProperty("ricefertinfo/NPk20RP")
    var ricefertinfoNPk20RP: Double? = null

    @JsonProperty("maizeYieldPrices/FYMbag")
    var maizeYieldPricesFYMbag: String? = null

    @JsonProperty("maizeYieldPrices/polutrybag")
    var maizeYieldPricesPolutrybag: String? = null

    @JsonProperty("maizeYieldPrices/poultrypricebag")
    var maizeYieldPricesPoultrypricebag: Double? = null

    @JsonProperty("maizeYieldPrices/poultryamountbag")
    var maizeYieldPricesPoultryamountbag: Double? = null

    @JsonProperty("maizeHHinfo/gendermaize")
    var maizeHHinfoGendermaize: String? = null

    @JsonProperty("cropspair/cropsKK")
    var cropspairCropsKK: String? = null

    @JsonProperty("riceYieldPrices/riceYield75kg")
    var riceYieldPricesRiceYield75kg: Double? = null

    @JsonProperty("riceYieldPrices/riceprice75kg")
    var riceYieldPricesRiceprice75kg: Double? = null

    @JsonProperty("maizeYieldPrices/FYMpricecart")
    var maizeYieldPricesFYMpricecart: Double? = null

    @JsonProperty("maizeYieldPrices/FYMamountcart")
    var maizeYieldPricesFYMamountcart: Double? = null

    @JsonProperty("maizeYieldPrices/FYMpricedonkey")
    var maizeYieldPricesFYMpricedonkey: Double? = null

    @JsonProperty("maizeYieldPrices/FYMamountdonkey")
    var maizeYieldPricesFYMamountdonkey: Double? = null

    @JsonProperty("maizeYieldPrices/poultrypricedonkey")
    var maizeYieldPricesPoultrypricedonkey: Double? = null

    @JsonProperty("maizeYieldPrices/poultryamountdonkey")
    var maizeYieldPricesPoultryamountdonkey: Double? = null

    @JsonProperty("cassavaYieldPrices/cassYieldTon")
    var cassavaYieldPricesCassYieldTon: Double? = null

    @JsonProperty("cassavaYieldPrices/cassavapriceTon")
    var cassavaYieldPricesCassavapriceTon: Double? = null

    @JsonProperty("maizefertinfo/fertMaize")
    var maizefertinfoFertMaize: Double? = null

    @JsonProperty("maizefertinfo/fertcassCP")
    var maizefertinfoFertcassCP: Double? = null

    @JsonProperty("ricefertinfo/fertRice")
    var ricefertinfoFertRice: Double? = null

    @JsonProperty("ricefertinfo/fertcassCP")
    var ricefertinfoFertcassCP: Double? = null

    @JsonProperty("cassavafertinfo/fertcass")
    var cassavafertinfoFertcass: Double? = null

    @JsonProperty("cassavafertinfo/fertcassCP")
    var cassavafertinfoFertcassCP: Double? = null

    @JsonProperty("maizefertinfo/DAPM")
    var maizefertinfoDAPM: Double? = null

    @JsonProperty("maizefertinfo/DAPMP")
    var maizefertinfoDAPMP: Double? = null

    @JsonProperty("cassavaYieldPrices/fcykg")
    var cassavaYieldPricesFcykg: Double? = null

    @JsonProperty("ricefertinfo/DAPR")
    var ricefertinfoDAPR: Double? = null

    @JsonProperty("ricefertinfo/DAPRP")
    var ricefertinfoDAPRP: Double? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null
}