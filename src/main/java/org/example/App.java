package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    private static BookingTime bookingTime;
    private static Patient patient;
    private static Premises premises;
    private static UserCredentials userCredentials;
    private static Address address;
    private static ContactInfo contactInfoPremises;
    private static ContactInfo contactInfoPatient;

    public static void setUp() {
        address = new Address("Stockholm", "street12", "10222");
        contactInfoPremises = new ContactInfo("premises@email.com", "080");
        contactInfoPatient = new ContactInfo("mick@email.com", "0803458");
        userCredentials = new UserCredentials("username", "password", "user");
        premises = new Premises("Olga hospital", address, contactInfoPremises);
        patient = new Patient("1992", "Micke", "eriksson", LocalDate.parse("1990-02-02"), contactInfoPatient, userCredentials);
        bookingTime = new BookingTime(LocalDateTime.parse("2022-03-02T12:00"), 0, "nope", "v002", true, patient, premises);
    }

    public static void main(String[] args) {
        setUp();
        System.out.println(bookingTime.toString().replace(",", "\n"));
    }
}
