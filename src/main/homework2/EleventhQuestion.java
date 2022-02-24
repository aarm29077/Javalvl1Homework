package homework2;
import java.util.Scanner;
public class EleventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int n=scanner.nextInt();
        int sum=0;
        System.out.print("The first n natural are : ");
        for (int i = 1; i <= n ; i++) {
            sum+=i;
            if ( i != n){
                System.out.print(i+", ");
            } else{
                System.out.print(i);
            }
        }
        System.out.println("\nThe Sum of Natural Number up to n terms : " + sum);
    }
}
