package com.aca.classwork.classwork5.game;

public class Game {
    String name;
    long shootCount;
    static long numberOfCalls;

    public static void main(String[] args) {
        Game game1 = new Game();
        game1.name = "game 1";
        for (int i = 0; i < 5; i++) {
            game1.fire();
        }

        System.out.println();

        Game game2 = new Game();
        game2.name = "game 2";
        for (int i = 0; i < 125; i++) {
            game2.fire();
        }

        System.out.println(game1.shootCount);
        System.out.println(game2.shootCount);
        System.out.println();

        game1.print();
        game2.print();
        System.out.println(numberOfCalls);
    }

    public void fire(){
        shootCount++;
        System.out.println(name + " fire" );
        sum();
    }

    public void sum(){
        numberOfCalls++;
    }

    public void print(){
        System.out.println("name: " + name + ", shoot: " + shootCount);
    }
}















//    public static void main(String[] args) {
//        Game firstGame = new Game();
//        firstGame.name = "game 1";
//        Game secondGame = new Game();
//        secondGame.name = "game 2";
//        int sum=0;
//
//        for (int i = 0; i < 5; i++) {
//            firstGame.fire();
//            sum++;
//        }
//        System.out.println();
//        for (int i = 0; i < 125; i++) {
//            secondGame.fire();
//            sum++;
//        }
//        System.out.println(sum);
//
//    }
//
//    public void fire() {
//        shootCount++;
//        System.out.println(name);
//    }















































//    static long shootCountOfClass;
//
//    String name;
//    long shootCount;
//
//    public static void main(String[] args) {
//        shootCountOfClass++;
//        shootCountOfClass++;
//        shootCountOfClass++;
//        shootCountOfClass++;
//
//        Game game1 = new Game();
//        game1.name = "game 1";
//        game1.shootCount++;
//        game1.shootCount++;
//        game1.shootCount++;
//
//        Game game2 = new Game();
//        game2.name = "game 2";
//        game2.shootCount++;
//
//        Game game3 = new Game();
//        game3.name = "game 2";
//
//        printShootCount(game1);
//        game1.printShootCountForObject();
//
//        printShootCount(game2);
//        game2.printShootCountForObject();
//
//        printShootCount(game3);
//        game3.printShootCountForObject();
//    }
//
//    public static void printShootCount(Game game) {
//        System.out.println(game.shootCount);
//    }
//
//    public static void printShootCountForClass(Game game) {
//        System.out.println(shootCountOfClass + game.shootCount);
//    }
//
//    public void printShootCountForObject() {
//        System.out.println(shootCount + "   " + shootCountOfClass);
//    }

