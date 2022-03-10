package main.com.aca.homework.week4.time;

/*
Create a Time method that takes seconds of a day in a constructor (starting from 00:00:00) and provides 3 method to get hours, minutes and seconds of the time.

Time time = new Time(0)
time.getSeconds() -> should return 0
time.getMinutes() -> should return 0
time.getHours() -> should return 0

Time time = new Time(3600+5*60+6)
time.getSeconds() -> should return 6
time.getMinutes() -> should return 5
time.getHours() -> should return 1
print the result of each method invocation
 */
public class Time {
    long seconds;

    public Time(long millis) {
        if (millis >= 0 && millis <= 86400) {
            this.seconds = millis;
        } else {
            System.out.println("Out of range");
        }
    }

    public long getSeconds() {
        return seconds % 60;

    }

    public long getMinutes() {//3820
        return seconds % 3600 - seconds % 60;

    }

    public long getHours() {
        return seconds / 3600;

    }


}
