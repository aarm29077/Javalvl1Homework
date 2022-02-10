package com.aca.homework.week5.exam;

public class Test {
    public static void main(String[] args) {

        Exam[] examsArray = new Exam[2];

        FailedExamTest firstUser = new FailedExamTest("username1", false);
        PassedExamTest secondUser = new PassedExamTest("smart-username", true);

        examsArray[0] = firstUser;
        examsArray[1] = secondUser;

        print(examsArray);
    }

    public static void print(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}