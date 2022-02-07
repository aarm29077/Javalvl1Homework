package com.aca.homework.week4.image;

public class Image {

     int verticalLength ;
     int horizontalLength;

    public Image(int verticalLength,int horizontalLength){
        this.verticalLength=verticalLength;
        this.horizontalLength=horizontalLength;

    }
    char[][] pixel = new char[verticalLength][horizontalLength];

    public void input(){
        for (int i = 0; i < pixel.length; i++) {
            for (int j = 0; j < pixel[verticalLength].length; j++) {
                pixel[i][j] = '-';
            }
        }
    }

    public void show(){
        for (int i = 0; i < pixel.length; i++) {
            for (int j = 0; j < pixel[verticalLength].length; j++) {
                System.out.println(pixel[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void draw(int verticalIndex , int horizontalIndex){
        pixel[verticalIndex][horizontalIndex]='*';

    }

}
