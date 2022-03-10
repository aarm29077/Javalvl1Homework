package com.aca.homework.week1.homework;

public class ThirdQuestion {
    public static void main(String[] args) {


        long v1 = 312334;
        long v2 = 32141;
        long v3 = 1241;
        long v4 = 13424;
        long v5 = 4141;
        long result = min(
                v1,
                min(v1,
                        min(v2, min(
                                v3, min(v4, v5)
                        ))

                ));
    }

    public static long min(long a, long b) {
        System.out.println("a = " + a + ", b = " + b);
        return a < b ? a : b;
    }
}