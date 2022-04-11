package com.aca.classwork.classwork22.lambda;

import java.util.List;

public class ForeachMain {
    public static void main(String[] args) {
        List<String> list = List.of("String1", "String2");

        list.forEach(s -> System.out.println(s));
    }
}
