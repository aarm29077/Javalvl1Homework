package com.aca.classwork.classwork18.runneable;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable mulRunnable = new MulRunnable(1, 9);
        Runnable substractingRunnable = new SubstractingRunnable(1, 9);
        Runnable sumRunnable = new SumRunnable(1, 9);

        List<Runnable> list = new LinkedList<>();
        list.add(mulRunnable);
        list.add(substractingRunnable);
        list.add(sumRunnable);

        mutate(list);
        runRunnable(list);
    }

    public static void mutate(List<Runnable> runnableList) {
        runnableList.remove(0);
        runnableList = null;
    }

    public static void runRunnable(List<Runnable> runnableList) {
        for (Runnable runnable : runnableList) {
            runnable.run();
        }
    }
}
