package com.aca.classwork.classwork8.developer;

public class JuniorDeveloper extends Developer {
    private int salary;


    public JuniorDeveloper(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    public static void main(String[] args) {

        JuniorDeveloper yan = new JuniorDeveloper("Narek", 650000);
        yan.toString();
        yan.getSalary();
    }

}
