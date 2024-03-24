package com.cdx.frello.user;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
    private String userName;
    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate birthdate;

    private String country;

    private String email;

    private Map<String, String> metadata = new HashMap<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName)
                && Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName)
                && gender == user.gender
                && Objects.equals(birthdate, user.birthdate)
                && Objects.equals(country, user.country)
                && Objects.equals(email, user.email)
                && Objects.equals(metadata, user.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, firstName, lastName, gender, birthdate, country, email, metadata);
    }
}
