package com.aca.classwork.classwork12.anonymous;

public class UserImpl implements User {

    private String name;
    private int age;

    public UserImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
