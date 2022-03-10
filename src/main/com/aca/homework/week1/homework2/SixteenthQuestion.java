package main.com.aca.homework.week1.homework2;
import java.util.Scanner;
public class SixteenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = scanner.nextInt();


        for (int i=1; i <=number ; i++) {
            System.out.println(" ");
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
        }
    }
}
