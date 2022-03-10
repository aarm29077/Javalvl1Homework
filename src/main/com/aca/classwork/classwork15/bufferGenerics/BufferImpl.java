package com.aca.classwork.classwork15.bufferGenerics;

public class BufferImpl<T> implements Buffer<T> {

    //    private Object o;
    private T o;


    @Override
    public void put(T o) {
        this.o = o;
    }

    @Override
    public T get() {
        return this.o;
    }
}
