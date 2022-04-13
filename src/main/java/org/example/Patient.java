package org.example;

import java.time.LocalDate;
import java.util.UUID;

public class Patient {

    private String id;
    private String ssn;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private ContactInfo contactInfo;
    private UserCredentials credentials;

    public Patient(String ssn, String firstName, String lastName, LocalDate birthday, ContactInfo contactInfo, UserCredentials credentials) {
        this.id = UUID.randomUUID().toString();
        setSsn(ssn);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setContactInfo(contactInfo);
        setCredentials(credentials);
    }

    public String getId() {
        return id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.equals("")) throw new IllegalArgumentException("Param: ssn cannot be null");
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals(""))
            throw new IllegalArgumentException("Param: firstName cannot be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals(""))
            throw new IllegalArgumentException("Param: lastName cannot be null");
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday == null) throw new IllegalArgumentException("Param: birthday cannot be null");
        this.birthday = birthday;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        if (contactInfo == null) throw new IllegalArgumentException("Param: contactInfo cannot be null");
        this.contactInfo = contactInfo;
    }

    public UserCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(UserCredentials credentials) {
        if (credentials == null) throw new IllegalArgumentException("Param: credentials cannot be null");
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", contactInfo=" + contactInfo +
                ", credentials=" + credentials +
                '}';
    }
}
