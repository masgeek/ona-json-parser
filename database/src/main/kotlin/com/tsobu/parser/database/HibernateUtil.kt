package com.tsobu.parser.database

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration
import java.io.File

object HibernateUtil {
    val sessionFactory = buildSessionFactory()
    private fun buildSessionFactory(): SessionFactory {
        val classLoader = javaClass.classLoader
        val configFile = classLoader.getResource("hibernate.cfg.xml").file

        return try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration().configure(File(configFile)).buildSessionFactory()
        } catch (ex: Throwable) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed.$ex")
            throw ExceptionInInitializerError(ex)
        }
    }

    fun shutdown() {
        // Close caches and connection pools
        sessionFactory.close()
    }
}