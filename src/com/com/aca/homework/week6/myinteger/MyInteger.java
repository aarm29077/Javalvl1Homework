package com.com.aca.homework.week6.myinteger;
/*

Create a MyInteger class that holds an int value. Create a static factory named valueOf that takes a value and returns MyInteger.
Cache MyInteger classes for values -100 to 100.
e.g. if MyInteger.valueof(10) is invoked then the method should create and return a new object.
If it is invoked once again then a new object should not be created but the old created one should be returned.

 */
public class MyInteger {
    public static MyInteger myInteger = null;
    int value;
    MyInteger[] array = new MyInteger[200];

    public MyInteger(int value){
        array[value]=myInteger;
    }

    public static MyInteger valueOf(int value) {
        if (myInteger == null) {
            myInteger = new MyInteger(value);
        }
        return myInteger;
    }

    public static void main(String[] args) {
        System.out.println(MyInteger.valueOf(0));

    }
}
