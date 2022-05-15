package com.aca.homework.week10.entry;

/*
Create EntryImpl generic implementation and write unit tests when the key type is a String and the value type is an Integer.

 */
public class EntryImpl<K, V> implements Entry<K, V> {
    private K key;
    private V value;

    public EntryImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K key() {
        return key;
    }

    @Override
    public V value() {
        return value;
    }
}
