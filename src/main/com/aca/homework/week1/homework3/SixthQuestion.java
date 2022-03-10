package main.com.aca.homework.week1.homework3;
import java.util.Scanner;
public class SixthQuestion {
    public static void main(String[] args) {
/*
        Write a simple program that gets as input number-n and prints Fibonacci nth number
*/
        int fibFirstNumber = 0;
        int fibSecondNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input fibonacci number index: ");
        int index = scanner.nextInt();
        int fibNumber = 0;


        if (index == 1) {
            System.out.println(fibFirstNumber);
        } else if (index == 2) {
            System.out.println(fibSecondNumber);
        } else {
            for (int i = 2; i <= index; i++) {
                fibFirstNumber = fibSecondNumber;
                fibSecondNumber = fibNumber;
                fibNumber = fibFirstNumber + fibSecondNumber;

            }
            System.out.println(fibNumber);
        }
    }
    }