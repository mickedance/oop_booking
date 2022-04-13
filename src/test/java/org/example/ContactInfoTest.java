package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ContactInfoTest {

    private ContactInfo contactInfo;

    public void setUp() {
        contactInfo = new ContactInfo("mick@eriksson.se", "34334");
    }

    @Test
    public void valid_param_should_return_success() {
        setUp();
        assertNotNull(contactInfo);
        assertNotNull(contactInfo.getId());
        assertNotNull(contactInfo.getEmail());
        assertNotNull(contactInfo.getPhone());
        assertNotNull(contactInfo.getClass());
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p1() {

        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                contactInfo = new ContactInfo(null, "0703434");
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_constructor_p2() {

        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                contactInfo = new ContactInfo("micke@joakim.se", null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setEmail() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                contactInfo.setEmail("");
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setPhone() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                contactInfo.setPhone("");
            }
        });
    }
}