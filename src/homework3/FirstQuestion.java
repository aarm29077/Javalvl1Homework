package homework3;
import java.util.Scanner;
public class FirstQuestion {
    public static void main(String[] args) {
        System.out.println(program());
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
    public static String program(){
        String passportName = "John";
        int passportAge = 43;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        return (isAnsweredNameSameWithPassportName(passportName) && isUserAgeTheSameAsPassportAge(passportAge, age) && isUserAgeGreaterThan18(age)) ? "YES" : "No";

    }

}
