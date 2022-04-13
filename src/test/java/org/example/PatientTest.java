package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient patient;
    private ContactInfo contactInfo;
    private UserCredentials credentials;

    public void setUp() {
        contactInfo = new ContactInfo("micke@micke.se", "08454345");
        credentials = new UserCredentials("mickeusername", "passwordmicke", "user");
        patient = new Patient("1990-03-02-1234", "Abraham", "Ingelsson", LocalDate.parse("1990-03-02"), contactInfo, credentials);
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

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p1() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("", "Micke", "larsson", LocalDate.parse("1990-02-03"), contactInfo, credentials);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p2() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("199002299", null, "larsson", LocalDate.parse("1990-02-03"), contactInfo, credentials);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p3() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("199002299", "micke", "", LocalDate.parse("1990-02-03"), contactInfo, credentials);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p4() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("199002299", "micke", "Ingelsson", null, contactInfo, credentials);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p5() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("199002299", "micke", "Ingelsson", LocalDate.parse("1990-02-03"), null, credentials);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p6() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient = new Patient("199002299", "micke", "Ingelsson", LocalDate.parse("1990-02-03"), contactInfo, null);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setCredentials() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setCredentials(null);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setSsn() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setSsn("");

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setContactInfo() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setContactInfo(null);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setBirthday() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setBirthday(null);

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setLastName() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setLastName("null");

            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setFirstName() {
        setUp();
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                patient.setFirstName(null);
            }
        });
    }
}