package com.aca.homework.week12.params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class UserCreateParamsTest {

    @Test
    void testAge(){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams("Hayk001","Hayk",0));
            }
        });
    }

    @Test
    void testUsername(){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams(null,"Hayk",22));
            }
        });
    }
    @Test
    void testFirstName(){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams("Hayk001",null,22));
            }
        });
    }
    @Test
    void test(){
        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams("Hayk001","Hayk",22));
            }
        }, "The age is inadmissible");
        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams("Hayk001","Hayk",22));
            }
        }, "The username is null!!");
        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                new UserCreateParams(new UserUpdateParams("Hayk001","Hayk",22));
            }
        }, "The firstName is null!!");
    }

}