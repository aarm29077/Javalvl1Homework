package com.aca.classwork.classwork11.clone;

//het gnaly ctrl+e  , kam  alt dzax, alt aj
class ComputerTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer = new Computer(Brand.DELL);

        Object clone = computer.clone();
    }

}