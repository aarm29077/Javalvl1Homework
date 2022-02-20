package com.aca.homework.week6.buffer;
/*
Create a Buffer interface that has put and get methods. The user can put any type of object and get it back.
If the buffer is full then ignore the put operation and print 'The buffer is not empty'
If the get method is invoked then a buffer should return its content and delete it from buffer.
If the buffer is empty and a user invokes the get method, the null value should be returned and the text 'Buffer is empty' should be printed.
Create a BufferImpl class that implements the Buffer interface. Implement toString and equals methods.

 */
public interface Buffer{
    void put(Buffer buffer);
    Object get(int index);
}
