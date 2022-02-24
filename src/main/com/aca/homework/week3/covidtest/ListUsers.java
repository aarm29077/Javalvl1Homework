package main.com.aca.homework.week3.covidtest;

public class ListUsers {
    public static void main(String[] args) {
        CovidTest firstPerson = new CovidTest();
        User user1 = new User();
        user1.name = "Mark";
        user1.code = "mark789";
        firstPerson.positive = "Positive";
        firstPerson.person = user1;

        firstPerson.print();
        System.out.println();
        System.out.println();

        CovidTest secondPerson = new CovidTest();
        User user2 = new User();
        user2.name = "Jane";
        user2.code = "jane45";
        secondPerson.positive = "Positive";
        secondPerson.person = user2;

        CovidTest thirdPerson = new CovidTest();
        User user3 = new User();
        user3.name = "Kate";
        user3.code = "kate876&";
        thirdPerson.positive = "Negative";
        thirdPerson.person = user3;

        printCovidTest(firstPerson, secondPerson, thirdPerson);

    }

    public static void printCovidTest(CovidTest firstPerson, CovidTest secondPerson, CovidTest thirdPerson) {
        System.out.println(firstPerson.positive + " " + firstPerson.person.name + " " + firstPerson.person.code);
        System.out.println(secondPerson.positive + " " + secondPerson.person.name + " " + secondPerson.person.code);
        System.out.println(thirdPerson.positive + " " + thirdPerson.person.name + " " + thirdPerson.person.code);
    }
}
