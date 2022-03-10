package com.aca.homework.week9.donate;

public class Watch implements Donatable {

    private double price;

    public Watch(double price) {
        this.price = price;
    }


    @Override
    public double donationAmount() {
        return price / 20;
    }
}
