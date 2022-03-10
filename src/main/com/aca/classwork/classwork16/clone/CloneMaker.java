package com.aca.classwork.classwork16.clone;

public class CloneMaker<T extends ConstructorCloneable<T>>{//genericneri depqum extends y u implementsy grvumen erkusnel extends

    public static void main(String[] args) {
        CloneMaker<Car> carCloneMaker = new CloneMaker<>();
        carCloneMaker.printCloneAndPrint(new Car(54));

        CloneMaker<Computer> computerCloneMaker = new CloneMaker<>();
        computerCloneMaker.printCloneAndPrint(new Computer("dell"));


    }
    public T printCloneAndPrint(T input){

        System.out.println(input);
        T newCloneObject = input.doClone();
        System.out.println(newCloneObject);
        return newCloneObject;
    }

}