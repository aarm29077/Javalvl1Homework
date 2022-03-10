package com.aca.classwork.classwork16;

public class GenericCollections<E> {

    private static int array_size = 100;

    private Object[] objects = new Object[array_size];

    public void set(int index, E element) {
        objects[index] = element;
    }

    public E get(int index) {
        return (E) objects[index];
    }

    public static void main(String[] args) {
        GenericCollections<Integer> collections1 = new GenericCollections<>();
//        collections1.set(1, "dfsgd");


        Integer integer = collections1.get(1);
    }
}