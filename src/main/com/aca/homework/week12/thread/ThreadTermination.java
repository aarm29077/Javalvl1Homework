package com.aca.homework.week12.thread;

import java.util.Scanner;

public class ThreadTermination {


    public static void main(String[] args) throws InterruptedException {
        process();
    }

    public static void process() throws InterruptedException {
        System.out.println("Start");

        Runnable runnable = createRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Finish");
    }


    public static Runnable createRunnable() {

        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis());
            }
        };
    }
}
