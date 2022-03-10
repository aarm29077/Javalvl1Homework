package com.aca.homework.week1.homework1;

public class SecondQuestion {
    public static void main(String[] args) {
        int min = min(9, 3, 1);
        System.out.println(min);
    }

    public static int min(int n1, int n2, int n3) {
        if (n1 < n2) {
            if (n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
}
