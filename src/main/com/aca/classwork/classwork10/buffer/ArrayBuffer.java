package com.aca.classwork.classwork10.buffer;

public class ArrayBuffer implements Buffer {

    private  String[] array = new String[1];

    @Override
    public void put(String value) {
        array[0] = value;
    }

    @Override
    public String get() {
        return array[0];
    }

    public static void main(String[] args) {
        ArrayBuffer buffer1 = new ArrayBuffer();
        buffer1.put("");
        ArrayBuffer buffer2 = new ArrayBuffer();

    }
}
