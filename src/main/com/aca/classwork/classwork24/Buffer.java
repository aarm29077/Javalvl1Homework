package com.aca.classwork.classwork24;

public interface Buffer<T> {

    T get() throws InterruptedException;

    void put(T t) throws InterruptedException;
}
