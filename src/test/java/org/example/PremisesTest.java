package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PremisesTest {

    private Premises premises;
    private ContactInfo contactInfo;
    private Address address;

    public void setUp() {
        contactInfo = new ContactInfo("micke@micke.se", "078876");
        address = new Address("Gävle", "sjukhusgatan 12", "20223");
        premises = new Premises("Olga Hospital", address, contactInfo);
    }

    @Test
    public void valid_param_should_return_successfully() {
        setUp();
        assertNotNull(premises);
        assertNotNull(premises.getAddress());
        assertNotNull(premises.getContactInfo());
        assertNotNull(premises.getId());
        assertNotNull(premises.getName());
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p1() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises = new Premises("", address, contactInfo);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p2() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises = new Premises("Micke", null, contactInfo);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p3() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises = new Premises("Micke", address, null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setContactInfo() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises.setContactInfo(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setName() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises.setName(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setAddress() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                premises.setAddress(null);
            }
        });
    }
}