package com.aca.classwork.classwork13.perfomance;

//HighPerformance
public class GoodStringMaker implements StringMaker {

    @Override
    public StringMakerResult make(int start, int end) {
        long startMillis = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = start; i < end; i++) {
            builder.append(i);
        }

        String text = builder.toString();

        return new StringMakerResult(
                text,
                System.currentTimeMillis() - startMillis);
    }
}
