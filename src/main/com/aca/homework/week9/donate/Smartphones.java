package com.aca.homework.week9.donate;

public class Smartphones implements Donatable {

    private double price;

    public Smartphones(double price) {
        this.price = price;
    }

    @Override
    public double donationAmount() {
        return price / 20;
    }
}
