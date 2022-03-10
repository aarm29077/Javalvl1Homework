package com.aca.classwork.classwork7.problems;

public class Numbers {
    private  int number1;
    private int number2;

    public Numbers(){
        this.number1 = 10;
        this.number2 = 15;
    }
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.setNumber1(10);
        numbers.setNumber2(15);
    }
    public void setNumber1(int number1){
        this.number1=number1;
    }
    public void setNumber2(int number2){
        this.number2=number2;
    }
    public Numbers(int number1 , int number2){
        this.number1=number1;
        this.number2=number2;
    }


}
