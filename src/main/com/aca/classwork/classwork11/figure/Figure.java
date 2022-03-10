package com.aca.classwork.classwork11.figure;

public class Figure {

    double width;
    double height;
    double radius;

    FigureType type;

    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
        type = FigureType.RECTANGLE;
    }

    public Figure(double radius) {
        type = FigureType.CIRCLE;
    }

    public static Figure OfRectangle(double width, double height) {
//        Figure figure = new Figure();
//        figure.height=height;
//        figure.width=width;
//        return figure;
        return new Figure(width, height);
    }

    public static Figure OfCircle(double radius) {
        return new Figure(radius);
    }

    public FigureType getType() {
        return this.type;
    }

    public double area() {
        return type == FigureType.RECTANGLE ? (this.width * this.height) : (Math.PI * radius * radius);

//        if (type==FigureType.RECTANGLE){
//        return this.width * this.height;
//    }else{
//            return Math.PI*radius*radius;
//        }
    }

    public double perimeter() {
        return type == FigureType.RECTANGLE ? (2 * (this.width + this.height)) : (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return type == FigureType.CIRCLE ? ("Circle : radius : " + radius) : ("Rectangle width : " + width + "Rectangle height: " + height);
    }
}

