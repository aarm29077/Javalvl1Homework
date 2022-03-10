package com.aca.homework.week2.string;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] symbols = new char[]{'a', '2', 'e', 'b', '3', '7', '9', 'w', '8', 't'};
        char[] symbols1 = new char[5];
        int k = 0;
        while (k < 10) {
            printArray(symbols, symbols1);
            k++;
        }
    }

    public static void printArray(char[] array1, char[] array2) {
        for (int i = 0; i < 5; i++) {
            int j = new Random().nextInt(array1.length);
            array2[i] = array1[j];
            System.out.print(array2[i]);
        }
        System.out.println();
    }
}
