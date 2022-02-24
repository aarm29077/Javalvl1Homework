package com.aca.homework.week5.exam;

public class FailedExamTest extends Exam {
    public FailedExamTest(String username) {
        super(username);
        this.passed=false;
    }
}
