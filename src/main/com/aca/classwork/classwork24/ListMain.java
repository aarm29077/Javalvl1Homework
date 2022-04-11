package com.aca.classwork.classwork24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b");//veradarcnum e immutable list, read only

        System.out.println(list.add("asdfghj"));

        List<String> arrayList = new ArrayList<>();

        arrayList.add(" ");

        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
    }
}
