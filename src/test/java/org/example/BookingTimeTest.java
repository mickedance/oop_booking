package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingTimeTest {

    private BookingTime bookingTime;
    private Patient patient;
    private Premises premises;
    private UserCredentials userCredentials;
    private Address address;
    private ContactInfo contactInfoPremises;
    private ContactInfo contactInfoPatient;

    public void setUp() {
        address = new Address("Stockholm", "street12", "10222");
        contactInfoPremises = new ContactInfo("premises@email.com", "080");
        contactInfoPatient = new ContactInfo("mick@email.com", "0803458");
        userCredentials = new UserCredentials("username", "password", "user");
        premises = new Premises("Olga hospital", address, contactInfoPremises);
        patient = new Patient("1992", "Micke", "eriksson", LocalDate.parse("1990-02-02"), contactInfoPatient, userCredentials);
        bookingTime = new BookingTime(LocalDateTime.parse("2022-03-02T12:00"), 0, "nope", "v002", true, patient, premises);
    }

    @Test
    public void valid_param_should_return_successObject() {
        setUp();
        assertNotNull(bookingTime);
        assertNotNull(bookingTime.getDateTime());
        assertNotNull(bookingTime.getAdministrator());
        assertNotNull(bookingTime.getId());
        assertNotNull(bookingTime.getPatient());
        assertNotNull(bookingTime.getPremises());
        assertNotNull(bookingTime.getPrice());
        assertNotNull(bookingTime.getVaccineId());
        assertNotNull(bookingTime.getClass());
        assertNotNull(bookingTime.isVacant());
    }

    @Test
    public void invalid_param_in_constructor_should_throw_exception_p1() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime = new BookingTime(null, 0, "nope", "v002", true, patient, premises);
            }
        });
    }

    @Test
    public void invalid_param_in_constructor_should_throw_exception_p3() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime = new BookingTime(LocalDateTime.parse("1900-02-02T10:00"), 0, "", "v002", true, patient, premises);
            }
        });
    }

    @Test
    public void invalid_param_in_constructor_should_throw_exception_p4() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime = new BookingTime(LocalDateTime.parse("1900-02-02T10:00"), 0, "nope", null, true, patient, premises);
            }
        });
    }

    @Test
    public void invalid_param_in_constructor_should_throw_exception_p7() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime = new BookingTime(LocalDateTime.parse("1900-02-02T10:00"), 0, "nope", "v002", true, patient, null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setPremises() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime.setPremises(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setDateTime() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime.setDateTime(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setAdministrator() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime.setAdministrator(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setVaccineId() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                bookingTime.setVaccineId(null);
            }
        });
    }
}