package com.aca.classwork.classwork10.QA;

public class MaxTestExecution extends TextExecution {

    public MaxTestExecution() {
        super("Max execution test");
    }

    @Override
    public Result execute() {
        int max = Math.max(9, 99);
        if (max == 99) {
            return Result.Pass;
        } else {
            return Result.Fail;
        }

    }
}
