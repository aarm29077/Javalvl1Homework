package com.aca.classwork.classwork12.clone;

public class Animal implements Cloneable{

     AnimalType type;
     private String name;

    Animal(AnimalType type, String name){
        this.type=type;
        this.name=name;
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (Animal) clone;
//        return (Animal) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new Animal(AnimalType.PREDATOR,"Tiger");
        System.out.println(tiger.clone().getClass());
    }

}
