package com.aca.homework.week7.singleton;

public class SingletonUserServiceTest {
    /*
     * Create the SingletonUserService class that has a private constructor. Create a static factory getInstance() method
     * that returns an object of the SingletonUserService if it is already created, otherwise creates and returns it.
     *
     * ստեղծում եք նաև SingletonUserServiceTest  class test folder-ի com.aca.homework.week7.singleton package-ում (ctrl+shift+T),
     * main method-ի մեջ ստեղծում եք 4 object getInstance()-ի միջոցով, համեմատում դրանք ==֊ի միջոցով, տպում և տեսնում եք որ true է տպվել
     * */

    public static void main(String[] args) {
        SingletonUserService singletonUserService1 = SingletonUserService.getInstance();
        SingletonUserService singletonUserService2 = SingletonUserService.getInstance();
        SingletonUserService singletonUserService3 = SingletonUserService.getInstance();
        SingletonUserService singletonUserService4 = SingletonUserService.getInstance();

        System.out.println(singletonUserService1 == singletonUserService2);
        System.out.println(singletonUserService3 == singletonUserService4);
        System.out.println(singletonUserService1 == singletonUserService3);
        System.out.println(singletonUserService2 == singletonUserService4);

    }
}
