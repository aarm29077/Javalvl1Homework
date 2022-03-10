package com.aca.classwork.classwork1;

public class ThirdProblem {
    public static void main(String[] args) {
        int a=10;
        int b= 20;
        System.out.println(minAndMax(a, b));

    }

    public static String minAndMax(int a , int b){
        return a<b ? a +"|"+b : b +"|"+a;
    }
}
