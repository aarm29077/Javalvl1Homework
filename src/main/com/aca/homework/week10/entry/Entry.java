package com.aca.homework.week10.entry;

/*
Create an Entry generic interface that has the following methods:
K key();
V value();
Create EntryImpl generic implementation and write unit tests when the key type is a String and the value type is an Integer.
 */
public interface Entry<K, V> {

    K key();
    V value();
}
