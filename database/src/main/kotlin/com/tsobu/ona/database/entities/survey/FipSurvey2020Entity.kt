package com.tsobu.ona.database.entities.survey

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "fip_survey_2020")
@Entity
class FipSurvey2020Entity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "formhub_uuid")
    var formhubUuid: String? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "deviceid")
    var deviceid: String? = null

    @Column(name = "phonenumber")
    var phonenumber: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "tooldescription_generated_note_name_7")
    var tooldescriptionGeneratedNoteName7: String? = null

    @Column(name = "tooldescription_banner")
    var tooldescriptionBanner: String? = null

    @Column(name = "tooldescription_intro")
    var tooldescriptionIntro: String? = null

    @Column(name = "farmeradress_generated_note_name_12")
    var farmeradressGeneratedNoteName12: String? = null

    @Column(name = "farmeradress_eaid")
    var farmeradressEaid: String? = null

    @Column(name = "farmeradress_hhid")
    var farmeradressHhid: String? = null

    @Column(name = "farmeradress_state")
    var farmeradressState: String? = null

    @Column(name = "farmeradress_lga")
    var farmeradressLga: String? = null

    @Column(name = "cropspair_generated_note_name_19")
    var cropspairGeneratedNoteName19: String? = null

    @Column(name = "cropspair_crops")
    var cropspairCrops: String? = null

    @Column(name = "cropspair_crops_kk")
    var cropspairCropsKk: String? = null

    @Column(name = "cropspair_croplookup")
    var cropspairCroplookup: String? = null

    @Column(name = "cropspair_generated_note_name_23")
    var cropspairGeneratedNoteName23: String? = null

    @Column(name = "cropspair_risk_att")
    var cropspairRiskAtt: String? = null

    @Column(name = "meausurearea_generated_note_name_27")
    var meausureareaGeneratedNoteName27: String? = null

    @Column(name = "meausurearea_field_area_app")
    var meausureareaFieldAreaApp: String? = null

    @Column(name = "meausurearea_linkto_app")
    var meausureareaLinktoApp: String? = null

    @Column(name = "meausurearea_measure_area")
    var meausureareaMeasureArea: String? = null

    @Column(name = "cassva_hh_info_generated_note_name_36")
    var cassvaHhInfoGeneratedNoteName36: String? = null

    @Column(name = "cassva_hh_info_farmareacassava")
    var cassvaHhInfoFarmareacassava: String? = null

    @Column(name = "cassva_hh_info_cassavadecision")
    var cassvaHhInfoCassavadecision: String? = null

    @Column(name = "cassva_hh_info_gendercassava")
    var cassvaHhInfoGendercassava: String? = null

    @Column(name = "cassva_hh_info_lastyear_invest_cassava")
    var cassvaHhInfoLastyearInvestCassava: String? = null

    @Column(name = "cassva_hh_info_cassavaplmonth")
    var cassvaHhInfoCassavaplmonth: String? = null

    @Column(name = "cassva_hh_info_cassavapurpose")
    var cassvaHhInfoCassavapurpose: String? = null

    @Column(name = "cassavafertinfo_generated_note_name_45")
    var cassavafertinfoGeneratedNoteName45: String? = null

    @Column(name = "cassavafertinfo_fert_c")
    var cassavafertinfoFertC: String? = null

    @Column(name = "cassavafertinfo_fertname_c")
    var cassavafertinfoFertnameC: String? = null

    @Column(name = "cassavafertinfo_c_urealastyear")
    var cassavafertinfoCUrealastyear: String? = null

    @Column(name = "cassavafertinfo_ureacass")
    var cassavafertinfoUreacass: String? = null

    @Column(name = "cassavafertinfo_ureacass_p")
    var cassavafertinfoUreacassP: String? = null

    @Column(name = "cassavafertinfo_c_npk15lastyear")
    var cassavafertinfoCNpk15lastyear: String? = null

    @Column(name = "cassavafertinfo_npk15cass")
    var cassavafertinfoNpk15cass: String? = null

    @Column(name = "cassavafertinfo_npk15cass_p")
    var cassavafertinfoNpk15cassP: String? = null

    @Column(name = "cassavafertinfo_c_npk20lastyear")
    var cassavafertinfoCNpk20lastyear: String? = null

    @Column(name = "cassavafertinfo_npk20cass")
    var cassavafertinfoNpk20cass: String? = null

    @Column(name = "cassavafertinfo_npk20cass_p")
    var cassavafertinfoNpk20cassP: String? = null

    @Column(name = "cassavafertinfo_cdaplastyear")
    var cassavafertinfoCdaplastyear: String? = null

    @Column(name = "cassavafertinfo_dapcass")
    var cassavafertinfoDapcass: String? = null

    @Column(name = "cassavafertinfo_dapcass_p")
    var cassavafertinfoDapcassP: String? = null

    @Column(name = "cassavafertinfo_fertcass")
    var cassavafertinfoFertcass: String? = null

    @Column(name = "cassavafertinfo_fertcass_cp")
    var cassavafertinfoFertcassCp: String? = null

    @Column(name = "cassava_yield_prices_generated_note_name_64")
    var cassavaYieldPricesGeneratedNoteName64: String? = null

    @Column(name = "cassava_yield_prices_unitweight_c")
    var cassavaYieldPricesUnitweightC: String? = null

    @Column(name = "cassava_yield_prices_cassava_harvested")
    var cassavaYieldPricesCassavaHarvested: String? = null

    @Column(name = "cassava_yield_prices_fcykg")
    var cassavaYieldPricesFcykg: String? = null

    @Column(name = "cassava_yield_prices_fcy_ton")
    var cassavaYieldPricesFcyTon: String? = null

    @Column(name = "cassava_yield_prices_cass_yieldkg")
    var cassavaYieldPricesCassYieldkg: String? = null

    @Column(name = "cassava_yield_prices_cass_yield_ton")
    var cassavaYieldPricesCassYieldTon: String? = null

    @Column(name = "cassava_yield_prices_cassavapricekg")
    var cassavaYieldPricesCassavapricekg: String? = null

    @Column(name = "cassava_yield_prices_cassavaprice_ton")
    var cassavaYieldPricesCassavapriceTon: String? = null

    @Column(name = "rice_hh_info_generated_note_name_75")
    var riceHhInfoGeneratedNoteName75: String? = null

    @Column(name = "rice_hh_info_farmarea_rice")
    var riceHhInfoFarmareaRice: String? = null

    @Column(name = "rice_hh_info_ricedecision")
    var riceHhInfoRicedecision: String? = null

    @Column(name = "rice_hh_info_genderrice")
    var riceHhInfoGenderrice: String? = null

    @Column(name = "rice_hh_info_lastyear_invest_rice")
    var riceHhInfoLastyearInvestRice: String? = null

    @Column(name = "rice_hh_info_ricepurpose")
    var riceHhInfoRicepurpose: String? = null

    @Column(name = "ricefertinfo_generated_note_name_83")
    var ricefertinfoGeneratedNoteName83: String? = null

    @Column(name = "ricefertinfo_fert_r")
    var ricefertinfoFertR: String? = null

    @Column(name = "ricefertinfo_fertname_r")
    var ricefertinfoFertnameR: String? = null

    @Column(name = "ricefertinfo_r_urealastyear")
    var ricefertinfoRUrealastyear: String? = null

    @Column(name = "ricefertinfo_urea_r")
    var ricefertinfoUreaR: String? = null

    @Column(name = "ricefertinfo_urea_rp")
    var ricefertinfoUreaRp: String? = null

    @Column(name = "ricefertinfo_r_npk15lastyear")
    var ricefertinfoRNpk15lastyear: String? = null

    @Column(name = "ricefertinfo_npk15_r")
    var ricefertinfoNpk15R: String? = null

    @Column(name = "ricefertinfo_npk15_rp")
    var ricefertinfoNpk15Rp: String? = null

    @Column(name = "ricefertinfo_r_npk20lastyear")
    var ricefertinfoRNpk20lastyear: String? = null

    @Column(name = "ricefertinfo_npk20_r")
    var ricefertinfoNpk20R: String? = null

    @Column(name = "ricefertinfo_npk20_rp")
    var ricefertinfoNpk20Rp: String? = null

    @Column(name = "ricefertinfo_r_daplastyear")
    var ricefertinfoRDaplastyear: String? = null

    @Column(name = "ricefertinfo_dap_r")
    var ricefertinfoDapR: String? = null

    @Column(name = "ricefertinfo_dap_rp")
    var ricefertinfoDapRp: String? = null

    @Column(name = "ricefertinfo_fert_rice")
    var ricefertinfoFertRice: String? = null

    @Column(name = "ricefertinfo_fertcass_cp")
    var ricefertinfoFertcassCp: String? = null

    @Column(name = "rice_yield_prices_generated_note_name_102")
    var riceYieldPricesGeneratedNoteName102: String? = null

    @Column(name = "rice_yield_prices_unitweight_r")
    var riceYieldPricesUnitweightR: String? = null

    @Column(name = "rice_yield_prices_rice_yieldkg")
    var riceYieldPricesRiceYieldkg: String? = null

    @Column(name = "rice_yield_prices_rice_yield75kg")
    var riceYieldPricesRiceYield75kg: String? = null

    @Column(name = "rice_yield_prices_ricepricekg")
    var riceYieldPricesRicepricekg: String? = null

    @Column(name = "rice_yield_prices_riceprice75kg")
    var riceYieldPricesRiceprice75kg: String? = null

    @Column(name = "rice_yield_prices_cropesta")
    var riceYieldPricesCropesta: String? = null

    @Column(name = "rice_yield_prices_ricegrowth")
    var riceYieldPricesRicegrowth: String? = null

    @Column(name = "maize_hh_info_generated_note_name_112")
    var maizeHhInfoGeneratedNoteName112: String? = null

    @Column(name = "maize_hh_info_farmarea_maize")
    var maizeHhInfoFarmareaMaize: String? = null

    @Column(name = "maize_hh_info_maizedecision")
    var maizeHhInfoMaizedecision: String? = null

    @Column(name = "maize_hh_info_gendermaize")
    var maizeHhInfoGendermaize: String? = null

    @Column(name = "maize_hh_info_lastyear_invest_maize")
    var maizeHhInfoLastyearInvestMaize: String? = null

    @Column(name = "maize_hh_info_maizepurpose")
    var maizeHhInfoMaizepurpose: String? = null

    @Column(name = "maizefertinfo_generated_note_name_120")
    var maizefertinfoGeneratedNoteName120: String? = null

    @Column(name = "maizefertinfo_fert_m")
    var maizefertinfoFertM: String? = null

    @Column(name = "maizefertinfo_fertname_m")
    var maizefertinfoFertnameM: String? = null

    @Column(name = "maizefertinfo_m_urealastyear")
    var maizefertinfoMUrealastyear: String? = null

    @Column(name = "maizefertinfo_urea_m")
    var maizefertinfoUreaM: String? = null

    @Column(name = "maizefertinfo_urea_mp")
    var maizefertinfoUreaMp: String? = null

    @Column(name = "maizefertinfo_m_npk15lastyear")
    var maizefertinfoMNpk15lastyear: String? = null

    @Column(name = "maizefertinfo_npk15_m")
    var maizefertinfoNpk15M: String? = null

    @Column(name = "maizefertinfo_npk15_mp")
    var maizefertinfoNpk15Mp: String? = null

    @Column(name = "maizefertinfo_m_npk20lastyear")
    var maizefertinfoMNpk20lastyear: String? = null

    @Column(name = "maizefertinfo_npk20_m")
    var maizefertinfoNpk20M: String? = null

    @Column(name = "maizefertinfo_npk20_mp")
    var maizefertinfoNpk20Mp: String? = null

    @Column(name = "maizefertinfo_m_daplastyear")
    var maizefertinfoMDaplastyear: String? = null

    @Column(name = "maizefertinfo_dap_m")
    var maizefertinfoDapM: String? = null

    @Column(name = "maizefertinfo_dap_mp")
    var maizefertinfoDapMp: String? = null

    @Column(name = "maizefertinfo_fert_maize")
    var maizefertinfoFertMaize: String? = null

    @Column(name = "maizefertinfo_fertcass_cp")
    var maizefertinfoFertcassCp: String? = null

    @Column(name = "maize_yield_prices_generated_note_name_139")
    var maizeYieldPricesGeneratedNoteName139: String? = null

    @Column(name = "maize_yield_prices_unitweight_m")
    var maizeYieldPricesUnitweightM: String? = null

    @Column(name = "maize_yield_prices_maize_yieldkg")
    var maizeYieldPricesMaizeYieldkg: String? = null

    @Column(name = "maize_yield_prices_maize_yield100kg")
    var maizeYieldPricesMaizeYield100kg: String? = null

    @Column(name = "maize_yield_prices_maizepricekg")
    var maizeYieldPricesMaizepricekg: String? = null

    @Column(name = "maize_yield_prices_maizeprice100kg")
    var maizeYieldPricesMaizeprice100kg: String? = null

    @Column(name = "maize_yield_prices_poultrymanure")
    var maizeYieldPricesPoultrymanure: String? = null

    @Column(name = "maize_yield_prices_polutrybag")
    var maizeYieldPricesPolutrybag: String? = null

    @Column(name = "maize_yield_prices_poultrypricebag")
    var maizeYieldPricesPoultrypricebag: String? = null

    @Column(name = "maize_yield_prices_poultrypricedonkey")
    var maizeYieldPricesPoultrypricedonkey: String? = null

    @Column(name = "maize_yield_prices_poultrypricecart")
    var maizeYieldPricesPoultrypricecart: String? = null

    @Column(name = "maize_yield_prices_poultryamountbag")
    var maizeYieldPricesPoultryamountbag: String? = null

    @Column(name = "maize_yield_prices_poultryamountdonkey")
    var maizeYieldPricesPoultryamountdonkey: String? = null

    @Column(name = "maize_yield_prices_poultryamountcart")
    var maizeYieldPricesPoultryamountcart: String? = null

    @Column(name = "maize_yield_prices_fym")
    var maizeYieldPricesFym: String? = null

    @Column(name = "maize_yield_prices_fym_bag")
    var maizeYieldPricesFymBag: String? = null

    @Column(name = "maize_yield_prices_fym_pricebag")
    var maizeYieldPricesFymPricebag: String? = null

    @Column(name = "maize_yield_prices_fym_pricedonkey")
    var maizeYieldPricesFymPricedonkey: String? = null

    @Column(name = "maize_yield_prices_fym_pricecart")
    var maizeYieldPricesFymPricecart: String? = null

    @Column(name = "maize_yield_prices_fym_amountbag")
    var maizeYieldPricesFymAmountbag: String? = null

    @Column(name = "maize_yield_prices_fym_amountdonkey")
    var maizeYieldPricesFymAmountdonkey: String? = null

    @Column(name = "maize_yield_prices_fym_amountcart")
    var maizeYieldPricesFymAmountcart: String? = null

    @Column(name = "generated_note_name_162")
    var generatedNoteName162: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "meta_instanceid")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}