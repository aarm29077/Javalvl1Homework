package com.aca.classwork.classwork7.cars;

public class AudioPlayer {

    private boolean isPLaying;
    public AudioPlayer(){
        System.out.println("AudioPlayer");
    }

    public void play() {
        isPLaying=true;
        System.out.println("Playing..");
    }

    public void stop() {
        isPLaying=false;
        System.out.println("Stopping..");
    }

    public void setPLaying(boolean PLaying) {
        isPLaying = PLaying;
    }
}
