package main.com.aca.homework.week5.exam;

public class Test {
    public static void main(String[] args) {

        Exam[] examsArray = new Exam[2];

        Exam failedExamTest = new FailedExamTest("username1");
        Exam passedExamTest = new PassedExamTest("smart-username");

        examsArray[0] = failedExamTest;
        examsArray[1] = passedExamTest;

        print(examsArray);
    }

    public static void print(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}