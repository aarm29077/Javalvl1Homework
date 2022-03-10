package com.aca.classwork.classwork14.exception;

public class UserCreationException extends RuntimeException {

    Animal animal;

    public UserCreationException(Animal animal) {
        this.animal = animal;
    }

    public UserCreationException() {
        this("message"); //kacnhelu e ays classi ayn constructory vory uni yndunox String argument`nerqeviny
    }

    public UserCreationException(String message) {
        super(message);
    }

    public Animal getAnimal() {
        return animal;
    }

}
