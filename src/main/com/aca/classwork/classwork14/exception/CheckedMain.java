package com.aca.classwork.classwork14.exception;

public class CheckedMain {

    public static void main(String[] args) {

//        try {
//            createUser();
//        } catch (Exception e) {
////            e.printStackTrace();
////            throw new RuntimeException();//UserCreationException is a RuntimeException
//        }
//        System.out.println("Finished");

        try {
            createUser();
        }catch (UserCreationException e){
            e.printStackTrace();

            System.out.println(e.getAnimal());

            throw new RuntimeException();
        }
        System.out.println("Finished");
    }

    public static void createUser(){//unchecked i depqum imast chka catch anenq , checked i depqum petq a catch anenq;
        User i = null;
//          throw new RuntimeException();
//        throw new Exception();
        throw new UserCreationException(Animal.Dog);

//        throw new UserCreationException("user");

    }

}
