package com.aca.homework.week7.clone;

public class LightTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light light1 = Light.staticLight(State.ON);
        Light light2 = Light.staticLight(State.OFF);

        Object clone1 = light1.clone();
        Object clone2 = light2.clone();


    }
}
