package com.aca.classwork.classwork12.clone;

public class PredatorAnimal extends Animal{

    public PredatorAnimal(String name){
        super(AnimalType.PREDATOR, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new PredatorAnimal("tiger");
        Animal clonedPredator = tiger.clone();
        System.out.println(clonedPredator.getClass());
    }
}
