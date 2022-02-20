package com.aca.homework.week6.tictactoe;

public class Board {

    String[][] board = new String[3][3];

    public void fillBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "*";
            }
        }
    }

    public void printBoard() {
        System.out.println("- " + 1 + " " + 2 + " " + 3);
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
