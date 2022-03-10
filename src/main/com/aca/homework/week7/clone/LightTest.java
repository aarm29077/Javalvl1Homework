package main.com.aca.homework.week7.clone;
/*
Create a Light class that is a Cloneable. The Light should have ON/OFF state, and static factory to create on and off light.
Implement the clone method.

 main method-ի մեջ factory-ին օգտագործելով մեկական object եք ստեղծում ու ամեն մեկից մեկական clone - clone() method-ի միջոցով )
 */
public class LightTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light light1 = Light.staticLight(State.ON);
        Light light2 = Light.staticLight(State.OFF);

        Light clone1 = light1.clone();
        Light clone2 = light2.clone();

        System.out.println(clone1.getClass());


    }
}
