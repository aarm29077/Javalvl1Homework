package com.aca.homework.week6.tictactoe;


import java.util.Scanner;

public class Coordinate {
    private int x;
    private int y;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void inputCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dear " + user.getUsername() + " it's your turn: ");
        String coordinates = scanner.next();
        if (((coordinates.charAt(1) - 48) >= 0 && (coordinates.charAt(1) - 48) <= 3) && ((coordinates.charAt(3) - 48) >= 0 && (coordinates.charAt(3) - 48) <= 3)) {
            x = coordinates.charAt(1) - 48 - 1;
            y = coordinates.charAt(3) - 48 - 1;
            setX(x);
            setY(y);
        } else {
            System.out.println("The index is wrong !!");
        }
    }
}
