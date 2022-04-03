package com.aca.homework.week12.params;

public class UserCreateParams {
    private String username;
    private String firstName;
    private int age;

    private UserUpdateParams userUpdateParams;

    public void setUserUpdateParams(UserUpdateParams userUpdateParams) {
        this.userUpdateParams = userUpdateParams;
    }

    public UserCreateParams(UserUpdateParams userUpdateParams) {
        this.username = userUpdateParams.getUsername();
        this.firstName = userUpdateParams.getFirstName();
        this.age = userUpdateParams.getAge();
    }

    public String getUsername() {
//        if (username == null) {
//            throw new RuntimeException("The username is null!!");
//        }     //meaningless
        return username;
    }

    public String getFirstName() {
//        if (firstName == null) {
//            throw new RuntimeException("The firstName is null!!");
//        }     //meaningless
        return firstName;
    }

    public int getAge() {
//        if (age <= 0 || age > 115) {
//            throw new RuntimeException("The age is inadmissible");
//        }     //meaningless
        return age;
    }


}
