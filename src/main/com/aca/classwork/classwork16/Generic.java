package com.aca.classwork.classwork16;

public class Generic<T1, T2> {//himnakan npataky compile error stanalne, vorpeszi sxalnery cuyc ta compilei jamanak voch te ashxatanqi jamanak

    public void set1(T1 t1) {
    }

    public T1 get() {
        return null;
    }

    public void set2(T2 t2) {
    }

    public static <T1> T1 identity(T1 input) {
        return input;
    }

    public static void main(String[] args) {

        Generic<Integer, String> generic1 = new Generic<>();
        Generic<Boolean, Short> generic = new Generic<>();

    }
}
