package com.aca.homework.week5.equals;

import java.util.Objects;

/*
Create an Owner class that has firstName and lastName. Implement toString and equals method.
Create a Motorcycle class that has a brand (SUZUKI, YAMAHA is allowed only) and an owner. Implement toString and equals methods of Motorcycle class.
Create a Motorcycle of YAMAHA type owner of which is 'Yorgantz' 'Mark.
Create a Motorcycle of YAMAHA type owner of which is 'Tavares 'Mark.
print the above objects, compare them and print the result.
 */
public class Owner {
    private String firstName;
    private String secondName;

    public Owner(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(firstName, owner.firstName) && Objects.equals(secondName, owner.secondName);
    }

}
