package main.com.aca.homework.week1.homework3;
import java.util.Scanner;
public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a =scanner.nextInt();
        System.out.print("Input b: ");
        int b =scanner.nextInt();
        System.out.print("Input c: ");
        int c =scanner.nextInt();
        System.out.print("Input d: ");
        int d =scanner.nextInt();
        System.out.print("Input e: ");
        int e =scanner.nextInt();
        System.out.print("Input f: ");
        int f = scanner.nextInt();
    if (a==10 || b==10 || c==10 || d==10 || e==10 || f==10){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}
