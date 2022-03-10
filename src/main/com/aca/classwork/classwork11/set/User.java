package com.aca.classwork.classwork11.set;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
//        if (obj == null || (obj.getClass() != User.class)) {
//            return false;
//        }//instanceof

        if (!(obj instanceof User)) {//I tarberutyun naxord(verevum) grac paymani nayev child usernernel e hashvi arnum
            return false;//ete true tpeinq meji parunakutyuny myus qaylerov cher stugi, miangamic ktper true
        }


        User user = (User) obj;

        return user.firstName.equals(this.firstName) && user.lastName.equals(this.lastName);
    }

    public static void main(String[] args) {
        Object user = new User("F", "L");
        User child = new ChildUser("F", "L");

        System.out.println(user instanceof User);//tipy stugelu hamara; stuguma te karoxenq cust anel et type-i te che.
        System.out.println(child instanceof User);


    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + ", lastName='" + lastName;

    }

}
