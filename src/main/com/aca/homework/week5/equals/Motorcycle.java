package main.com.aca.homework.week5.equals;

import java.util.Objects;

/*
Create a Motorcycle class that has a brand (SUZUKI, YAMAHA is allowed only) and an owner. Implement toString and equals methods of Motorcycle class.
 */
public class Motorcycle {
    private Owner owner;
    private BrandType brand;

    public Motorcycle(Owner owner, BrandType type) {
        this.owner = owner;
        this.brand = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "owner=" + owner +
                ", brand=" + brand +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(owner, that.owner) && brand == that.brand;
    }

}
