package com.aca.homework.week9.generic.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Create a ArrayListTest class and test add, get and size method for String, Integer generic types.
 */
class ArrayListTest {

    @Test
    void testAddGet() {
        ArrayList<String> arrayListForStrings = new ArrayList<>();
        ArrayList<Integer> arrayListForIntegers = new ArrayList<>();
        arrayListForStrings.add("abd");
        arrayListForStrings.add("bbb");
        arrayListForIntegers.add(45);
        arrayListForIntegers.add(29);

        Assertions.assertEquals("abd", arrayListForStrings.get(0));
        Assertions.assertEquals("bbb", arrayListForStrings.get(1));
        Assertions.assertEquals(45, arrayListForIntegers.get(0));
        Assertions.assertEquals(29, arrayListForIntegers.get(1));
        Assertions.assertEquals(2, arrayListForStrings.size());
        Assertions.assertEquals(2, arrayListForIntegers.size());


    }

    @Test
    void testSize() {

    }
}