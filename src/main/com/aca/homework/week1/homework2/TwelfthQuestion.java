package com.aca.homework.week1.homework2;

import java.util.Scanner;

public class TwelfthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 5 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double sum = a + b + c + d + e;
        double average = (a + b + c + d + e) / 5;
        System.out.println("The sum of 5 numbers is : " + sum);
        System.out.println("The average is: " + average);

    }
}
