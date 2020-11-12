package com.tsobu.ona.core.dto.json.sphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "gender", "nrPar", "EAID", "country", "currency", "conversion", "loc", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "village", "nrParRoots", "marketType", "marketName", "nrParMarket", "nrParMarketMain", "unit", "unitNameSelect", "unitNameOther", "unitWeightOther", "unitName", "unitLocalWeight", "unitWeight", "priceNote", "priceJan", "priceFeb", "priceMar", "priceApr", "priceMay", "priceJun", "priceJul", "priceAug", "priceSep", "priceOct", "priceNov", "priceDec", "nrParMarketNote", "nrParMarketJan", "nrParMarketFeb", "nrParMarketMar", "nrParMarketApr", "nrParMarketMay", "nrParMarketJun", "nrParMarketJul", "nrParMarketAug", "nrParMarketSep", "nrParMarketOct", "nrParMarketNov", "nrParMarketDec", "nrParStarch", "starchFactoryName", "nrParStarchFactory", "nrParStarchFactoryMain", "starchFactoryNameOther", "nrParStarchNote", "nrParStarchJan", "nrParStarchFeb", "nrParStarchMar", "nrParStarchApr", "nrParStarchMay", "nrParStarchJun", "nrParStarchJul", "nrParStarchAug", "nrParStarchSep", "nrParStarchOct", "nrParStarchNov", "nrParStarchDec", "commentPriceYear", "commentPriceMarket", "commentPriceStarch", "commentPriceGeneral", "thankyou", "end", "instanceID", "KEY")
class PraSphsDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("gender")
    var gender: String? = null

    @JsonProperty("nrPar")
    var nrPar: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("loc")
    var loc: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("village")
    var village: String? = null

    @JsonProperty("nrParRoots")
    var nrParRoots: String? = null

    @JsonProperty("marketType")
    var marketType: String? = null

    @JsonProperty("marketName")
    var marketName: String? = null

    @JsonProperty("nrParMarket")
    var nrParMarket: String? = null

    @JsonProperty("nrParMarketMain")
    var nrParMarketMain: String? = null

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("unitNameOther")
    var unitNameOther: String? = null

    @JsonProperty("unitWeightOther")
    var unitWeightOther: String? = null

    @JsonProperty("unitName")
    var unitName: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null

    @JsonProperty("unitWeight")
    var unitWeight: String? = null

    @JsonProperty("priceNote")
    var priceNote: String? = null

    @JsonProperty("priceJan")
    var priceJan: String? = null

    @JsonProperty("priceFeb")
    var priceFeb: String? = null

    @JsonProperty("priceMar")
    var priceMar: String? = null

    @JsonProperty("priceApr")
    var priceApr: String? = null

    @JsonProperty("priceMay")
    var priceMay: String? = null

    @JsonProperty("priceJun")
    var priceJun: String? = null

    @JsonProperty("priceJul")
    var priceJul: String? = null

    @JsonProperty("priceAug")
    var priceAug: String? = null

    @JsonProperty("priceSep")
    var priceSep: String? = null

    @JsonProperty("priceOct")
    var priceOct: String? = null

    @JsonProperty("priceNov")
    var priceNov: String? = null

    @JsonProperty("priceDec")
    var priceDec: String? = null

    @JsonProperty("nrParMarketNote")
    var nrParMarketNote: String? = null

    @JsonProperty("nrParMarketJan")
    var nrParMarketJan: String? = null

    @JsonProperty("nrParMarketFeb")
    var nrParMarketFeb: String? = null

    @JsonProperty("nrParMarketMar")
    var nrParMarketMar: String? = null

    @JsonProperty("nrParMarketApr")
    var nrParMarketApr: String? = null

    @JsonProperty("nrParMarketMay")
    var nrParMarketMay: String? = null

    @JsonProperty("nrParMarketJun")
    var nrParMarketJun: String? = null

    @JsonProperty("nrParMarketJul")
    var nrParMarketJul: String? = null

    @JsonProperty("nrParMarketAug")
    var nrParMarketAug: String? = null

    @JsonProperty("nrParMarketSep")
    var nrParMarketSep: String? = null

    @JsonProperty("nrParMarketOct")
    var nrParMarketOct: String? = null

    @JsonProperty("nrParMarketNov")
    var nrParMarketNov: String? = null

    @JsonProperty("nrParMarketDec")
    var nrParMarketDec: String? = null

    @JsonProperty("nrParStarch")
    var nrParStarch: String? = null

    @JsonProperty("starchFactoryName")
    var starchFactoryName: String? = null

    @JsonProperty("nrParStarchFactory")
    var nrParStarchFactory: String? = null

    @JsonProperty("nrParStarchFactoryMain")
    var nrParStarchFactoryMain: String? = null

    @JsonProperty("starchFactoryNameOther")
    var starchFactoryNameOther: String? = null

    @JsonProperty("nrParStarchNote")
    var nrParStarchNote: String? = null

    @JsonProperty("nrParStarchJan")
    var nrParStarchJan: String? = null

    @JsonProperty("nrParStarchFeb")
    var nrParStarchFeb: String? = null

    @JsonProperty("nrParStarchMar")
    var nrParStarchMar: String? = null

    @JsonProperty("nrParStarchApr")
    var nrParStarchApr: String? = null

    @JsonProperty("nrParStarchMay")
    var nrParStarchMay: String? = null

    @JsonProperty("nrParStarchJun")
    var nrParStarchJun: String? = null

    @JsonProperty("nrParStarchJul")
    var nrParStarchJul: String? = null

    @JsonProperty("nrParStarchAug")
    var nrParStarchAug: String? = null

    @JsonProperty("nrParStarchSep")
    var nrParStarchSep: String? = null

    @JsonProperty("nrParStarchOct")
    var nrParStarchOct: String? = null

    @JsonProperty("nrParStarchNov")
    var nrParStarchNov: String? = null

    @JsonProperty("nrParStarchDec")
    var nrParStarchDec: String? = null

    @JsonProperty("commentPriceYear")
    var commentPriceYear: String? = null

    @JsonProperty("commentPriceMarket")
    var commentPriceMarket: String? = null

    @JsonProperty("commentPriceStarch")
    var commentPriceStarch: String? = null

    @JsonProperty("commentPriceGeneral")
    var commentPriceGeneral: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}