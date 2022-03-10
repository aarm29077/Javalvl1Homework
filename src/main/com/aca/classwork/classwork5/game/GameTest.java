package com.aca.classwork.classwork5.game;

public class GameTest {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.name = "gamdfghjkle 1";

        Game game2 = new Game();

        Player player1 = new Player();

        Game[] gameArray = new Game[]{game1, game2};

        player1.game = gameArray;
        player1.username = "aca";

        player1.print();
    }
}
