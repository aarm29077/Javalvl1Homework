package com.aca.classroom.week13.print;

public class TextPrinterRunnable implements Runnable {

    private final Printer printer;
    private final String name;
    private volatile boolean isRunning = true;

    public TextPrinterRunnable(Printer printer, String name) {
        if (printer == null) {
            throw new IllegalArgumentException();
        }
        this.printer = printer;
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

            //System.out.println(name);
            printer.print(name);
        }
    }

    public void stop() {
        System.out.println("STOPPING.." + Thread.currentThread().getName());
        isRunning = false;
    }

}
