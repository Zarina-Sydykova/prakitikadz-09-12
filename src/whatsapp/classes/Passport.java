package whatsapp.classes;
import whatsapp.enums.Gender;
import whatsapp.enums.Region;

import java.time.LocalDate;

public class Passport {
    private Long Id;
    private String surName;
    private String firstName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private Region region;

    public Passport(Long id, String surName, String firstName, LocalDate dateOfBirth, Gender gender, int region) {
        Id = id;
        this.surName = surName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.region = region;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Id=" + Id +
                ", surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", region=" + region +
                '}';
    }
}
