package com.aca.homework.week1.homework2;

import java.util.Scanner;

public class FifteenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms is: ");
        int number = scanner.nextInt();
        int sum = 0;

        System.out.print("The odd numbers are: ");
        for (int i = 1; i <= number * 2; i += 2) {
            if (i != number * 2 && i != number * 2 - 1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
            sum += i;
        }
        System.out.println("\nThe Sum of odd Natural Number up to 5 terms is: " + sum);
    }
}
