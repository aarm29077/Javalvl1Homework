package com.aca.homework.week7.clone;

public class Light implements Cloneable {

    private State state;

    public Light(State state) {
        this.state = state;
    }

    public static Light staticLight(State state) {
        return new Light(state);
    }

    @Override
    protected Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}
