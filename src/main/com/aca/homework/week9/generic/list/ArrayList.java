package com.aca.homework.week9.generic.list;

import com.aca.homework.week9.donate.Donatable;

/*
Create a generic List interface that has an add, get(int index) and size method.
The ArrayList List's implementation encapsulates a 1000 fixed size array and does not handle a 1001th add method properly.
Create a ArrayListTest class and test add, get and size method for String, Integer generic types.
*/
public class ArrayList<T> implements List<T> {

    private Object[] array;

    private int count = 0;

    public ArrayList() {
        array = new Object[1000];
    }

    @Override
    public void add(T obj) {
        if (count < array.length) {
            array[count] = obj;
        } else {
            Object[] newArray = new Donatable[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[count] = obj;
            array = newArray;
        }
        ++count;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int size() {
        return count;
    }
}
