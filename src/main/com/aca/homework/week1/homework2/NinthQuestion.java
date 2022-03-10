package main.com.aca.homework.week1.homework2;
import java.util.Scanner;
public class NinthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year number: ");
        int yearNumber = scanner.nextInt();
        String yearName=null;
        if (yearNumber%4==0){
            if(yearNumber%100==0 && (yearNumber&400)==0){
                yearName="leap year.";
                System.out.print(yearNumber + " is a " + yearName);
            }else if (yearNumber%100==0 && yearNumber%400!=0 ){
                yearName="common year.";
                System.out.print(yearNumber + " is a " + yearName);
            }
            else{
                yearName="leap year.";
                System.out.print(yearNumber + " is a " + yearName);

            }
        }else{
            yearName="common year.";
            System.out.println(yearNumber + " is" + " a " + yearName);
        }
    }
}
