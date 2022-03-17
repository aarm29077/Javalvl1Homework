package com.aca.classwork.classwork16;

public class Generics<T1> {
    public void set1(User t) {
        System.out.println("user");
    }

    public void set1(T1 t) {
        System.out.println("user2");
    }

    public static void main(String[] args) {
        Generics<SubUser> userGenerics = new Generics<>();
        userGenerics.set1(new SubUser());
        System.out.println();
    }
}
