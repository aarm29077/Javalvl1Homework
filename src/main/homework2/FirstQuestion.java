package homework2;
import java.util.Scanner;
public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input your number: ");
        int n=scanner.nextInt();
        if (n%2==1){
            System.out.println("Weird");
        }
        else if (n%2==0 && n>1){
            if (n<=5){
                System.out.println("Not Weird");
            }
            else if(n<=20){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
