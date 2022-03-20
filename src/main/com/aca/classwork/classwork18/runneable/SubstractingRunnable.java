package com.aca.classwork.classwork18.runneable;

public class SubstractingRunnable implements Runnable{
    private int firsNumber, secondNumber;

    public SubstractingRunnable(int firsNumber, int secondNumber) {
        this.firsNumber = firsNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void run() {
        System.out.println(firsNumber / secondNumber);
    }

}
