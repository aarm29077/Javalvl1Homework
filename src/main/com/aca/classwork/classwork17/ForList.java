package com.aca.classwork.classwork17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ForList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = Collections.emptyList();
//empty listy veradarcnum e datark list
        List<Integer> list4 = Collections.singletonList(7);
//empty listy ev singleton listy readonly en.


/*
for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
//        list.add(7);
//        list.add(14);
//        list.add(145);
//        list.add(14);
        printAll(list);
        */
    }

    public static void printAll(List<Integer> list) {
        long start = System.currentTimeMillis();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //iteratory amen angam next anelov sharjvum er araj, isk linked listov amen angam galiser 0ic eli gnumer
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
