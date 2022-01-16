package homework3;
import java.util.Scanner;
public class FirstQuestion {
    public static void main(String[] args) {
        String passportName = "John";
        int passportAge = 43;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        if (isAnsweredNameSameWithPassportName(passportName) && isUserAgeTheSameAsPassportAge(passportAge, age) && isUserAgeGreaterThan18(age)) {
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

    }
    public static boolean isAnsweredNameSameWithPassportName(String passportName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        return name.equals(passportName);
    }
    public static boolean isUserAgeTheSameAsPassportAge(int  age ,int passportAge){
        return age==passportAge;
    }
    public static boolean isUserAgeGreaterThan18(int age){
        return age>18;
    }

}
