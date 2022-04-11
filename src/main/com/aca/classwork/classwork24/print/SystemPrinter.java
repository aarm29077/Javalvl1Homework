package com.aca.classwork.classwork24.print;



public class SystemPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
