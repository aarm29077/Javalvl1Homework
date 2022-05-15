package com.aca.homework.week10.concrete.map;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Create a Map class that has the following methods:

void put(@NotNull String key, @NotNull String value);
String getValue(@NotNull String key);
int size();
boolean isEmpty();

A user can add a value for the given key and retrieve it back.

@NotNull annotation should be created too.
e.g a user can put "+3743743743" as a value for the "Java Help Centre Phone Number" key.

Create MapTest class and write the following methods:

testPutWhenKeyIsNull()
testPutWhenValueIsNull()
testGetValueWhenValueIsNull()
testGetValueWhenKeyIsNotFound() //should return null
testGetValueWhenKeyIsFound() // put a key value pair and assert that the value is correct
testSizeWhenEmpty()
testSizeWhen1PairIsAdded()
 */
public class Map {
    private int capacity = 10;
    KeyValue<String, String>[] array;
    private int count = 0;

    public Map() {
        array = new KeyValue[capacity];
    }

    void put(@NotNull String key, @NotNull String value) {
        if (key == null) {
            throw new RuntimeException("The key is null!!!");
        }
        if (value == null) {
            throw new RuntimeException("The value is null!!!");
        }
        if (count >= capacity) {
            KeyValue<String, String>[] newArray = new KeyValue[capacity * 2];
            for (int i = 0; i < array.length; i++) {
                array[i] = newArray[i];
            }
            array = newArray;
        }
        array[count].setKey(key);
        array[count].setValue(value);
        ++count;
    }

    public String getValue(@NotNull String key) {
        if (key == null) {
            throw new RuntimeException("The key is null!!!");
        }
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i].getKey(), key)) {
                return array[i].getValue();
            }
        }
        System.out.println("There isn't any object whose key is " + key);
        return null;
    }


    int size() {
        return count;
    }

    boolean isEmpty() {
        return array[0] == null;
    }

}
