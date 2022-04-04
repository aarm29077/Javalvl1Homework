package com.aca.classroom.week13.print;

public class SystemPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
