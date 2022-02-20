package com.aca.homework.week6.tictactoe;

public class Game {
    public static void main(String[] args) {
        System.out.println("Tic-tac-toe started!");
        waitSecond();

        User user1 = new User();
        user1.setUsername();
        User user2 = new User();
        user2.setUsername();

        Board board = new Board();
        board.fillBoard();
        board.printBoard();


        Coordinate coordinate = new Coordinate();
        user1.coordinate = coordinate;
        user2.coordinate = coordinate;

        BoardPixel boardPixel = new BoardPixel();
        boardPixel.boardObject = board;
        boardPixel.coordinate = coordinate;

        user1.ourBoardPixel = boardPixel;
        user2.ourBoardPixel = boardPixel;

        String result = Result.LOST.toString();

        while (!boardPixel.isWon()) {

            user1.inputCoordinates();
            while (boardPixel.isExist()) {
                user1.inputCoordinates();
            }

            boardPixel.fillBoard();
            boardPixel.printBoard();
            if (!boardPixel.isWon()) {
                user2.inputCoordinates();

                while (boardPixel.isExist()) {
                    user2.inputCoordinates();
                }
                boardPixel.fillBoard();
                boardPixel.printBoard();
            } else {
                result = Result.WIN.toString();
                break;
            }
        }
        if (result.equals(Result.LOST.toString())) {
            System.out.println(user2.getUsername() + " won!");
        } else {
            System.out.println(user1.getUsername() + " won!");
        }

    }

    public static void waitSecond() {
        long startMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - startMillis < 1000) {
        }
    }
}
