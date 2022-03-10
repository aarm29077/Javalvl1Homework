package com.aca.classwork.classwork15.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("C:\\Users\\User\\IdeaProjects\\firstprojectofsecondpart\\src\\main\\classwork15\\file\\text.txt")
        );
        
//        scanner.close();
//        try {
//
//        }catch (Exception e){
//
//        }finally {
//
//        }

        System.out.println(scanner.nextLine());
        System.out.println(Arrays.toString(scanner.nextLine().split(" ")));
    }
}
