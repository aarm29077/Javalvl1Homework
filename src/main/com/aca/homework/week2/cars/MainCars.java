package com.aca.homework.week2.cars;

public class MainCars {
    public static void main(String[] args) {
        Cars[] cars = new Cars[41];
        for (int i = 0; i < cars.length; i++) {
            Cars cars1 = new Cars();
            cars1.brand = "Porsche";
            cars1.year = 1980 + i;
            cars[i] = cars1;
        }
        Cars[] ourCars = carsBefore2010(cars);
        printCars(ourCars);
    }

    public static void printCars(Cars[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].year);
        }
    }

    public static Cars[] carsBefore2010(Cars[] cars) {
        int capacity = 31;
        Cars[] carsArray = new Cars[capacity];
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i] = cars[i];
        }
        return carsArray;
    }

    public static Cars[] carsAfter2010(Cars[] cars) {
        int capacity = 10;
        Cars[] carsArray = new Cars[capacity];
        for (int i = 0; i < capacity; i++) {
            carsArray[i] = cars[i + 31];
        }
        return carsArray;
    }
}