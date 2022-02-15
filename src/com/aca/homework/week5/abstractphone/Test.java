package com.aca.homework.week5.abstractphone;


public class Test {
    public static void main(String[] args) {
        Model model1 = Model.SAMSUNG;
        PhoneService phoneService1 = new PhoneService();
        phoneService1.PhoneCreate("351978946541895", model1);

        Model model2 = Model.IPHONE;
        PhoneService phoneService2 = new PhoneService();
        phoneService2.PhoneCreate("45678974132187", model2);

        PhoneService phoneService3 = new PhoneService();
        phoneService2.PhoneCreate("04894100487866", model2);

        Model model3 = Model.NOKIA;
        PhoneService phoneService4 = new PhoneService();
        phoneService4.PhoneCreate("04894100487866", model3);

        PhoneService phoneService = new PhoneService();
        System.out.println(phoneService.PhoneGetByImei("45678974132187"));


    }
}
