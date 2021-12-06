package com.tsobu.ona.database.entities.fielddata

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "field_data_wheat_dg")
@Entity
class WheatDgEntity : BaseEntity() {
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

    @Column(name = "generated_note_name_11")
    var generatedNoteName11: String? = null

    @Column(name = "banner")
    var banner: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "event")
    var event: String? = null

    @Column(name = "generated_note_name_19")
    var generatedNoteName19: String? = null

    @Column(name = "eaid")
    var eaid: String? = null

    @Column(name = "eaidscan")
    var eaidscan: String? = null

    @Column(name = "eaidtext")
    var eaidtext: String? = null

    @Column(name = "generated_note_name_25")
    var generatedNoteName25: String? = null

    @Column(name = "hhid")
    var hhid: String? = null

    @Column(name = "hhidscan")
    var hhidscan: String? = null

    @Column(name = "hhidtext")
    var hhidtext: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "generated_note_name_32")
    var generatedNoteName32: String? = null

    @Column(name = "loc_field")
    var locField: String? = null

    @Column(name = "geopoint_latitude")
    var geopointLatitude: String? = null

    @Column(name = "geopoint_longitude")
    var geopointLongitude: String? = null

    @Column(name = "geopoint_altitude")
    var geopointAltitude: String? = null

    @Column(name = "geopoint_accuracy")
    var geopointAccuracy: String? = null

    @Column(name = "generated_note_name_37")
    var generatedNoteName37: String? = null

    @Column(name = "previous_fertilizer_use")
    var previousFertilizerUse: String? = null

    @Column(name = "fallow")
    var fallow: String? = null

    @Column(name = "last_season_crop")
    var lastSeasonCrop: String? = null

    @Column(name = "crop_residue")
    var cropResidue: String? = null

    @Column(name = "crop_residue_purpose")
    var cropResiduePurpose: String? = null

    @Column(name = "drainage")
    var drainage: String? = null

    @Column(name = "weed_types")
    var weedTypes: String? = null

    @Column(name = "weed_control_methods")
    var weedControlMethods: String? = null

    @Column(name = "soil_type")
    var soilType: String? = null

    @Column(name = "common_diseases")
    var commonDiseases: String? = null

    @Column(name = "generated_note_name_50")
    var generatedNoteName50: String? = null

    @Column(name = "plot_w_con")
    var plotWCon: String? = null

    @Column(name = "plot_l_con")
    var plotLCon: String? = null

    @Column(name = "plot_w_ssr")
    var plotWSsr: String? = null

    @Column(name = "plot_l_ssr")
    var plotLSsr: String? = null

    @Column(name = "plot_w_local")
    var plotWLocal: String? = null

    @Column(name = "plot_l_local")
    var plotLLocal: String? = null

    @Column(name = "plot_size_con")
    var plotSizeCon: String? = null

    @Column(name = "plot_size_ssr")
    var plotSizeSsr: String? = null

    @Column(name = "plot_size_local")
    var plotSizeLocal: String? = null

    @Column(name = "generated_note_name_62")
    var generatedNoteName62: String? = null

    @Column(name = "nr_tillage")
    var nrTillage: String? = null

    @Column(name = "tillage_force")
    var tillageForce: String? = null

    @Column(name = "type_tillage")
    var typeTillage: String? = null

    @Column(name = "generated_note_name_68")
    var generatedNoteName68: String? = null

    @Column(name = "organic_inputs")
    var organicInputs: String? = null

    @Column(name = "organic_input_types")
    var organicInputTypes: String? = null

    @Column(name = "date_organic_inputs")
    var dateOrganicInputs: LocalDateTime? = null

    @Column(name = "organic_inout_amount")
    var organicInoutAmount: String? = null

    @Column(name = "generated_note_name_75")
    var generatedNoteName75: String? = null

    @Column(name = "planting_date")
    var plantingDate: LocalDateTime? = null

    @Column(name = "variety")
    var variety: String? = null

    @Column(name = "variety_name")
    var varietyName: String? = null

    @Column(name = "between_row")
    var betweenRow: String? = null

    @Column(name = "within_row")
    var withinRow: String? = null

    @Column(name = "generated_note_name_83")
    var generatedNoteName83: String? = null

    @Column(name = "date_fertilizer1")
    var dateFertilizer1: LocalDateTime? = null

    @Column(name = "fertilizer1_con")
    var fertilizer1Con: String? = null

    @Column(name = "fertilizer1_ssr")
    var fertilizer1Ssr: String? = null

    @Column(name = "fertilizer1_local")
    var fertilizer1Local: String? = null

    @Column(name = "generated_note_name_90")
    var generatedNoteName90: String? = null

    @Column(name = "generated_note_name_91")
    var generatedNoteName91: String? = null

    @Column(name = "nr_plants_emerg_con")
    var nrPlantsEmergCon: String? = null

    @Column(name = "nr_plants_emerg_ssr")
    var nrPlantsEmergSsr: String? = null

    @Column(name = "nr_plants_emerg_local")
    var nrPlantsEmergLocal: String? = null

    @Column(name = "nr_plants_physio_con")
    var nrPlantsPhysioCon: String? = null

    @Column(name = "nr_plants_physio_ssr")
    var nrPlantsPhysioSsr: String? = null

    @Column(name = "nr_plants_physio_local")
    var nrPlantsPhysioLocal: String? = null

    @Column(name = "generated_note_name_100")
    var generatedNoteName100: String? = null

    @Column(name = "date_fertilizer2")
    var dateFertilizer2: LocalDateTime? = null

    @Column(name = "fertilizer2_con")
    var fertilizer2Con: String? = null

    @Column(name = "fertilizer2_ssr")
    var fertilizer2Ssr: String? = null

    @Column(name = "fertilizer2_local")
    var fertilizer2Local: String? = null

    @Column(name = "physiological_maturity_con_count")
    var physiologicalMaturityConCount: String? = null

    @Column(name = "generated_note_name_107")
    var generatedNoteName107: String? = null

    @Column(name = "nr_productive_tillers_con")
    var nrProductiveTillersCon: String? = null

    @Column(name = "nr_not_priductive_tillers_con")
    var nrNotPriductiveTillersCon: String? = null

    @Column(name = "plantheight_con")
    var plantheightCon: String? = null

    @Column(name = "nr_spikletper_spike_con")
    var nrSpikletperSpikeCon: String? = null

    @Column(name = "physiological_maturity_ssr_count")
    var physiologicalMaturitySsrCount: String? = null

    @Column(name = "generated_note_name_114")
    var generatedNoteName114: String? = null

    @Column(name = "nr_productive_tillers_ssr")
    var nrProductiveTillersSsr: String? = null

    @Column(name = "nr_not_priductive_tillers_ssr")
    var nrNotPriductiveTillersSsr: String? = null

    @Column(name = "plantheight_ssr")
    var plantheightSsr: String? = null

    @Column(name = "nr_spikletper_spike_ssr")
    var nrSpikletperSpikeSsr: String? = null

    @Column(name = "physiological_maturity_local_count")
    var physiologicalMaturityLocalCount: String? = null

    @Column(name = "generated_note_name_121")
    var generatedNoteName121: String? = null

    @Column(name = "nr_productive_tillers_local")
    var nrProductiveTillersLocal: String? = null

    @Column(name = "nr_not_priductive_tillers_local")
    var nrNotPriductiveTillersLocal: String? = null

    @Column(name = "plantheight_local")
    var plantheightLocal: String? = null

    @Column(name = "nr_spikletper_spike_local")
    var nrSpikletperSpikeLocal: String? = null

    @Column(name = "period")
    var period: String? = null

    @Column(name = "nr_weeding")
    var nrWeeding: String? = null

    @Column(name = "generated_note_name_130")
    var generatedNoteName130: String? = null

    @Column(name = "date_weeding1")
    var dateWeeding1: LocalDateTime? = null

    @Column(name = "date_weeding2")
    var dateWeeding2: LocalDateTime? = null

    @Column(name = "date_weeding3")
    var dateWeeding3: LocalDateTime? = null

    @Column(name = "date_weeding4")
    var dateWeeding4: LocalDateTime? = null

    @Column(name = "nr_spraying")
    var nrSpraying: String? = null

    @Column(name = "generated_note_name_138")
    var generatedNoteName138: String? = null

    @Column(name = "date_spraying1")
    var dateSpraying1: LocalDateTime? = null

    @Column(name = "date_spraying2")
    var dateSpraying2: LocalDateTime? = null

    @Column(name = "date_spraying3")
    var dateSpraying3: LocalDateTime? = null

    @Column(name = "date_spraying4")
    var dateSpraying4: LocalDateTime? = null

    @Column(name = "generated_note_name_145")
    var generatedNoteName145: String? = null

    @Column(name = "rate_note")
    var rateNote: String? = null

    @Column(name = "rate_drought_con")
    var rateDroughtCon: String? = null

    @Column(name = "rate_water_logging_con")
    var rateWaterLoggingCon: String? = null

    @Column(name = "rate_erosion_con")
    var rateErosionCon: String? = null

    @Column(name = "rate_lodging_con")
    var rateLodgingCon: String? = null

    @Column(name = "nutrient_deff_con")
    var nutrientDeffCon: String? = null

    @Column(name = "rate_grazing_con")
    var rateGrazingCon: String? = null

    @Column(name = "rate_fire_con")
    var rateFireCon: String? = null

    @Column(name = "rate_pests_con")
    var ratePestsCon: String? = null

    @Column(name = "rate_weeds_con")
    var rateWeedsCon: String? = null

    @Column(name = "rate_plb_con")
    var ratePlbCon: String? = null

    @Column(name = "rate_other_disease_con")
    var rateOtherDiseaseCon: String? = null

    @Column(name = "rate_theft_missing_con")
    var rateTheftMissingCon: String? = null

    @Column(name = "rate_drought_ssr")
    var rateDroughtSsr: String? = null

    @Column(name = "rate_water_logging_ssr")
    var rateWaterLoggingSsr: String? = null

    @Column(name = "rate_erosion_ssr")
    var rateErosionSsr: String? = null

    @Column(name = "rate_lodging_ssr")
    var rateLodgingSsr: String? = null

    @Column(name = "nutrient_deff_ssr")
    var nutrientDeffSsr: String? = null

    @Column(name = "rate_grazing_ssr")
    var rateGrazingSsr: String? = null

    @Column(name = "rate_fire_ssr")
    var rateFireSsr: String? = null

    @Column(name = "rate_pests_ssr")
    var ratePestsSsr: String? = null

    @Column(name = "rate_weeds_ssr")
    var rateWeedsSsr: String? = null

    @Column(name = "rate_plb_ssr")
    var ratePlbSsr: String? = null

    @Column(name = "rate_other_disease_ssr")
    var rateOtherDiseaseSsr: String? = null

    @Column(name = "rate_theft_missing_ssr")
    var rateTheftMissingSsr: String? = null

    @Column(name = "rate_drought_local")
    var rateDroughtLocal: String? = null

    @Column(name = "rate_water_logging_ssr_local")
    var rateWaterLoggingSsrLocal: String? = null

    @Column(name = "rate_erosion_ssr_local")
    var rateErosionSsrLocal: String? = null

    @Column(name = "rate_lodging_local")
    var rateLodgingLocal: String? = null

    @Column(name = "nutrient_deff_local")
    var nutrientDeffLocal: String? = null

    @Column(name = "rate_grazing_local")
    var rateGrazingLocal: String? = null

    @Column(name = "rate_fire_local")
    var rateFireLocal: String? = null

    @Column(name = "rate_pests_local")
    var ratePestsLocal: String? = null

    @Column(name = "rate_weeds_local")
    var rateWeedsLocal: String? = null

    @Column(name = "rate_plb_local")
    var ratePlbLocal: String? = null

    @Column(name = "rate_other_disease_local")
    var rateOtherDiseaseLocal: String? = null

    @Column(name = "rate_theft_missing_local")
    var rateTheftMissingLocal: String? = null

    @Column(name = "generated_note_name_189")
    var generatedNoteName189: String? = null

    @Column(name = "vigor_note")
    var vigorNote: String? = null

    @Column(name = "vigor_con")
    var vigorCon: String? = null

    @Column(name = "vigor_ssr")
    var vigorSsr: String? = null

    @Column(name = "vigor_local")
    var vigorLocal: String? = null

    @Column(name = "generated_note_name_196")
    var generatedNoteName196: String? = null

    @Column(name = "harvest_date_con")
    var harvestDateCon: LocalDateTime? = null

    @Column(name = "above_gr_biomass_con")
    var aboveGrBiomassCon: String? = null

    @Column(name = "rate_grazing_con1")
    var rateGrazingCon1: String? = null

    @Column(name = "rate_lodging_con1")
    var rateLodgingCon1: String? = null

    @Column(name = "rate_theft_missing_con1")
    var rateTheftMissingCon1: String? = null

    @Column(name = "rate_other_disease_con1")
    var rateOtherDiseaseCon1: String? = null

    @Column(name = "rate_pests_con1")
    var ratePestsCon1: String? = null

    @Column(name = "above_gr_biomass_ssr")
    var aboveGrBiomassSsr: String? = null

    @Column(name = "rate_grazing_ssr1")
    var rateGrazingSsr1: String? = null

    @Column(name = "rate_lodging_ssr1")
    var rateLodgingSsr1: String? = null

    @Column(name = "rate_theft_missing_ssr1")
    var rateTheftMissingSsr1: String? = null

    @Column(name = "rate_other_disease_ssr1")
    var rateOtherDiseaseSsr1: String? = null

    @Column(name = "rate_pests_ssr1")
    var ratePestsSsr1: String? = null

    @Column(name = "above_gr_biomass_local")
    var aboveGrBiomassLocal: String? = null

    @Column(name = "rate_grazing_local1")
    var rateGrazingLocal1: String? = null

    @Column(name = "rate_lodging_local1")
    var rateLodgingLocal1: String? = null

    @Column(name = "rate_theft_missing_local1")
    var rateTheftMissingLocal1: String? = null

    @Column(name = "rate_other_disease_local1")
    var rateOtherDiseaseLocal1: String? = null

    @Column(name = "rate_pests_local1")
    var ratePestsLocal1: String? = null

    @Column(name = "generated_note_name_221")
    var generatedNoteName221: String? = null

    @Column(name = "grain_fw_con")
    var grainFwCon: String? = null

    @Column(name = "grain_fw_ssr")
    var grainFwSsr: String? = null

    @Column(name = "grain_fw_local")
    var grainFwLocal: String? = null

    @Column(name = "moisture_con")
    var moistureCon: String? = null

    @Column(name = "moisture_ssr")
    var moistureSsr: String? = null

    @Column(name = "moisture_local")
    var moistureLocal: String? = null

    @Column(name = "tsw_con")
    var tswCon: String? = null

    @Column(name = "tsw_ssr")
    var tswSsr: String? = null

    @Column(name = "tsw_local")
    var tswLocal: String? = null

    @Column(name = "harvest_index_con")
    var harvestIndexCon: String? = null

    @Column(name = "harvest_index_ssr")
    var harvestIndexSsr: String? = null

    @Column(name = "harvest_index_local")
    var harvestIndexLocal: String? = null

    @Column(name = "thankyou")
    var thankyou: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}