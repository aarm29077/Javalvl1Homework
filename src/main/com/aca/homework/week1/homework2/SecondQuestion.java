package main.com.aca.homework.week1.homework2;
import java.util.Scanner;
public class SecondQuestion {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your number : ");
    int N= scanner.nextInt();
    for (int i = 1 ; i <= 10; i++) {
        System.out.println( N + " * " + i + " = " + N*i);

        }
    }
}
