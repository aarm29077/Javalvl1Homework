package com.aca.homework.week4.image;

public class Test {
    public static void main(String[] args) {
        Image image = new Image(7,7);
        image.draw(1,2);
        image.draw(2,1);
        image.draw(2,2);
        image.draw(2,3);

        image.show();
    }
}
