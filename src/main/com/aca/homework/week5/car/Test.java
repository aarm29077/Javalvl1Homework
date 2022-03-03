package main.com.aca.homework.week5.car;
/*
Create Car class that has color, width, weight, and brand fields and getters only. All fields of the Car class should be initialized within a constructor.
Create Hyundai and Bmw subclasses.
Ask a user to input color, width, weight and brand name 5 times, create a car object based on the input fields and add them in an array. if the inputed brand name is other than 'bmw' or 'hyundai' just ignore it and do not create an object.
Implement toString methods in Car class.
Create a method that takes array of objects and for each object print the following
"1) brand: bmw, white: red, width: 5, wight 1200"
"2) brand: hyundai, color: red, width: 5, wight 1300"
..
"5) brand: bmw, color: black, width: 6, wight 1500"
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car[] carsArray = new Car[5];
        for (int i = 0; i < carsArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input color: ");
            String color = scanner.next();
            System.out.print("Input width: ");
            double width = scanner.nextDouble();
            System.out.print("Input weight: ");
            long weight = scanner.nextLong();
            System.out.print("Input brand: ");
            String brand = scanner.next();
            Car car = new Car(color, width, weight);
            if (brand.equals("bmw") || brand.equals("hyundai")) {
                carsArray[i] = car;
            }
        }
        print(carsArray);
    }
    public static void print(Object[] object) {
        for (int i = 0; i < object.length; i++) {
            if (object[i] != null) {
                System.out.println((i + 1) + ") " + object[i].toString());
            }
        }
    }
}
