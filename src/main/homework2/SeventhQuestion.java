package homework2;
import java.util.Scanner;
public class SeventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month number 1-12: ");
        int monthNumber = scanner.nextInt();
        int yearNumber = 0;
        String monthName;
        int dayQuantity;
        String yearName = null;



        if(monthNumber>=1 && monthNumber<=12) {
            System.out.print("Input year number: ");
            yearNumber = scanner.nextInt();
        }else{
            System.out.println("Error");
        }



        if (yearNumber % 4 == 0) {
            if (yearNumber % 100 == 0 && yearNumber % 400 == 0) {
                yearName = "Leap year";
            } else if( yearNumber % 100 == 0 && yearNumber % 400 !=0){
                yearName = "Common year";
            }
            else {
                yearName= "Leap year";
            }
        }else{
            yearName="Common year";
        }


        if (monthNumber == 1) {
            monthName = "January";
            dayQuantity = 31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        } else if (monthNumber == 2) {
            monthName = "February";
            if (yearName == "Leap year") {
                dayQuantity = 29;
                System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
            } else {
                dayQuantity = 28;
                System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
            }
        } else if (monthNumber == 3) {
            monthName = "March";
            dayQuantity = 31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        } else if (monthNumber == 4) {
            monthName = "April";
            dayQuantity = 30;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        } else if (monthNumber == 5) {
            monthName = "May";
            dayQuantity = 31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        } else if (monthNumber == 6) {
            monthName = "June";
            dayQuantity = 30;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        } else if (monthNumber == 7) {
            monthName = "July";
            dayQuantity = 31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }
        else if(monthNumber ==8){
            monthName="August";
            dayQuantity=31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }
        else if(monthNumber ==9){
            monthName="September";
            dayQuantity=30;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }
        else if (monthNumber == 10){
            monthName = "October";
            dayQuantity=31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }
        else if(monthNumber == 11){
            monthName = "November";
            dayQuantity=30;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }
        else if (monthNumber == 12){
            monthName = " December";
            dayQuantity = 31;
            System.out.println(monthName + " " + yearNumber + " has " + dayQuantity + " days.");
        }

    //switch case-erov aveli hesht kliner. Qani vor chenq ancel, pordzeci ays tarberakov
    }
}

