package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "sg_data_val_fip")
class SgDataValFipEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "form_hub_uu_id")
    var formHubUuId: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDateTime? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "sim_serial")
    var simSerial: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "crop")
    var crop: String? = null

    @Column(name = "event")
    var event: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "loc_field")
    var locField: String? = null

    @Column(name = "geo_point_latitude")
    var geoPointLatitude: String? = null

    @Column(name = "geo_point_longitude")
    var geoPointLongitude: String? = null

    @Column(name = "geo_point_altitude")
    var geoPointAltitude: String? = null

    @Column(name = "geo_point_accuracy")
    var geoPointAccuracy: String? = null

    @Column(name = "land_preparation_clearing")
    var landPreparationClearing: String? = null

    @Column(name = "land_preparation_vegetation")
    var landPreparationVegetation: String? = null

    @Column(name = "land_preparation_nr_tillage")
    var landPreparationNrTillage: String? = null

    @Column(name = "land_preparation_nr_harrow")
    var landPreparationNrHarrow: String? = null

    @Column(name = "land_preparation_ridging")
    var landPreparationRidging: String? = null

    @Column(name = "land_prepation_details_tillage_method1")
    var landPrepationDetailsTillageMethod1: String? = null

    @Column(name = "land_prepation_details_tillage_method2")
    var landPrepationDetailsTillageMethod2: String? = null

    @Column(name = "land_prepation_details_tillage_method3")
    var landPrepationDetailsTillageMethod3: String? = null

    @Column(name = "land_prepation_details_harrow_method1")
    var landPrepationDetailsHarrowMethod1: String? = null

    @Column(name = "land_prepation_details_harrow_method2")
    var landPrepationDetailsHarrowMethod2: String? = null

    @Column(name = "land_prepation_details_harrow_method3")
    var landPrepationDetailsHarrowMethod3: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "planting_details_trial_type")
    var plantingDetailsTrialType: String? = null

    @Column(name = "planting_details_rice_system")
    var plantingDetailsRiceSystem: String? = null

    @Column(name = "planting_details_variety")
    var plantingDetailsVariety: String? = null

    @Column(name = "planting_details_planting_density")
    var plantingDetailsPlantingDensity: String? = null

    @Column(name = "planting_details_density_details_cassava_between_row_c")
    var plantingDetailsDensityDetailsCassavaBetweenRowC: String? = null

    @Column(name = "planting_details_density_details_cassava_within_row_c")
    var plantingDetailsDensityDetailsCassavaWithinRowC: String? = null

    @Column(name = "planting_details_density_details_maize_between_row_m")
    var plantingDetailsDensityDetailsMaizeBetweenRowM: String? = null

    @Column(name = "planting_details_density_details_maize_within_row_m")
    var plantingDetailsDensityDetailsMaizeWithinRowM: String? = null

    @Column(name = "planting_details_planting_method")
    var plantingDetailsPlantingMethod: String? = null

    @Column(name = "planting_details_tp_method")
    var plantingDetailsTpMethod: String? = null

    @Column(name = "nursery_date")
    var nurseryDate: LocalDateTime? = null

    @Column(name = "tp_date")
    var tpDate: LocalDateTime? = null

    @Column(name = "planting_details_ds_method")
    var plantingDetailsDsMethod: String? = null

    @Column(name = "seeding_date")
    var seedingDate: LocalDateTime? = null

    @Column(name = "planting_details_organic_input")
    var plantingDetailsOrganicInput: String? = null

    @Column(name = "plot_size_details_plot_w")
    var plotSizeDetailsPlotW: String? = null

    @Column(name = "plot_size_details_plot_l")
    var plotSizeDetailsPlotL: String? = null

    @Column(name = "plot_size_details_plot_size")
    var plotSizeDetailsPlotSize: String? = null

    @Column(name = "plant_stand_nr_plants_fce")
    var plantStandNrPlantsFce: String? = null

    @Column(name = "plant_stand_nr_plants_fip")
    var plantStandNrPlantsFip: String? = null

    @Column(name = "plant_stand_rice_nr_plants_fce1")
    var plantStandRiceNrPlantsFce1: String? = null

    @Column(name = "plant_stand_rice_nr_plants_fce2")
    var plantStandRiceNrPlantsFce2: String? = null

    @Column(name = "plant_stand_rice_nr_plants_fip1")
    var plantStandRiceNrPlantsFip1: String? = null

    @Column(name = "plant_stand_rice_nr_plants_fip2")
    var plantStandRiceNrPlantsFip2: String? = null

    @Column(name = "plot_layout_fce_plot_dim_fce_c")
    var plotLayoutFcePlotDimFceC: String? = null

    @Column(name = "plot_layout_fce_plot_dim_fce_m")
    var plotLayoutFcePlotDimFceM: String? = null

    @Column(name = "plot_layout_fce_plot_dim_fce_r")
    var plotLayoutFcePlotDimFceR: String? = null

    @Column(name = "plot_layout_fce_plot_l1_fce")
    var plotLayoutFcePlotL1Fce: String? = null

    @Column(name = "plot_layout_fce_plot_w1_fce")
    var plotLayoutFcePlotW1Fce: String? = null

    @Column(name = "plot_layout_fce_plot_l2_fce")
    var plotLayoutFcePlotL2Fce: String? = null

    @Column(name = "plot_layout_fce_plot_w2_fce")
    var plotLayoutFcePlotW2Fce: String? = null

    @Column(name = "plot_layout_fip_plot_dim_fip_c")
    var plotLayoutFipPlotDimFipC: String? = null

    @Column(name = "plot_layout_fip_plot_dim_fip_m")
    var plotLayoutFipPlotDimFipM: String? = null

    @Column(name = "plot_layout_fip_plot_dim_fip_r")
    var plotLayoutFipPlotDimFipR: String? = null

    @Column(name = "plot_layout_fip_plot_l1_fip_c")
    var plotLayoutFipPlotL1FipC: String? = null

    @Column(name = "plot_layout_fip_plot_w1_fip_c")
    var plotLayoutFipPlotW1FipC: String? = null

    @Column(name = "plot_layout_fip_plot_l2_fip_c")
    var plotLayoutFipPlotL2FipC: String? = null

    @Column(name = "plot_layout_fip_plot_w2_fip_c")
    var plotLayoutFipPlotW2FipC: String? = null

    @Column(name = "gapping")
    var gapping: String? = null

    @Column(name = "gapping_date")
    var gappingDate: LocalDateTime? = null

    @Column(name = "gapping_details_gapping_type")
    var gappingDetailsGappingType: String? = null

    @Column(name = "fertilizers1_blue")
    var fertilizers1Blue: String? = null

    @Column(name = "fertilizer1_blue_date_fertilizer1")
    var fertilizer1BlueDateFertilizer1: LocalDateTime? = null

    @Column(name = "fertilizer1_blue_urea1")
    var fertilizer1BlueUrea1: String? = null

    @Column(name = "fertilizer1_blue_npk1")
    var fertilizer1BlueNpk1: String? = null

    @Column(name = "fertilizers2_blue")
    var fertilizers2Blue: String? = null

    @Column(name = "fertilizer2_blue_date_fertilizer2")
    var fertilizer2BlueDateFertilizer2: LocalDateTime? = null

    @Column(name = "fertilizer2_blue_urea2")
    var fertilizer2BlueUrea2: String? = null

    @Column(name = "fertilizer2_blue_npk2")
    var fertilizer2BlueNpk2: String? = null

    @Column(name = "fertilizers3_blue")
    var fertilizers3Blue: String? = null

    @Column(name = "fertilizer3_blue_date_fertilizer3")
    var fertilizer3BlueDateFertilizer3: LocalDateTime? = null

    @Column(name = "fertilizer3_blue_urea3")
    var fertilizer3BlueUrea3: String? = null

    @Column(name = "fertilizer3_blue_npk3")
    var fertilizer3BlueNpk3: String? = null

    @Column(name = "fertilizers1_yellow")
    var fertilizers1Yellow: String? = null

    @Column(name = "fertilizer1_yellow_date_fertilizer1")
    var fertilizer1YellowDateFertilizer1: LocalDateTime? = null

    @Column(name = "fertilizer1_yellow_urea1")
    var fertilizer1YellowUrea1: String? = null

    @Column(name = "fertilizer1_yellow_npk1")
    var fertilizer1YellowNpk1: String? = null

    @Column(name = "fertilizers2_yellow")
    var fertilizers2Yellow: String? = null

    @Column(name = "fertilizer2_yellow_date_fertilizer2")
    var fertilizer2YellowDateFertilizer2: LocalDateTime? = null

    @Column(name = "fertilizer2_yellow_urea2")
    var fertilizer2YellowUrea2: String? = null

    @Column(name = "fertilizer2_yellow_npk2")
    var fertilizer2YellowNpk2: String? = null

    @Column(name = "fertilizers3_yellow")
    var fertilizers3Yellow: String? = null

    @Column(name = "fertilizer3_yellow_date_fertilizer3")
    var fertilizer3YellowDateFertilizer3: LocalDateTime? = null

    @Column(name = "fertilizer3_yellow_urea3")
    var fertilizer3YellowUrea3: String? = null

    @Column(name = "fertilizer3_yellow_npk3")
    var fertilizer3YellowNpk3: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: String? = null

    @Column(name = "weeding_details_date_weeding1")
    var weedingDetailsDateWeeding1: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method1")
    var weedingDetailsWeedingMethod1: String? = null

    @Column(name = "weeding_details_date_weeding2")
    var weedingDetailsDateWeeding2: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method2")
    var weedingDetailsWeedingMethod2: String? = null

    @Column(name = "weeding_details_date_weeding3")
    var weedingDetailsDateWeeding3: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method3")
    var weedingDetailsWeedingMethod3: String? = null

    @Column(name = "weeding_details_date_weeding4")
    var weedingDetailsDateWeeding4: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method4")
    var weedingDetailsWeedingMethod4: String? = null

    @Column(name = "weeding_details_date_weeding5")
    var weedingDetailsDateWeeding5: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method5")
    var weedingDetailsWeedingMethod5: String? = null

    @Column(name = "weeding_details_date_weeding6")
    var weedingDetailsDateWeeding6: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method6")
    var weedingDetailsWeedingMethod6: String? = null

    @Column(name = "weeding_details_date_weeding7")
    var weedingDetailsDateWeeding7: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method7")
    var weedingDetailsWeedingMethod7: String? = null

    @Column(name = "weeding_details_date_weeding8")
    var weedingDetailsDateWeeding8: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method8")
    var weedingDetailsWeedingMethod8: String? = null

    @Column(name = "weeding_details_date_weeding9")
    var weedingDetailsDateWeeding9: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method9")
    var weedingDetailsWeedingMethod9: String? = null

    @Column(name = "weeding_details_date_weeding10")
    var weedingDetailsDateWeeding10: LocalDateTime? = null

    @Column(name = "weeding_details_weeding_method10")
    var weedingDetailsWeedingMethod10: String? = null

    @Column(name = "trial_rating_cassava_rate_note")
    var trialRatingCassavaRateNote: String? = null

    @Column(name = "trial_rating_cassava_rate_drought")
    var trialRatingCassavaRateDrought: String? = null

    @Column(name = "trial_rating_cassava_rate_water_logging")
    var trialRatingCassavaRateWaterLogging: String? = null

    @Column(name = "trial_rating_cassava_rate_lodging")
    var trialRatingCassavaRateLodging: String? = null

    @Column(name = "trial_rating_cassava_rate_grazing")
    var trialRatingCassavaRateGrazing: String? = null

    @Column(name = "trial_rating_cassava_rate_fire")
    var trialRatingCassavaRateFire: String? = null

    @Column(name = "trial_rating_cassava_rate_pests")
    var trialRatingCassavaRatePests: String? = null

    @Column(name = "trial_rating_cassava_rate_weeds")
    var trialRatingCassavaRateWeeds: String? = null

    @Column(name = "trial_rating_cassava_rate_cmd")
    var trialRatingCassavaRateCmd: String? = null

    @Column(name = "trial_rating_cassava_rate_other_disease")
    var trialRatingCassavaRateOtherDisease: String? = null

    @Column(name = "trial_rating_cassava_rate_theft_missing")
    var trialRatingCassavaRateTheftMissing: String? = null

    @Column(name = "trial_rating_maize_rate_note")
    var trialRatingMaizeRateNote: String? = null

    @Column(name = "trial_rating_maize_rate_drought")
    var trialRatingMaizeRateDrought: String? = null

    @Column(name = "trial_rating_maize_rate_water_logging")
    var trialRatingMaizeRateWaterLogging: String? = null

    @Column(name = "trial_rating_maize_rate_lodging")
    var trialRatingMaizeRateLodging: String? = null

    @Column(name = "trial_rating_maize_rate_grazing")
    var trialRatingMaizeRateGrazing: String? = null

    @Column(name = "trial_rating_maize_rate_fire")
    var trialRatingMaizeRateFire: String? = null

    @Column(name = "trial_rating_maize_rate_fall_armyworm")
    var trialRatingMaizeRateFallArmyworm: String? = null

    @Column(name = "trial_rating_maize_rate_stemborer")
    var trialRatingMaizeRateStemborer: String? = null

    @Column(name = "trial_rating_maize_rate_mite")
    var trialRatingMaizeRateMite: String? = null

    @Column(name = "trial_rating_maize_rate_other_pests")
    var trialRatingMaizeRateOtherPests: String? = null

    @Column(name = "trial_rating_maize_rate_weeds")
    var trialRatingMaizeRateWeeds: String? = null

    @Column(name = "trial_rating_maize_rate_other_disease")
    var trialRatingMaizeRateOtherDisease: String? = null

    @Column(name = "trial_rating_maize_rate_theft_missing")
    var trialRatingMaizeRateTheftMissing: String? = null

    @Column(name = "trial_rating_rice_rate_note")
    var trialRatingRiceRateNote: String? = null

    @Column(name = "trial_rating_rice_rate_lodging")
    var trialRatingRiceRateLodging: String? = null

    @Column(name = "trial_rating_rice_rate_missing")
    var trialRatingRiceRateMissing: String? = null

    @Column(name = "trial_rating_rice_rate_drought")
    var trialRatingRiceRateDrought: String? = null

    @Column(name = "trial_rating_rice_rate_cold")
    var trialRatingRiceRateCold: String? = null

    @Column(name = "trial_rating_rice_rate_heat")
    var trialRatingRiceRateHeat: String? = null

    @Column(name = "trial_rating_rice_rate_submergence")
    var trialRatingRiceRateSubmergence: String? = null

    @Column(name = "trial_rating_rice_rate_iron_toxicity")
    var trialRatingRiceRateIronToxicity: String? = null

    @Column(name = "trial_rating_rice_rate_salinity")
    var trialRatingRiceRateSalinity: String? = null

    @Column(name = "trial_rating_rice_rate_other_soil")
    var trialRatingRiceRateOtherSoil: String? = null

    @Column(name = "trial_rating_rice_text_soil")
    var trialRatingRiceTextSoil: String? = null

    @Column(name = "trial_rating_rice_rate_animalg_razing")
    var trialRatingRiceRateAnimalgRazing: String? = null

    @Column(name = "trial_rating_rice_rate_bird")
    var trialRatingRiceRateBird: String? = null

    @Column(name = "trial_rating_rice_rate_rat")
    var trialRatingRiceRateRat: String? = null

    @Column(name = "trial_rating_rice_select_dominant_pest")
    var trialRatingRiceSelectDominantPest: String? = null

    @Column(name = "trial_rating_rice_rate_dominant_pest")
    var trialRatingRiceRateDominantPest: String? = null

    @Column(name = "trial_rating_rice_rate_other_pests")
    var trialRatingRiceRateOtherPests: String? = null

    @Column(name = "trial_rating_rice_select_dominant_disease")
    var trialRatingRiceSelectDominantDisease: String? = null

    @Column(name = "trial_rating_rice_rate_dominant_disease")
    var trialRatingRiceRateDominantDisease: String? = null

    @Column(name = "trial_rating_rice_rate_other_diseases")
    var trialRatingRiceRateOtherDiseases: String? = null

    @Column(name = "trial_rating_rice_rate_weeds")
    var trialRatingRiceRateWeeds: String? = null

    @Column(name = "water_management_rate_note")
    var waterManagementRateNote: String? = null

    @Column(name = "water_management_rate_irrigation1")
    var waterManagementRateIrrigation1: String? = null

    @Column(name = "water_management_rate_drainage1")
    var waterManagementRateDrainage1: String? = null

    @Column(name = "water_management_rate_irrigation2")
    var waterManagementRateIrrigation2: String? = null

    @Column(name = "water_management_rate_drainage2")
    var waterManagementRateDrainage2: String? = null

    @Column(name = "water_level_rate_note")
    var waterLevelRateNote: String? = null

    @Column(name = "water_level_rate_water1")
    var waterLevelRateWater1: String? = null

    @Column(name = "water_level_rate_water2")
    var waterLevelRateWater2: String? = null

    @Column(name = "cassava_harvest_date")
    var cassavaHarvestDate: LocalDateTime? = null

    @Column(name = "harvest_cassava_tuberized_marketable_roots_nr_fce")
    var harvestCassavaTuberizedMarketableRootsNrFce: String? = null

    @Column(name = "harvest_cassava_tuberized_marketable_roots_fw_fce")
    var harvestCassavaTuberizedMarketableRootsFwFce: String? = null

    @Column(name = "harvest_cassava_tuberized_marketable_roots_nr_fip")
    var harvestCassavaTuberizedMarketableRootsNrFip: String? = null

    @Column(name = "harvest_cassava_tuberized_marketable_roots_fw_fip")
    var harvestCassavaTuberizedMarketableRootsFwFip: String? = null

    @Column(name = "maize_harvest_date")
    var maizeHarvestDate: LocalDateTime? = null

    @Column(name = "harvest_maize_maize_cobs_nr_ss_fce")
    var harvestMaizeMaizeCobsNrSsFce: String? = null

    @Column(name = "harvest_maize_maize_cobs_fw_ss_fce")
    var harvestMaizeMaizeCobsFwSsFce: String? = null

    @Column(name = "harvest_maize_plant_sample_id_maize_cobs_fce")
    var harvestMaizePlantSampleIdMaizeCobsFce: String? = null

    @Column(name = "harvest_maize_maize_cobs_nr_plot_fce")
    var harvestMaizeMaizeCobsNrPlotFce: String? = null

    @Column(name = "harvest_maize_maizecobs_fw_plot_fce")
    var harvestMaizeMaizecobsFwPlotFce: String? = null

    @Column(name = "harvest_maize_maize_cobs_nr_ss_fip")
    var harvestMaizeMaizeCobsNrSsFip: String? = null

    @Column(name = "harvest_maize_maize_cobs_fw_ss_fip")
    var harvestMaizeMaizeCobsFwSsFip: String? = null

    @Column(name = "harvest_maize_plant_sample_id_maize_cobs_fip")
    var harvestMaizePlantSampleIdMaizeCobsFip: String? = null

    @Column(name = "harvest_maize_maize_cobs_nr_plot_fip")
    var harvestMaizeMaizeCobsNrPlotFip: String? = null

    @Column(name = "harvest_maize_maize_cobs_fw_plot_fip")
    var harvestMaizeMaizeCobsFwPlotFip: String? = null

    @Column(name = "rice_harvest_date")
    var riceHarvestDate: LocalDateTime? = null

    @Column(name = "harvest_rice_rice_panicles_fw_plot_fce")
    var harvestRiceRicePaniclesFwPlotFce: String? = null

    @Column(name = "harvest_rice_rice_panicles_fw_ss_fce")
    var harvestRiceRicePaniclesFwSsFce: String? = null

    @Column(name = "harvest_rice_plant_sample_id_rice_panicles_fce")
    var harvestRicePlantSampleIdRicePaniclesFce: String? = null

    @Column(name = "harvest_rice_rice_panicles_fw_plot_fip")
    var harvestRiceRicePaniclesFwPlotFip: String? = null

    @Column(name = "harvest_rice_rice_panicles_fw_ss_fip")
    var harvestRiceRicePaniclesFwSsFip: String? = null

    @Column(name = "harvest_rice_plant_sample_id_rice_panicles_fip")
    var harvestRicePlantSampleIdRicePaniclesFip: String? = null

    @Column(name = "farmer_evaluation_score_note")
    var farmerEvaluationScoreNote: String? = null

    @Column(name = "farmer_evaluation_cost_score")
    var farmerEvaluationCostScore: String? = null

    @Column(name = "farmer_evaluation_labour_score")
    var farmerEvaluationLabourScore: String? = null

    @Column(name = "farmer_evaluation_yield_score")
    var farmerEvaluationYieldScore: String? = null

    @Column(name = "farmer_evaluation_quality_score")
    var farmerEvaluationQualityScore: String? = null

    @Column(name = "farmer_evaluation_revenue_score")
    var farmerEvaluationRevenueScore: String? = null

    @Column(name = "farmer_evaluation_overall_score")
    var farmerEvaluationOverallScore: String? = null

    @Column(name = "price_roots")
    var priceRoots: String? = null

    @Column(name = "price_maize")
    var priceMaize: String? = null

    @Column(name = "price_rice")
    var priceRice: String? = null

    @Column(name = "comment")
    var comment: String? = null

    @Column(name = "thank_you")
    var thankYou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}