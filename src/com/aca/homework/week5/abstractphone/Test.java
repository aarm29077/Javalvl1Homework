package com.aca.homework.week5.abstractphone;
/*
Create an AbstractPhoneService class that has 2 public abstract methods:
Phone create(String imei, Model model);
Phone getByImei(String imei);
Create a PhoneService class that extends from AbstractPhoneService and has implementations of the abstract methods.
When a user passes an IMEI and model to the create method, PhoneService class creates a Phone object, keeps it in a private array, and returns the newly created object.
When a user invokes the getByImei method, PhoneService class finds and returns the Phone object out of the private array.
Implement the equals and toString methods of the Phone class.
Create a SAMSUNG phone via PhoneService having IMEI 351978946541895, also
IPHONE, IMEI: 45678974132187
IPHONE, IMEI: 04894100487866
NOKIA,  IMEI: 99987741084444
invoke the getByImei method to find the phone having the IMEI 04894100487866 and print the phone.
        */
public class Test {
    public static void main(String[] args) {
        Model model1 = new Model("Samsung");
        PhoneService phoneService1 = new PhoneService();
        phoneService1.PhoneCreate("351978946541895",model1);

        Model model2 = new Model("Iphone");
        PhoneService phoneService2 = new PhoneService();
        phoneService2.PhoneCreate("45678974132187",model2);

        PhoneService phoneService3 = new PhoneService();
        phoneService2.PhoneCreate("04894100487866",model2);

        Model model3 = new Model("Nokia");
        PhoneService phoneService4 = new PhoneService();
        phoneService4.PhoneCreate("04894100487866",model3);

        PhoneService phoneService = new PhoneService();
        System.out.println(phoneService.PhoneGetByImei("45678974132187"));




    }
}
