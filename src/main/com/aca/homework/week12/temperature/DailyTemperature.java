package com.aca.homework.week12.temperature;

public class DailyTemperature {

    private int dayNumber;
    private double degree;

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }


    @Override
    public String toString() {
        return "dayNumber=" + dayNumber + ", degree=" + degree;
    }
}
