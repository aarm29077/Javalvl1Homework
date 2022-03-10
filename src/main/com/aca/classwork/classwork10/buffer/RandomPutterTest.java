package com.aca.classwork.classwork10.buffer;

import classwork10.buffer.Buffer;

import java.util.Scanner;

public class RandomPutterTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int value = scanner.nextInt();

        Buffer buffer = null;
        if (value == 0) {
//            RandomPutter randomPutter1= new RandomPutter(new MyBuffer());
            buffer = new MyBuffer();
//            randomPutter1.start();
        } else if (value == 1) {
//            new RandomPutter(new ArrayBuffer()).start();
            buffer = new ArrayBuffer();
        }
        new RandomPutter(buffer).start();

    }

}
