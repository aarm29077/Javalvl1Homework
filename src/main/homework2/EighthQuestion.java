package homework2;
import java.util.Scanner;
public class EighthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input letter: ");
        String letter = scanner.next();


        if (letter.length() == 1 && letter.charAt(0) >= 65 && letter.charAt(0) <= 122) {
            if (letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O") || letter.equals("u") || letter.equals("U")) {
                System.out.println("Input letter is Vowel.");
            } else {
                System.out.println("Input number is Consonant. ");
            }
        } else {
            System.out.println("Error");
        }
    }
}