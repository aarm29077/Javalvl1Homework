package com.aca.exam.exam1;

import java.util.Scanner;

public class ExamTest {
    public static void main(String[] args) {
        Exam exam = new Exam();
        Scanner scanner = new Scanner(System.in);
        exam.putValues();

        System.out.println();
        System.out.print("Input number: ");
        int problemNumber = scanner.nextInt();
        while (problemNumber != 8) {
            if (problemNumber == 1) {
                System.out.println(exam.maxvalue());
            } else if (problemNumber == 2) {
                System.out.println(exam.minValue());
            } else if (problemNumber == 4) {
                System.out.println(exam.averageValue());
            } else if (problemNumber == 5) {
                exam.numberWanted(3);
            } else if (problemNumber == 6) {
                System.out.println(exam.subtractionMaxAndMin());
            } else if (problemNumber == 7) {
                System.out.println(exam.zeroesCount());
            }
            System.out.print("Input number: ");
            problemNumber = scanner.nextInt();
        }
        System.out.println("The end");
    }
}
