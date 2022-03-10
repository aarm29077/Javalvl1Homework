package com.aca.homework.week5.equals;

/*
Create an Owner class that has firstName and lastName. Implement toString and equals method.
Create a Motorcycle class that has a brand (SUZUKI, YAMAHA is allowed only) and an owner. Implement toString and equals methods of Motorcycle class.
Create a Motorcycle of YAMAHA type owner of which is 'Yorgantz' 'Mark.
Create a Motorcycle of YAMAHA type owner of which is 'Tavares 'Mark.
print the above objects, compare them and print the result.

 */
public class Test {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Mark", "Yorgantz");

        Owner owner2 = new Owner("Mark", "Tavares");

        Motorcycle motorcycle1 = new Motorcycle(owner1, BrandType.YAMAHA);
        Motorcycle motorcycle2 = new Motorcycle(owner2, BrandType.YAMAHA);

        System.out.println(motorcycle1.equals(motorcycle1));
        System.out.println(motorcycle1.equals(motorcycle2));

    }
}
