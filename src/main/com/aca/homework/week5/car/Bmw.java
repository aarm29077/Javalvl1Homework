package main.com.aca.homework.week5.car;

public class Bmw extends Car {
    Brand brand;
    public Bmw(String color, double width, long weight) {
        super(color, width, weight);
        brand=Brand.BMW;
    }
}
