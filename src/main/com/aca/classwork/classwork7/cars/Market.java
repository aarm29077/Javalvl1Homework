package com.aca.classwork.classwork7.cars;

public class Market {
    public static Car carOption1() {
        Car car = new Car();
        AudioPlayer audioPlayer = new AudioPlayer();
        car.setAudioPlayer(audioPlayer);
        return car;
    }

    public static Car carOption2() {
        Car car = new Car();
        return car;
    }


    public static void main(String[] args) {

        Car car = carOption1();
        car.openedDoor();


//        Car car1 = carOption2();
//        car1.openedDoor();

    }


}
