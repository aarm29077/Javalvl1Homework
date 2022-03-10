package com.aca.classwork.classwork9.object;

import firstlesson.Main;

public class User {
    private String name;
    private String password;
    private int age;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String password, int age) {

        this.name = name;
        this.password = password;
        this.age = age;

    }

    public static void main(String[] args) {

        User user1 = new User("Koryun", "Koryun2005", 17);
        User user2 = new User("Koryun", "Koryun2005", 17);
        User user3 = new User("Koryun", "Koryun2005", 16);
        User user4 = new User("Koryun", "Koryun2005", 17);

//        SubUser subUser = new SubUser("Koryun", "Koryun2005",17);
//        System.out.println(user1.equals(subUser));
//        System.out.println();


//        System.out.println(user1==user2);    //.equals -y true ktar, bayc senc false e
//        System.out.println();


//        System.out.println(user1.equals(user2));
//        System.out.println(user2.equals(user4));
//        System.out.println();


//        User user8 = user3;
//        System.out.println(user3.equals(user8));
//        System.out.println();


//        User users[] = {user1, user2, user3, user3};
//        System.out.println(getUsersIndex(users, user1));


/*        1) a.equals(b) == b.equals(a)
        2) a.equals(null) --> false
        3) a.equals(a)--> true
        4) a.equals(b) is true, b.equals(c) is true => a.equals(c)-->true
        5) equals does not depends on invocation number
*/

        //1
        System.out.println("safgs".equals(user2));
        System.out.println(user3.equals("dsafsdg"));
        System.out.println();

        //2
        System.out.println(user1.equals(null));
        System.out.println();

        //3
        System.out.println(user1.equals(user1));
        System.out.println();

        //4
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user4));
        System.out.println(user1.equals(user4));
        System.out.println();
    }

    public static int getUsersIndex(User[] users, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (obj.getClass() != User.class)) {
            return false;
        }
        User user = (User) obj;

        return user.age == this.age
                && user.name.equals(this.name)
                && user.password.equals(this.password);
    }

}
