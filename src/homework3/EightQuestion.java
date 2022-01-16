package homework3;
import java.util.Arrays;
import java.util.Scanner;
public class EightQuestion {
    public static void main(String[] args) {
        for (int i = 0; i <= 16 ; i++) {
            System.out.print(i +"  ");
            if (i>=9){
                System.out.print("");
            }
        }
        System.out.println();
        int linenumber=1;
        String board[][] = new String[16][16];
        for (int i = 0; i < board.length; i++) {
            System.out.print(linenumber + " ");
            if (i<9){
                System.out.print(" ");
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j>=9){
                    System.out.print(" ");
                }
                board[i][j] = "* ";
                System.out.print(board[i][j] + " ");

            }
            ++linenumber;
            System.out.println("");
            System.out.println(" ");
        }


    }

}












