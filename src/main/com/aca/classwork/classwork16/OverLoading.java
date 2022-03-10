package com.aca.classwork.classwork16;

public class OverLoading {
    public void invoke(Object o) {
        System.out.println("o");
    }

    public void invoke(User o) {
        System.out.println("u");
    }

    public void invoke(SubUser o) {
        System.out.println("sub");
    }

    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        Object o = new User();
        User u = new User();
        SubUser su = new SubUser();

        overLoading.invoke(o);
        overLoading.invoke(u);
        overLoading.invoke(su);
    }

}
