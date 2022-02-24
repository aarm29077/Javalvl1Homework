package com.aca.homework.week6.list;

public class ArrayList implements List {
    private int capacity;
    private String[] array;
    private int index;

    public ArrayList() {
        this.capacity = 10;
        array = new String[capacity];
    }

    public void add(String value) {
        if (index < capacity) {
            array[index] = value;

        } else {
            this.capacity *= 2;
            String[] newArray = new String[capacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;

            array = newArray;
        }
        ++index;
    }

    public String get(int getIndex) {

        if (array[getIndex] != null) {
            return array[getIndex];
        } else {
            throw new RuntimeException("Empty");
        }

    }


}
