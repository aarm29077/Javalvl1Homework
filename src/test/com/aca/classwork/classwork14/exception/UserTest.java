package com.aca.classwork.classwork14.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @Test
    public void testWhenUsernameIsNull() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User(null, "first name");

            }
        });

        Assertions.assertEquals("the username is null", exception.getMessage());
        System.out.println(exception.getMessage());
    }

    @Test
    public void testWhenFirstNameIsNull() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User("lkjkhgtf", null);

            }
        });

        Assertions.assertEquals(exception.getMessage(), "the firstName is null");
//        System.out.println(exception.getMessage());
    }

}