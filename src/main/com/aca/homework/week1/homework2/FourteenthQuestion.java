package main.com.aca.homework.week1.homework2;
import java.util.Scanner;
public class FourteenthQuestion {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the number (Table to be calculated) : Input number of terms : ");
    int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println( number + " * " +  i + " = " + number*i);
        }

    }
}
