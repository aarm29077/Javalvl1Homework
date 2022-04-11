package com.aca.classwork.classwork23.stopRunnable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextPrinterRunnableTest {
    private TextPrinterRunnable textSubject;

    @BeforeEach
    void init() {
        textSubject = new TextPrinterRunnable("Hello world!");
    }

    @Test
    public void testRun() {
        textSubject.run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                textSubject.stop();
            }
        }).start();
    }
}

