package com.hibernateOneToOne.entitis;

import javax.persistence.*;
import java.util.Date;
@Table(name = "passport")
@Entity
public class Passport {
  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

  @Column(name = "passport_no")
    private String passportNumber;

  @Temporal(TemporalType.DATE)
    @Column(name = "expiry_date")
    private Date expiryDate;

    public Passport() {
    }

    public Passport(Person person, String passportNumber, Date expiryDate) {
        this.person = person;
        this.passportNumber = passportNumber;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
