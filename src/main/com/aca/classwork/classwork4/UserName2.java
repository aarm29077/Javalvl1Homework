package com.aca.classwork.classwork4;
import java.util.Scanner;
public class UserName2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userName = new String[3];
        String[] userLastName = new String[3];
        int[] userAge = new int[3];
        inputUser(userName, userLastName, userAge);

        for (int i = 0; i < 3; i++) {
            printUserData(userName, userLastName, userAge, i);
            wait1Sec();

        }

    }

    public static void inputUser(String[] userName, String[] userLastName, int[] userAge) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input name: ");
            userName[i] = scanner.nextLine();

            System.out.println("Input LastName: ");
            userLastName[i] = scanner.nextLine();

            System.out.println("Input Age: ");
            userAge[i] = scanner.nextInt();

            scanner.nextLine();
        }
    }
    public static void printUserData(String[] userName, String[] userLastName, int[] userAge , int i){
        System.out.println(
                System.currentTimeMillis() + " " +
                        userName[i] + " " +
                        userLastName[i] + " " +
                        userAge[i]);

    }
    public static void wait1Sec(){
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }
}