package com.aca.classwork.classwork11.figure.hierarchy;

public class CircleFigure implements Figure {
    private double radius;

    public CircleFigure(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
