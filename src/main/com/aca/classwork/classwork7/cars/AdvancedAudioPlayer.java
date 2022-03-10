package com.aca.classwork.classwork7.cars;

public class AdvancedAudioPlayer extends AudioPlayer {
    //sub class                 //super class
    public static void main(String[] args) {
//        AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();
//        advancedAudioPlayer.play();
//
//        advancedAudioPlayer.setPLaying(false);
        new AdvancedAudioPlayer();
    }

    public AdvancedAudioPlayer() {
        System.out.println("AdvancedAudioPlayer");
    }

    @Override
    public void play() {
        super.play();
    }

    public void pause() {
        System.out.println("Paused!!");
    }
}
