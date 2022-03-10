package com.aca.homework.week4.image;

public class Image {

    private int verticalLength;
    private int horizontalLength;
    private char[][] pixel;

    public Image(int verticalLength, int horizontalLength) {
        this.verticalLength = verticalLength;
        this.horizontalLength = horizontalLength;
        this.pixel = new char[verticalLength][horizontalLength];
        fill();
    }

    public void fill() {
        for (int i = 0; i < pixel.length; i++) {
            for (int j = 0; j < pixel[i].length; j++) {
                pixel[i][j] = '-';
            }
        }
    }

    public void show() {
        for (int i = 0; i < pixel.length; i++) {
            for (int j = 0; j < pixel[i].length; j++) {
                System.out.print(pixel[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void draw(int verticalIndex, int horizontalIndex) {
        pixel[verticalIndex][horizontalIndex] = '*';

    }

}
