package com.aca.classwork.classwork1;

public class FourthProblem {
    public static void main(String[] args) {
        int[] array = new int[]{5,8,9};
        int max = max(array[2], max(array[0], array[1]));
        System.out.println(max);

    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
