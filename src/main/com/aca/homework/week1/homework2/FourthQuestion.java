package main.com.aca.homework.week1.homework2;
import java.util.Scanner;
public class FourthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        double num = scanner.nextDouble();
        if(num > 0) {
            if (num <1){
                System.out.println("positive");
                System.out.println("small");
            }
            else if( num > 1000000){
                System.out.println("positive");
                System.out.println("large");
            }
            else{
                System.out.println("positive");
            }

        }
        else if ( num < 0) {
            if (num > -1){
                System.out.println("negative");
                System.out.println("small");
            }
            else if ( num < -1000000){
                System.out.println("negative");
                System.out.println("large");
            }
            else {
                System.out.println("negative");
            }
        }
        else{
            System.out.println("zero");
        }
    }
}
