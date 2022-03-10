package com.aca.classwork.classwork12.timer;

public class BadTimer implements Timer {
    @Override
    public void start() {
        int number = 0;
        while (true) {
            wait1Second();
            ++number;
            System.out.println(number);
        }
    }

    private void wait1Second() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1000) {

        }
    }
}
