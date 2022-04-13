package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    private Address address;

    public void setUp(){
        address = new Address("Stockholm", "Storsjövägen 22", "13200");
    }

   @Test
    public void valid_params_should_not_be_null(){
       address = new Address("Stockholm","Järvavägen 33",  "10244");
       Assertions.assertNotNull(address);
       Assertions.assertNotNull(address.getCity());
       Assertions.assertNotNull(address.getStreet());
       Assertions.assertNotNull(address.getZipCode());
       Assertions.assertNotNull(address.getClass());
   }
   @Test
    public void non_valid_params_should_throw_exception_p1(){
       assertThrows(RuntimeException.class, new Executable() {
           @Override
           public void execute() throws Throwable {
               address = new Address(null, "järvavägen 22", "10244");
           }
       });
   }
    @Test
    public void non_valid_params_should_throw_exception_p2(){
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                address = new Address("s", "", "10244");
            }
        });
    }
    @Test
    public void non_valid_params_should_throw_exception_p3(){
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                address = new Address("Stockholm", "street", null);
            }
        });
    }
    @Test
    public void setStreet_should_throw_exception_with_non_valid_param(){
       setUp();

       assertThrows(RuntimeException.class, new Executable() {
           @Override
           public void execute() throws Throwable {
               address.setStreet(null);
           }
       });
    }
    @Test
    public void setCity_should_throw_exception_with_non_valid_param(){
        setUp();

        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                address.setCity(null);
            }
        });
    }
    @Test
    public void setZipCode_should_throw_exception_with_non_valid_param(){
        setUp();

        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                address.setZipCode(null);
            }
        });
    }


}