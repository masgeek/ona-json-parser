package com.tsobu.parser.database.entities

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
@Table(name = "data_val_pp_tz")
class PlantingPracticeTz {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    var id: Long? = null

}