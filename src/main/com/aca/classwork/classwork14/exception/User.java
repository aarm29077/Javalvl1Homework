package com.aca.classwork.classwork14.exception;


public class User {

    private String username;
    private String firstName;

    public User(String username, String firstName) {
        if (username == null) {
            throw new IllegalArgumentException("the username is null");
        }//IllegalArgumentException is a RuntimeException. Himnakanum ogtagorcumen IllegalArgumentException y
        if (firstName == null) {
            throw new IllegalArgumentException("the firstName is null");
        }
        this.username = username;
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }
}
