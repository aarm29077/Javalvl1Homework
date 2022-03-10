package com.aca.classwork.classwork3;

public class WhileTest {
    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis() / 1000;
        long a = 0;

        while (true) {
            long b = a;
            a = (System.currentTimeMillis() / 1000 - startMillis);

            if(b != a)
                System.out.println(a);
        }
    }

}
