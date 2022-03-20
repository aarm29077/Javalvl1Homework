package com.aca.classwork.classwork18.map.user;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        User user = new User("username", 15);
//        System.out.println(user.hashCode());
//
//        User user2 = new User("username2", 15);
//        System.out.println(user2.hashCode());
//
//        User user3 = new User("username2", 15);
//        System.out.println(user3.hashCode());

        User user1 = new User("username1", 45);
        User user2 = new User("username1", 45);
        Map<User, Integer> userCarCount = new HashMap<>();
        userCarCount.put(user1, 1);
        user1.setAge(9);
        System.out.println(
//                userCarCount.containsKey(user2)
                userCarCount.containsKey(new User("Sargis", 18))

        );
    }
}
