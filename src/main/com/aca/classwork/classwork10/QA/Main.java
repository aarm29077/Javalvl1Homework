package com.aca.classwork.classwork10.QA;

public class Main {
    public static void main(String[] args) {
//        Math.abs()
        TextExecution [] textExecutions = {new MinTesExecution(), new MaxTestExecution() };
        startAll(textExecutions);

        ABSTest absTest = new ABSTest();
        absTest.start();
//        startAll(new TextExecution[]{new MaxTestExecution()) , new MinTesExecution()};
    }
    public static void startAll(TextExecution[] textExecutions){
        for (TextExecution textExecution : textExecutions) {
            textExecution.start();
            System.out.println();
        }
    }

}
