package com.aca.classwork.classwork24.stopRunnable;

public class TextPrinterRunnable implements Runnable {

    private final String name;
    private boolean isRunning = true;


    public TextPrinterRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
            System.out.println(Thread.currentThread().getName());
        }
    }

    public void stop() {
        System.out.println("Stopping ... " + Thread.currentThread().getName());

        isRunning = false;
    }
}
