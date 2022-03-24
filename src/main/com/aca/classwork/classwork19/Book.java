package com.aca.classwork.classwork19;

import java.util.*;

public class Book implements Comparable<Book> {

    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
 /*       String s1 = "name";
        String s2 = args[0];
        System.out.println(s1);
        System.out.println(s2);*/

//        Set<Book> books = Set.of(
//                new Book("effective", 54.99)
//        );

//        Set<Book> books1 = new HashSet<>();


        //strategy
        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Set<Book> books1 = new TreeSet<>();
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("effective", 54.99));
        books1.add(new Book("apush@", 40));
        for (Book book : books1) {
            System.out.println(book);
        }
        Book book = new Book(args[0], Double.parseDouble(args[1]));
        System.out.println("We are searching the book which " + book);
        System.out.println(books1.contains(book));
        System.out.println(books1.size());


        System.out.println();
        System.out.println();

        String s1 = "ab";
        String s2 = "ab";
        String s3 = "Ab";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));

        if (true) {
            return;
        }
    }

    @Override
    public String toString() {
        return "name = " + name + ", price = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Book o) {
//        return 0;//nshanakum a vor et elementy kar
        //ete compare aneluc drakan tiv e return anum, uremn nor tivy naxord avelacracic mec er, ete bacasakan`poqr er , ete 0`havasar en

        int result = this.name.compareTo(o.name);
        if (result == 0) {
//            return (int) (this.price - o.price);
            return Double.valueOf(this.price).compareTo(o.price);
        } else {
            return result;
        }
    }

    public static void print1(List<Integer> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void print2(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
