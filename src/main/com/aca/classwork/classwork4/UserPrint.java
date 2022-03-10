package com.aca.classwork.classwork4;

import java.util.Scanner;

public class UserPrint {
    public static void main(String[] args) {
        String[] userNames = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter the user name: ");
            userNames[i] = new Scanner(System.in).nextLine();
        }
        for (int i = 0; i < 3; i++) {
            long start = (System.currentTimeMillis() / 1000);
            while (System.currentTimeMillis() / 1000 == start) {

            }
            System.out.println(userNames[i]);

        }
    }
}