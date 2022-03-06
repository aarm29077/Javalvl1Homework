package com.aca.homework.week3.license.covid.test;

public class User {

    private String userName;
    private String name;
    private String license;

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
