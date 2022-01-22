package com.aca.homework.week2.user.creation;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User[] persons = new User[3];
        inputArguments(persons);
        printUser(persons);
    }
    public static void inputArguments(User[] user){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < user.length; i++) {
            User ourUser = new User();
            System.out.print("Input name: ");
            ourUser.name= scanner.nextLine();
            System.out.print("Input height: ");
            ourUser.height=scanner.nextInt();
            user[i]=ourUser;

            scanner.nextLine();
        }
    }
    public static void printUser(User[] user){
        for (int i = 0; i < user.length; i++) {
            System.out.println("The name is: "+user[i].name + ", " + user[i].name + "'s height is: " + user[i].height );
            wait1Second();
        }
    }
    public static void wait1Second(){
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }
}


