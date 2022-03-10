package com.aca.classwork.classwork6.bank;

public class AccountTest {


    public static void main(String[] args) {
        Account[] array = new Account[5];
        array[0] = new Account();

        Account first = new Account();
        first.money = 111;
        array[1] = first;

        Account second = new Account();
        second.money = 222;
        array[2] = second;

        mutate(array);

        int b = 1;
        mutateFirst(array, b);

        System.out.println("------------");

        System.out.println(array[1].money);

        System.out.println();

        mutateSecond(array);
        mutateArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mutate(Account[] array) {
        array[0] = null;
    }

    public static void mutateFirst(Account[] array, int a) {
        array[1].money = a;
    }

    public static void mutateArray(Account[] arrayInMethod) {
        arrayInMethod = null;
    }

    public static void mutateSecond(Account[] array) {
        array[2] = new Account();
    }
}
