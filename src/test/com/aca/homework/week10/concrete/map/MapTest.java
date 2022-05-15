package com.aca.homework.week10.concrete.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.testng.Assert;

/*
Create MapTest class and write the following methods:

testPutWhenKeyIsNull()
testPutWhenValueIsNull()
testGetValueWhenValueIsNull()
testGetValueWhenKeyIsNotFound() //should return null
testGetValueWhenKeyIsFound() // put a key value pair and assert that the value is correct
testSizeWhenEmpty()
testSizeWhen1PairIsAdded()
 */
class MapTest {
    private Map map;

    @BeforeEach
    public void SetUp() {
        map = new Map();
    }

    @Test
    public void testPutWhenKeyIsNull() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                map.put(null, "text");
            }
        });
    }

    @Test
    public void testPutWhenValueIsNull() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                map.put("text", null);
            }
        });
    }

    @Test
    public void testGetValueWhenValueIsNull() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                map.getValue(null);
            }
        });
    }

    @Test
    public void testGetValueWhenKeyIsNotFound() {//should return null
        KeyValue<String, String>[] anotherArray = new KeyValue[10];
        map.array = anotherArray;
        Assertions.assertNull(map.getValue("sadfas"));
    }

    @Test
    void testGetValueWhenKeyIsFound() {
        KeyValue<String, String>[] anotherArray = new KeyValue[10];
        map.array = anotherArray;
        map.put("key1", "value1");
        map.put("key2", "value2");
        Assertions.assertNull(map.getValue("key2"));
    }

    @Test
    void testSizeWhenEmpty() {
        KeyValue<String, String>[] anotherArray = new KeyValue[10];
        map.array = anotherArray;

        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    void testSizeWhen1PairIsAdded() {
        KeyValue<String, String>[] anotherArray = new KeyValue[10];
        map.array = anotherArray;
        map.put("text1", "value1");

        Assertions.assertFalse(map.isEmpty());
    }

}