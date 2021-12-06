package com.tsobu.ona.database.entities.validation

import com.tsobu.ona.database.entities.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "choice_validation_kano_kaduna")
@Entity
class ChoiceValidationKanoKadunaEntity : BaseEntity() {
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

    @Column(name = "farmeradress_state")
    var farmeradressState: String? = null

    @Column(name = "farmeradress_crops")
    var farmeradressCrops: String? = null

    @Column(name = "farmeradress_generated_note_name_15")
    var farmeradressGeneratedNoteName15: String? = null

    @Column(name = "farmeradress_eaid")
    var farmeradressEaid: String? = null

    @Column(name = "farmeradress_hhid")
    var farmeradressHhid: String? = null

    @Column(name = "farmeradress_first_crop")
    var farmeradressFirstCrop: String? = null

    @Column(name = "farmeradress_second_crop")
    var farmeradressSecondCrop: String? = null

    @Column(name = "farmeradress_cropesta")
    var farmeradressCropesta: String? = null

    @Column(name = "farmeradress_plm")
    var farmeradressPlm: String? = null

    @Column(name = "farmeradress_crop1area")
    var farmeradressCrop1area: String? = null

    @Column(name = "farmeradress_crop2area")
    var farmeradressCrop2area: String? = null

    @Column(name = "farmeradress_npk_price")
    var farmeradressNpkPrice: String? = null

    @Column(name = "farmeradress_urea_price")
    var farmeradressUreaPrice: String? = null

    @Column(name = "farmeradress_lookup_1a")
    var farmeradressLookup1a: String? = null

    @Column(name = "farmeradress_lookup_1b")
    var farmeradressLookup1b: String? = null

    @Column(name = "farmeradress_lookup_1c")
    var farmeradressLookup1c: String? = null

    @Column(name = "farmeradress_lookup_2a")
    var farmeradressLookup2a: String? = null

    @Column(name = "farmeradress_lookup_2b")
    var farmeradressLookup2b: String? = null

    @Column(name = "farmeradress_lookup_2c")
    var farmeradressLookup2c: String? = null

    @Column(name = "farmeradress_crop1_low_npk")
    var farmeradressCrop1LowNpk: String? = null

    @Column(name = "farmeradress_crop1_low_urea")
    var farmeradressCrop1LowUrea: String? = null

    @Column(name = "farmeradress_crop1_low_tc")
    var farmeradressCrop1LowTc: String? = null

    @Column(name = "farmeradress_crop1_low_ty")
    var farmeradressCrop1LowTy: String? = null

    @Column(name = "farmeradress_crop1_medium_npk")
    var farmeradressCrop1MediumNpk: String? = null

    @Column(name = "farmeradress_crop1_medium_urea")
    var farmeradressCrop1MediumUrea: String? = null

    @Column(name = "farmeradress_crop1_medium_tc")
    var farmeradressCrop1MediumTc: String? = null

    @Column(name = "farmeradress_crop1_medium_ty")
    var farmeradressCrop1MediumTy: String? = null

    @Column(name = "farmeradress_crop1_high_npk")
    var farmeradressCrop1HighNpk: String? = null

    @Column(name = "farmeradress_crop1_high_urea")
    var farmeradressCrop1HighUrea: String? = null

    @Column(name = "farmeradress_crop1_high_tc")
    var farmeradressCrop1HighTc: String? = null

    @Column(name = "farmeradress_crop1_high_ty")
    var farmeradressCrop1HighTy: String? = null

    @Column(name = "farmeradress_crop2_low_npk")
    var farmeradressCrop2LowNpk: String? = null

    @Column(name = "farmeradress_crop2_low_urea")
    var farmeradressCrop2LowUrea: String? = null

    @Column(name = "farmeradress_crop2_low_tc")
    var farmeradressCrop2LowTc: String? = null

    @Column(name = "farmeradress_crop2_low_ty")
    var farmeradressCrop2LowTy: String? = null

    @Column(name = "farmeradress_crop2_medium_npk")
    var farmeradressCrop2MediumNpk: String? = null

    @Column(name = "farmeradress_crop2_medium_urea")
    var farmeradressCrop2MediumUrea: String? = null

    @Column(name = "farmeradress_crop2_medium_tc")
    var farmeradressCrop2MediumTc: String? = null

    @Column(name = "farmeradress_crop2_medium_ty")
    var farmeradressCrop2MediumTy: String? = null

    @Column(name = "farmeradress_crop2_high_npk")
    var farmeradressCrop2HighNpk: String? = null

    @Column(name = "farmeradress_crop2_high_urea")
    var farmeradressCrop2HighUrea: String? = null

    @Column(name = "farmeradress_crop2_high_tc")
    var farmeradressCrop2HighTc: String? = null

    @Column(name = "farmeradress_crop2_high_ty")
    var farmeradressCrop2HighTy: String? = null

    @Column(name = "farmeradress_crop1low_yi")
    var farmeradressCrop1lowYi: String? = null

    @Column(name = "farmeradress_crop1low_ybag")
    var farmeradressCrop1lowYbag: String? = null

    @Column(name = "farmeradress_crop1low_quantity_npk")
    var farmeradressCrop1lowQuantityNpk: String? = null

    @Column(name = "farmeradress_crop1low_quantity_urea")
    var farmeradressCrop1lowQuantityUrea: String? = null

    @Column(name = "farmeradress_crop1low_tc1")
    var farmeradressCrop1lowTc1: String? = null

    @Column(name = "farmeradress_crop1low_tc2")
    var farmeradressCrop1lowTc2: String? = null

    @Column(name = "farmeradress_crop1low_tc")
    var farmeradressCrop1lowTc: String? = null

    @Column(name = "farmeradress_crop2low_yi")
    var farmeradressCrop2lowYi: String? = null

    @Column(name = "farmeradress_crop2low_ybag")
    var farmeradressCrop2lowYbag: String? = null

    @Column(name = "farmeradress_crop2low_quantity_npk")
    var farmeradressCrop2lowQuantityNpk: String? = null

    @Column(name = "farmeradress_crop2low_quantity_urea")
    var farmeradressCrop2lowQuantityUrea: String? = null

    @Column(name = "farmeradress_crop2low_tc1")
    var farmeradressCrop2lowTc1: String? = null

    @Column(name = "farmeradress_crop2low_tc2")
    var farmeradressCrop2lowTc2: String? = null

    @Column(name = "farmeradress_crop2low_tc")
    var farmeradressCrop2lowTc: String? = null

    @Column(name = "farmeradress_crop1medium_yi")
    var farmeradressCrop1mediumYi: String? = null

    @Column(name = "farmeradress_crop1medium_ybag")
    var farmeradressCrop1mediumYbag: String? = null

    @Column(name = "farmeradress_crop1medium_quantity_npk")
    var farmeradressCrop1mediumQuantityNpk: String? = null

    @Column(name = "farmeradress_crop1medium_quantity_urea")
    var farmeradressCrop1mediumQuantityUrea: String? = null

    @Column(name = "farmeradress_crop1medium_tc1")
    var farmeradressCrop1mediumTc1: String? = null

    @Column(name = "farmeradress_crop1medium_tc2")
    var farmeradressCrop1mediumTc2: String? = null

    @Column(name = "farmeradress_crop1medium_tc")
    var farmeradressCrop1mediumTc: String? = null

    @Column(name = "farmeradress_crop2medium_yi")
    var farmeradressCrop2mediumYi: String? = null

    @Column(name = "farmeradress_crop2medium_ybag")
    var farmeradressCrop2mediumYbag: String? = null

    @Column(name = "farmeradress_crop2medium_quantity_npk")
    var farmeradressCrop2mediumQuantityNpk: String? = null

    @Column(name = "farmeradress_crop2medium_quantity_urea")
    var farmeradressCrop2mediumQuantityUrea: String? = null

    @Column(name = "farmeradress_crop2medium_tc1")
    var farmeradressCrop2mediumTc1: String? = null

    @Column(name = "farmeradress_crop2medium_tc2")
    var farmeradressCrop2mediumTc2: String? = null

    @Column(name = "farmeradress_crop2medium_tc")
    var farmeradressCrop2mediumTc: String? = null

    @Column(name = "farmeradress_crop1high_yi")
    var farmeradressCrop1highYi: String? = null

    @Column(name = "farmeradress_crop1high_ybag")
    var farmeradressCrop1highYbag: String? = null

    @Column(name = "farmeradress_crop1high_quantity_npk")
    var farmeradressCrop1highQuantityNpk: String? = null

    @Column(name = "farmeradress_crop1high_quantity_urea")
    var farmeradressCrop1highQuantityUrea: String? = null

    @Column(name = "farmeradress_crop1high_tc1")
    var farmeradressCrop1highTc1: String? = null

    @Column(name = "farmeradress_crop1high_tc2")
    var farmeradressCrop1highTc2: String? = null

    @Column(name = "farmeradress_crop1high_tc")
    var farmeradressCrop1highTc: String? = null

    @Column(name = "farmeradress_crop2high_yi")
    var farmeradressCrop2highYi: String? = null

    @Column(name = "farmeradress_crop2high_ybag")
    var farmeradressCrop2highYbag: String? = null

    @Column(name = "farmeradress_crop2high_quantity_npk")
    var farmeradressCrop2highQuantityNpk: String? = null

    @Column(name = "farmeradress_crop2high_quantity_urea")
    var farmeradressCrop2highQuantityUrea: String? = null

    @Column(name = "farmeradress_crop2high_tc1")
    var farmeradressCrop2highTc1: String? = null

    @Column(name = "farmeradress_crop2high_tc2")
    var farmeradressCrop2highTc2: String? = null

    @Column(name = "farmeradress_crop2high_tc")
    var farmeradressCrop2highTc: String? = null

    @Column(name = "farmeradress_ricelowbags")
    var farmeradressRicelowbags: String? = null

    @Column(name = "farmeradress_ricemediumbags")
    var farmeradressRicemediumbags: String? = null

    @Column(name = "farmeradress_ricehighbags")
    var farmeradressRicehighbags: String? = null

    @Column(name = "farmeradress_maizelowbags")
    var farmeradressMaizelowbags: String? = null

    @Column(name = "farmeradress_maizemediumbags")
    var farmeradressMaizemediumbags: String? = null

    @Column(name = "farmeradress_maizehighbags")
    var farmeradressMaizehighbags: String? = null

    @Column(name = "farmeradress_cassavalowbags")
    var farmeradressCassavalowbags: String? = null

    @Column(name = "farmeradress_cassavamediumbags")
    var farmeradressCassavamediumbags: String? = null

    @Column(name = "farmeradress_cassavahighbags")
    var farmeradressCassavahighbags: String? = null

    @Column(name = "farmeradress_ricelowbags2")
    var farmeradressRicelowbags2: String? = null

    @Column(name = "farmeradress_ricemediumbags2")
    var farmeradressRicemediumbags2: String? = null

    @Column(name = "farmeradress_ricehighbags2")
    var farmeradressRicehighbags2: String? = null

    @Column(name = "farmeradress_maizelowbags2")
    var farmeradressMaizelowbags2: String? = null

    @Column(name = "farmeradress_maizemediumbags2")
    var farmeradressMaizemediumbags2: String? = null

    @Column(name = "farmeradress_maizehighbags2")
    var farmeradressMaizehighbags2: String? = null

    @Column(name = "farmeradress_cassavalowbags2")
    var farmeradressCassavalowbags2: String? = null

    @Column(name = "farmeradress_cassavamediumbags2")
    var farmeradressCassavamediumbags2: String? = null

    @Column(name = "farmeradress_cassavahighbags2")
    var farmeradressCassavahighbags2: String? = null

    @Column(name = "farmeradress_crop1low_ybagc")
    var farmeradressCrop1lowYbagc: String? = null

    @Column(name = "farmeradress_crop1medium_ybagc")
    var farmeradressCrop1mediumYbagc: String? = null

    @Column(name = "farmeradress_crop1high_ybagc")
    var farmeradressCrop1highYbagc: String? = null

    @Column(name = "farmeradress_crop2low_ybagc")
    var farmeradressCrop2lowYbagc: String? = null

    @Column(name = "farmeradress_crop2medium_ybagc")
    var farmeradressCrop2mediumYbagc: String? = null

    @Column(name = "farmeradress_crop2high_ybagc")
    var farmeradressCrop2highYbagc: String? = null

    @Column(name = "farmeradress_c1_showoption3")
    var farmeradressC1Showoption3: String? = null

    @Column(name = "farmeradress_c2_showoption3")
    var farmeradressC2Showoption3: String? = null

    @Column(name = "firstcropoptions_first_crop_packagenote")
    var firstcropoptionsFirstCropPackagenote: String? = null

    @Column(name = "firstcropoptions_first_crop_package1")
    var firstcropoptionsFirstCropPackage1: String? = null

    @Column(name = "firstcropoptions_first_crop_package2")
    var firstcropoptionsFirstCropPackage2: String? = null

    @Column(name = "firstcropoptions_first_crop_package3")
    var firstcropoptionsFirstCropPackage3: String? = null

    @Column(name = "secondcropoptions_first_crop_package")
    var secondcropoptionsFirstCropPackage: String? = null

    @Column(name = "secondcropoptions_second_crop_packagenote")
    var secondcropoptionsSecondCropPackagenote: String? = null

    @Column(name = "secondcropoptions_second_crop_package1")
    var secondcropoptionsSecondCropPackage1: String? = null

    @Column(name = "secondcropoptions_second_crop_package2")
    var secondcropoptionsSecondCropPackage2: String? = null

    @Column(name = "secondcropoptions_second_crop_package3")
    var secondcropoptionsSecondCropPackage3: String? = null

    @Column(name = "secondcropoptions_second_crop_package")
    var secondcropoptionsSecondCropPackage: String? = null

    @Column(name = "recommendations_first_crop_package_fip3")
    var recommendationsFirstCropPackageFip3: String? = null

    @Column(name = "recommendations_first_crop_package_fip_kaduna")
    var recommendationsFirstCropPackageFipKaduna: String? = null

    @Column(name = "recommendations_second_crop_package_fip3")
    var recommendationsSecondCropPackageFip3: String? = null

    @Column(name = "recommendations_second_crop_package_fip_kano")
    var recommendationsSecondCropPackageFipKano: String? = null

    @Column(name = "recommendations_first_crop_package_npk")
    var recommendationsFirstCropPackageNpk: String? = null

    @Column(name = "recommendations_first_crop_package_fip_npk")
    var recommendationsFirstCropPackageFipNpk: String? = null

    @Column(name = "recommendations_first_crop_package_urea")
    var recommendationsFirstCropPackageUrea: String? = null

    @Column(name = "recommendations_first_crop_package_fip_urea")
    var recommendationsFirstCropPackageFipUrea: String? = null

    @Column(name = "recommendations_second_crop_package_npk")
    var recommendationsSecondCropPackageNpk: String? = null

    @Column(name = "recommendations_second_crop_package_fip_npk")
    var recommendationsSecondCropPackageFipNpk: String? = null

    @Column(name = "recommendations_second_crop_package_urea")
    var recommendationsSecondCropPackageUrea: String? = null

    @Column(name = "recommendations_second_crop_package_fip_urea")
    var recommendationsSecondCropPackageFipUrea: String? = null

    @Column(name = "recommendations_farmersplotcrop1")
    var recommendationsFarmersplotcrop1: String? = null

    @Column(name = "recommendations_validationplotcrop1")
    var recommendationsValidationplotcrop1: String? = null

    @Column(name = "recommendations_farmersplotcrop2")
    var recommendationsFarmersplotcrop2: String? = null

    @Column(name = "recommendations_validationplotcrop2")
    var recommendationsValidationplotcrop2: String? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column(name = "instance_id")
    var instanceId: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null
}