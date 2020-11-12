package com.tsobu.ona.forms.sphs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "loc", "lon", "EAID", "unit", "_tags", "_uuid", "start", "today", "_notes", "_edited", "_status", "country", "village", "_version", "currency", "deviceid", "geopoint", "unitName", "username", "_duration", "_xform_id", "simserial", "conversion", "nrParRoots", "unitWeight", "nrParStarch", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "subscriberid", "_submitted_by", "purpose/nrPar", "purpose/gender", "unitNameSelect", "meta/instanceID", "unitLocalWeight", "_submission_time", "_xform_id_string", "commentPriceYear", "market/marketName", "market/marketType", "_bamboo_dataset_id", "commentPriceMarket", "market/nrParMarket", "_media_all_received", "commentPriceGeneral", "priceDetails/priceApr", "priceDetails/priceAug", "priceDetails/priceDec", "priceDetails/priceFeb", "priceDetails/priceJan", "priceDetails/priceJul", "priceDetails/priceJun", "priceDetails/priceMar", "priceDetails/priceMay", "priceDetails/priceNov", "priceDetails/priceOct", "priceDetails/priceSep", "market/nrParMarketMain", "nrParMarketDetails/nrParMarketApr", "nrParMarketDetails/nrParMarketAug", "nrParMarketDetails/nrParMarketDec", "nrParMarketDetails/nrParMarketFeb", "nrParMarketDetails/nrParMarketJan", "nrParMarketDetails/nrParMarketJul", "nrParMarketDetails/nrParMarketJun", "nrParMarketDetails/nrParMarketMar", "nrParMarketDetails/nrParMarketMay", "nrParMarketDetails/nrParMarketNov", "nrParMarketDetails/nrParMarketOct", "nrParMarketDetails/nrParMarketSep", "email", "commentPriceStarch", "starchFactory/starchFactoryName", "starchFactory/nrParStarchFactory", "nrParStarchDetails/nrParStarchApr", "nrParStarchDetails/nrParStarchAug", "nrParStarchDetails/nrParStarchDec", "nrParStarchDetails/nrParStarchFeb", "nrParStarchDetails/nrParStarchJan", "nrParStarchDetails/nrParStarchJul", "nrParStarchDetails/nrParStarchJun", "nrParStarchDetails/nrParStarchMar", "nrParStarchDetails/nrParStarchMay", "nrParStarchDetails/nrParStarchNov", "nrParStarchDetails/nrParStarchOct", "nrParStarchDetails/nrParStarchSep", "starchFactory/nrParStarchFactoryMain", "starchFactoryNameOther")
class PraSphsForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("loc")
    var loc: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("village")
    var village: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("unitName")
    var unitName: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("nrParRoots")
    var nrParRoots: String? = null

    @JsonProperty("unitWeight")
    var unitWeight: String? = null

    @JsonProperty("nrParStarch")
    var nrParStarch: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/nrPar")
    var nrPar: String? = null

    @JsonProperty("purpose/gender")
    var gender: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("commentPriceYear")
    var commentPriceYear: String? = null

    @JsonProperty("market/marketName")
    var marketName: String? = null

    @JsonProperty("market/marketType")
    var marketType: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("commentPriceMarket")
    var commentPriceMarket: String? = null

    @JsonProperty("market/nrParMarket")
    var nrParMarket: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("commentPriceGeneral")
    var commentPriceGeneral: String? = null

    @JsonProperty("priceDetails/priceApr")
    var priceApr: String? = null

    @JsonProperty("priceDetails/priceAug")
    var priceAug: String? = null

    @JsonProperty("priceDetails/priceDec")
    var priceDec: String? = null

    @JsonProperty("priceDetails/priceFeb")
    var priceFeb: String? = null

    @JsonProperty("priceDetails/priceJan")
    var priceJan: String? = null

    @JsonProperty("priceDetails/priceJul")
    var priceJul: String? = null

    @JsonProperty("priceDetails/priceJun")
    var priceJun: String? = null

    @JsonProperty("priceDetails/priceMar")
    var priceMar: String? = null

    @JsonProperty("priceDetails/priceMay")
    var priceMay: String? = null

    @JsonProperty("priceDetails/priceNov")
    var priceNov: String? = null

    @JsonProperty("priceDetails/priceOct")
    var priceOct: String? = null

    @JsonProperty("priceDetails/priceSep")
    var priceSep: String? = null

    @JsonProperty("market/nrParMarketMain")
    var marketNrParMarketMain: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketApr")
    var nrParMarketApr: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketAug")
    var nrParMarketAug: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketDec")
    var nrParMarketDec: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketFeb")
    var nrParMarketFeb: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketJan")
    var nrParMarketJan: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketJul")
    var nrParMarketJul: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketJun")
    var nrParMarketJun: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketMar")
    var nrParMarketMar: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketMay")
    var nrParMarketMay: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketNov")
    var nrParMarketNov: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketOct")
    var nrParMarketOct: String? = null

    @JsonProperty("nrParMarketDetails/nrParMarketSep")
    var nrParMarketSep: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("commentPriceStarch")
    var commentPriceStarch: String? = null

    @JsonProperty("starchFactory/starchFactoryName")
    var starchFactoryName: String? = null

    @JsonProperty("starchFactory/nrParStarchFactory")
    var nrParStarchFactory: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchApr")
    var nrParStarchApr: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchAug")
    var nrParStarchAug: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchDec")
    var nrParStarchDec: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchFeb")
    var nrParStarchFeb: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchJan")
    var nrParStarchJan: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchJul")
    var nrParStarchJul: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchJun")
    var nrParStarchJun: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchMar")
    var nrParStarchMar: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchMay")
    var nrParStarchMay: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchNov")
    var nrParStarchNov: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchOct")
    var nrParStarchOct: String? = null

    @JsonProperty("nrParStarchDetails/nrParStarchSep")
    var nrParStarchSep: String? = null

    @JsonProperty("starchFactory/nrParStarchFactoryMain")
    var nrParStarchFactoryMain: String? = null

    @JsonProperty("starchFactoryNameOther")
    var starchFactoryNameOther: String? = null
}