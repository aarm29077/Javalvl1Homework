package homework2;
import java.util.Scanner;
public class SixthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Input floating-point another number: ");
        double number2 = scanner.nextDouble();

        if (number1 * 1000 == number2 * 1000) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}