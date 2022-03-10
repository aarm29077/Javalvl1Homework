package com.aca.classwork.classwork13.perfomance;

public class StringMakerResult {

    private String text;
    private long duration;

    public StringMakerResult(String text, long duration) {
        this.text = text;
        this.duration = duration;
    }

    public String getText() {
        return text;
    }

    public long getDuration() {
        return duration;
    }

}
