package homework3;
import java.util.Arrays;
import java.util.Scanner;
public class EightQuestion {
    public static void main(String[] args) {
        System.out.print(" ");
        for (int i = 0; i <10 ; i++) {
            System.out.print("  " + i );
        }
        System.out.println();
        int linenumber=0;
        String board[][] = new String[10][10];
        for (int i = 0; i < board.length; i++) {
            System.out.print(linenumber + "  ");
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "* ";
                System.out.print(board[i][j] + " ");
            }
            ++linenumber;
            System.out.println(" ");
        }


    }



}












