package com.aca.classwork.classwork25;

public interface Buffer<T> {

    T get() throws InterruptedException;

    void put(T t) throws InterruptedException;
}
