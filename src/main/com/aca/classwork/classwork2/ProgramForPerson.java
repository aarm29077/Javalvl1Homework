package com.aca.classwork.classwork2;
import java.util.Scanner;
public class ProgramForPerson {
    public static void main(String[] args) {

        System.out.println(method2());

    }
    public static boolean isHeightLowerThen180(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Մուտքագրեք հասակը։ ");
        final int height = scanner.nextInt();
        return height<180;

    }
    public static boolean isAgeGT59(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Մուտքագրեք տարիքը։ ");
        final int age = scanner.nextInt();
        return age>59;

    }
    public static boolean isWeightEq50(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Մուտքագրեք քաշը։ ");
        final int weight = scanner.nextInt();
        return weight==50;
    }
    public static String method2(){
        boolean heightLowerThen180 = isHeightLowerThen180();
        boolean ageGT59 = isAgeGT59();
        boolean weightEq50 = isWeightEq50();
        return  (!heightLowerThen180 && weightEq50)||(heightLowerThen180&&weightEq50&& !ageGT59) ? "Պայմանը բավարարված է" : "Պայմանը բավարարված չէ";
    }
}
