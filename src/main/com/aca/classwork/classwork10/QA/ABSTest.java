package com.aca.classwork.classwork10.QA;

public class ABSTest extends TextExecution {

    public ABSTest() {
        super("Abs test execute");
    }

    @Override
    public Result execute() {


        int number = Math.abs(-1000);
        if (number == 1000) {
            return Result.Pass;
        } else {
            return Result.Fail;
        }

    }
}
