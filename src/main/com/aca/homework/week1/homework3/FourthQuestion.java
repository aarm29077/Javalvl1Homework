package com.aca.homework.week1.homework3;

import java.util.Scanner;

public class FourthQuestion {
    /*    Write a Simple program that takes as input 20 numbers in the range [0,100], if the
        number is out of range program must output to user message that the input number is out of
        range when all number was already input program must show as output sum of input
                numbers
        Requirements:
        the program must have a method check number.
        the program must have a method read number.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number: ");
            array[i] = scanner.nextInt();
            if (checkNumber(array[i])) {
                sum += array[i];
                if (i == array.length - 1) {
                    System.out.println("The sum is: " + sum);
                }
            } else {
                System.out.println("The number is out of range.");
                break;
            }
        }
    }

    public static boolean checkNumber(int number) {
        return (number >= 0 && number <= 100);
    }


}
