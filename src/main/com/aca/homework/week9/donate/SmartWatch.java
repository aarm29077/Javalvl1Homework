package com.aca.homework.week9.donate;

public class SmartWatch implements Donatable {

    private double price;

    public SmartWatch(double price) {
        this.price = price;
    }

    @Override
    public double donationAmount() {
        return price / 20;
    }
}
