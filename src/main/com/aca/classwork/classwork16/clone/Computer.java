package com.aca.classwork.classwork16.clone;

public class Computer implements ConstructorCloneable<Computer> {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public Computer doClone() {
        return new Computer(this.brand);
    }

    @Override
    public String toString() {
        return "Computer " + brand;
    }
}
