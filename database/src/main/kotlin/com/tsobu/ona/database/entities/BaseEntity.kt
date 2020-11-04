package com.tsobu.ona.database.entities

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@MappedSuperclass
open class BaseEntity {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    var id: Long? = null

//    @CreationTimestamp
//    @Column(name = "created_at", updatable = false, nullable = false)
//    var createdAt: LocalDateTime? = null
//
//    @UpdateTimestamp
//    @Column(name = "updated_at", insertable = false)
//    var updatedAt: LocalDateTime? = null
}