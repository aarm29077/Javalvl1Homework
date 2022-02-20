package com.aca.homework.week6.buffer;

import java.util.Arrays;

/*
Create a Buffer interface that has put and get methods. The user can put any type of object and get it back.

If the buffer is full then ignore the put operation and print 'The buffer is not empty'
If the get method is invoked then a buffer should return its content and delete it from buffer.
If the buffer is empty and a user invokes the get method, the null value should be returned and the text 'Buffer is empty' should be printed.

Create a BufferImpl class that implements the Buffer interface. Implement toString and equals methods.

 */
public class BufferImpl implements Buffer {

    Buffer[] buffers;

    private int index = 0;

    public BufferImpl() {

    }

    public BufferImpl(int capacity) {
        buffers = new Buffer[capacity];
    }

    @Override
    public void put(Buffer buffer) {
        if (index < 10) {
            buffers[index] = buffer;
            ++index;
        } else {
            System.out.println("The buffer is not empty");
        }


    }

    @Override
    public Object get(int index) {
        if (buffers[index] != null) {
            Buffer chosenBuffer = buffers[index];
            for (int i = index; i < buffers.length - 1; i++) {
                buffers[i] = buffers[i + 1];
            }
            int size = buffers.length;
            Buffer[] buffersArray = new Buffer[size];
            for (int i = 0; i < buffersArray.length; i++) {
                buffersArray[i] = buffers[i];
            }
            buffers = buffersArray;
            return chosenBuffer;
        } else {
            return "Buffer is empty";

        }
    }

    @Override
    public String toString() {
        return "BufferImpl{" +
                "buffers=" + Arrays.toString(buffers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BufferImpl buffer = (BufferImpl) o;
        return Arrays.equals(buffers, buffer.buffers);
    }

}
