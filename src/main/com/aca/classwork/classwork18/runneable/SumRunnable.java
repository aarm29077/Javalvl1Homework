package com.aca.classwork.classwork18.runneable;

public class SumRunnable implements Runnable {
    private int firsNumber, secondNumber;

    public SumRunnable(int firsNumber, int secondNumber) {
        this.firsNumber = firsNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void run() {
        System.out.println(firsNumber + secondNumber);
    }

    public static void main(String[] args) {
        Runnable runnable = new SumRunnable(5, 7);
        runnable.run();
    }
}
