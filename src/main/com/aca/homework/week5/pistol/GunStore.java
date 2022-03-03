package main.com.aca.homework.week5.pistol;

import java.util.Scanner;

/*
The GunStore sells 3 type of pistols: AirPistol, MakarovPistol and NagantPistol. Each of them has a name and shoot in a different way.
Imagine a gun seller ask you the name of a pistol and based on that provides you the new pistol. Gun seller asks you for pistol name 4 times.
After getting pistols shoot each of them.
below is the shoot print message depending on the pistol type
air pistol shoot should print: air pistol fire!
makaraov: makarov fire!!
nagant: nagant pistol fire!!!!!
 */
public class GunStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gun[] gunsArray = new Gun[4];
        for (int i = 0; i <gunsArray.length; i++) {
            System.out.print("What is the gun name? (makarov, nagant or air ) : ");
            String name = scanner.next();


            if (name.equals("makarov")){
                MakarovPistol makarovPistol = new MakarovPistol();
                gunsArray[i]=makarovPistol;
            }else if (name.equals("nagant")){
                NagantPistol nagantPistol = new NagantPistol();
                gunsArray[i]=nagantPistol;
            }else if (name.equals("air")){
                AirPistol airPistol = new AirPistol();
                gunsArray[i]=airPistol;
            }
        }
        print(gunsArray);
    }
    public static void print(Gun[] array){
        for (Gun gun : array) {
            if (gun != null) {
                System.out.println(gun);
            }
        }
    }
}
