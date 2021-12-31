package com.company;

public class Primitives {

    public static void main(String[] args) {
        System.out.println("Hello world");

        byte by1 = 0b01111111;
        byte by2 = 0b01111111;
        byte by3 = 5;

        char c1 = 'a';
        char c2 = 'b';
        char c3 = Character.MAX_VALUE;
        char c4 = 96;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        boolean b1 = true;
        boolean b2= false;

        short s1 = Short.MIN_VALUE;
        short s2 = Short.MAX_VALUE;
        short s3 = 32767;

        int a1 = Integer.MIN_VALUE;
        int a2 = Integer.MAX_VALUE;
        int a3 = 45;

        int color1 = 0b11111111_11111111_00000000_00000000;
        int color2 = 0xFF_FF_00_00;

        System.out.println("Color " + color1);
        System.out.println("Color " + color2);

        long l1 = Long.MIN_VALUE;
        long l2 = Long.MAX_VALUE;
        long l3 = 456;

        float f1 = Float.MAX_VALUE;
        float f2= Float.MIN_VALUE;
        float f3= 1.5456f;

        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        double d3 = 9876543.09876543;
    }
}
