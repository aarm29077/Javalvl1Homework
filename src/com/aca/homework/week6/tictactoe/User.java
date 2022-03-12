package com.aca.homework.week6.tictactoe;

import java.util.Scanner;

public class User {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(int index) {
        Scanner scanner = new Scanner(System.in);
        if (index == 1) {
            System.out.print("Please enter the name of the first user: ");
        } else if (index == 2) {
            System.out.print("Please enter the name of the second user: ");
        } else {
            System.out.println("There are many people");
            return;
        }
        this.username = scanner.next();
    }


}
