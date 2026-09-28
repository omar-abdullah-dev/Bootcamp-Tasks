package com.hibernateOneToOne;

import com.hibernateOneToOne.entitis.Passport;
import com.hibernateOneToOne.entitis.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .configure("com/hibernateOneToOne/hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
    Transaction transaction = null;

    try {
        transaction = session.beginTransaction();

        Passport passport = new Passport();
        passport.setPassportNumber("AB" + System.currentTimeMillis());
        passport.setExpiryDate(parseDate("2025-01-01"));

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setDateOfBirth(parseDate("1990-01-01"));
        person.setPassport(passport);

        session.persist(person);

        transaction.commit();
        System.out.println("Saved person with id: " + person.getId());
        System.out.println(person);
    } catch (Exception exception) {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        throw exception;
    }

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
