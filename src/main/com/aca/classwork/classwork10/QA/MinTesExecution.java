package com.aca.classwork.classwork10.QA;

public class MinTesExecution extends TextExecution{

    public MinTesExecution() {
        super("Min execution test");
    }
    @Override
    public Result execute() {
        int min = Math.min(9, 99);
        if (min == 9) {
            return Result.Pass;
        } else {
            return Result.Fail;
        }

    }
}
