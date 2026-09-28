package com.hibernateOneToOne;

import com.hibernateOneToOne.entitis.Passport;
import com.hibernateOneToOne.entitis.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .configure("com/hibernateOneToOne/hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class);

        String databasePassword = System.getenv("HIBERNATE_DB_PASSWORD");
        if (databasePassword != null) {
            configuration.setProperty("hibernate.connection.password", databasePassword);
        }

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Person person = new Person();
            person.setFirstName("John");
            person.setLastName("Doe");
            person.setDateOfBirth(parseDate("1990-01-01"));
            Passport passport = new Passport();
            passport.setPassportNumber("AB" + System.currentTimeMillis());
            passport.setExpiryDate(parseDate("2025-01-01"));
            passport.setPerson(person);

            session.beginTransaction();
            session.persist(person);
            session.persist(passport);
            session.getTransaction().commit();

            System.out.println("Saved person with id: " + person.getId());
        }
    }

    private static java.util.Date parseDate(String value) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(value);
        } catch (ParseException exception) {
            throw new IllegalArgumentException("Invalid date: " + value, exception);
        }
    }
}
