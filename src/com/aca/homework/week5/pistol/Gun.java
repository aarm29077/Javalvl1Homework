package com.aca.homework.week5.pistol;

public class Gun {
    private String name;
    private String shoot;

    public String getName() {
        return name;
    }

    public String getShoot() {
        return shoot;
    }

    @Override
    public String toString() {
        return getName() + ": " + getShoot() ;
    }
}
