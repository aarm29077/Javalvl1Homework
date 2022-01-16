package homework3;
import java.util.Arrays;
import java.util.Scanner;
public class EightQuestion {
    public static void main(String[] args) {
        System.out.print("0 ");
        for (int i = 0; i <= 9 ; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        int linenumber=0;
        String board[][] = new String[10][10];
        for (int i = 0; i < board.length; i++) {
            System.out.print(linenumber + " ");
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "X";
                System.out.print(board[i][j] + " ");
                ;
            }
            ++linenumber;
            System.out.println("");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input line number where you want to put it: ");
//        int a=scanner.nextInt();
//        System.out.println("Input column number where you want to put it: ");
//        int b= scanner.nextInt();
//
//        System.out.println("Start!!!!!! ");
//        System.out.println("Input the number of linet shoot : ");
//        int shoot1 = scanner .nextInt();
//        System.out.println("Input number of column to shoot: ");
//        int shoot2= scanner.nextInt();

    }
}












