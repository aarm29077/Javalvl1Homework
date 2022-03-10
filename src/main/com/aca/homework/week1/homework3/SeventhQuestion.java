package main.com.aca.homework.week1.homework3;

import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args) {
        int fibonacciFirstNumber = 0;
        int fibonacciSecondNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input fibonacci number index: ");
        int index = scanner.nextInt();
        int fibNumber = 0;
        int sum=0;


        if (index == 1) {
            System.out.println(fibonacciFirstNumber);
            System.out.println("Sum is: " + 0);
        } else if (index == 2) {
            System.out.println(fibonacciSecondNumber);
            System.out.println("Sum is: " + 1);
        } else {
            for (int i = 2; i <= index; i++) {
                fibonacciFirstNumber = fibonacciSecondNumber;
                fibonacciSecondNumber = fibNumber;
                fibNumber = fibonacciFirstNumber + fibonacciSecondNumber;
                sum+=fibNumber;
            }
//            System.out.println(fibNumber);
            System.out.println("Sum is: " + sum);

        }
    }
}
