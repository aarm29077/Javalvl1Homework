package com.aca.classwork.classwork13.concat;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongConcatenatorTest {

    private LongConcatenator testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new LongConcatenator();
    }
    @Test
    void test2Numbers() {
        Assertions.assertEquals("1050",testSubject.concat(10,50));
//        testSubject.concat(10,50);
    }

//    public static void main(String[] args) {
//
//
////        LongConcatenator testSubject = new LongConcatenator();
////        System.out.println(testSubject.concat(546, 846));
//    }

}