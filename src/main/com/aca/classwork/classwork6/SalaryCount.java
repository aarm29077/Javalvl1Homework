package com.aca.classwork.classwork6;

public class SalaryCount {
    public static void main(String[] args) {
        double  salary = 150000;
        Count(salary);
    }
    public static void Count(double  salary){
        for (int i = 0; i < 365 ; i++) {
            salary = salary + salary/100;
//            System.out.println(salary);
        }
        System.out.println(salary);
    }

}
