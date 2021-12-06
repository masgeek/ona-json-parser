package com.tsobu.ona.core.dto.json.survey

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "formhub-uuid",
    "today",
    "deviceid",
    "phonenumber",
    "username",
    "toolDescription-generated_note_name_7",
    "toolDescription-banner",
    "toolDescription-intro",
    "farmeradress-generated_note_name_12",
    "farmeradress-EAID",
    "farmeradress-HHID",
    "farmeradress-state",
    "farmeradress-lga",
    "cropspair-generated_note_name_19",
    "cropspair-crops",
    "cropspair-cropsKK",
    "cropspair-croplookup",
    "cropspair-generated_note_name_23",
    "cropspair-riskAtt",
    "meausurearea-generated_note_name_27",
    "meausurearea-fieldAreaApp",
    "meausurearea-linktoApp",
    "meausurearea-measureArea",
    "cassvaHHinfo-generated_note_name_36",
    "cassvaHHinfo-farmareaCassava",
    "cassvaHHinfo-cassavadecision",
    "cassvaHHinfo-genderCassava",
    "cassvaHHinfo-lastyearInvestCassava",
    "cassvaHHinfo-cassavaplmonth",
    "cassvaHHinfo-cassavapurpose",
    "cassavafertinfo-generated_note_name_45",
    "cassavafertinfo-fertC",
    "cassavafertinfo-fertnameC",
    "cassavafertinfo-Curealastyear",
    "cassavafertinfo-ureacass",
    "cassavafertinfo-ureacassP",
    "cassavafertinfo-CNPK15lastyear",
    "cassavafertinfo-NPK15cass",
    "cassavafertinfo-NPK15cassP",
    "cassavafertinfo-CNPK20lastyear",
    "cassavafertinfo-NPK20cass",
    "cassavafertinfo-NPK20cassP",
    "cassavafertinfo-CDAPlastyear",
    "cassavafertinfo-DAPcass",
    "cassavafertinfo-DAPcassP",
    "cassavafertinfo-fertcass",
    "cassavafertinfo-fertcassCP",
    "cassavaYieldPrices-generated_note_name_64",
    "cassavaYieldPrices-unitweightC",
    "cassavaYieldPrices-CassavaHarvested",
    "cassavaYieldPrices-fcykg",
    "cassavaYieldPrices-fcyTon",
    "cassavaYieldPrices-cassYieldkg",
    "cassavaYieldPrices-cassYieldTon",
    "cassavaYieldPrices-cassavapricekg",
    "cassavaYieldPrices-cassavapriceTon",
    "riceHHinfo-generated_note_name_75",
    "riceHHinfo-farmareaRice",
    "riceHHinfo-ricedecision",
    "riceHHinfo-genderrice",
    "riceHHinfo-lastyearInvestRice",
    "riceHHinfo-ricepurpose",
    "ricefertinfo-generated_note_name_83",
    "ricefertinfo-fertR",
    "ricefertinfo-fertnameR",
    "ricefertinfo-Rurealastyear",
    "ricefertinfo-ureaR",
    "ricefertinfo-ureaRP",
    "ricefertinfo-RNPK15lastyear",
    "ricefertinfo-NPK15R",
    "ricefertinfo-NPK15RP",
    "ricefertinfo-RNPK20lastyear",
    "ricefertinfo-NPk20R",
    "ricefertinfo-NPk20RP",
    "ricefertinfo-RDAPlastyear",
    "ricefertinfo-DAPR",
    "ricefertinfo-DAPRP",
    "ricefertinfo-fertRice",
    "ricefertinfo-fertcassCP",
    "riceYieldPrices-generated_note_name_102",
    "riceYieldPrices-unitweightR",
    "riceYieldPrices-riceYieldkg",
    "riceYieldPrices-riceYield75kg",
    "riceYieldPrices-ricepricekg",
    "riceYieldPrices-riceprice75kg",
    "riceYieldPrices-cropesta",
    "riceYieldPrices-ricegrowth",
    "maizeHHinfo-generated_note_name_112",
    "maizeHHinfo-farmareaMaize",
    "maizeHHinfo-maizedecision",
    "maizeHHinfo-gendermaize",
    "maizeHHinfo-lastyearInvestMaize",
    "maizeHHinfo-maizepurpose",
    "maizefertinfo-generated_note_name_120",
    "maizefertinfo-fertM",
    "maizefertinfo-fertnameM",
    "maizefertinfo-Murealastyear",
    "maizefertinfo-ureaM",
    "maizefertinfo-ureaMP",
    "maizefertinfo-MNPK15lastyear",
    "maizefertinfo-NPK15M",
    "maizefertinfo-NPK15MP",
    "maizefertinfo-MNPK20lastyear",
    "maizefertinfo-NPk20M",
    "maizefertinfo-NPk20MP",
    "maizefertinfo-MDAPlastyear",
    "maizefertinfo-DAPM",
    "maizefertinfo-DAPMP",
    "maizefertinfo-fertMaize",
    "maizefertinfo-fertcassCP",
    "maizeYieldPrices-generated_note_name_139",
    "maizeYieldPrices-unitweightM",
    "maizeYieldPrices-maizeYieldkg",
    "maizeYieldPrices-maizeYield100kg",
    "maizeYieldPrices-maizepricekg",
    "maizeYieldPrices-maizeprice100kg",
    "maizeYieldPrices-poultrymanure",
    "maizeYieldPrices-polutrybag",
    "maizeYieldPrices-poultrypricebag",
    "maizeYieldPrices-poultrypricedonkey",
    "maizeYieldPrices-poultrypricecart",
    "maizeYieldPrices-poultryamountbag",
    "maizeYieldPrices-poultryamountdonkey",
    "maizeYieldPrices-poultryamountcart",
    "maizeYieldPrices-FYM",
    "maizeYieldPrices-FYMbag",
    "maizeYieldPrices-FYMpricebag",
    "maizeYieldPrices-FYMpricedonkey",
    "maizeYieldPrices-FYMpricecart",
    "maizeYieldPrices-FYMamountbag",
    "maizeYieldPrices-FYMamountdonkey",
    "maizeYieldPrices-FYMamountcart",
    "generated_note_name_162",
    "end",
    "meta-instanceID",
    "KEY"
)
class FipSurvey2020Dto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("formhub-uuid")
    var formhubUuid: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("toolDescription-generated_note_name_7")
    var toolDescriptionGeneratedNoteName7: String? = null

    @JsonProperty("toolDescription-banner")
    var toolDescriptionBanner: String? = null

    @JsonProperty("toolDescription-intro")
    var toolDescriptionIntro: String? = null

    @JsonProperty("farmeradress-generated_note_name_12")
    var farmeradressGeneratedNoteName12: String? = null

    @JsonProperty("farmeradress-EAID")
    var farmeradressEAID: String? = null

    @JsonProperty("farmeradress-HHID")
    var farmeradressHHID: String? = null

    @JsonProperty("farmeradress-state")
    var farmeradressState: String? = null

    @JsonProperty("farmeradress-lga")
    var farmeradressLga: String? = null

    @JsonProperty("cropspair-generated_note_name_19")
    var cropspairGeneratedNoteName19: String? = null

    @JsonProperty("cropspair-crops")
    var cropspairCrops: String? = null

    @JsonProperty("cropspair-cropsKK")
    var cropspairCropsKK: String? = null

    @JsonProperty("cropspair-croplookup")
    var cropspairCroplookup: String? = null

    @JsonProperty("cropspair-generated_note_name_23")
    var cropspairGeneratedNoteName23: String? = null

    @JsonProperty("cropspair-riskAtt")
    var cropspairRiskAtt: String? = null

    @JsonProperty("meausurearea-generated_note_name_27")
    var meausureareaGeneratedNoteName27: String? = null

    @JsonProperty("meausurearea-fieldAreaApp")
    var meausureareaFieldAreaApp: String? = null

    @JsonProperty("meausurearea-linktoApp")
    var meausureareaLinktoApp: String? = null

    @JsonProperty("meausurearea-measureArea")
    var meausureareaMeasureArea: String? = null

    @JsonProperty("cassvaHHinfo-generated_note_name_36")
    var cassvaHHinfoGeneratedNoteName36: String? = null

    @JsonProperty("cassvaHHinfo-farmareaCassava")
    var cassvaHHinfoFarmareaCassava: String? = null

    @JsonProperty("cassvaHHinfo-cassavadecision")
    var cassvaHHinfoCassavadecision: String? = null

    @JsonProperty("cassvaHHinfo-genderCassava")
    var cassvaHHinfoGenderCassava: String? = null

    @JsonProperty("cassvaHHinfo-lastyearInvestCassava")
    var cassvaHHinfoLastyearInvestCassava: String? = null

    @JsonProperty("cassvaHHinfo-cassavaplmonth")
    var cassvaHHinfoCassavaplmonth: String? = null

    @JsonProperty("cassvaHHinfo-cassavapurpose")
    var cassvaHHinfoCassavapurpose: String? = null

    @JsonProperty("cassavafertinfo-generated_note_name_45")
    var cassavafertinfoGeneratedNoteName45: String? = null

    @JsonProperty("cassavafertinfo-fertC")
    var cassavafertinfoFertC: String? = null

    @JsonProperty("cassavafertinfo-fertnameC")
    var cassavafertinfoFertnameC: String? = null

    @JsonProperty("cassavafertinfo-Curealastyear")
    var cassavafertinfoCurealastyear: String? = null

    @JsonProperty("cassavafertinfo-ureacass")
    var cassavafertinfoUreacass: String? = null

    @JsonProperty("cassavafertinfo-ureacassP")
    var cassavafertinfoUreacassP: String? = null

    @JsonProperty("cassavafertinfo-CNPK15lastyear")
    var cassavafertinfoCNPK15lastyear: String? = null

    @JsonProperty("cassavafertinfo-NPK15cass")
    var cassavafertinfoNPK15cass: String? = null

    @JsonProperty("cassavafertinfo-NPK15cassP")
    var cassavafertinfoNPK15cassP: String? = null

    @JsonProperty("cassavafertinfo-CNPK20lastyear")
    var cassavafertinfoCNPK20lastyear: String? = null

    @JsonProperty("cassavafertinfo-NPK20cass")
    var cassavafertinfoNPK20cass: String? = null

    @JsonProperty("cassavafertinfo-NPK20cassP")
    var cassavafertinfoNPK20cassP: String? = null

    @JsonProperty("cassavafertinfo-CDAPlastyear")
    var cassavafertinfoCDAPlastyear: String? = null

    @JsonProperty("cassavafertinfo-DAPcass")
    var cassavafertinfoDAPcass: String? = null

    @JsonProperty("cassavafertinfo-DAPcassP")
    var cassavafertinfoDAPcassP: String? = null

    @JsonProperty("cassavafertinfo-fertcass")
    var cassavafertinfoFertcass: String? = null

    @JsonProperty("cassavafertinfo-fertcassCP")
    var cassavafertinfoFertcassCP: String? = null

    @JsonProperty("cassavaYieldPrices-generated_note_name_64")
    var cassavaYieldPricesGeneratedNoteName64: String? = null

    @JsonProperty("cassavaYieldPrices-unitweightC")
    var cassavaYieldPricesUnitweightC: String? = null

    @JsonProperty("cassavaYieldPrices-CassavaHarvested")
    var cassavaYieldPricesCassavaHarvested: String? = null

    @JsonProperty("cassavaYieldPrices-fcykg")
    var cassavaYieldPricesFcykg: String? = null

    @JsonProperty("cassavaYieldPrices-fcyTon")
    var cassavaYieldPricesFcyTon: String? = null

    @JsonProperty("cassavaYieldPrices-cassYieldkg")
    var cassavaYieldPricesCassYieldkg: String? = null

    @JsonProperty("cassavaYieldPrices-cassYieldTon")
    var cassavaYieldPricesCassYieldTon: String? = null

    @JsonProperty("cassavaYieldPrices-cassavapricekg")
    var cassavaYieldPricesCassavapricekg: String? = null

    @JsonProperty("cassavaYieldPrices-cassavapriceTon")
    var cassavaYieldPricesCassavapriceTon: String? = null

    @JsonProperty("riceHHinfo-generated_note_name_75")
    var riceHHinfoGeneratedNoteName75: String? = null

    @JsonProperty("riceHHinfo-farmareaRice")
    var riceHHinfoFarmareaRice: String? = null

    @JsonProperty("riceHHinfo-ricedecision")
    var riceHHinfoRicedecision: String? = null

    @JsonProperty("riceHHinfo-genderrice")
    var riceHHinfoGenderrice: String? = null

    @JsonProperty("riceHHinfo-lastyearInvestRice")
    var riceHHinfoLastyearInvestRice: String? = null

    @JsonProperty("riceHHinfo-ricepurpose")
    var riceHHinfoRicepurpose: String? = null

    @JsonProperty("ricefertinfo-generated_note_name_83")
    var ricefertinfoGeneratedNoteName83: String? = null

    @JsonProperty("ricefertinfo-fertR")
    var ricefertinfoFertR: String? = null

    @JsonProperty("ricefertinfo-fertnameR")
    var ricefertinfoFertnameR: String? = null

    @JsonProperty("ricefertinfo-Rurealastyear")
    var ricefertinfoRurealastyear: String? = null

    @JsonProperty("ricefertinfo-ureaR")
    var ricefertinfoUreaR: String? = null

    @JsonProperty("ricefertinfo-ureaRP")
    var ricefertinfoUreaRP: String? = null

    @JsonProperty("ricefertinfo-RNPK15lastyear")
    var ricefertinfoRNPK15lastyear: String? = null

    @JsonProperty("ricefertinfo-NPK15R")
    var ricefertinfoNPK15R: String? = null

    @JsonProperty("ricefertinfo-NPK15RP")
    var ricefertinfoNPK15RP: String? = null

    @JsonProperty("ricefertinfo-RNPK20lastyear")
    var ricefertinfoRNPK20lastyear: String? = null

    @JsonProperty("ricefertinfo-NPk20R")
    var ricefertinfoNPk20R: String? = null

    @JsonProperty("ricefertinfo-NPk20RP")
    var ricefertinfoNPk20RP: String? = null

    @JsonProperty("ricefertinfo-RDAPlastyear")
    var ricefertinfoRDAPlastyear: String? = null

    @JsonProperty("ricefertinfo-DAPR")
    var ricefertinfoDAPR: String? = null

    @JsonProperty("ricefertinfo-DAPRP")
    var ricefertinfoDAPRP: String? = null

    @JsonProperty("ricefertinfo-fertRice")
    var ricefertinfoFertRice: String? = null

    @JsonProperty("ricefertinfo-fertcassCP")
    var ricefertinfoFertcassCP: String? = null

    @JsonProperty("riceYieldPrices-generated_note_name_102")
    var riceYieldPricesGeneratedNoteName102: String? = null

    @JsonProperty("riceYieldPrices-unitweightR")
    var riceYieldPricesUnitweightR: String? = null

    @JsonProperty("riceYieldPrices-riceYieldkg")
    var riceYieldPricesRiceYieldkg: String? = null

    @JsonProperty("riceYieldPrices-riceYield75kg")
    var riceYieldPricesRiceYield75kg: String? = null

    @JsonProperty("riceYieldPrices-ricepricekg")
    var riceYieldPricesRicepricekg: String? = null

    @JsonProperty("riceYieldPrices-riceprice75kg")
    var riceYieldPricesRiceprice75kg: String? = null

    @JsonProperty("riceYieldPrices-cropesta")
    var riceYieldPricesCropesta: String? = null

    @JsonProperty("riceYieldPrices-ricegrowth")
    var riceYieldPricesRicegrowth: String? = null

    @JsonProperty("maizeHHinfo-generated_note_name_112")
    var maizeHHinfoGeneratedNoteName112: String? = null

    @JsonProperty("maizeHHinfo-farmareaMaize")
    var maizeHHinfoFarmareaMaize: String? = null

    @JsonProperty("maizeHHinfo-maizedecision")
    var maizeHHinfoMaizedecision: String? = null

    @JsonProperty("maizeHHinfo-gendermaize")
    var maizeHHinfoGendermaize: String? = null

    @JsonProperty("maizeHHinfo-lastyearInvestMaize")
    var maizeHHinfoLastyearInvestMaize: String? = null

    @JsonProperty("maizeHHinfo-maizepurpose")
    var maizeHHinfoMaizepurpose: String? = null

    @JsonProperty("maizefertinfo-generated_note_name_120")
    var maizefertinfoGeneratedNoteName120: String? = null

    @JsonProperty("maizefertinfo-fertM")
    var maizefertinfoFertM: String? = null

    @JsonProperty("maizefertinfo-fertnameM")
    var maizefertinfoFertnameM: String? = null

    @JsonProperty("maizefertinfo-Murealastyear")
    var maizefertinfoMurealastyear: String? = null

    @JsonProperty("maizefertinfo-ureaM")
    var maizefertinfoUreaM: String? = null

    @JsonProperty("maizefertinfo-ureaMP")
    var maizefertinfoUreaMP: String? = null

    @JsonProperty("maizefertinfo-MNPK15lastyear")
    var maizefertinfoMNPK15lastyear: String? = null

    @JsonProperty("maizefertinfo-NPK15M")
    var maizefertinfoNPK15M: String? = null

    @JsonProperty("maizefertinfo-NPK15MP")
    var maizefertinfoNPK15MP: String? = null

    @JsonProperty("maizefertinfo-MNPK20lastyear")
    var maizefertinfoMNPK20lastyear: String? = null

    @JsonProperty("maizefertinfo-NPk20M")
    var maizefertinfoNPk20M: String? = null

    @JsonProperty("maizefertinfo-NPk20MP")
    var maizefertinfoNPk20MP: String? = null

    @JsonProperty("maizefertinfo-MDAPlastyear")
    var maizefertinfoMDAPlastyear: String? = null

    @JsonProperty("maizefertinfo-DAPM")
    var maizefertinfoDAPM: String? = null

    @JsonProperty("maizefertinfo-DAPMP")
    var maizefertinfoDAPMP: String? = null

    @JsonProperty("maizefertinfo-fertMaize")
    var maizefertinfoFertMaize: String? = null

    @JsonProperty("maizefertinfo-fertcassCP")
    var maizefertinfoFertcassCP: String? = null

    @JsonProperty("maizeYieldPrices-generated_note_name_139")
    var maizeYieldPricesGeneratedNoteName139: String? = null

    @JsonProperty("maizeYieldPrices-unitweightM")
    var maizeYieldPricesUnitweightM: String? = null

    @JsonProperty("maizeYieldPrices-maizeYieldkg")
    var maizeYieldPricesMaizeYieldkg: String? = null

    @JsonProperty("maizeYieldPrices-maizeYield100kg")
    var maizeYieldPricesMaizeYield100kg: String? = null

    @JsonProperty("maizeYieldPrices-maizepricekg")
    var maizeYieldPricesMaizepricekg: String? = null

    @JsonProperty("maizeYieldPrices-maizeprice100kg")
    var maizeYieldPricesMaizeprice100kg: String? = null

    @JsonProperty("maizeYieldPrices-poultrymanure")
    var maizeYieldPricesPoultrymanure: String? = null

    @JsonProperty("maizeYieldPrices-polutrybag")
    var maizeYieldPricesPolutrybag: String? = null

    @JsonProperty("maizeYieldPrices-poultrypricebag")
    var maizeYieldPricesPoultrypricebag: String? = null

    @JsonProperty("maizeYieldPrices-poultrypricedonkey")
    var maizeYieldPricesPoultrypricedonkey: String? = null

    @JsonProperty("maizeYieldPrices-poultrypricecart")
    var maizeYieldPricesPoultrypricecart: String? = null

    @JsonProperty("maizeYieldPrices-poultryamountbag")
    var maizeYieldPricesPoultryamountbag: String? = null

    @JsonProperty("maizeYieldPrices-poultryamountdonkey")
    var maizeYieldPricesPoultryamountdonkey: String? = null

    @JsonProperty("maizeYieldPrices-poultryamountcart")
    var maizeYieldPricesPoultryamountcart: String? = null

    @JsonProperty("maizeYieldPrices-FYM")
    var maizeYieldPricesFYM: String? = null

    @JsonProperty("maizeYieldPrices-FYMbag")
    var maizeYieldPricesFYMbag: String? = null

    @JsonProperty("maizeYieldPrices-FYMpricebag")
    var maizeYieldPricesFYMpricebag: String? = null

    @JsonProperty("maizeYieldPrices-FYMpricedonkey")
    var maizeYieldPricesFYMpricedonkey: String? = null

    @JsonProperty("maizeYieldPrices-FYMpricecart")
    var maizeYieldPricesFYMpricecart: String? = null

    @JsonProperty("maizeYieldPrices-FYMamountbag")
    var maizeYieldPricesFYMamountbag: String? = null

    @JsonProperty("maizeYieldPrices-FYMamountdonkey")
    var maizeYieldPricesFYMamountdonkey: String? = null

    @JsonProperty("maizeYieldPrices-FYMamountcart")
    var maizeYieldPricesFYMamountcart: String? = null

    @JsonProperty("generated_note_name_162")
    var generatedNoteName162: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("meta-instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}