package com.tsobu.ona.database.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
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

    @Column(name = "column_valid")
    var columnValid: Boolean? = null

    @Column(name = "expected_data_count")
    var expectedDataCount: Int? = null

    @Column(name = "actual_data_count")
    var actualDataCount: Int? = null

    @Column(name = "data_count_valid")
    var dataCountValid: Boolean? = null

    @Column(name = "processed")
    var processed: Boolean? = null

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    var createdAt: LocalDateTime? = null

    @UpdateTimestamp
    @Column(name = "updated_at", insertable = false)
    var updatedAt: LocalDateTime? = null
}