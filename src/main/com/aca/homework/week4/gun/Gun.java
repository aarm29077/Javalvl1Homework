package com.aca.homework.week4.gun;

import java.util.Scanner;

public class Gun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cartridge = loadedCartridge();
        fire(cartridge);

    }
    public static int loadedCartridge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input + to load up , input - to break:");
        String load = scanner.next();
        int quantity=0;

        while (load.equals("+") ){
            if (quantity<=10){
                ++quantity;
                System.out.print("Input + to load up , input - to break:");
                 load = scanner.next();
            }
            else{
                System.out.println("Cartridge is full ");
                break;
            }
        }
        if (load.equals("-")){
            System.out.println("End of loading");
        }
        return quantity;


    }
//    public static boolean isPossibleCartridgeQuantity(int cartridge){
//        if (cartridge>=1 && cartridge <= 10) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    public static void fire(int cartridge){
        if (cartridge == 1) {
            System.out.println("a cartridge is loaded");
        }
        while (cartridge != 0) {
            wait2Seconds();
            System.out.println("Fire!");
            cartridge--;
        }

    }
    public static void wait2Seconds(){
        long startMillis = System.currentTimeMillis();
        while (System.currentTimeMillis()-startMillis<2000){

        }
    }
}
