package com.aca.classwork.classwork12.anonymous;

public class Main {
    public static void main(String[] args) {
        User user1 = new UserImpl("Name",15);
        User user2 = User.of("Name",15);

        User user3 = new User() {
            @Override
            public String getName() {
                return "Hrach";
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
        //        System.out.println(user3.getName());

        User user4 = User.ofImpl("Karen",96);
        System.out.println(user4.getName());


    }
}
