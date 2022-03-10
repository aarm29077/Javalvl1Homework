package com.aca.homework.week9.donate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
testWhenNothingIsBought() // assert that the total donated amount is 0
testWhenOneSmartphoneIsBought() // buy a Smartphone that has 100 price and assert that the total donated amount is 5
testWhenOneSmartphoneAndOneWatchIsBought() // buy a Smartphone that has 100 price, a Watch having a 200 price and assert that the total donated amount is 15
testWhenOneSmartphoneOneWatchAndOneSmartWatchIsBought() // buy a Smartphone that has 100 price, a Watch having a 200, a SmartWatch having a 1000 price and assert that the total donated amount is 65


keep a list of purchased goods' string representations in AcaSmile class and provide a method to get the list (array) of it.
Write a test and assert that the list is correct.
 */
class AcaSmileTest {
    @Test
    void testWhenNothingIsBought() {
        AcaSmile<Donatable> acaSmile = new AcaSmile<>();
        Assertions.assertEquals(0, acaSmile.buyWithDonation(null));
    }

    @Test
    void testWhenOneSmartphoneIsBought() {
        Smartphones smartphone = new Smartphones(100);
        AcaSmile<Donatable> acaSmile = new AcaSmile<>();
        Assertions.assertEquals(5, acaSmile.buyWithDonation(smartphone));
    }

    @Test
    void testWhenOneSmartphoneAndOneWatchIsBought() {
        Smartphones smartphone = new Smartphones(100);
        Watch watch = new Watch(200);
        AcaSmile<Donatable> acaSmile = new AcaSmile<>();
        double result = acaSmile.buyWithDonation(watch) + acaSmile.buyWithDonation(smartphone);
        Assertions.assertEquals(15, result);
    }

    @Test
    void testWhenOneSmartphoneOneWatchAndOneSmartWatchIsBought() {
        Smartphones smartphone = new Smartphones(100);
        Watch watch = new Watch(200);
        SmartWatch smartWatch = new SmartWatch(1000);
        AcaSmile<Donatable> acaSmile = new AcaSmile<>();
        acaSmile.buyWithDonation(smartphone);
        acaSmile.buyWithDonation(watch);
        acaSmile.buyWithDonation(smartWatch);
        Assertions.assertEquals(65, acaSmile.getAllDonatedAmount());
    }

    @Test
    void testCheckArray() {
        Smartphones smartphone = new Smartphones(100);
        Watch watch = new Watch(200);
        SmartWatch smartWatch = new SmartWatch(1000);
        AcaSmile<Donatable> acaSmile = new AcaSmile<>();
        acaSmile.setPurchasedGoods(smartphone);
        acaSmile.setPurchasedGoods(watch);
        Assertions.assertEquals(smartphone, acaSmile.getPurchasedGoods()[0]);
    }
}