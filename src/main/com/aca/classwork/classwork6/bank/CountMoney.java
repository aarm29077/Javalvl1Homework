package com.aca.classwork.classwork6.bank;

import java.util.Scanner;
import java.util.Scanner;

public class CountMoney {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Account[] accountArray = new Account[125];
        for (int i = 0; i < 2; i++) {

        }
        for (int i = 1; i <= 2; i++) {

            Account account = new Account();
            nameDeclare(account);
            account.money = 150000;
            account.money += 15000;

            for (int j = 0; j < 365; j++) {
                salaryCount(account);
            }
            accountArray[i] = account;

            System.out.print("Account " + i + " money : " + accountArray[i].money);
            System.out.println();
        }


    }

    public static void salaryCount(Account account) {
        account.money *= 1.01;
    }

    public static void nameDeclare(Account account) {
//        account.name="hsbc";
    }

}
