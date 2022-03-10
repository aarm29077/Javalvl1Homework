package com.aca.classwork.classwork13.annotations;

import classwork13.perfomance.StringMakerResult;

@LowPerformance
public class BadStringMaker implements StringMaker {

    @Override
    @LowPerformance
    public StringMakerResult make(int start, int end) {

        String text = "";

        long startMillis = System.currentTimeMillis();

        for (int i = start; i < end; i++) {
            text += i;
        }

        return new StringMakerResult(
                text,
                System.currentTimeMillis() - startMillis
        );
    }
}
