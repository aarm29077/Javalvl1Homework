package com.aca.classwork.classwork24;

public class WaitMain {
    public static void main(String[] args) throws InterruptedException {
        final WaitMain waitMain = new WaitMain();
        synchronized (waitMain) {
            waitMain.wait();

        }

    }
}
