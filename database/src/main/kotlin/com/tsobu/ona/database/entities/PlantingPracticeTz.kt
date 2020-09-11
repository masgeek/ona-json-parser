package com.tsobu.ona.database.entities

import com.tsobu.ona.database.entities.BaseEntity
import org.hibernate.annotations.GenericGenerator
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Suppress("unused")
@Entity
@Table(name = "data_val_pp_tz")
class PlantingPracticeTz : BaseEntity() {

    var eaid: String? = null
    var hhid: String? = null
    var zone: String? = null
    var tags: String? = null
    var uid: String? = null
    var email: String? = null
    var today: Date? = null
    var start: Timestamp? = null
    var end: Timestamp? = null
    var notes: String? = null
    var edited: String? = null
    var status: String? = null
    var comment: String? = null
    var country: String? = null
    var version: String? = null
    var currency: String? = null
    var deviceId: String? = null
    var geoPoint: String? = null
    var userName: String? = null
    var duration: String? = null
    var xFormId: String? = null
    var locField: String? = null
    var simSerial: String? = null
    var conversion: String? = null
    var phoneNumber: String? = null
    var attachments: String? = null
    var geoLocation: String? = null
    var mediaCount: String? = null
    var totalMedia: String? = null
    var formHubUuId: String? = null
    var subscriberId: String? = null
    var submittedBy: String? = null
    var purposeEvent: String? = null
    var metaInstanceId: String? = null
    var submissionTime: String? = null
    var xformIdString: String? = null
    var controlTreatment: String? = null
    var bambooDatasetId: String? = null
    var mediaAllReceived: String? = null
    var inputs1OrgInputs1: String? = null
    var inputs1Fertilizer1: String? = null
    var plantingDetailsVariety: String? = null
    var plotLayoutP1PlotL1P1: String? = null
    var plotLayoutP1PlotL2P1: String? = null
    var plotLayoutP1PlotW1P1: String? = null
    var plotLayoutP1PlotW2P1: String? = null
    var plotLayoutP2PlotL1P2: String? = null
    var plotLayoutP2PlotL2P2: String? = null
    var plotLayoutP2PlotW1P2: String? = null
    var plotLayoutP2PlotW2P2: String? = null
    var plotLayoutP3PlotL1P3: String? = null
    var plotLayoutP3PlotL2P3: String? = null
    var plotLayoutP3PlotW1P3: String? = null
    var plotLayoutP3PlotW2P3: String? = null
    var plotLayoutP4PlotL1P4: String? = null
    var plotLayoutP4PlotL2P4: String? = null
    var plotLayoutP4PlotW1P4: String? = null
    var plotLayoutP4PlotW2P4: String? = null
    var weedAssessmentP1Count: String? = null
    var weedAssessmentP2Count: String? = null
    var weedAssessmentP3Count: String? = null
    var weedAssessmentP4Count: String? = null
    var weedAssessmentP5Count: String? = null
    var weedAssessmentP6Count: String? = null
    var landPreparationClearing: String? = null
    var landPreparationVegetation: String? = null
    var confirmTreatmentsConfirmP1: String? = null
    var confirmTreatmentsConfirmP2: String? = null
    var confirmTreatmentsConfirmP3: String? = null
    var confirmTreatmentsConfirmP4: String? = null
    var plantingDetailsPlantingDate: String? = null
    var landPrepationDetailsRidgingMethod: String? = null
    var landPrepationDetailsTillageMethod: String? = null
}