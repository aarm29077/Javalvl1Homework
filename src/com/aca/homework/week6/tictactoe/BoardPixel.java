package com.aca.homework.week6.tictactoe;

import java.util.Scanner;

import static com.aca.homework.week6.tictactoe.State.*;

public class BoardPixel {
    private Coordinate coordinate;
    Board boardObject;
    private int count = 0;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void fillBoard() {
        if ((count == 0 || count % 2 == 0) && !isExist()) {
            boardObject.board[coordinate.getX()][coordinate.getY()] = X;
        } else if (count % 2 == 1 && !isExist()) {
            boardObject.board[coordinate.getX()][coordinate.getY()] = O;
        } else {
            System.out.println("Already exist!! ");
        }
        ++this.count;
    }

    public boolean isExist() {
        if (boardObject.board[coordinate.getX()][coordinate.getY()] == EMPTY) {
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
            if (boardObject.board[i][0].equals(boardObject.board[i][1]) && boardObject.board[i][0].equals(boardObject.board[i][2]) && boardObject.board[i][0] != EMPTY) {
                return true;
            } else if (boardObject.board[0][i].equals(boardObject.board[1][i]) && boardObject.board[0][i].equals(boardObject.board[2][i]) && boardObject.board[0][i] != EMPTY) {
                return true;
            } else if (boardObject.board[i][i].equals(X)) {
                ++countForX1;
            } else if (boardObject.board[i][i].equals(O)) {
                ++countForO1;
            } else if (boardObject.board[i][boardObject.board.length - 1 - i].equals(X)) {
                ++countForX2;
            } else if (boardObject.board[i][boardObject.board.length - 1 - i].equals(O)) {
                ++countForO2;
            }
        }

        return countForX1 == 3 || countForO1 == 3 || countForX2 == 3 || countForO2 == 3;
    }
}
