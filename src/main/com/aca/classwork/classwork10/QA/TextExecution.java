package com.aca.classwork.classwork10.QA;

public abstract class TextExecution {

    private String description;

    public TextExecution(String description) {
        this.description = description;
    }

    public abstract Result execute();

    public void start() {
        printTestDescription();
        Result result = execute();
        printResult(result);
    }

    public void printTestDescription() {
        System.out.println("Starting the " + description);
    }

    public void printResult(Result result) {
        System.out.println("The result of " + description + " is " + result);


    }



}
