package main.com.aca.homework.week1.homework3;
import java.util.Scanner;
public class FifthQuestion {
    public static void main(String[] args) {
    /*Write a simple program that gets as input 10 numbers and print the division of each
        couple
        */
        Scanner scanner = new Scanner(System.in);
        double array[] = new double[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number ");
            array[i] = scanner.nextInt();
            if (i % 2 == 1) {
                if (array[i] > array[i - 1]) {
                    System.out.println(array[i] / array[i - 1]);
                } else {
                    System.out.println(array[i-1] / array[i]);
                }
            }
        }
    }
}