package com.aca.homework.week6.tictactoe;

import java.util.Scanner;

public class User {
    private String username;
    Coordinate coordinate;

    BoardPixel ourBoardPixel;


    private int count = 0;

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        Scanner scanner = new Scanner(System.in);
        if (count == 0) {
            System.out.print("Please enter the name of the first user: ");
        } else if (count == 1) {
            System.out.print("Please enter the name of the second user: ");
        } else {
            System.out.println("There are many people");
            return;
        }
        this.username = scanner.next();

        ++count;
    }

    public void inputCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dear " + getUsername() + " it's your turn: ");
        String coordinates = scanner.next();
        if (((coordinates.charAt(1) - 48) >= 0 && (coordinates.charAt(1) - 48) <= 3) && ((coordinates.charAt(3) - 48) >= 0 && (coordinates.charAt(3) - 48) <= 3)) {
            coordinate.x = coordinates.charAt(1) - 48 - 1;
            coordinate.y = coordinates.charAt(3) - 48 - 1;
        } else {
            System.out.println("The index is wrong !!");
        }
    }
}
