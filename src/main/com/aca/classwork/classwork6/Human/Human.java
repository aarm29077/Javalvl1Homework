package com.aca.classwork.classwork6.Human;

public class Human {

    private String name;
    private double height;

    public Human() {
    }

    public Human(String nameValue, double heightValue) {
        setName(nameValue);
        setHeight(heightValue);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newValue) {
        this.name = newValue;
    }

    public void setHeight(double newValue) {
        if (newValue > 50) {
            this.height = newValue;
        } else {
            throw new RuntimeException("The height is less than a 50");
        }
    }

    public String getStringRepresentation() {
        return "name " + name + ", height " + height;
    }

}
