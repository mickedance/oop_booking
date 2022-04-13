package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient patient;

    public void setUp(){
        ContactInfo  contactInfo= new ContactInfo("micke@micke.se", "08454345");
        UserCredentials credentials = new UserCredentials("mickeusername", "passwordmicke", "user");
        patient = new Patient("1990-03-02-1234", "Abraham", "Ingelsson", LocalDate.parse("1990-03-02"), contactInfo, credentials );
    }

    @Test
    public void valid_param_should_return_success() {
        setUp();
        assertNotNull(patient);
        assertNotNull(patient.getId());
        assertNotNull(patient.getBirthday());
        assertNotNull(patient.getContactInfo());
        assertNotNull(patient.getCredentials());
        assertNotNull(patient.getFirstName());
        assertNotNull(patient.getLastName());
        assertNotNull(patient.getClass());
    }
}