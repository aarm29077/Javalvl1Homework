package com.aca.classwork.classwork8.developer;

public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value=value;
    }
    public  int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
