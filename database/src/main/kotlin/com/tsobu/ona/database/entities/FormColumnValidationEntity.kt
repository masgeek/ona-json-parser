package com.tsobu.ona.database.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "form_column_validation")
class FormColumnValidationEntity {


    @Id
    @Column(name = "form_name", nullable = false)
    var formName: String? = null

    @Column(name = "expected_column_count")
    var expectedColumnCount: Int? = null

    @Column(name = "actual_column_count")
    var actualColumnCount: Int? = null

    @Column(name = "expected_file_size_kb")
    var expectedFileSizeKb: Long? = null

    @Column(name = "actual_file_size_kb")
    var actualFileSizeKb: Long? = null

    @Column(name = "is_valid")
    var valid: Boolean? = null

    @Column(name = "processed")
    var processed: Boolean? = null
}