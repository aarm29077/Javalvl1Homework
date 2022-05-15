package com.aca.homework.week9.generic.list;

/*
Create a generic List interface that has an add, get(int index) and size method.
The ArrayList List's implementation encapsulates a 1000 fixed size array and does not handle a 1001th add method properly.
Create a ArrayListTest class and test add, get and size method for String, Integer generic types.


 */
public interface List<T> {

    void add(T obj);

    T get(int index);

    int size();

}