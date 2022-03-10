package com.aca.classwork.classwork10.buffer;

public class MyBuffer implements Buffer {
    private String value;

    @Override
    public String get() {
        return this.value;
    }

    @Override
    public void put(String value) {
        this.value = value;
    }
}
