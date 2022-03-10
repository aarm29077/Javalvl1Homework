package com.aca.classwork.classwork5.game;

public class Player {
    String username;
    Game[] game;

    public void print() {
        System.out.println("username: " + username);

        for (int i = 0; i < game.length; i++) {
            game[i].print();
        }
    }

}
