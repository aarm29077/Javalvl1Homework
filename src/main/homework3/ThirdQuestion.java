package homework3;
import java.util.Scanner;
public class ThirdQuestion {
    public static void main(String[] args) {
        int array[] = new int[100];
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number: ");
            array[i]= scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
