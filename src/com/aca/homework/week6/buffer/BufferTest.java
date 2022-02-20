package com.aca.homework.week6.buffer;

public class BufferTest {
    public static void main(String[] args) {
        Buffer buffer = new BufferImpl(10);
        BufferImpl buffer1 = new BufferImpl();
        BufferImpl buffer2 = new BufferImpl();
        BufferImpl buffer3 = new BufferImpl();
        BufferImpl buffer4 = new BufferImpl();

        buffer.put(buffer1);
        buffer.put(buffer2);
        buffer.put(buffer3);
        buffer.put(buffer4);

        System.out.println(buffer.get(0));
        System.out.println(buffer.get(2));
        System.out.println(buffer.get(2));

    }
}
