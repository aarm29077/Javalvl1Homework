package com.aca.homework.week6.tictactoe;

import java.util.Scanner;

public class BoardPixel {
    Coordinate coordinate;
    Board boardObject;
    private int count = 0;


    public void fillBoard() {
        if ((count == 0 || count % 2 == 0) && !isExist()) {
            boardObject.board[coordinate.x][coordinate.y] = State.X.toString();
        } else if (count % 2 == 1 && !isExist()) {
            boardObject.board[coordinate.x][coordinate.y] = State.O.toString();
        } else {
            System.out.println("Already exist!! ");
        }
        ++count;
    }

    public boolean isExist() {
        if (boardObject.board[coordinate.x][coordinate.y].equals("*")) {
            return false;
        } else {
            System.out.println("Write again!!");
            return true;
        }
    }


    public void printBoard() {
        System.out.println("- " + 1 + " " + 2 + " " + 3);
        for (int i = 0; i < boardObject.board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < boardObject.board[i].length; j++) {
                System.out.print(boardObject.board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean isWon() {
        int countForX1 = 0;
        int countForO1 = 0;
        int countForX2 = 0;
        int countForO2 = 0;


        for (int i = 0; i < boardObject.board.length; i++) {
            if (boardObject.board[i][0].equals(boardObject.board[i][1]) && boardObject.board[i][0].equals(boardObject.board[i][2]) && !boardObject.board[i][0].equals("*")) {
                return true;
            } else if (boardObject.board[0][i].equals(boardObject.board[1][i]) && boardObject.board[0][i].equals(boardObject.board[2][i]) && !boardObject.board[0][i].equals("*")) {
                return true;
            } else if (boardObject.board[i][i].equals(State.X.toString())) {
                ++countForX1;
            } else if (boardObject.board[i][i].equals(State.O.toString())) {
                ++countForO1;
            } else if (boardObject.board[i][boardObject.board.length - 1 - i].equals(State.X.toString())) {
                ++countForX2;
            } else if (boardObject.board[i][boardObject.board.length - 1 - i].equals(State.O.toString())) {
                ++countForO2;
            }
        }

        return countForX1 == 3 || countForO1 == 3 || countForX2 == 3 || countForO2 == 3;
    }
}
