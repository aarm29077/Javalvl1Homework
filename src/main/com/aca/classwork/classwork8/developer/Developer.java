package com.aca.classwork.classwork8.developer;

public class Developer extends Object {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Developer developer = new Developer("John");
//        System.out.println(developer.toString());
//        System.out.println();

        Developer developer = new Developer("Arman");
        Developer developer1=new Developer("Arman");
        Developer developer2=developer1;

        System.out.println(developer2.equals(developer1));
        System.out.println(developer1==developer);
        System.out.println(developer.equals(developer1));
    }

    @Override
    public boolean equals(Object o) {
        Developer o1 = (Developer) o;
        return this.name.equals(o1.name);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return 60_000;
    }


    @Override
    public String toString() {
        return "name " + getName() + " salary " + getSalary();
    }
}


