package homework2;
import java.util.Scanner;
public class FifthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        //1
        if ( number > 0  && number < 8){
            if( number == 1){
                System.out.println("Monday");
            }
            else if( number == 2){
                System.out.println("Tuesday");
            }
            else if( number == 3){
                System.out.println("Wednesday");
            }
            else if( number == 4 ){
                System.out.println("Thursday");
            }
            else if (number == 5){
                System.out.println("Friday");
            }
            else if ( number == 6){
                System.out.println("Saturday");
            }
            else{
                System.out.println("Sunday");
        }
    }
        else{
            System.out.println("Error");
        }
        //2
        System.out.print("Input number: ");
        int number1 = scanner.nextInt();
        switch (number1){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

}
}
