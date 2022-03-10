package com.aca.classwork.classwork12.test;

public enum ResultType {
    FAIL("The execution is fail"),
    PASS("The execution is passed");

    //The user registration test execution is failed

    private String message;

    ResultType(String message) {
        this.message = message;
    }

    public String getTextExecutionMessage(String testName) {
        return testName + " " + message;
    }
}
