package main.com.aca.homework.week4.time;


public class Test {

    public static void main(String[] args) {
        long millis = 86400;

        Time time = new Time(millis);
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        System.out.println(time.getSeconds());

    }

}
