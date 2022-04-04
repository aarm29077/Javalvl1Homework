package com.aca.classwork.classwork24.stopRunnable;


public class TypePrinterMain {
    public static void main(String[] args) {
        TextPrinterRunnable runnable = new TextPrinterRunnable("Hello world!");
        final Thread thread0 = new Thread(runnable);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runnable.stop();
            }
        });
        thread1.start();
        runnable.stop();
    }
}
