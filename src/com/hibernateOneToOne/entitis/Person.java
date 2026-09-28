package com.hibernateOneToOne.entitis;

import javax.persistence.*;
import java.util.Date;
@Table(name = "person")
@Entity
public class Person {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "first_name")
    private String firstName;

   @Column(name = "last_name")
    private String lastName;


    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

   @OneToOne(mappedBy = "person")
    private Passport passport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
