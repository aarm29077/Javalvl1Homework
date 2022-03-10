package com.aca.classwork.classwork8.developer;

public class Printers {
    public static void main(String[] args) {


        Developer eric = new Developer("eric");

        System.out.println(eric.getClass().getDeclaredFields());
        String x = eric.getName();
        System.out.println(x);
        System.out.println(eric);





        System.out.println();
        print("heyyyy");
        print(564);
        print(new Developer("Harut"));

        int i = 456;
        Integer i1 = 456;
    }



    public static void printAllToStrings(Object[] developers){
        for (int i = 0; i < developers.length; i++) {
            System.out.println(developers[i].toString());
        }
    }
    public static void print(Object o){
        System.out.println("---- "+o.toString());
    }
//    public static void print(JuniorDeveloper juniorDeveloper){
//        System.out.println("---- "+ juniorDeveloper.toString());
//    }
//    public static void print(MidDeveloper juniorDeveloper){
//        System.out.println("---- "+ juniorDeveloper.toString());
//    }
//    public static void print(Developer developer){
//        System.out.println("---- "+ developer.toString());
//    }
}
