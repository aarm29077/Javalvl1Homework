package com.aca.classwork.classwork6.Human;

public class HumanTest {

    public static void main(String[] args) {
//        human1.setName("Hayk");
//        human1.setHeight(160);
        Human human1 = new Human("Jane", 546);

        System.out.println(human1.getStringRepresentation());
        System.out.println();

        Human human2 = new Human("mark", 459);

        System.out.println(human2.getStringRepresentation());
        System.out.println();

        Human human3 = new Human("Fred", -498);

        System.out.println(human1.getName());
        System.out.println(human3.getStringRepresentation());

    }


}
