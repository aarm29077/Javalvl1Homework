package com.aca.classwork.classwork14.exception;

public class Main {
    public static void main(String[] args) {
//        RuntimeException exception = new RuntimeException();
//        throw exception;
        System.out.println(createUSer().getFirstName());

    }

    public static User createUSer() {
        User user = null;
        try {
            user = new User(null, "first name");

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }

        if (user == null) {
            user = new User("ignore", "ignore");
        }
        return user;
    }

}
