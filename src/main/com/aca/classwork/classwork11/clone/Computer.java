package com.aca.classwork.classwork11.clone;

public class Computer implements Cloneable {


    private Brand brand;

    public Computer(Brand brand){
        this.brand=brand;

    }
    @Override
    protected Computer clone() throws CloneNotSupportedException {
            return (Computer) super.clone();

    }
}
