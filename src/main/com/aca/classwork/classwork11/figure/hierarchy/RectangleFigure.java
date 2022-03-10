package com.aca.classwork.classwork11.figure.hierarchy;


public class RectangleFigure implements Figure {
    private double width;
    private double height;

    public RectangleFigure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return width + height;
    }
}
