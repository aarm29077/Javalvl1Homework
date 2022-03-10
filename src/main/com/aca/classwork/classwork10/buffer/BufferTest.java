package com.aca.classwork.classwork10.buffer;

public class BufferTest {

    public static void main(String[] args) {
//        Buffer buffer = new MyBuffer();
//        putInBuffer(buffer, "text");
//        printBufferValue(buffer);
//
//        ArrayBuffer arrayBuffer = new ArrayBuffer();
//        arrayBuffer.put("adsada");
//        System.out.println(arrayBuffer.get());


    }

    public static void putInBuffer(Buffer buffer, String value) {
        buffer.put(value);
    }

    public static void printBufferValue(Buffer buffer) {
        System.out.println(buffer.get());
    }
}
