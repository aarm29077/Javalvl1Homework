package com.aca.homework.week12.params;

public class UserUpdateParams {
    private String username;
    private String firstName;
    private int age;


    public UserUpdateParams(String username, String firstName, int age) {
        if (username == null) {
            throw new RuntimeException("The username is null!!");
        }
        if (firstName == null) {
            throw new RuntimeException("The firstName is null!!");
        }
        if (age <= 0 || age > 115) {
            throw new RuntimeException("The age is inadmissible");
        }

        this.username = username;
        this.firstName = firstName;
        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
