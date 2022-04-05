package com.com.aca.homework.week6.myinteger;
/*

Create a MyInteger class that holds an int value. Create a static factory named valueOf that takes a value and returns MyInteger.
Cache MyInteger classes for values -100 to 100.
e.g. if MyInteger.valueof(10) is invoked then the method should create and return a new object.
If it is invoked once again then a new object should not be created but the old created one should be returned.

 */
public class MyInteger {
    MyInteger myInteger;
    private int value;
    static MyInteger[] array = new MyInteger[200];

    public MyInteger() {
    }

    public MyInteger(int value){
        array[value+100]= new MyInteger();

    }

    public static MyInteger valueOf(int value) {
        if (array[value+100]== null) {
            array[value+100] = new MyInteger(value);
            return array[value+100];
        }
        return array[value+100];
    }

    public static void main(String[] args) {
        System.out.println(MyInteger.valueOf(-100));
        System.out.println(MyInteger.valueOf(50));


    }
}
