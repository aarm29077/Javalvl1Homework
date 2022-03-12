package com.aca.homework.week6.tictactoe;

public class Game {
    public static void main(String[] args) {
        System.out.println("Tic-tac-toe started!");
        waitSecond();

        User user1 = new User();
        user1.setUsername(1);
        User user2 = new User();
        user2.setUsername(2);

        Board board = new Board();
        board.fillBoard();
        board.printBoard();


        Coordinate coordinate1 = new Coordinate();
        coordinate1.setUser(user1);

        Coordinate coordinate2 = new Coordinate();
        coordinate2.setUser(user2);

        BoardPixel boardPixel = new BoardPixel();

        boardPixel.boardObject = board;
        boardPixel.setCoordinate(coordinate1);
        boardPixel.setCoordinate(coordinate2);


        String result = Result.LOST.toString();


        while (!boardPixel.isWon()) {

            coordinate1.inputCoordinates();
            while (boardPixel.isExist()) {
                coordinate1.inputCoordinates();
            }
            boardPixel.fillBoard();
            boardPixel.printBoard();
            if (!boardPixel.isWon()) {
                coordinate2.inputCoordinates();
                while (boardPixel.isExist()) {
                    coordinate2.inputCoordinates();
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
