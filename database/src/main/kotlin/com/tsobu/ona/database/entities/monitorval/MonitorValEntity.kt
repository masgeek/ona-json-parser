package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val")
class MonitorValEntity : BaseEntity() {
    @Column(name = "submission_date")
    var submissionDate: LocalDateTime? = null

    @Column(name = "uuid")
    var uuid: String? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "today_date")
    var todayDate: LocalDate? = null

    @Column(name = "device_id")
    var deviceId: String? = null

    @Column(name = "subscriber_id")
    var subscriberId: String? = null

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

    @Column(name = "login")
    var login: String? = null

    @Column(name = "firstname")
    var firstname: String? = null

    @Column(name = "surname")
    var surname: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "firstname_ea")
    var firstnameEa: String? = null

    @Column(name = "surname_ea")
    var surnameEa: String? = null

    @Column(name = "name_ea")
    var nameEa: String? = null

    @Column(name = "details_ea")
    var detailsEa: String? = null

    @Column(name = "details_ea_note")
    var detailsEaNote: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "firstname_hh")
    var firstnameHh: String? = null

    @Column(name = "surname_hh")
    var surnameHh: String? = null

    @Column(name = "name_hh")
    var nameHh: String? = null

    @Column(name = "details_hh")
    var detailsHh: String? = null

    @Column(name = "details_hh_note")
    var detailsHhNote: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "conversion")
    var conversion: String? = null

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

    @Column(name = "zone_select")
    var zoneSelect: String? = null

    @Column(name = "zone_value")
    var zoneValue: String? = null

    @Column(name = "use_case")
    var useCase: String? = null

    @Column(name = "maize_variety_select")
    var maizeVarietySelect: String? = null

    @Column(name = "maize_variety_other")
    var maizeVarietyOther: String? = null

    @Column(name = "maize_variety_duration")
    var maizeVarietyDuration: String? = null

    @Column(name = "maize_variety")
    var maizeVariety: String? = null

    @Column(name = "plots")
    var plots: String? = null

    @Column(name = "nr_plots")
    var nrPlots: String? = null

    @Column(name = "knowledge_note")
    var knowledgeNote: String? = null

    @Column(name = "knowledge_hh")
    var knowledgeHh: String? = null

    @Column(name = "knowledge_ea")
    var knowledgeEa: String? = null

    @Column(name = "install_correct")
    var installCorrect: String? = null

    @Column(name = "install_correct_details_count")
    var installCorrectDetailsCount: String? = null

    @Column(name = "set_of_install_correct_details")
    var setOfInstallCorrectDetails: String? = null

    @Column(name = "nr_plots_correct")
    var nrPlotsCorrect: String? = null

    @Column(name = "correct_score")
    var correctScore: String? = null

    @Column(name = "hetero_geneities")
    var heteroGeneities: String? = null

    @Column(name = "intercrops")
    var intercrops: String? = null

    @Column(name = "border_effects")
    var borderEffects: String? = null

    @Column(name = "trial_quality_incidence_all")
    var trialQualityIncidenceAll: String? = null

    @Column(name = "trial_quality_severity_all")
    var trialQualitySeverityAll: String? = null

    @Column(name = "trial_quality_score_all")
    var trialQualityScoreAll: String? = null

    @Column(name = "trial_quality_some_count")
    var trialQualitySomeCount: String? = null

    @Column(name = "set_of_trial_quality_some")
    var setOfTrialQualitySome: String? = null

    @Column(name = "trial_quality_score")
    var trialQualityScore: String? = null

    @Column(name = "management")
    var management: String? = null

    @Column(name = "embedded")
    var embedded: String? = null

    @Column(name = "buffer_rows")
    var bufferRows: String? = null

    @Column(name = "management_details")
    var managementDetails: String? = null

    @Column(name = "problems_all")
    var problemsAll: String? = null

    @Column(name = "trial_rating_all_count")
    var trialRatingAllCount: String? = null

    @Column(name = "set_of_trialrating_all")
    var setOfTrialratingAll: String? = null

    @Column(name = "problems_some")
    var problemsSome: String? = null

    @Column(name = "trial_rating_some_count")
    var trialRatingSomeCount: String? = null

    @Column(name = "set_of_trial_rating_some")
    var setOfTrialRatingSome: String? = null

    @Column(name = "trial_quality_score_note")
    var trialQualityScoreNote: String? = null

    @Column(name = "trial_rating_note1")
    var trialRatingNote1: String? = null

    @Column(name = "trial_rating_note2")
    var trialRatingNote2: String? = null

    @Column(name = "trial_correct_note1")
    var trialCorrectNote1: String? = null

    @Column(name = "trial_correct_note2")
    var trialCorrectNote2: String? = null

    @Column(name = "trial_validity_note1")
    var trialValidityNote1: String? = null

    @Column(name = "trial_validity_note2")
    var trialValidityNote2: String? = null

    @Column(name = "trial_valid")
    var trialValid: String? = null

    @Column(name = "plot_layout_count")
    var plotLayoutCount: String? = null

    @Column(name = "set_of_plot_layout")
    var setOfPlotLayout: String? = null

    @Column(name = "nr_plants")
    var nrPlants: String? = null

    @Column(name = "maize_plant_height_count")
    var maizePlantHeightCount: String? = null

    @Column(name = "set_of_maize_plant_height")
    var setOfMaizePlantHeight: String? = null

    @Column(name = "leaf_sample_count")
    var leafSampleCount: String? = null

    @Column(name = "set_of_leafsample")
    var setOfLeafsample: String? = null

    @Column(name = "depths")
    var depths: String? = null

    @Column(name = "soil_sample_count")
    var soilSampleCount: String? = null

    @Column(name = "set_of_soilsample")
    var setOfSoilsample: String? = null

    @Column(name = "soil_sample_tool")
    var soilSampleTool: String? = null

    @Column(name = "soil_sample_tool_other")
    var soilSampleToolOther: String? = null

    @Column(name = "position_landscape")
    var positionLandscape: String? = null

    @Column(name = "slope")
    var slope: String? = null

    @Column(name = "generated_table_list_label_166")
    var generatedTableListLabel166: String? = null

    @Column(name = "reserved_name_for_field_list_labels_167")
    var reservedNameForFieldListLabels167: String? = null

    @Column(name = "conservation")
    var conservation: String? = null

    @Column(name = "ridges")
    var ridges: String? = null

    @Column(name = "irrigated")
    var irrigated: String? = null

    @Column(name = "fallow")
    var fallow: String? = null

    @Column(name = "fertilizer")
    var fertilizer: String? = null

    @Column(name = "organicinput")
    var organicinput: String? = null

    @Column(name = "cassava_grown_monocrop")
    var cassavaGrownMonocrop: String? = null

    @Column(name = "cassava_grown_intercrop")
    var cassavaGrownIntercrop: String? = null

    @Column(name = "conservation_measures")
    var conservationMeasures: String? = null

    @Column(name = "distance_between_ridges")
    var distanceBetweenRidges: String? = null

    @Column(name = "width_ridges")
    var widthRidges: String? = null

    @Column(name = "height_ridges")
    var heightRidges: String? = null

    @Column(name = "years_fallow")
    var yearsFallow: String? = null

    @Column(name = "years_since_cassava_monocrop")
    var yearsSinceCassavaMonocrop: String? = null

    @Column(name = "years_since_cassava_intercrop")
    var yearsSinceCassavaIntercrop: String? = null

    @Column(name = "predominant_intercrops")
    var predominantIntercrops: String? = null

    @Column(name = "predominant_intercrops_other")
    var predominantIntercropsOther: String? = null

    @Column(name = "previous_crop")
    var previousCrop: String? = null

    @Column(name = "previous_crop_other")
    var previousCropOther: String? = null

    @Column(name = "previous_other_crops")
    var previousOtherCrops: String? = null

    @Column(name = "previous_other_crops_other")
    var previousOtherCropsOther: String? = null

    @Column(name = "fertilizer_applied")
    var fertilizerApplied: String? = null

    @Column(name = "fertilizer_applied_other")
    var fertilizerAppliedOther: String? = null

    @Column(name = "local_soil_name")
    var localSoilName: String? = null

    @Column(name = "local_soil_name_translated")
    var localSoilNameTranslated: String? = null

    @Column(name = "distance")
    var distance: String? = null

    @Column(name = "fertility_farmer")
    var fertilityFarmer: String? = null

    @Column(name = "fertility_researcher")
    var fertilityResearcher: String? = null

    @Column(name = "drainage")
    var drainage: String? = null

    @Column(name = "soil_depth")
    var soilDepth: String? = null

    @Column(name = "comment", columnDefinition = "TEXT")
    var comment: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}