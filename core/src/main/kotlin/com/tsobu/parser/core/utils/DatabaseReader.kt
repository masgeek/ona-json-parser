package com.tsobu.parser.core.utils

import com.tsobu.parser.database.HibernateUtil
import com.tsobu.parser.database.entities.PlantingPracticeTz
import org.hibernate.Session
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Root


class DatabaseReader {

    fun readScoreWeedTable() {
        val session: Session = HibernateUtil.sessionFactory.openSession()
        session.beginTransaction()

        val data = session.createQuery(
                "SELECT a FROM PlantingPracticeTz a",
                PlantingPracticeTz::class.java)
                .resultList

        val list = data
    }

    fun readTable() {
        val session: Session = HibernateUtil.sessionFactory.openSession()
        session.beginTransaction()

        val data = session.createQuery(
                "SELECT a FROM PlantingPracticeTz a",
                PlantingPracticeTz::class.java)
                .resultList

        val list = data
    }

    fun readTableOld() {
        val session: Session = HibernateUtil.sessionFactory.openSession()
        session.beginTransaction()

        val cb = session.criteriaBuilder
        val cr: CriteriaQuery<PlantingPracticeTz> = cb.createQuery(PlantingPracticeTz::class.java)
        val root: Root<PlantingPracticeTz> = cr.from(PlantingPracticeTz::class.java)

        cr.select(root)

        val query = session.createQuery(cr)
        val results: List<PlantingPracticeTz> = query.resultList
        session.close()
    }
}