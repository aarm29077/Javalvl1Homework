package com.aca.homework.week5.abstractphone;


public class Test {
    public static void main(String[] args) {

        Phone [] phones = new Phone[4];
        PhoneService phoneService = new PhoneService();
        phoneService.array=phones;

        Model model1 = Model.SAMSUNG;
        phoneService.PhoneCreate("351978946541895", model1);

        Model model2 = Model.IPHONE;
        phoneService.PhoneCreate("45678974132187", model2);

        PhoneService phoneService3 = new PhoneService();
        phoneService.PhoneCreate("04894100487866", model2);

        Model model3 = Model.NOKIA;
        phoneService.PhoneCreate("04894100487866", model3);

        System.out.println(phoneService.PhoneGetByImei("351978946541895"));


    }
}
