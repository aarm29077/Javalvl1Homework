package com.aca.homework.week2.user.creation;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User[] persons = new User[3];
        User user1 = new User();
        user1.name = "Mary";
        user1.height = 170;
        persons[0] = user1;
        User user2 = new User();
        user2.name = "Grace";
        user2.height = 169;
        persons[1] = user2;
        User user3 = new User();
        user3.name="Nicolas";
        user3.height=175;
        persons[2]=user3;
        printUser(persons);
    }

    //    public static void inputArguments(User[] user){
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < user.length; i++) {
//            User ourUser = new User();
//            System.out.print("Input name: ");
//            ourUser.name= scanner.nextLine();
//            System.out.print("Input height: ");
//            ourUser.height=scanner.nextInt();
//            user[i]=ourUser;
//
//            scanner.nextLine();
//        }
    public static void printUser(User[] user) {
        for (int i = 0; i < user.length; i++) {
            System.out.println("The name is: " + user[i].name + ", " + user[i].name + "'s height is: " + user[i].height);
        }
    }

}


