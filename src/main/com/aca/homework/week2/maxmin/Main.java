package main.com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        MaxMin numbersSort = twoNumbers(firstNumber, secondNumber);
        System.out.println("Max value is : " + numbersSort.Max);
        System.out.println("Min value is:  " + numbersSort.Min);
    }

    public static MaxMin twoNumbers(int a, int b) {
        MaxMin numbers = new MaxMin();
        if (a > b) {
            numbers.Max = a;
            numbers.Min= b;
        }
        numbers.Max=b;
        numbers.Min = a;
        return numbers;
    }

}

