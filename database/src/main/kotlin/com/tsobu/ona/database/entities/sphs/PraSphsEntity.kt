package com.tsobu.ona.database.entities.sphs

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "pra_sphs")
class PraSphsEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

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

    @Column(name = "gender")
    var gender: String? = null

    @Column(name = "nr_par")
    var nrPar: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

    @Column(name = "loc")
    var loc: String? = null

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

    @Column(name = "village")
    var village: String? = null

    @Column(name = "nr_par_roots")
    var nrParRoots: String? = null

    @Column(name = "market_type")
    var marketType: String? = null

    @Column(name = "market_name")
    var marketName: String? = null

    @Column(name = "nr_par_market")
    var nrParMarket: String? = null

    @Column(name = "nr_par_market_main")
    var nrParMarketMain: String? = null

    @Column(name = "unit")
    var unit: String? = null

    @Column(name = "unit_name_select")
    var unitNameSelect: String? = null

    @Column(name = "unit_name_other")
    var unitNameOther: String? = null

    @Column(name = "unit_weight_other")
    var unitWeightOther: String? = null

    @Column(name = "unit_name")
    var unitName: String? = null

    @Column(name = "unit_local_weight")
    var unitLocalWeight: String? = null

    @Column(name = "unit_weight")
    var unitWeight: String? = null

    @Column(name = "price_note")
    var priceNote: String? = null

    @Column(name = "price_jan")
    var priceJan: String? = null

    @Column(name = "price_feb")
    var priceFeb: String? = null

    @Column(name = "price_mar")
    var priceMar: String? = null

    @Column(name = "price_apr")
    var priceApr: String? = null

    @Column(name = "price_may")
    var priceMay: String? = null

    @Column(name = "price_jun")
    var priceJun: String? = null

    @Column(name = "price_jul")
    var priceJul: String? = null

    @Column(name = "price_aug")
    var priceAug: String? = null

    @Column(name = "price_sep")
    var priceSep: String? = null

    @Column(name = "price_oct")
    var priceOct: String? = null

    @Column(name = "price_nov")
    var priceNov: String? = null

    @Column(name = "price_dec")
    var priceDec: String? = null

    @Column(name = "nr_par_market_note")
    var nrParMarketNote: String? = null

    @Column(name = "nr_par_market_jan")
    var nrParMarketJan: String? = null

    @Column(name = "nr_par_market_feb")
    var nrParMarketFeb: String? = null

    @Column(name = "nr_par_market_mar")
    var nrParMarketMar: String? = null

    @Column(name = "nr_par_market_apr")
    var nrParMarketApr: String? = null

    @Column(name = "nr_par_market_may")
    var nrParMarketMay: String? = null

    @Column(name = "nr_par_market_jun")
    var nrParMarketJun: String? = null

    @Column(name = "nr_par_market_jul")
    var nrParMarketJul: String? = null

    @Column(name = "nr_par_market_aug")
    var nrParMarketAug: String? = null

    @Column(name = "nr_par_market_sep")
    var nrParMarketSep: String? = null

    @Column(name = "nr_par_market_oct")
    var nrParMarketOct: String? = null

    @Column(name = "nr_par_market_nov")
    var nrParMarketNov: String? = null

    @Column(name = "nr_par_market_dec")
    var nrParMarketDec: String? = null

    @Column(name = "nr_par_starch")
    var nrParStarch: String? = null

    @Column(name = "starch_factory_name")
    var starchFactoryName: String? = null

    @Column(name = "nr_par_starch_factory")
    var nrParStarchFactory: String? = null

    @Column(name = "nr_par_starch_factory_main")
    var nrParStarchFactoryMain: String? = null

    @Column(name = "starch_factory_name_other")
    var starchFactoryNameOther: String? = null

    @Column(name = "nr_par_starch_note")
    var nrParStarchNote: String? = null

    @Column(name = "nr_par_starch_jan")
    var nrParStarchJan: String? = null

    @Column(name = "nr_par_starch_feb")
    var nrParStarchFeb: String? = null

    @Column(name = "nr_par_starch_mar")
    var nrParStarchMar: String? = null

    @Column(name = "nr_par_starch_apr")
    var nrParStarchApr: String? = null

    @Column(name = "nr_par_starch_may")
    var nrParStarchMay: String? = null

    @Column(name = "nr_par_starch_jun")
    var nrParStarchJun: String? = null

    @Column(name = "nr_par_starch_jul")
    var nrParStarchJul: String? = null

    @Column(name = "nr_par_starch_aug")
    var nrParStarchAug: String? = null

    @Column(name = "nr_par_starch_sep")
    var nrParStarchSep: String? = null

    @Column(name = "nr_par_starch_oct")
    var nrParStarchOct: String? = null

    @Column(name = "nr_par_starch_nov")
    var nrParStarchNov: String? = null

    @Column(name = "nr_par_starch_dec")
    var nrParStarchDec: String? = null

    @Column(name = "comment_price_year")
    var commentPriceYear: String? = null

    @Column(name = "comment_price_market")
    var commentPriceMarket: String? = null

    @Column(name = "comment_price_starch")
    var commentPriceStarch: String? = null

    @Column(name = "comment_price_general")
    var commentPriceGeneral: String? = null

    @Column(name = "thankyou")
    var thankyou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key", unique = true)
    var controlKey: String? = null
}