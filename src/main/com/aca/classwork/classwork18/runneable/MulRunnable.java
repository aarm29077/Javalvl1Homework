package com.aca.classwork.classwork18.runneable;

public class MulRunnable implements Runnable{
    private int firsNumber, secondNumber;

    public MulRunnable(int firsNumber, int secondNumber) {
        this.firsNumber = firsNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void run() {
        System.out.println(firsNumber * secondNumber);
    }

}
