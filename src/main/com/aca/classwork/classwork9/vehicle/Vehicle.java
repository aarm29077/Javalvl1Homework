package com.aca.classwork.classwork9.vehicle;

public class Vehicle {
    //MOTORCYCLE, CAR, BUS
    private String type;
    //SUZUKI , OPEL , MAN
    private String brand;

    private int year;

    public Vehicle(String type, String brand, int year) {
        if (type.equals("MotorCycle") || type.equals("Car") || type.equals("Bus")) {
            this.type = type;
            this.brand = brand;
            this.year = year;
        }else{
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        new Vehicle("asdfghja","Bmw",444);
        System.out.println("Stopppp");
    }
}
