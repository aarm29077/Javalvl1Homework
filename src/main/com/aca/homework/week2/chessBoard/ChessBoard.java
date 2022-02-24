package main.com.aca.homework.week2.chessBoard;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char array[][] = new char[8][8];
        int linenumber = 8;
        for (int i = 0; i < array.length; i++) {
            System.out.print(linenumber + " ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
            linenumber--;
        }
        System.out.print("  " + "a " + "b " + "c " + "d " + "e " + "f " + "g " + "h ");
        System.out.println();
        System.out.println();

        System.out.print("Input place letter and number: ");
        String place = scanner.next();
        char placeLetter = place.charAt(0);
        char placeNumber = place.charAt(1);
        System.out.print("Input place letter and number to move: ");
        String placeToMove = scanner.next();
        char placeLetterToMove = placeToMove.charAt(0);
        char placeNumberToMove = placeToMove.charAt(1);
        horse(array, placeLetter, placeNumber, placeLetterToMove, placeNumberToMove);

////       horse(array, 4,1,5,3);
    }

    public static void horse(char[][] array1, char i, char j, char k, char l) {
        if ((i <= 104 && i >= 97 && k <= 104 && k >= 97 && j >= 48 && j <= 56 && l >= 48 && l <= 56)) {
            if ((i - k == 1 || k - i == 1) && (j - l == 2 || l - j == 2)) {
                System.out.println("Yes");
            } else if ((i - k == 2 || k - i == 2) && (j - l == 1 || l - j == 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Error");
        }
    }
}
