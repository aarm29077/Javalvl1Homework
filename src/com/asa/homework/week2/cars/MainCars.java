package com.asa.homework.week2.cars;

public class MainCars {
    public static void main(String[] args) {
        Cars[] cars = new Cars[41];
        for (int i = 0; i < cars.length; i++) {
            Cars cars1 = new Cars();
            cars1.brand = "Porsche";
            cars1.year = 1980 + i;
            cars[i] = cars1;
        }
            carsAfter2010(cars);
    }
    public static void carsBefore2010(Cars[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year<2010) {
                System.out.println(cars[i].brand + " " + cars[i].year);
            }
        }
    }
    public static void carsAfter2010(Cars[] cars){
        for (int i = 0; i < cars.length ; i++) {
            if (cars[i].year>2010){
                System.out.println(cars[i].brand + " " + cars[i].year);
            }
        }
    }

}