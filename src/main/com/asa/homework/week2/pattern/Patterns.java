package main.com.asa.homework.week2.pattern;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        char array[][] = new char[5][5];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write 1 to use addPattern3Right and 2 for addPattern2Right2Top: ");
        int numberOfPattern = scanner.nextInt();

        if (numberOfPattern == 1 || numberOfPattern == 2) {
            System.out.print("Please write the i: ");
            int i = scanner.nextInt();
            System.out.print("Please write the k: ");
            int j = scanner.nextInt();
            System.out.println();

            System.out.println("Before");
            for (int n = 0; n < array.length; n++) {
                for (int m = 0; m < array[n].length; m++) {
                    array[n][m] = '0';
                    System.out.print(array[n][m] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("After");

            if (numberOfPattern == 1) {

                printPattern(addPattern3Right(array, i, j));
            } else {
                printPattern2(addPattern2Right2Top(array, i, j));
            }
        } else {
            System.out.println("Input write number!!!");
        }
    }

    public static char[][] addPattern3Right(char[][] array1, int i, int j) {
        if (j + 2 > array1[i].length) {
            return array1;
        }
        for (int k = j; k <= j + 2; k++) {
            array1[i][k] = '*';
        }
        return array1;

    }

    public static void printPattern(char[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] addPattern2Right2Top(char[][] array1, int i, int j) {
        if (j + 1 > array1[i].length) {
            return array1;
        }
        for (int k = j; k <= j + 1; k++) {
            array1[i][k] = '*';
        }
        int l = j + 1;
        for (int n = i; i - n <= 2; n--) {
            array1[n][l] = '*';
        }
        return array1;

    }

    public static void printPattern2(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
