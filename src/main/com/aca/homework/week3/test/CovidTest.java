package main.com.aca.homework.week3.test;

import java.util.Random;

public class CovidTest {

    private String result = "undefined";
    private User user;

    String[] array = new String[]{"undefined", "positive", "negative"};

    public void getResult() {
        result = array[new Random().nextInt(2)];
        System.out.println(result);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public void test() {
        wait3Seconds();
        getResult();
    }

    public void wait3Seconds() {
        long startMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - startMillis < 3000) {
        }
    }
}
