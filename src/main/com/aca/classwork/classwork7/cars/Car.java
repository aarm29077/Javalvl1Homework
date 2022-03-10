package com.aca.classwork.classwork7.cars;

public class Car {

    private AudioPlayer audioPlayer;

    public Car() {

    }

    public Car(AudioPlayer audioPlayer) {
        this.audioPlayer=audioPlayer;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setAudioPlayer(new AudioPlayer());
        //car1 and car 2 is the same
        Car car2 = new Car(new AudioPlayer());
        Car car3 = new Car(null);

    }

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void openedDoor() {
        if (audioPlayer != null) {
            audioPlayer.play();
            wait3Second();
            audioPlayer.stop();
        } else {
            System.out.println("Door is opened");
        }

    }

    public static void wait3Second() {
        long startMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - startMillis < 3000) {

        }

    }


}
