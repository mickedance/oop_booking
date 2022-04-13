package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserCredentialsTest {

    private UserCredentials credentials;

    public void setUp() {
        credentials = new UserCredentials("mickeusername", "1234", "user");
    }

    @Test
    public void valid_param_should_return_success_object() {
        setUp();

        assertNotNull(credentials);
        assertNotNull(credentials.getId());
        assertNotNull(credentials.getPassword());
        assertNotNull(credentials.getRole());
        assertNotNull(credentials.getUsername());
        assertNotNull(credentials.getClass());
    }

    @Test
    public void invalid_param_should_throw_exception_p1() {
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials = new UserCredentials("", "1213", "user");
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_p2() {
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials = new UserCredentials("username", null, "user");
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_p3() {
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials = new UserCredentials("username", "password", null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setRole() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials.setRole(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setUsername() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials.setUsername(null);
            }
        });
    }

    @Test
    public void invalid_param_should_throw_exception_in_setPassword() {
        setUp();
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                credentials.setPassword(null);
            }
        });
    }
}