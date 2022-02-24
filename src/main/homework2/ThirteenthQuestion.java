package homework2;
import java.util.Scanner;
public class ThirteenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + (int)Math.pow(i,3));
        }
    }
}
