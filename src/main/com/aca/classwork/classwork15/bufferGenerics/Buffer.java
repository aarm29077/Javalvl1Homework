package com.aca.classwork.classwork15.bufferGenerics;

public interface Buffer<T> {

//    void put(Object o);
//    Object get();

    void put(T o);

    T get();


}
/*
     public static void main(String[] args) {
        Buffer<Integer> integerBuffer = new Buffer<Integer>() {
            @Override
            public void put(Integer o) {

            }

            @Override
            public Integer get() {
                return null;
            }
        };

        integerBuffer.put("mfd");
        Integer integer = integerBuffer.get();

        Buffer<String> stringBuffer = new Buffer<String>() {
            @Override
            public void put(String o) {

            }

            @Override
            public String get() {
                return null;
            }
        };
        stringBuffer.put(4545);
        String s = stringBuffer.get();
    }
 */