package main.com.aca.homework.week3.test;

public class Main {
    //    Create a User having fields username and name. Create a CovidTest class that has fields user and result.
//    The result can be one of the following values: "undefined", "positive", "negative".
//    By default, the covid test result should be "undefined".
//    Make all User's and CovidTest's fields private.
//    Create a test() method in CovidTest class which in 3 seconds randomly set any test result.
//    Create a DrivingLicense class that has fields user and an array of granted license categories (may contain 'A', 'B, 'C', 'D', 'E')
//    There is a person having "vova_gasparyan" username and "Vova" name who gave a test and waiting to see his covid test result.
//    Before giving a test the policeman stopped Vova who had to show his driving license of BC type.
//    note: Only User, CovidTest, DrivingLicense, and Main classes should be created.

    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setUserName("Vova Gasparyan");
        firstUser.setName("Vova");

        CovidTest covidTest = new CovidTest();
        covidTest.setUser(firstUser);
        covidTest.test();

        System.out.println();

        DrivingLicense drivingLicense = new DrivingLicense();
        firstUser.setLicense(String.valueOf(drivingLicense.license[1] + "" + drivingLicense.license[2]));


        System.out.println("Policeman stopped !!");
        System.out.println(firstUser.getLicense());


    }
}
