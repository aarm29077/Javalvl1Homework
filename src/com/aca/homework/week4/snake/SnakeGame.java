package com.aca.homework.week4.snake;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        char[][] matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '0';
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int count=0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[0][0] = '*';
                System.out.print("Input apple's index of row : ");
                int indexOfRowApple = scanner.nextInt();
                System.out.print("Input apple's index of column: ");
                int indexOfColumnApple = scanner.nextInt();

                matrix[indexOfRowApple][indexOfColumnApple] = '=';

                while (matrix[i][j] != matrix[indexOfRowApple][indexOfColumnApple]) {

                    System.out.println("Where to go? ");
                    System.out.print("answer : ");
                    System.out.println();


                    String position = scanner.next();

                    if (position.equals("w")) {
                        matrix[0][0] = '0';
                        --i;
                        matrix[i][j]='*';
                        if (count==0){
                            matrix[i+1][j]='0';
                        }
                        else {
                            matrix[i+count][j] = '*';
                            matrix[i+count+1][j]='0';

                        }
                    }

                    else if (position.equals("s")) {
                        matrix[0][0] = '0';
                        ++i;
                        matrix[i][j] = '*';
                        if (count==0){
                            matrix[i-1][j]='0';
                        }
                        else {
                            matrix[i-count][j] = '*';
                            matrix[i-count-1][j]='0';

                        }

                    }

                    else if (position.equals("a")) {
                        matrix[0][0] = '0';
                        --j;
                        matrix[i][j] = '*';
                        if (count==0){
                            matrix[i][j+1]='0';
                        }
                        else{
                            matrix[i][j+count] = '*';
                            matrix[i][j+count+1]='0';

                            }

                    }

                    else if (position.equals("d")) {
                        matrix[0][0] = '0';
                        ++j;
                        matrix[i][j] = '*';
                        if (count==0){
                            matrix[i][j-1]='0';
                        }
                        else{
                            matrix[i][j-count]='*';
                            matrix[i][j-count-1]='0';                        }
                    }

                    for (int k = 0; k < matrix.length; k++) {
                        for (int l = 0; l < matrix[k].length; l++) {
                            System.out.print(matrix[k][l] + " " );
                        }
                        System.out.println();
                    }
                }
                matrix[i][j] = '0';
                System.out.println();
                ++count;

            }

        }

    }
}


