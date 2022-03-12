package com.aca.homework.week5.light.out;

import java.util.Scanner;

public class Game {
/*Create a Game class that container matrix of lights of 5x5.

  12345
-------
1|++0++
2|+0+0+
3|0+++0
4|+0+0+
5|++0++
  01234
Create an initialzie() method that will fill the matrix with the light having the above depicted state where + means that the light is 'on' and 0 is 'off'.

To make the Game graphic more understandable fill the board with numbers, |s and -s.

The Game class should have start method that start asking light position in a format '(x,y)' and will switch the light state located at (x,y), (x-1,y), (x+1,y), (x,y-1) and (x,y+1) coordinates.

*/

    char[][] matrix = new char[5][5];
    int moves = 0;
    public void initializer() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '+';
            }
        }
        for (int i = 0; i < 3; i++) {
            int j = matrix[i].length / 2;
            if (i == 0) {
                matrix[i][j] = '0';
            } else {
                matrix[i][j + i] = '0';
                matrix[i][j - i] = '0';
            }
        }
        for (int i = 3; i < matrix.length; i++) {
            int j = matrix[i].length / 2;
            if (i == matrix.length - 1) {
                matrix[i][j] = '0';
            } else {
                matrix[i][j + 1] = '0';
                matrix[i][j - 1] = '0';
            }
        }

    }

    public void print() {
        System.out.println("moves: " + moves);
        System.out.println("   1 2 3 4 5  ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + "| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        ++moves;
    }

    public void start() {

            while (!isFinished()) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input coordinates () : ");
                String coordinates = scanner.next();
                while ((coordinates.charAt(1)<48 || coordinates.charAt(1)>53) || (coordinates.charAt(3)<48 || coordinates.charAt(3)>53)){
                    System.out.print("Input coordinates again () : ");
                    coordinates=scanner.next();
                }
                int a=coordinates.charAt(1)-48;
                int b=coordinates.charAt(3)-48;

                int k=a-1;
                int m=b-1;

                if (k <= matrix.length - 2 && k >= matrix.length - 4 && m >= matrix[k].length - 4 && m <= matrix[k].length - 2) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                } else if (k <= matrix.length - 2 && k >= matrix.length - 4 && m == matrix[k].length) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                } else if (k <= matrix.length - 2 && k >= matrix.length - 4 && m == 0) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    print();
                } else if (m >= matrix[k].length - 4 && m <= matrix[k].length - 2 && k == matrix.length - 1) {
                    matrix[k][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                } else if (m >= matrix[k].length - 4 && m <= matrix[k].length - 2 && k == 0) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                } else if (k == 0 && m == 0) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    print();
                } else if (k == matrix.length - 1 && m == 0) {
                    matrix[k][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m + 1] = '0';
                    print();
                } else if (k == 0 && m == matrix[k].length - 1) {
                    matrix[k][m] = '0';
                    matrix[k + 1][m] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                } else if (k == matrix.length - 1 && m == matrix[k].length - 1) {
                    matrix[k][m] = '0';
                    matrix[k - 1][m] = '0';
                    matrix[k][m - 1] = '0';
                    print();
                }
            }
        System.out.println("You won!!");

    }
    private boolean isFinished(){
        int count=0;
        for (char[] chars : matrix) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '0') {
                    count += 1;
                }
            }
        }
        return count == 25;
    }


}
