package com.aca.classwork.classwork5.maxmin;

import java.util.Scanner;

public class MaxMinTest {
    public static void main(String[] args) {
//        MaxMin[] maxMins = get3MaxMin();
//        printMaxMins(maxMins);
        MaxMin maxMin8=new MaxMin();
        maxMin8.max=9;
        maxMin8.min=6;
        Printers.printDetails(maxMin8);

    }


    public static MaxMin createMaxMin(long i, long j) {
        MaxMin maxMin = new MaxMin();
        if (i > j) {
            maxMin.max = i;
            maxMin.min = j;
        } else {
            maxMin.max = j;
            maxMin.min = i;
        }

        return maxMin;
    }

    public static MaxMin[] get3MaxMin() {
        MaxMin[] maxMinArray = new MaxMin[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a number: ");
            long number1 = new Scanner(System.in).nextLong();
            System.out.print("Please enter a number: ");
            long number2 = new Scanner(System.in).nextLong();

            MaxMin maxMin = createMaxMin(number1, number2);
            maxMinArray[i] = maxMin;
        }
        return maxMinArray;

    }

    public static void printMaxMins(MaxMin[] maxMinArray) {
        for (int i = 0; i < maxMinArray.length; i++) {
            MaxMin maxMin = maxMinArray[i];
            Printers.printDetails(maxMin);
        }
    }


}
