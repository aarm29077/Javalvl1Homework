package com.aca.classwork.classwork14.exception;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MainTest {

    @Test
    public void test() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {   //stugum e stex grvacy kancheluc exception qcume te voch
                Main.main(null);
            }
        });
    }

}