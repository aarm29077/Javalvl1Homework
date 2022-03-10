package com.aca.classwork.classwork16.clone;

public class Car implements ConstructorCloneable<Car> {
    private int age;

    public Car(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // clone-ery krknel,eeen jamanak clone y petq a super ov greinq vor minchev amenaverev superclassygnar hasner, clone aneluc chisht type ov clone aner, isk ete nor new aneinq mi tipi kaner clone inqy
    @Override
    public Car doClone() {
        return new Car(this.age);
    }

    @Override
    public String toString() {
        return "Car " + age;
    }
}


