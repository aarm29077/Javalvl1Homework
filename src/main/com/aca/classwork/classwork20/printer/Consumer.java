package com.aca.classwork.classwork20.printer;

import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        list.forEach(new java.util.function.Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
