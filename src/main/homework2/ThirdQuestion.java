package homework2;
import java.util.Scanner;
import java.math.MathContext;
public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();
        double D = b*b-4*a*c;
        double d = Math.sqrt(D);
        if (D>0){
            double x1 = (-b+d) / (2 * a);
            double x2 = (-b-d) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        if (D==0){
            double x = (-b) / (2*a);
            System.out.println(x);
        }
        if (D<0){
            System.out.println("has no solution");
        }
    }
}