package com.aca.homework.week9.donate;

/*
Create an AcaSmile generic class that has buyWithDonation method and takes a generic object, prints
that the provided good is bought, and accumulates the donated amount to the total donated amount.
AcaSmile also has a method to get the total donated amount.

 */
public class AcaSmile<T extends Donatable> {

    private int startingSize = 3;

    private Object[] purchasedGoods;

    private int count;

    private double allDonatedAmount;

    public AcaSmile() {
        purchasedGoods = new Donatable[startingSize];
    }

    double buyWithDonation(T obj) {
        if (obj == null) {
            return 0;
        }
        System.out.println("The " + obj.getClass() + " is bought.");
        allDonatedAmount += obj.donationAmount();
        return obj.donationAmount();
    }

    public double getAllDonatedAmount() {
        return allDonatedAmount;
    }

    public Object[] getPurchasedGoods() {
        return purchasedGoods;
    }

    public void setPurchasedGoods(T o) {
        if (count < startingSize) {
            purchasedGoods[count] = o;
        } else {
            Object[] newPurchasedGoods = new Donatable[purchasedGoods.length * 2];
            for (int i = 0; i < purchasedGoods.length; i++) {
                newPurchasedGoods[i] = purchasedGoods[i];
            }
            newPurchasedGoods[count] = o;
            purchasedGoods = newPurchasedGoods;
        }
        ++count;

    }
}
