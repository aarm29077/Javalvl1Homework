package com.aca.classwork.classwork15.scanner;

import java.util.Arrays;
import java.util.InputMismatchException;

public class IntScanner {

    private IntSupplier intSupplier;

    public IntScanner(IntSupplier intSupplier) {
        this.intSupplier = intSupplier;
    }

    public int[] get5SizedArray() {
        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("input number " + (i + 1) + ": ");

        int i = 0;
        while (i < 5) {
            try {
//                numbers[i] = new Scanner(System.in).nextInt();
                numbers[i] = intSupplier.get();
                i++;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        }
        return numbers;
    }


    public int findMax(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        ProblemWithNumbers problemWithNumbers = new ProblemWithNumbers();
//        System.out.println(problemWithNumbers.findMax(problemWithNumbers.get5SizedArray()));

        System.out.println(Arrays.toString(new IntScanner(new IntSupplier()).get5SizedArray()));
    }
}





/*
*    public int[] get5SizedArray() {
        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("input number " + (i + 1) + ": ");

        int i = 0;
        while (i < 5) {
            try {
//                numbers[i] = new Scanner(System.in).nextInt();
                numbers[i] = new IntSupplier().get();
                i++;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        }
        return numbers;
    }
*/