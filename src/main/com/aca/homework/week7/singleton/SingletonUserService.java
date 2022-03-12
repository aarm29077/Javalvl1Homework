package com.aca.homework.week7.singleton;

/*
 * Create the SingletonUserService class that has a private constructor. Create a static factory getInstance() method
 * that returns an object of the SingletonUserService if it is already created, otherwise creates and returns it.
 *
 * ստեղծում եք նաև SingletonUserServiceTest  class test folder-ի com.aca.homework.week7.singleton package-ում (ctrl+shift+T),
 * main method-ի մեջ ստեղծում եք 4 object getInstance()-ի միջոցով, համեմատում դրանք ==֊ի միջոցով, տպում և տեսնում եք որ true է տպվել
 * */
public class SingletonUserService {

    public static SingletonUserService singletonUserService = new SingletonUserService();

    private SingletonUserService() {

    }

    public static SingletonUserService getInstance() {
        if (singletonUserService == null) {
            singletonUserService = new SingletonUserService();
        }
        return singletonUserService;
    }
}
