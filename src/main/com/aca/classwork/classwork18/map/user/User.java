package com.aca.classwork.classwork18.map.user;

import java.util.Objects;

public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

/*    @Override
    public int hashCode() {
//        int hashCode = super.hashCode();
//        return hashCode;
        return super.hashCode();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        //return username != null ? username.equals(user.username) : user.username == null;
        return Objects.equals(username, user.username);
    }

    /*
    1.ete erku object irar havasar en, iranc hashcodery havasar en
    2.ete erku objectneri hashcodery irar havasar en, partadir chi vor objectnery irar havasar linen
    */
    @Override
    public int hashCode() {
//        int result = username != null ? username.hashCode() : 0;
//        result = 31 * result + age;
//        return result;

        return Objects.hash(username, age);
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
